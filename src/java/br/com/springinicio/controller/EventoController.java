/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.springinicio.controller;

import br.com.springinicio.mapeamento.evento.EventoMapeamento;
import br.com.springinicio.mapeamento.tipoatividade.TipoAtividadeMapeamento;
import br.com.springinicio.repository.EventoRepository;
import br.com.springinicio.repository.TipoAtividadeRepository;
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
public class EventoController {
    private EventoRepository eventoRep = new EventoRepository();
    
     @RequestMapping(value = {"CadastrarEvento"},method = RequestMethod.GET)
    public String CadastrarEvento(Model model){
        
        List<TipoAtividadeMapeamento> listaTiposAtividades;

        listaTiposAtividades = new TipoAtividadeRepository().buscarTodos();

        model.addAttribute("listaTiposAtividade", listaTiposAtividades);

        return "cadastrarEvento";
    }
    
    @RequestMapping(value = {"CadastrarEvento"},method = RequestMethod.POST)
    public String CadastrarEvento(EventoMapeamento eventoMapeamento){
        this.eventoRep.salvar(eventoMapeamento);
        return "cadastrarEvento";
    }
    
    @RequestMapping(value = {"ListarEvento"},method = RequestMethod.GET)
    public String ListarEvento(Model model){
        List<EventoMapeamento> listaEvento = this.eventoRep.buscarTodos();
        model.addAttribute("listarEvento", listaEvento);
        return "listarEvento";
    }
    
    public EventoRepository getEventoRep(){
        return eventoRep;
    }
    
    public void setEventoRep(EventoRepository eventoRep){
        this.eventoRep = eventoRep;
    }
    
}
