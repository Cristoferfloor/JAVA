package krakedev;

public class Calculadora {

    public int sumar(int valor1, int valor2){
        int resultado;
        resultado = valor1+valor2;
        return resultado;
    }

    public  double multiplicar(double valor1, double valor2) {
        double producto = valor1 * valor2;
        return producto;
    }

     public int resta(int valor1, int valor2){
        int resultado;
        resultado = valor1-valor2;
        return resultado;
    }
    
    public  double dividir(double dividendo, double divisor) {
        
        if (divisor != 0) {
            double cociente = dividendo / divisor;
            return cociente;
        } else {
            
            System.out.println("Error: No se puede dividir por cero.");
            return Double.NaN;  
        }
    }

    public  double promediar(double valor1, double valor2, double valor3) {
        
        double suma = valor1 + valor2 + valor3;
        double promedio = suma / 3.0;

        return promedio;
    }

    public  void mostrarResultado() {
        System.out.println("Ahorita no joven, Salí al almuerzo. Regreso en 15 minutos");
    }
}
