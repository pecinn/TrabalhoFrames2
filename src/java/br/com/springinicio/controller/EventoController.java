/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.springinicio.controller;

import br.com.springinicio.mapeamento.evento.EventoMapeamento;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author LaboratorioA
 */
@Controller
public class EventoController {
    
     @RequestMapping(value = {"CadastrarEvento"}, method = RequestMethod.GET)
    public String CadastrarEvento(){
        return "cadastrarEvento";
    }
    
    @RequestMapping(value = {"CadastrarEvento"},method = RequestMethod.POST)
    public String CadastrarEvento(EventoMapeamento eventoMapeamento){
     
        return "cadastrarEvento";
    }
}
