<%-- 
    Document   : inscrever
    Created on : 30/06/2019, 11:39:05
    Author     : Felipe
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h3>Inscrições</h3>
<form method="POST" action="FazerInscricao.htm">

<div class="form-group">
        <label for="inscricaoId">Nome</label>
        <input id="inscricaoId" class="form-control" type="text" name="nome">

        <label for="inscricaoId">CPF</label>
        <input id="inscricaoId" class="form-control" type="text" name="cpf">

        <div class="row">
            <div class="col-lg-6">
                <div class="input-group">
                    <label for="inscricaoId">Aluno do IFMS?</label>
                    
                    <span class="input-group-addon"> Sim
                        <input id="inscricaoId" type="checkbox" aria-label="interno">
                    </span>
                     <span class="input-group-addon"> Não
                         <input id="inscricaoId" type="checkbox" aria-label="interno">
                    </span>
                </div><!-- /input-group -->
            </div><!-- /.col-lg-6 -->
            
        </div><!-- /.row -->
        
        <label for="inscricaoId">Instituição</label>
        <input id="inscricaoId" class="form-control" type="text" name="instituicao">
        
        <label for="inscricaoId">RA</label>
        <input id="inscricaoId" class="form-control" type="text" name="ra">
        
        <label for="inscricaoId">Siape</label>
        <input id="inscricaoId" class="form-control" type="text" name="siape">
        
         <label class="control-label" for="inscicaoId">Tipo</label> 
        <select name="evento.id" class="form-control">
            <c:forEach items="${listaEventos}" var="eventos">
                <option value="${eventos.id}">${eventos.titulo}</option>
            </c:forEach>
        </select>
    </div>
    <input class="btn btn-primary" type="submit" value="salvar">
</form>
