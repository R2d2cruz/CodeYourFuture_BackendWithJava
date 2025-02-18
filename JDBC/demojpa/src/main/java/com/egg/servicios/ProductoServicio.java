package com.egg.servicios;

import java.util.List;

import com.egg.entidades.Producto;
import com.egg.persistencia.ProductoDAO;

public class ProductoServicio {
    private final ProductoDAO daoProducto;

    public ProductoServicio() {
        this.daoProducto = new ProductoDAO();
    }

    public void listarProductos() throws Exception {
        List<Producto> todasOficinas = daoProducto.listarTodosClientes();
        imprimirLista(todasOficinas);
    }

    public void imprimirLista(List<Producto> listaRecibida) throws Exception {
        for (Producto producto : listaRecibida) {
            System.out.println(producto.getCodigoProducto() + " - " + producto.getNombre() + " - "
                    + producto.getDescripcion());
        }
    }
}
