package krakedev;

public class Auto {
	
    public String marca;
    public int anio;
    public double precio;


    public Auto(String marca, int anio , double precio){

        this.marca=marca;
        this.anio=anio;
        this.precio=precio;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnio() {
        return this.anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    

}
