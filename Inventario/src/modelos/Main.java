package modelos;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    List <Producto> productos = new ArrayList();

    public static void agregarProducto(Producto producto){
        productos.add(producto);
    }

    public int contarCategorias(){
        return productos.size();
    }
    public static void main(String[] args) {
        Categoria categoria = new Categoria("cat1", "Lacteos");
        Producto p1 = new Producto("pd1", "Queso", 85, 120, 10, categoria);
        Producto p2 = new Producto("pd2", "Leche", 40, 65, 100, categoria);

        List <Producto> productos = new ArrayList();
        productos.add(p1);
        productos.add(p2);
    }
}
