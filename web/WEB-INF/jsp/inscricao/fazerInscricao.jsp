<%-- 
    Document   : fazerInscricao
    Created on : 17/06/2019, 08:04:03
    Author     : LaboratorioA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<h2>Inscrição</h2>
<form method="POST" action="FazerInscricao.htm">
    <div class="form-group">
        <label for="inscricaoId">Nome</label>
        <input id="pessoaId" class="form-control" type="text" name="nome">

        <label for="inscricaoId">CPF</label>
        <input id="pessoaId" class="form-control" type="text" name="cpf">

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
    </div>
    <input class="btn btn-primary" type="submit" value="salvar">
</form>