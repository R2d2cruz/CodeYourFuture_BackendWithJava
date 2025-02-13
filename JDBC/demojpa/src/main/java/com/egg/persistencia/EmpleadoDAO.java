package com.egg.persistencia;

import com.egg.entidades.Empleado;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EmpleadoDAO {


    private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("ViveroPU");
    private final EntityManager em = emf.createEntityManager();


    public void guardarEmpleado(Empleado empleado) throws Exception {
        em.getTransaction().begin();
        em.persist(empleado);
        em.getTransaction().commit();
    }

    public Empleado buscarEmpleado(int id) throws Exception {
        em.getTransaction().begin();
        Empleado empleado = em.find(Empleado.class, id);
        return empleado;
    }

    public void removerEmpleado(Empleado empleado) throws Exception {
        em.getTransaction().begin();
        em.remove(empleado);
        em.getTransaction().commit();
    }
    
}
