<%-- 
    Document   : fazerInscricao
    Created on : 17/06/2019, 08:04:03
    Author     : LaboratorioA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h2>Cadastrar Eventos</h2>
<form method="POST" action="CadastrarEvento.htm">
    <div class="form-group">
        <h3>Cadastro de atividades</h3>
        
        <label for="eventoId">Total de Vagas</label>
        <input id="eventoId" value="123" class="form-control" type="number" name="totalDeVagas">
        
        <label for="eventoId">Título</label>
        <input id="eventoId" value="aaaaaaaaaa" class="form-control" type="text" name="titulo">
        
        <label for="eventoId">Data de Início</label>
        <!--input id="eventoId" class="form-control" type="date" name="dataInicio"-->

        <label for="eventoId">Carga Horária</label>
        <input id="eventoId" value="12345" class="form-control" type="number" name="cargaHoraria">

        <label class="control-label" for="eventoId">Tipo</label> 
        <select name="tipoAtividade.id" class="form-control">
            <c:forEach items="${listaTiposAtividade}" var="tipoAtivi">
                <option value="${tipoAtivi.id}">${tipoAtivi.descricao}</option>
            </c:forEach>
        </select>
    </div>
    <input class="btn btn-primary" type="submit" value="salvar">
</form>

