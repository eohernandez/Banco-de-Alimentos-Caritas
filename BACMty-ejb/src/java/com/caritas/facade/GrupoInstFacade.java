/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.caritas.facade;

import com.caritas.entity.GrupoInst;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author tecnologia
 */
@Stateless
public class GrupoInstFacade extends AbstractFacade<GrupoInst> {
    @PersistenceContext(unitName = "BACMty-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public GrupoInstFacade() {
        super(GrupoInst.class);
    }

    public List<GrupoInst> findLike(String query, int length) {
        return em.createNamedQuery("GrupoInst.findLike")
                .setParameter("query", "%" + query + "%")
                .setMaxResults(length)
                .getResultList();
    }
    
}
