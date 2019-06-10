/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.springinicio.mapeamento.pessoa;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

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
    @Column(length = 100, nullable = false)
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
