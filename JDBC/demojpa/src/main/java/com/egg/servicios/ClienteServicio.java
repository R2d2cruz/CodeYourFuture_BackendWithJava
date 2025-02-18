package com.egg.servicios;

import java.util.List;

import com.egg.entidades.Cliente;
import com.egg.persistencia.ClienteDAO;

public class ClienteServicio {
    private final ClienteDAO daoCliente;// Instancio a la unidad d persistencia para acceder a los metodos del EM

    public ClienteServicio() {
        this.daoCliente = new ClienteDAO();
    }

    public void crearCliente(int codigoCliente, String nombreCliente, String nombreContacto, String apellidoContacto,
            String telefono, String fax, String ciudad, String region, String pais,
            String codigoPostal, int idEmpleado, double limiteCredito) {
        try {

            Cliente clienteNuevo = new Cliente();

            clienteNuevo.setApellidoContacto(apellidoContacto);
            clienteNuevo.setCiudad(ciudad);
            clienteNuevo.setCodigoCliente(codigoCliente);
            clienteNuevo.setCodigoPostal(codigoPostal);
            clienteNuevo.setFax(fax);
            clienteNuevo.setIdEmpleado(idEmpleado);
            clienteNuevo.setLimite_credito(limiteCredito);
            clienteNuevo.setNombreCliente(nombreCliente);
            clienteNuevo.setNombreContacto(nombreContacto);
            clienteNuevo.setPais(pais);
            clienteNuevo.setRegion(region);
            clienteNuevo.setTelefono(telefono);

            daoCliente.guardarCliente(clienteNuevo);
        } catch (Exception e) {
            System.out.println(e.toString() + "No se guardo el cliente  de manera correcta");
        }

    }

    public void listarClientes() throws Exception {
        List<Cliente> todasOficinas = daoCliente.listarTodosClientes();
        imprimirLista(todasOficinas);
    }

    public void listarClientes(String nombreRecibido) throws Exception {
        List<Cliente> clientesNombre = daoCliente.listarClientesPorNombre(nombreRecibido);
        imprimirLista(clientesNombre);
    }

    public void listarClientesPorCiudad(String nombreCiudad) throws Exception {
        List<Cliente> clientesNombre = daoCliente.listarClientesPorCiudad(nombreCiudad);
        imprimirLista(clientesNombre);
    }

    public void imprimirLista(List<Cliente> listaRecibida) throws Exception {
        for (Cliente cliente : listaRecibida) {
            System.out.println(cliente.getCodigoCliente() + " - " + cliente.getApellidoContacto() + " - "
                    + cliente.getNombreContacto());
        }
    }

}
