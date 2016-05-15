<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <link rel="stylesheet"
          href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
    <title>Recipes</title>
</head>

<section class="container">
    <div class="row">
        <c:forEach items="${recipes}" var="recipe">
            <div class="col-sm-6 col-md-3" style="padding-bottom: 15px">
                <div class="thumbnail">
                    <img src="<c:url value="/resource/images/${recipe.recipeId}.jpg"></c:url>" alt="image"  style = "width:100%; height:auto"/>
                    <div class="caption">
                        <strong>${recipe.mainIngredient}</strong>
                        <p>${recipe.name}</p>
                    </div>
                </div>
            </div>
        </c:forEach>
    </div>
</section>

</html>
