/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.springinicio.mapeamento.pessoa;

import br.com.springinicio.mapeamento.evento.EventoMapeamento;
import java.io.Serializable;
import javax.persistence.Column;
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
@Table(name = "Pessoa")
public class PessoaMapeamento implements Serializable{
    @Id
    @GeneratedValue
    private long id;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idEvento")
    @Fetch(FetchMode.JOIN)
    private EventoMapeamento evento;
    private String nome;
    @Column(length = 11, nullable = false,unique = true)
    private String cpf;
    @Column(nullable = false)
    private boolean interno;
    @Column(length = 50, nullable = false)
    private String instituicao;
    @Column(length = 19, nullable = true, unique = true)
    private String ra;
    @Column(length = 7, nullable = true, unique = true)
    private String siape;
    
     

    public PessoaMapeamento(){
        this.interno = true;
        this.instituicao = "IFMS";
    }
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public EventoMapeamento getEvento() {
        return evento;
    }

    public void setEvento(EventoMapeamento evento) {
        this.evento = evento;
    }

  

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public boolean isInterno() {
        return interno;
    }

    public void setInterno(boolean interno) {
        this.interno = interno;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getSiape() {
        return siape;
    }

    public void setSiape(String siape) {
        this.siape = siape;
    }
    
    
}
