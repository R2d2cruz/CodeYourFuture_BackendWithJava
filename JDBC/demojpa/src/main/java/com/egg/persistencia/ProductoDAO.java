package com.egg.persistencia;

import java.util.List;

import com.egg.entidades.Producto;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ProductoDAO {


    private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("ViveroPU");
    private final EntityManager em = emf.createEntityManager();


    public void guardarCliente(Producto producto) throws Exception {
        em.getTransaction().begin();
        em.persist(producto);
        em.getTransaction().commit();
    }

    public List<Producto> listarTodosClientes() throws Exception {
        return em.createQuery("SELECT p FROM Producto p", Producto.class)
                .getResultList();
    }
    
    
}
