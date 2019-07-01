<%-- 
    Document   : listarInscricoes
    Created on : 01/07/2019, 12:54:49
    Author     : laboratoriodm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<h3>Lista de Inscrições</h3>
<table class="table">
    <tr>
        <th>Id</th>
        <th>Evento</th>
        <th>Nome</th>
        <th>CPF</th>
        <th>Instituição</th>
        <th>RA</th>
        <th>SIAPE</th>
    </tr>
    <c:forEach var="item" items="${listaDePessoas}">
        <tr>
            <td>${item.id}</td>
            <td>${item.evento.titulo}</td>
            <td>${item.nome}</td>
            <td>${item.cpf}</td>
            <td>${item.instituicao}</td>
            <td>${item.ra}</td>
            <td>${item.siape}</td>
        </tr>
    </c:forEach>
</table>
