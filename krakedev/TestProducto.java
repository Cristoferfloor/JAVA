package krakedev;

public class TestProducto {
    public static void main(String[] args) {
        

        Producto productoA, productoB, productoC;

        productoA = new Producto("Paracetamol","Alivio del dolor",5.99,100);
        productoB = new Producto("Ibuprofeno","Antiinflamatorio",7.49,75);
        productoC = new Producto("Vitamina C","Suplemento nutricional",9.99,50);


        

        
        System.out.println("Producto A: " + productoA.getNombre() + ", Descripción=" + productoA.getDescripcion() +
                ", Precio=" + productoA.getPrecio() + ", Stock=" + productoA.getStockActual());
        System.out.println("Producto B: " + productoB.getNombre() + ", Descripción=" + productoB.getDescripcion() +
                ", Precio=" + productoB.getPrecio() + ", Stock=" + productoB.getStockActual());
        System.out.println("Producto C: " + productoC.getNombre() + ", Descripción=" + productoC.getDescripcion() +
                ", Precio=" + productoC.getPrecio() + ", Stock=" + productoC.getStockActual());
    }
}
