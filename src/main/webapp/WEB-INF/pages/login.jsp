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
    <link rel="stylesheet"  href="/resources/css/style.css"  media="screen" type="text/css" />
    <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Varela+Round">
</head>


<body>


<div class="navbar navbar-fixed-top"  style="background-color:black" >
    <div class="container" >
        <div class="navbar-header" >
            <a class="navbar-brand" href="/start" style="color:white" ><h2>ImageGallery</h2></a>
            <a href="/start"> <img src="https://s3.envato.com/files/220258455/3d-spherical-image-gallery-02.png" width="85px"/></a>
        </div>
        <div class="container">
            <form class="navbar-form navbar-right">
                <a href="/register" class="btn btn-success btn-lg">Реєстрація</a>
            </form>
        </div>
    </div>
</div>


<div id="login">
    <c:url value="/j_spring_security_check" var="loginUrl" />
    <h2><span class="fontawesome-lock"></span>Авторизация</h2>

    <form action="${loginUrl}" method="POST">
        <fieldset>
                <p><label for="email">Логін:</label></p>
				
		<p><input type="text" id="email" name="j_login" placeholder="Логін" onBlur="if(this.value=='')this.value='логин'" onFocus="if(this.value=='Логин')this.value=''"></p>


		
		<p><label for="password">Пароль:</label></p>
				
		<p><input type="password" id="password" name="j_password" value="Пароль" onBlur="if(this.value=='')this.value='Пароль'" onFocus="if(this.value=='Пароль')this.value=''"></p> 

		
		<p><input type="submit" value="ВВІЙТИ"></p>


            <c:if test="${param.error ne null}">
                <p>Wrong login or password!</p>
            </c:if>

            <c:if test="${param.logout ne null}">
                <p>Chao!</p>
            </c:if>
        </fieldset>
    </form>
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
