package krakedev;

public class TestProducto {
    public static void main(String[] args) {
		// TODO Auto-generated method stub

		Producto productoA, productoB, productoC;

   
        productoA = new Producto();
        productoB = new Producto();
        productoC = new Producto();

        
        productoA.nombre = "Paracetamol";
        productoA.descripcion = "Alivio del dolor";
        productoA.precio = 5.99;
        productoA.stockActual = 100;

        productoB.nombre = "Ibuprofeno";
        productoB.descripcion = "Antiinflamatorio";
        productoB.precio = 7.49;
        productoB.stockActual = 75;

        productoC.nombre = "Vitamina C";
        productoC.descripcion = "Suplemento nutricional";
        productoC.precio = 9.99;
        productoC.stockActual = 50;

       
        System.out.println("Producto A: " + productoA.nombre + ", Descripción=" + productoA.descripcion +
                ", Precio=" + productoA.precio + ", Stock=" + productoA.stockActual);
        System.out.println("Producto B: " + productoB.nombre + ", Descripción=" + productoB.descripcion +
                ", Precio=" + productoB.precio + ", Stock=" + productoB.stockActual);
        System.out.println("Producto C: " + productoC.nombre + ", Descripción=" + productoC.descripcion +
                ", Precio=" + productoC.precio + ", Stock=" + productoC.stockActual);
    
	}
    
}
