/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.springinicio.controller;

import br.com.springinicio.mapeamento.pessoa.PessoaMapeamento;
import br.com.springinicio.repository.PessoaRepository;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author LaboratorioA
 */
@Controller
public class PessoasInscricoesController {
    private PessoaRepository pessoaRep = new PessoaRepository();
    
    @RequestMapping(value = {"FazerInscricao"}, method = RequestMethod.GET)
    public String CadastrarParticipante(){
        return "fazerInscricao";
    }
    
    @RequestMapping(value = {"FazerInscricao"},method = RequestMethod.POST)
    public String CadastrarParticipante(PessoaMapeamento pessoa){
     this.pessoaRep.salvar(pessoa);
        return "fazerInscricao";
    }
   
    @RequestMapping(value = {"ListarPessoas"},method = RequestMethod.GET)
    public String ListarPessoas(Model model){
        List<PessoaMapeamento> listaDePessoas = this.pessoaRep.buscarTodos();
        model.addAttribute("listaDePessoas", listaDePessoas);
        return "listaDePessoas";
    }
    
    public PessoaRepository getPessoaRep(){
        return pessoaRep;
    }
    
    public void setPessoaRep(PessoaRepository pessoaRep){
        this.pessoaRep = pessoaRep;
    }
    
}
