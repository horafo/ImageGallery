<%@ page contentType="text/html;charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <meta charset="utf-8">
    <title>ImageGallery</title>

    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="shortcut icon" href="https://s3.envato.com/files/220258455/3d-spherical-image-gallery-02.png"
          type="image/png">
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
          integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
          crossorigin="anonymous">

    <!-- Optional theme -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"
          integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp"
          crossorigin="anonymous">
    <link rel="stylesheet" href="/resources/css/style_start.css" media="screen" type="text/css"/>
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
</br></br></br></br></br></br>

<p class="thumb">
    <a href="/auto"><img src="https://cdn.riastatic.com/photos/ria/news_common/23/2304/230460/230460f.jpg" width="260" height="150"/></a>
    <a href="/architecture"><img src="https://image.ibb.co/ecJgDb/1_full.jpg" width="260" height="150"/></a>
    <a href="/brand"><img src="https://image.ibb.co/ng5WeG/229191_Sepik.jpg" width="260" height="150"/></a>
    <a href="/games"><img src="https://preview.ibb.co/f8bnKG/games_wallpapers_1920x1080_00020.jpg" width="260" height="150"/></a>
</p>
<a href="/auto"><h3 class="thumb1">Авто</h3></a>
<a href="/architecture"><h3 class="thumb2">Архітектура</h3></a>
<a href="/brand"><h3 class="thumb3">Бренди</h3></a>
<a href="/games"><h3 class="thumb4">Ігри</h3></a>

<p class="thumb10">
    <a href="/food"><img src="https://image.ibb.co/hvnKzG/10874926.jpg" width="260" height="150"/></a>
    <a href="/film"><img src="https://image.ibb.co/kvqYRw/4338o_Hk20_Tqw2_D3a_X5_Ikn_D39c_ZG2_Q.jpg" width="260" height="150"/></a>
    <a href="/space"><img src="https://image.ibb.co/fR7SKG/31.jpg" width="260" height="150"/></a>
    <a href="/cartoon"><img src="https://image.ibb.co/miFHmw/355123_1.jpg" width="260" height="150"/></a>
</p>
<a href="/food"><h3 class="thumb11">Їжа</h3></a>
<a href="/film"><h3 class="thumb21">Кіно</h3></a>
<a href="/space"><h3 class="thumb31">Космос</h3></a>
<a href="/cartoon"><h3 class="thumb41">Мультфільми</h3></a>

<p class="thumb20">
    <a href="/nature"><img src="https://image.ibb.co/hGpzzG/tuman_v_gorah_1920x1200.jpg" width="260" height="150"/></a>
    <a href="/sport"><img src="https://image.ibb.co/dn6ttb/sport_wallpapers_2560x1600_00013.jpg" width="260" height="150"/></a>
    <a href="/animals"><img src="https://image.ibb.co/di1yRw/1920x1080_10.jpg" width="260" height="150"/></a>
    <a href="/transport"><img src="https://image.ibb.co/cfQxKG/58648054.jpg" width="260" height="150"/></a>
</p>
            <a href="/nature"><h3 class="thumb12">Природа</h3>
            <a href="/sport"><h3 class="thumb22">Спорт</h3>
            <a href="/animals"><h3 class="thumb32">Тварини</h3>
            <a href="/transport"><h3 class="thumb42">Транспорт</h3>


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
