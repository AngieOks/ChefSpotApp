<%--
  Created by IntelliJ IDEA.
  User: lilyp
  Date: 29/04/2016
  Time: 15:48
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title><tiles:insertAttribute name="title" /></title>

    <link href="http://getbootstrap.com/dist/css/bootstrap.css"	rel="stylesheet">

    <link href="http://getbootstrap.com/examples/jumbotron/jumbotron.css"	rel="stylesheet">

    <link href='https://fonts.googleapis.com/css?family=Open+Sans:400,300italic,300,400italic' rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Metrophobic|Montserrat|Petit+Formal+Script' rel='stylesheet' type='text/css'>

    <style>

        html, body{
            margin:0px;
            padding:0px;
        }
        .navbar{
            font-size: 110%;
            padding-top: 1%;
            padding-bottom: 1%;
            border: none !important;
        }
        nav.navbar div.collapse ul.nav li a{
            color: #ffffff;
            font-weight: bold;
        }
        .spacetab{
            margin-top: 6%;
        }
        .spacetab2{
            margin-top: 2%;
        }
        @font-face {
            font-family: Georgia;
            src: url('/resources/Georgia.woff');
        }
        .headersection{
            text-align: center;
        }
        .headertitle{
            font-family:Georgia;
            font-weight: 400;
            font-style: italic;
            color: #1e282f;
            letter-spacing: 1px;
        }
        .headertagline, caption{
            font-family: Montserrat, Georgia,serif;
            font-size: 14px;
            color: #a3865b;
            font-weight: 700;
            letter-spacing: 2px;
            margin-top: 5px;
        }
        div.collapse ul.navbar-right li a{
            font-size: 90%;
        }

    </style>

</head>

<body>

    <nav class="navbar navbar-inverse navbar-fixed-top" style="background-color: #62a5a1">
        <div class="container">
            <tiles:insertAttribute name="navigation" />
        </div>
    </nav>

    <div class="row container-fluid spacetab headersection">
        <div class="container">
            <div class="container">
                <h1><strong><span class="headertitle"><tiles:insertAttribute name="heading" /></span></strong></h1>
                <strong><span class="headertagline"><tiles:insertAttribute name="tagline" /></span></strong>
            </div>
        </div>
    </div>

    <div class="row container-fluid spacetab2">
        <div class="container">
            <div class="container">
                <tiles:insertAttribute name="content" />
            </div>
        </div>
    </div>

    <div class="footer container-fluid">
        <div class="container">
                <tiles:insertAttribute name="footer" />
        </div>
    </div>

</body>
</html>

