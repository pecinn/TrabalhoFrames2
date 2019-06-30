/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.springinicio.controller;


import br.com.springinicio.mapeamento.evento.EventoMapeamento;
import br.com.springinicio.mapeamento.pessoa.PessoaMapeamento;
import br.com.springinicio.repository.EventoRepository;

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
public class PessoasController {
    private PessoaRepository pessoaRep = new PessoaRepository();
    
    @RequestMapping(value = {"FazerInscricao"},method = RequestMethod.GET)
    public String FazerInscricao(Model model){
        List<EventoMapeamento> listaEventos;
        listaEventos = new EventoRepository().buscarTodos();
        model.addAttribute("listaEventos", listaEventos);
        return "inscrever";
    }

   
    @RequestMapping(value = {"FazerInscricao"},method = RequestMethod.POST)
    public String FazerInscricao(PessoaMapeamento pessoa, Model model){
     this.pessoaRep.salvar(pessoa);
        return "inscrever";
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
