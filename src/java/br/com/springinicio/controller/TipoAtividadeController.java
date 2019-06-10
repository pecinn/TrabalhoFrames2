/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.springinicio.controller;

import br.com.springinicio.mapeamento.tipoatividade.TipoAtividadeMapeamento;
import br.com.springinicio.repository.TipoAtividadeRepository;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Frank
 */
@Controller
public class TipoAtividadeController {
    private TipoAtividadeRepository tipoAtividadeRep = new TipoAtividadeRepository();
    
    @RequestMapping("index")
    public String index(){
        return "index";
    }
    
    @RequestMapping(value = {"CadastrarTipoAtividade"},method = RequestMethod.GET)
    public String CadastrarTipoAtividade(){
        return "tipoAtividade/cadastroTipoAtividade";
    }
    
    @RequestMapping(value = {"CadastrarTipoAtividade"},method = RequestMethod.POST)
    public String CadastrarTipoAtividade(TipoAtividadeMapeamento tipoAtividade){
        this.tipoAtividadeRep.salvar(tipoAtividade);
        return "tipoAtividade/cadastroTipoAtividade";
    }
    
    @RequestMapping(value = {"ListarTipoAtividade"},method = RequestMethod.GET)
    public String ListarTipoAtividade(Model model){
        List<TipoAtividadeMapeamento> listaTipoAtivi = this.tipoAtividadeRep.buscarTodos();
        model.addAttribute("listaTipoAti", listaTipoAtivi);
        return "tipoAtividade/listarTipoAtividade";
    }

    public TipoAtividadeRepository getTipoAtividadeRep() {
        return tipoAtividadeRep;
    }

    public void setTipoAtividadeRep(TipoAtividadeRepository tipoAtividadeRep) {
        this.tipoAtividadeRep = tipoAtividadeRep;
    }
    
    
}
