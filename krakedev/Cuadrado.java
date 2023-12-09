package krakedev;

public class Cuadrado {


public double lado;

public double calcularArea() {
    return lado * lado;
}

public double calcularPerimetro() {
    return 4 * lado;
}

public void setLado(double lado) {
    this.lado = lado;
}


}
