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
    <a href="/auto1"><img src="https://image.ibb.co/hpgLeR/001_Wallpapers_Auto_250509_Go2_Load_COM.jpg" width="370" height="275" class="photo1"/></a>
    <a href="/auto2"><img src="https://image.ibb.co/gchSKG/1_avtomobili_oboi_kartinki_foto_1920x1080.jpg" width="485" height="275" class="photo2"/></a>
    <a href="/auto3"><img src="https://image.ibb.co/fBKJRw/13.jpg" width="435" height="275" class="photo3"/></a>

    <a href="/auto4"><img src="https://image.ibb.co/iHMMeG/28bd30fa4dc94b15.jpg" width="380" height="275" class="photo4" /></a>
    <a href="/auto5"><img src="https://image.ibb.co/fCFsmw/710.jpg" width="455" height="275" class="photo5" /></a>
    <a href="/auto6"><img src="https://image.ibb.co/ii2cKG/2015_novitec_torado_lamborghini_huracan_n_largo_8_wide.jpg" width="455" height="275" class="photo6" /></a>

    <a href="/auto7"><img src="https://image.ibb.co/fT0mDb/09588e6c3bb4a852895bf56e628.jpg" width="460" height="275" class="photo7"/></a>
    <a href="/auto8"><img src="https://image.ibb.co/bRZeYb/16291_Moa_DHw_Pb_QCFIzuyl_Nc_Ef_Asd_Y.jpg" width="415" height="275" class="photo8"/></a>
    <a href="/auto9"><img src="https://image.ibb.co/n7rYYm/tires_metallic_colors_road_hd_car_images_automobile_amazing_toys_desktop_images_car_background_1920x1200.jpg" width="415" height="275" class="photo9"/></a>

    <a href="/auto10"><img src="https://image.ibb.co/ku9bm6/wallpapers_cars_07.jpg" width="425" height="275" class="photo10"/></a>
    <a href="/auto11"><img src="https://image.ibb.co/fDC7tm/oboitut_com_3400.jpg" width="425" height="275"  class="photo11"/></a>
    <a href="/auto12"><img src="https://image.ibb.co/mzFmDb/52483e6799140.jpg" width="440" height="275" class="photo12"/></a>

    <a href="/auto13"><img src="https://image.ibb.co/imzntm/subaru_impreza_wrx_sti_cars_mountains_white_2000x1333_wallpaper.jpg" width="415" height="275" class="photo13"/></a>
    <a href="/auto14"><img src="https://image.ibb.co/dNmhmw/7021269_aspid_gt_21.jpg" width="435" height="275" class="photo14"/></a>
    <a href="/auto15"><img src="https://image.ibb.co/gbpdYm/805457_black_cars_cars_close_up_low_angle_shot_luxury_sport_cars_vehicles.jpg" width="440" height="275"  class="photo15"/></a>

    <a href="/auto16"><img src="https://image.ibb.co/g014zG/auto_wallpapers1_ru_b142.jpg" width="430" height="275" class="photo16"/></a>
    <a href="/auto17"><img src="https://image.ibb.co/iNFhR6/1920x1080_ferrari_pirelli_cars.jpg" width="430" height="275" class="photo17"/></a>
    <a href="/auto18"><img src="https://image.ibb.co/hU4eYb/audi_s5_cars_wallpaper1.jpg" width="430" height="275"class="photo18" /></a>

    <a href="/auto19"><img src="https://image.ibb.co/cJBMeG/Ferrari_488_Spider_11.jpg" width="412" height="275" class="photo19" /></a>
    <a href="/auto20"><img src="https://image.ibb.co/ebGXmw/Lexus_2018_LC_500h_Grey_Metallic_529395_3840x2400.jpg" width="435" height="275" class="photo20"/></a>
    <a href="/auto21"><img src="https://image.ibb.co/ccJaw6/maxresdefault.jpg" width="440" height="275" class="photo21"/></a>

    <a href="/auto22"><img src="https://image.ibb.co/dJq3tb/Mercedes_Benz_AMG_Vision_Gran_Turismo_Concept_rear_view_in_desert_wallpapersbyte_com_2560x1600.jpg" width="430" height="275" class="photo22"/></a>
    <a href="/auto23"><img src="https://image.ibb.co/jwsSKG/Porsche_911_Carrera_S_2013_2560x1600_001.jpg" width="430" height="275"  class="photo23"/></a>
    <a href="/auto24"><img src="https://image.ibb.co/n4DOtb/Subaru.jpg" width="430" height="275"class="photo24" /></a>

    <a href="/auto25"><img src="https://image.ibb.co/jTfsmw/wallpapers_cars_0.jpg" width="440" height="275" class="photo25"/></a>
    <a href="/auto26"><img src="https://image.ibb.co/g5tCmw/wpapers_ru.jpg" width="440" height="275" class="photo26"/></a>
    <a href="/auto27"><img src="https://image.ibb.co/dcdpYb/zagl_3.jpg" width="410" height="275" class="photo27" /></a>

    <a href="/auto28"><img src="https://image.ibb.co/jRfxKG/1.jpg" width="420" height="275" class="photo28"/></a>
    <a href="/auto29"><img src="https://image.ibb.co/jWByim/luxfon_com_11240.jpg" width="455" height="275"  class="photo29"/></a>
    <a href="/auto30"><img src="https://image.ibb.co/hpB4zG/elitefon_ru_21718.jpg" width="415" height="275" class="photo30"/></a>
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