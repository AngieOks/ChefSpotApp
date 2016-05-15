<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
    <title>Recipes</title>
</head>

<section class="container">
    <form:form  modelAttribute="newRecipe" class="form-horizontal"  enctype="multipart/form-data" method = "post">
        <fieldset>

            <legend>Add a new recipe</legend>

            <form:errors path="*" cssClass="alert alert-danger" element="div"/>

            <div class="form-group">
                <label class="control-label col-lg-2" for="recipeId"><spring:message code="addRecipe.form.recipeId.label"/></label>
                <div class="col-lg-10">
                    <form:input name="recipeId" path="recipeId" type="text" class="form:input-large"/>
                </div>
            </div>

            <div class="form-group">
                <label class="control-label col-lg-2" for="name"><spring:message code="addRecipe.form.name.label"/></label>
                <div class="col-lg-10">
                    <form:input name="name" path="name" type="text" class="form:input-large"/>
                </div>
            </div>

            <div class="form-group">
                <label class="control-label col-lg-2" for="mainIngredient"><spring:message code="addRecipe.form.mainIngredient.label"/></label>
                <div class="col-lg-10">
                    <form:input name="mainIngredient" path="mainIngredient" type="text" class="form:input-large"/>
                </div>
            </div>

            <div class="form-group">
                <label class="control-label col-lg-2" for="description"><spring:message code="addRecipe.form.description.label"/></label>
                <div class="col-lg-10">
                    <form:input name="description" path="description" type="text" class="form:input-large"/>
                </div>
            </div>

            <div class="form-group">
                <label class="control-label col-lg-2" for="likes"><spring:message code="addRecipe.form.likes.label"/></label>
                <div class="col-lg-10">
                    <form:input name="likes" path="likes" type="text" class="form:input-large"/>
                </div>
            </div>

            <div class="form-group">
                <label class="control-label col-lg-2" for="views"><spring:message code="addRecipe.form.views.label"/></label>
                <div class="col-lg-10">
                    <form:input name="views" path="views" type="text" class="form:input-large"/>
                </div>
            </div>

            <div class="form-group">
                <label class="control-label col-lg-2" for="datePosted"><spring:message code="addRecipe.form.datePosted.label"/></label>
                <div class="col-lg-10">
                    <form:input name="datePosted" path="datePosted" type="text" class="form:input-large"/>
                </div>
            </div>

            <div class="form-group">
                <label class="control-label col-lg-2" for="recipeImage"><spring:message code="addRecipe.form.recipeImage.label"/></label>
                <div class="col-lg-10">
                    <form:input name="recipeImage" path="recipeImage" type="file" class="form:input-large"/>
                </div>
            </div>

            <div class="form-group">
                <div class="col-lg-offset-2">
                    <input type="submit" name="btnAdd" class="btn btn-primary" value ="Add"/>
                </div>
            </div>

                <a href="<c:url value="/j_spring_security_logout" />" class="btn btn-danger btn-mini pull-right">logout</a>
        </fieldset>
    </form:form>

</section>
</html>