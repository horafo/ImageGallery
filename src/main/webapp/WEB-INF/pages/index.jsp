<%@ page contentType="text/html;charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>ImageGallery</title>

    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="shortcut icon" href="https://s3.envato.com/files/220258455/3d-spherical-image-gallery-02.png" type="image/png">
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
          integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
          crossorigin="anonymous">

    <!-- Optional theme -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"
          integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp"
          crossorigin="anonymous">
    <!-- Optional theme -->
    <link rel="stylesheet" href="/resources/css/style_index.css" media="screen" type="text/css" />
</head>
<body>

<nav class="navbar  navbar-fixed-top" role="navigation" style="background-color:black">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse"
                    data-target="#bs-example-navbar-collapse-1" style="background-color:white">
                <span class="sr-only">Навигация</span>
                <span class="icon-bar" style="background-color:black"></span>
                <span class="icon-bar" style="background-color:black"></span>
                <span class="icon-bar" style="background-color:black"></span>
            </button>
            <a class="navbar-brand" href="/start" style="color:white"><h2>ImageGallery</h2></a>
            <a href="/start"><img id="favicon" src="https://s3.envato.com/files/220258455/3d-spherical-image-gallery-02.png"
                                  width="85px"/></a>
        </div>
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <form class="navbar-form navbar-right">
                <div class="form-group" id="enter">
                    <a href="/login" class="btn btn-success btn-lg" class="form-control">Вхід</a>
                </div>
                <div class="form-group">
                    <a href="/register" class="btn btn-success btn-lg" class="form-control">Реєстрація</a>
                </div>
            </form>
        </div>
    </div>
</nav>
</br></br></br></br></br></br>

<div class="container">
        <h2>Ви зайшли до особистого кабінету, як:</h2>
        <c:forEach var="s"  items="${roles}">
            <h3><c:out value="${s}" /></h3>
        </c:forEach>
    <br/>

    <h2>Персональні дані:</h2>
    <br/>
        <c:url value="/update" var="updateUrl" />
        <form  class="navbar-form" action="${updateUrl}"  method="POST">
            <big>Логін:<span id="login"><em>${login}</em></span></big>
            <br/><br/>
            <div class="form-group">
            <big>Eл.пошта:</big><input type="text" name="email" placeholder="email" id="email" class="form-control" value="${email}" size="30" />
             </div>
            <br/><br/>
            <div class="form-group">
            <big>Телефон:</big><input type="text" name="phone" placeholder="phone number" id="phone" class="form-control" value="${phone}" size="30" />
            </div>
            <br/><br/>
            <input class="btn btn-success btn-md" value="Оновити" id="btn-update" type="submit"  />
        </form>

        <br/><br/> <br/>
        <c:url value="/logout" var="logoutUrl" />
        <a href="${logoutUrl}" id="btn-danger" class="btn btn-danger btn-lg">Вихід</a>
    <br/><br/>  <br/><br/>
</div>

<div class="navbar navbar-fixed-bottom">
    <div class="container ">
        <footer>
            <p>&copy; Всі права захищені 2018</p>
        </footer>


    </div>
</div>
<!-- jQuery -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"
        integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
        crossorigin="anonymous"></script>
</body>
</html>
