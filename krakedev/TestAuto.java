package krakedev;

public class TestAuto {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Auto auto1 = new Auto();
        Auto auto2 = new Auto();

        // Modificar los valores de los atributos de cada auto
        auto1.marca = "Toyota";
        auto1.anio = 2022;
        auto1.precio = 25000.0;

        auto2.marca = "Ford";
        auto2.anio = 2021;
        auto2.precio = 22000.0;

        // Mostrar los valores de los atributos de los dos autos en consola
        System.out.println("Marca=" + auto1.marca +", Año=" + auto1.anio +", Precio=" + auto1.precio);
        System.out.println("Marca=" + auto2.marca + ", Año=" + auto2.anio + ", Precio=" + auto2.precio);
    }
}
