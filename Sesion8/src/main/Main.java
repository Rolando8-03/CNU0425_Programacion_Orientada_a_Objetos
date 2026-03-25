package main;

import models.Producto;
import models.Servicio;
import models.Telefono;

public class Main {
    public static void main(String[] args) {
        Producto cafe = new Producto();
        cafe.setNombre("CAFE");
        cafe.setCantidad(5);
        cafe.setPrecio(500);
        System.out.println(cafe);

        Producto leche = new Producto();
        leche.setNombre("LECHE");
        leche.setPrecio(35);
        leche.setCantidad(20);
        System.out.println(leche);

        Telefono mi_telefono = new Telefono();
        mi_telefono.setMarca("Samsung");
        mi_telefono.setModelo("A54");
        mi_telefono.setProcesador("Exynos 1600");
        mi_telefono.setMemoria(128);
        System.out.println(mi_telefono);

        Producto agua = new Servicio("Agua", 120, "Mes Marzo", "Potable");
        System.out.println(agua);
    }
}
