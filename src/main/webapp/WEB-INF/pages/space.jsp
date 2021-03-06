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
    <link rel="stylesheet" href="/resources/css/style_page.css" media="screen" type="text/css" />
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

<p>
    <a href="/space1"><img src="http://www.imageup.ru/img143/3121746/12.jpg" width="420" height="275" class="photo1"/></a>
    <a href="/space2"><img src="http://www.imageup.ru/img143/3121750/21.jpg" width="435" height="275" class="photo2"/></a>
    <a href="/space3"><img src="http://www.imageup.ru/img143/3121755/32.jpg" width="435" height="275" class="photo3"/></a>

    <a href="/space4"><img src="http://www.imageup.ru/img143/3121758/41.jpg" width="380" height="275" class="photo4" /></a>
    <a href="/space5"><img src="http://www.imageup.ru/img143/3121762/51.jpg" width="455" height="275" class="photo5" /></a>
    <a href="/space6"><img src="http://www.imageup.ru/img143/3121768/62.jpg" width="455" height="275" class="photo6" /></a>

    <a href="/space7"><img src="http://www.imageup.ru/img143/3121771/71.jpg" width="460" height="275" class="photo7"/></a>
    <a href="/space8"><img src="http://www.imageup.ru/img143/3121777/82.jpg" width="415" height="275" class="photo8"/></a>
    <a href="/space9"><img src="http://www.imageup.ru/img143/3121780/91.jpg" width="415" height="275" class="photo9"/></a>

    <a href="/space10"><img src="http://www.imageup.ru/img143/3121785/101.jpg" width="425" height="275" class="photo10"/></a>
    <a href="/space11"><img src="http://www.imageup.ru/img143/3121789/111.jpg" width="425" height="275"  class="photo11"/></a>
    <a href="/space12"><img src="http://www.imageup.ru/img143/3121794/122.jpg" width="440" height="275" class="photo12"/></a>

    <a href="/space13"><img src="http://www.imageup.ru/img143/3121799/132.jpg" width="415" height="275" class="photo13"/></a>
    <a href="/space14"><img src="http://www.imageup.ru/img143/3121802/141.jpg" width="435" height="275" class="photo14"/></a>
    <a href="/space15"><img src="http://www.imageup.ru/img143/3121807/152.jpg" width="440" height="275"  class="photo15"/></a>


</p>


<a href="#" class="scrollup">Наверх</a>

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

<script type="text/javascript">
    $(document).ready(function(){

        $(window).scroll(function(){
            if ($(this).scrollTop() > 400) {
                $('.scrollup').fadeIn();
            } else {
                $('.scrollup').fadeOut();
            }
        });

        $('.scrollup').click(function(){
            $("html, body").animate({ scrollTop: 0 }, 600);
            return false;
        });

    });
</script>

</body>
</html>