<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<div class="container-fluid">
    <div class="navbar-header">
        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
        </button>
        <a class="navbar-brand" href="<spring:url value="/"/>" style="color:white; font-size: 220%; font-family: Metrophobic"><strong>chef</strong>spot</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
        <ul class="nav navbar-nav">
            <li><a href="<spring:url value="/recipes"/>">RECIPES</a></li>
            <li><a href="<spring:url value="#"/>">FAMILY FOOD</a></li>
            <li><a href="<spring:url value="#"/>">HEALTH</a></li>
            <li><a href="<spring:url value="#"/>">DISCOVER</a></li>
            <li><a href="<spring:url value="/recipes/add"/>">ADD RECIPE</a></li>
        </ul>
        <ul class="nav navbar-nav navbar-right">
            <li><a href="<spring:url value="/login"/>">SIGN UP / LOG IN</a></li>
            <li class="dropdown">
                <a class="dropdown-toggle" data-toggle="dropdown" href="#">FOLLOW<span class="caret"></span></a>
                <ul class="dropdown-menu">
                    <li><a href="#">Instagram</a></li>
                    <li><a href="#">Facebook</a></li>
                    <li><a href="#">google plus></a></li>
                    <li><li><a href="#">twitter</a></li>
                    <li><a href="#">pin interest</a></li>
                </ul>
            </li>
            <li><a href="#"><span class="glyphicon glyphicon-search"></span></a></li>
        </ul>
    </div>
</div>