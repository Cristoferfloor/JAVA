package krakedev;

public class Persona {
   
	private String Nombre;

	private int edad;

	private double estatura;

	public Persona(String Nombre,int edad, double estatura){

		this.Nombre=Nombre;
		this.edad=edad;
		this.estatura=estatura;
	}

	public String getNombre() {	
		return this.Nombre;
	}

	public void setNombre(String Nombre) {
		this.Nombre = Nombre;
	}

	public int getEdad() {
		return this.edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getEstatura() {
		return this.estatura;
	}

	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}


    
}
