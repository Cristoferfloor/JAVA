package krakedev;

public class TestAuto {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Auto auto1 = new Auto("fia",2022,12.00);
        Auto auto2 = new Auto("Fort",2021,20.000);

        
        

        // Mostrar los valores de los atributos de los dos autos en consola
        System.out.println("Marca=" + auto1.getMarca() +", Año=" + auto1.getAnio() +", Precio=" + auto1.getPrecio());
        System.out.println("Marca=" + auto2.getMarca() + ", Año=" + auto2.getAnio()+ ", Precio=" + auto2.getPrecio());
    }
}
