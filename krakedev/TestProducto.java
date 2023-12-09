package krakedev;

public class TestProducto {
    public static void main(String[] args) {
        

        Producto productoA, productoB, productoC;

        productoA = new Producto();
        productoB = new Producto();
        productoC = new Producto();

        
        productoA.setNombre("Paracetamol");
        productoA.setDescripcion("Alivio del dolor");
        productoA.setPrecio(5.99);
        productoA.setStockActual(100);

        productoB.setNombre("Ibuprofeno");
        productoB.setDescripcion("Antiinflamatorio");
        productoB.setPrecio(7.49);
        productoB.setStockActual(75);

        productoC.setNombre("Vitamina C");
        productoC.setDescripcion("Suplemento nutricional");
        productoC.setPrecio(9.99);
        productoC.setStockActual(50);

        
        System.out.println("Producto A: " + productoA.getNombre() + ", Descripción=" + productoA.getDescripcion() +
                ", Precio=" + productoA.getPrecio() + ", Stock=" + productoA.getStockActual());
        System.out.println("Producto B: " + productoB.getNombre() + ", Descripción=" + productoB.getDescripcion() +
                ", Precio=" + productoB.getPrecio() + ", Stock=" + productoB.getStockActual());
        System.out.println("Producto C: " + productoC.getNombre() + ", Descripción=" + productoC.getDescripcion() +
                ", Precio=" + productoC.getPrecio() + ", Stock=" + productoC.getStockActual());
    }
}
