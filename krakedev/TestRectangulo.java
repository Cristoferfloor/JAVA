package krakedev;

public class TestRectangulo {

    public static void main(String[] args) {
        
        Rectangulo r1 = new Rectangulo();
        Rectangulo r2 = new Rectangulo();

         Rectangulo peri = new Rectangulo();
         Rectangulo peri2 = new Rectangulo();

        peri.base=7;

        peri.altura=2;

        peri2.base=4;

        peri2.altura=3;

        int areas;

        r1.base=10;

        r1.altura= 5;


        r2.base = 7;

        r2.altura = 2;

     int areas1;


       areas = r1.calcularArea();
       areas1 = r2.calcularArea();

       double perimetro1 = peri.calcularPerimetro();
        double perimetro2 = peri2.calcularPerimetro();

        System.out.println("Area r1 es "+areas );

         System.out.println("Area r1 es "+areas1 );
        System.out.println("-----------------------------------" );

         System.out.println("Perímetro del rectángulo 1: " + perimetro1);
        System.out.println("Perímetro del rectángulo 2: " + perimetro2);

    }
    
}
