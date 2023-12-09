package krakedev;

public class TestPersona {

    public static void main(String[] args) {
		
		
		Persona p = new Persona();
		
		p.setNombre("Ariel");
		
		p.setEdad(12);
		
		p.setEstatura(1.23);
		
		
		System.out.println("Nombre :" + p.getNombre());
		System.out.println("Edad :" + p.getEdad());
		System.out.println("Estatura :" + p.getEstatura());
  
	}
    
}
