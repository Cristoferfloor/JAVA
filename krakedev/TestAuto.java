package krakedev;

public class TestAuto {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Auto auto1 = new Auto();
        Auto auto2 = new Auto();

        
        auto1.setMarca("fia");
        auto1.setAnio(2022);
        auto1.setPrecio(12.000);

        auto2.setMarca("Fort");
        auto2.setAnio(2021);
        auto2.setPrecio(20.000);

        // Mostrar los valores de los atributos de los dos autos en consola
        System.out.println("Marca=" + auto1.getMarca() +", Año=" + auto1.getAnio() +", Precio=" + auto1.getPrecio());
        System.out.println("Marca=" + auto2.getMarca() + ", Año=" + auto2.getAnio()+ ", Precio=" + auto2.getPrecio());
    }
}
