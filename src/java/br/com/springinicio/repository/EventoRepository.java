/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.springinicio.repository;

import br.com.springinicio.mapeamento.evento.EventoMapeamento;
import br.com.springinicio.util.NewHibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author LaboratorioA
 */
public class EventoRepository {
     public void salvar(EventoMapeamento evento) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction transac = session.beginTransaction();
        session.save(evento);
        transac.commit();
        session.close();
    }

    public List<EventoMapeamento> buscarTodos() {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        List<EventoMapeamento> listaDeEventos;

        Transaction transac = session.beginTransaction();
        listaDeEventos = session.createQuery("from EventoMapeamento").list();
        transac.commit();

        session.close();
        return listaDeEventos;
    }
}
