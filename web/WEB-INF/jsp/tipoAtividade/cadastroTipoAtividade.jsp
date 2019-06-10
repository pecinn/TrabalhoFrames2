<%-- 
    Document   : index
    Created on : 06/05/2019, 08:03:29
    Author     : Frank
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<h3>Cadastro de tipos de  atividades</h3>
<form method="POST" action="CadastrarTipoAtividade.htm">
    <div class="form-group">
        <label for="descricaoId">Descrição</label>
        <input id="descricaoId" class="form-control" type="text" name="descricao">
    </div>
    <input class="btn btn-primary" type="submit" value="salvar">
</form>

