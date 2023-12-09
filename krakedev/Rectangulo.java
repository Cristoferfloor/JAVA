package krakedev;

public class Rectangulo {

    public int base;

    public int altura;

    public int getBase() {
        return this.base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltur() {
        return this.altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }


    public int calcularArea(){
     int area;

     area = base*altura;
        return area;
    }

    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    
    
}
