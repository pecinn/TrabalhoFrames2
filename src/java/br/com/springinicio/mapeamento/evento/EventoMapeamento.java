/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.springinicio.mapeamento.evento;

import br.com.springinicio.mapeamento.tipoatividade.TipoAtividadeMapeamento;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

/**
 *
 * @author Frank
 */
@Entity
@Table(name = "Evento")
public class EventoMapeamento implements Serializable{
    @Id
    @GeneratedValue
    private long id;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idTipoAtividade")
    @Fetch(FetchMode.JOIN)
    private TipoAtividadeMapeamento tipoAtividade;
    private String titulo;
    private int totalDeVagas;
    private Date dataInicio;
    private int cargaHoraria;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public TipoAtividadeMapeamento getTipoAtividade() {
        return tipoAtividade;
    }

    public void setTipoAtividade(TipoAtividadeMapeamento tipoAtividade) {
        this.tipoAtividade = tipoAtividade;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    

    public int getTotalDeVagas() {
        return totalDeVagas;
    }

    public void setTotalDeVagas(int totalDeVagas) {
        this.totalDeVagas = totalDeVagas;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    
    
}
