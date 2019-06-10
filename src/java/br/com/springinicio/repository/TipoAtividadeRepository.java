/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.springinicio.repository;

import br.com.springinicio.mapeamento.tipoatividade.TipoAtividadeMapeamento;
import br.com.springinicio.util.NewHibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Frank
 */
public class TipoAtividadeRepository {

    public void salvar(TipoAtividadeMapeamento tipoAtividade) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();

        Transaction transac = session.beginTransaction();
        session.save(tipoAtividade);
        transac.commit();

        session.close();
    }

    public List<TipoAtividadeMapeamento> buscarTodos() {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        List<TipoAtividadeMapeamento> listaDeTiposAtivi;

        Transaction transac = session.beginTransaction();
        listaDeTiposAtivi = session.createQuery("from TipoAtividadeMapeamento").list();
        transac.commit();

        session.close();
        return listaDeTiposAtivi;
    }
}
