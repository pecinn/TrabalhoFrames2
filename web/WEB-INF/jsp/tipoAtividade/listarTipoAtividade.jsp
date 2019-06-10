<%-- 
    Document   : index
    Created on : 06/05/2019, 08:03:29
    Author     : Frank
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div>
            <h1>Atividades IFMS</h1>
        </div>
        <div>
            <ul>
                <li><a href="index.htm">Home</a></li>
                <li><a href="CadastrarTipoAtividade.htm">Cadastrar Tipo Atividade</a></li>
                <li><a href="ListarTipoAtividade.htm">Listar Tipo Atividade</a></li>
            </ul>
        </div>
        <h3>Lista de tipos de atividades</h3>
        <table>
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
    </body>
</html>
