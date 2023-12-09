package krakedev;

public class TestCalculadora {

    public static void main(String[] args) {

        Calculadora calcu;
        calcu = new Calculadora();

        int resultadoSuma;
        int resultadoResta;

        double resultadoMultiplicacion;

        double resultadodivicion;

        double promedio;


        
    
        
        promedio = calcu.promediar(7, 8, 10);

        resultadodivicion = calcu.dividir(4, 5);

        resultadoMultiplicacion = calcu.multiplicar(10.0, 5.0);

        resultadoResta=calcu.resta(2, 5);


        resultadoSuma=calcu.sumar(2, 5);
        
        System.out.println("Suma :" + resultadoSuma);

        System.out.println("Resta :" + resultadoResta);


        System.out.println("-------------------------------------");

         System.out.println("Multiplicacion :" + resultadoMultiplicacion);

         System.out.println("-------------------------------------");

         System.out.println("Dividir :" + resultadodivicion);

         System.out.println("-------------------------------------");

         System.out.println("Promedio :" + promedio);

         System.out.println("-------------------------------------");

         calcu.mostrarResultado();

         System.out.println("-------------------------------------");
         System.out.println("-------------------------------------");






    }
		
    
}
