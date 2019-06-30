<%-- 
    Document   : listarEvento
    Created on : 29/06/2019, 22:41:54
    Author     : Felipe
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<h3>Lista de Eventos</h3>
<table class="table">
    <tr>
        <th>Id</th>
        <th>Tipo Atividade</th>
        <th>Titulo</th>
        <th>Total de Vagas</th>
        <th>Data Inicio</th>
        <th>Carga Horária</th>
    </tr>
    <c:forEach var="item" items="${listaEvento}">
        <tr>
            <td>${item.id}</td>
            <td>${item.tipoAtividade.descricao}</td>
            <td>${item.titulo}</td>
            <td>${item.totalDeVagas}</td>
            <td>${item.dataInicio}</td>
            <td>${item.cargaHoraria}</td>
        </tr>
    </c:forEach>
</table>

