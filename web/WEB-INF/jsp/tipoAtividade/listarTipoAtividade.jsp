<%-- 
    Document   : index
    Created on : 06/05/2019, 08:03:29
    Author     : Frank
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<h3>Lista de tipos de atividades</h3>
<table class="table">
    <tr>
        <th>Id</th>
        <th>Descrição</th>
    </tr>
    <c:forEach var="item" items="${listaTipoAti}">
        <tr>
            <td>${item.id}</td>
            <td>${item.descricao}</td>
        </tr>
    </c:forEach>
</table>

