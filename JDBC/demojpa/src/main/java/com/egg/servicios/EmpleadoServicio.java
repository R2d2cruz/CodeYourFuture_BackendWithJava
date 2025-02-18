package com.egg.servicios;

import java.util.List;

import com.egg.entidades.Empleado;
import com.egg.persistencia.EmpleadoDAO;

public class EmpleadoServicio {
    private final EmpleadoDAO daoEmpleado;// Instancio a la unidad d persistencia para acceder a los metodos del EM

    public EmpleadoServicio() {
        this.daoEmpleado = new EmpleadoDAO();
    }

    public Empleado buscarEmpleado(int id) {
        Empleado empleado = null;
        try {
            empleado = daoEmpleado.buscarEmpleado(id);
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
            daoEmpleado.removerEmpleado(empleado);
        } catch (Exception e) {
            System.out.println(e.toString() + "No se pudo eliminar el empleado.");
        }
    }

    public void listarEmpleadosPorOficina(int idOficina) throws Exception {
        List<Empleado> empleadosOficina = daoEmpleado.listarEmpleadoPorOficina(idOficina);
        imprimirLista(empleadosOficina);
    }

    public void imprimirLista(List<Empleado> listaRecibida) throws Exception {
        for (Empleado empleado : listaRecibida) {
            System.out.println(empleado.getCodigoEmpleado() + " - " + empleado.getApellido() + " - "
                    + empleado.getNombre());
        }
    }

    public void imprimirEmpleadosExcluyendo(int idEmpleado) throws Exception {
    List<Empleado> listaEmpleados = daoEmpleado.listarEmpleadosExcluyendo(idEmpleado);
    for (Empleado empleado : listaEmpleados) {
        System.out.println(empleado.getNombre() + " - " +
                           empleado.getOficina().getCiudad() + " - " +
                           empleado.getOficina().getCodigoOficina());
    }
}
}
