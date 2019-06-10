<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<html>
    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <link rel="stylesheet" href="resources/bootstrap3.3/css/bootstrap.css"/>
        <title><tiles:getAsString name="titulo"/></title>
    </head>
    <body>       
        <div class="container">
            <div class="row"> 
                <tiles:insertAttribute name="cabecalho"/>
            </div>
            <div class="row">
                <div class="col-md-3">
                    <tiles:insertAttribute name="navbar"/>
                </div>
                <div class="col-md-9">
                    <tiles:insertAttribute name="body"/>
                </div>
            </div>
            <tiles:insertAttribute name="footer"/>
        </div>
    </body>
</html>