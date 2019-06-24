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
        <!--table class="table">
            <tr>
                <th>Id</th>
                <th>Descrição</th>
            </tr>
            <!--c:forEach var="item" items="${listaTipoAti}">
                <tr>
                    <td>${item.id}</td>
                    <td>${item.descricao}</td>
                </tr>
        <!--/c:forEach-->
        </table-->
        <label for="eventoId">Total de Vagas</label>
        <input id="eventoId" class="form-control" type="number" name="totalDeVagas">

        <label for="eventoId">Data de Início</label>
        <input id="eventoId" class="form-control" type="date" name="dataInicio">

        <label for="eventoId">Carga Horária</label>
        <input id="eventoId" class="form-control" type="number" name="cargaHoraria">

        <label class="control-label" for="">Tipo</label> 
        <select name="idTipoAtividade" class="form-control">
            <c:forEach items="${listaTiposAtividade}" var="tipoAtivi">
                <option value="${tipoAtivi.id}">${tipoAtivi.descricao}</option>
            </c:forEach>
        </select>
    </div>
    <input class="btn btn-primary" type="submit" value="salvar">
</form>

