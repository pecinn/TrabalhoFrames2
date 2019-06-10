<%-- 
    Document   : index
    Created on : 06/05/2019, 08:03:29
    Author     : Frank
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
        <h3>Cadastro de tipos de  atividades</h3>
        <form method="POST" action="CadastrarTipoAtividade.htm">
            Descrição: <input type="text" name="descricao">
            <input type="submit" value="salvar">
        </form>
    </body>
</html>
