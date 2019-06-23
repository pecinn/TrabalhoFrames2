/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.springinicio.controller;

import br.com.springinicio.mapeamento.pessoa.PessoaMapeamento;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author LaboratorioA
 */
@Controller
public class PessoasInscricoesController {
    
    
    @RequestMapping(value = {"FazerInscricao"}, method = RequestMethod.GET)
    public String CadastrarParticipante(){
        return "fazerInscricao";
    }
    
    @RequestMapping(value = {"FazerInscricao"},method = RequestMethod.POST)
    public String CadastrarParticipante(PessoaMapeamento pessoaMapeamento){
     
        return "fazerInscricao";
    }
}
