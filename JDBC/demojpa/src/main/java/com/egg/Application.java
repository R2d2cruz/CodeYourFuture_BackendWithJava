package com.egg;

import com.egg.servicios.ClienteServicio;
import com.egg.servicios.EmpleadoServicio;
import com.egg.servicios.OficinaServicio;
import com.egg.servicios.ProductoServicio;


public class Application {

    public static void main(String[] args) {
        OficinaServicio oficinaServicio = new OficinaServicio();
        ClienteServicio clienteServicio = new ClienteServicio();
        ProductoServicio productoServicio = new ProductoServicio();
        EmpleadoServicio empleadoServicio = new EmpleadoServicio();

        try {

            // IMPRIMIR TODAS LAS OFICINAS
            // System.out.println("****************OFICINAS DISPONIBLES*****************");
            // System.out.println("ID OFICINA // CIUDAD OFICINA // PAIS OFICINA");
            // oficinaServicio.listarOficinas();

            // IMPRIMIR TODOS LOS CLIENTE
            System.out.println("****************CLIENTES DISPONIBLES*****************");
            System.out.println("ID CLIENTE // CIUDAD CLIENTE // PAIS CLIENTE");
            clienteServicio.listarClientes();

            // IMPRIMIR TODOS LOS PRODUCTOS
            System.out.println("*****************PRODUCTOS DISPONIBLES******************");
            System.out.println("ID PRODUCTO // NOMBRE PRODUCTO // DESCRIPCION PRODUCTO");
            productoServicio.listarProductos();

            // IMPRIMIR TODOS LOS CLIENTE
            System.out.println("****************CLIENTES POR NOMBRE*****************");
            System.out.println("ID CLIENTE // APELLIDO CLIENTE // NOMBRE CLIENTE");
            clienteServicio.listarClientes("Antonio");

            // IMPRIMIR TODOS LOS CLIENTE
            System.out.println("****************EMPLEADO POR OFICINA*****************");
            System.out.println("ID EMPLEADO // APELLIDO EMPLEADO // NOMBRE EMPLEADO");
            empleadoServicio.listarEmpleadosPorOficina(6);

            // IMPRIMIR TODOS LOS CLIENTE
            System.out.println("****************CLIENTES POR NOMBRE*****************");
            System.out.println("ID CLIENTE // APELLIDO CLIENTE // NOMBRE CLIENTE");
            clienteServicio.listarClientesPorCiudad("Madrid");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}