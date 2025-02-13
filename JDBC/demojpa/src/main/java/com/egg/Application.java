package com.egg;

import com.egg.servicios.GamaServicio;


public class Application {


    public static void main(String[] args) {
        GamaServicio gamaServicio = new GamaServicio();

        System.out.println(gamaServicio.buscarGamaProducto(2).getDescripcionTexto());


    }
}