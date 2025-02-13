
package com.egg.servicios;

import com.egg.entidades.GamaProducto;
import com.egg.persistencia.GamaProductoDAO;

public class GamaServicio {
    private final GamaProductoDAO daoGama;// Instancio a la unidad d persistencia para acceder a los métodos del EM

    public GamaServicio() {
        this.daoGama = new GamaProductoDAO();
    }

    public void crearGama(String descripcionTexto, String descripcionHtml, String gama, String imagen) {

        try {
            GamaProducto gamaNueva = new GamaProducto();

            gamaNueva.setDescripcionTexto(descripcionTexto);
            gamaNueva.setDescripcionHtml(descripcionHtml);
            gamaNueva.setGama(gama);
            gamaNueva.setImagen(imagen);

            daoGama.guardarGamaProducto(gamaNueva);

        } catch (Exception e) {
            System.out.println(e.toString() + "No se guardo la nueva gamaProducto de manera correcta");
        }

    }

    public GamaProducto buscarGamaProducto(int id) {
        GamaProducto gamaProducto = null;
        try {
            gamaProducto = daoGama.buscarGamaProducto(id);
            if (gamaProducto == null) {
                throw new Exception("Error 404: gama producto no encontrado. ");
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        return gamaProducto;
    }


    public void actualizarDescripcion(int id, String descripcionTexto, String descripcionHtml) {
        GamaProducto gamaNueva = buscarGamaProducto(id);
        gamaNueva.setDescripcionTexto(descripcionTexto);
        gamaNueva.setDescripcionHtml(descripcionHtml);
        actualizarGamaProducto(gamaNueva);
    }

    public void actualizarGama(int id, String gama) {
        GamaProducto gamaNueva = buscarGamaProducto(id);
        gamaNueva.setGama(gama);
        actualizarGamaProducto(gamaNueva);
    }

    public void actualizarImagen(int id, String imagen) {
        GamaProducto gamaNueva = buscarGamaProducto(id);
        gamaNueva.setImagen(imagen);
        actualizarGamaProducto(gamaNueva);
    }

    public void actualizarGamaProducto(GamaProducto gamaProducto) {
        try {
            daoGama.actualizarProducto(gamaProducto);

        } catch (Exception e) {
            System.out.println(e.toString() + "No se guardo la nueva gamaProducto de manera correcta");
        }

    }



}
