<%@ page contentType="text/html;charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <meta charset="utf-8">
    <title>ImageGallery</title>

    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="shortcut icon" href="https://s3.envato.com/files/220258455/3d-spherical-image-gallery-02.png" type="image/png">
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
          integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

    <!-- Optional theme -->
    <link rel="stylesheet" href="/resources/css/style_page.css" media="screen" type="text/css"/>

    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/social-likes/dist/social-likes_classic.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/social-likes/dist/social-likes.min.js"></script>
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
                    <a href="/" class="btn btn-success btn-lg" class="form-control">Вхід/Особистий кабінет</a>
                </div>
                <div class="form-group">
                    <a href="/register" class="btn btn-success btn-lg" class="form-control">Реєстрація</a>
                </div>
            </form>
        </div>
    </div>
</nav>
</br></br></br></br></br>


<div class="gallery">
    <a href="#"><img src="http://www.imageup.ru/img143/3121755/32.jpg" /></a>

</div>
</br>

<div class="container-fluid" id="container">
    <div align="center">

        <c:url value="/space3like" var="space3likeUrl"/>
        <form action="${space3likeUrl}" method="POST" class="navbar-form navbar-left">
            <input type="submit" name="like" class="btn btn-default btn-lg" value="Мне нравится"/>
            <span id="like" class="fontawesome-thumbs-up">${like}</span>
        </form>

        <c:url value="/space3dislike" var="space3dislikeUrl"/>
        <form action="${space3dislikeUrl}" method="POST" class="navbar-form navbar-left">
            <input type="submit" name="dislike" class="btn btn-default btn-lg" value="Не нравится"/>
            <span id="dislike" class="fontawesome-thumbs-down">${dislike}</span>
        </form>

        <ul class="nav navbar-nav ">
            <li class="dropdown">
                <button class="btn btn-primary btn-lg dropdown-toggle fontawesome-cloud-download" data-toggle="dropdown"
                > Скачать фото <span class="caret"></span></button>
                <ul class="dropdown-menu ">
                    <li>
                        <a href="http://www.imageup.ru/img143/3121755/32.jpg.html?a=download">2560x1440</a>
                    </li>
                    <li class="divider"></li>
                    <li><a href="http://www.imageup.ru/img143/3121754/31.jpg.html?a=download">1920x1080</a></li>
                    <li class="divider"></li>
                    <li><a href="http://www.imageup.ru/img143/3121756/33.jpg.html?a=download">1366x768</a></li>
                    <li class="divider"></li>
                    <li>
                        <a href="http://www.imageup.ru/img143/3121757/34.jpg.html?a=download ">1280x720</a>
                    </li>
                </ul>
            </li>
        </ul>
    </div>
</div>


</br></br></br></br></br>


<div align="center">
    <div class="social-likes" data-url="file:///C:/Users/Администратор/Desktop/Bootstrap/15/brand1.js.html">
        <div class="facebook" title="Поделиться ссылкой на Фейсбуке">Facebook</div>
        <div class="twitter" title="Поделиться ссылкой в Твиттере">Twitter</div>
        <div class="mailru" title="Поделиться ссылкой в Моём мире">Мой мир</div>
        <div class="vkontakte" title="Поделиться ссылкой во Вконтакте">Вконтакте</div>
        <div class="odnoklassniki" title="Поделиться ссылкой в Одноклассниках">Одноклассники</div>
        <div class="plusone" title="Поделиться ссылкой в Гугл-плюсе">Google+</div>
    </div>
</div>

</br></br></br></br>
<div class="navbar navbar-fixed-bottom">
    <div class="container ">
        <footer>
            <p>&copy; Всі права захищені 2018</p>
        </footer>
    </div>
</div>


<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"
        integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
        crossorigin="anonymous"></script>

</body>
</html>