/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.springinicio.repository;

import br.com.springinicio.mapeamento.pessoa.PessoaMapeamento;
import br.com.springinicio.util.NewHibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;



/**
 *
 * @author LaboratorioA
 */
public class PessoaRepository {
    
     public void salvar(PessoaMapeamento pessoa) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();

        Transaction transac = session.beginTransaction();
        session.save(pessoa);
        transac.commit();

        session.close();
    }

    public List<PessoaMapeamento> buscarTodos() {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        List<PessoaMapeamento> listaDePessoas;

        Transaction transac = session.beginTransaction();
        listaDePessoas = session.createQuery("from PessoaMapeamento").list();
        transac.commit();

        session.close();
        return listaDePessoas;
    }
}
