package com.egg.servicios;

import com.egg.entidades.Empleado;
import com.egg.persistencia.EmpleadoDAO;

public class EmpleadoServicio {
    private final EmpleadoDAO empleadoDAO;// Instancio a la unidad d persistencia para acceder a los metodos del EM

    public EmpleadoServicio() {
        this.empleadoDAO = new EmpleadoDAO();
    }

    public Empleado buscarEmpleado(int id) {
        Empleado empleado = null;
        try {
            empleado = empleadoDAO.buscarEmpleado(id);
            if (empleado == null) {
                throw new Exception("Error 404: gama producto no encontrado. ");
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        return empleado;
    }
    

    public void  removerEmpleado(int id) {
        try {
            Empleado empleado = buscarEmpleado(id);
            empleadoDAO.removerEmpleado(empleado);
        } catch (Exception e) {
            System.out.println(e.toString() + "No se pudo eliminar el empleado.");
        }
    }
}
