package krakedev;

public class TestCuadrado {

    public static void main(String[] args) {
        

        Cuadrado l1 = new Cuadrado();

        l1.lado=6;

         Cuadrado C1 = new Cuadrado();

         Cuadrado C2 = new Cuadrado();

         Cuadrado C3 = new Cuadrado();

         C1.lado=3;
         C2.lado=4;
         C3.lado=5;

         double areaCuadrado1 = C1.calcularArea();
        double areaCuadrado2 = C2.calcularArea();
        double areaCuadrado3 = C3.calcularArea();




        double areaCuadrado4 = l1.calcularArea();



        System.out.println("Área del cuadrado 1: " + areaCuadrado4);

        System.out.println("Área del cuadrado 1: " + areaCuadrado1);
        System.out.println("Área del cuadrado 2: " + areaCuadrado2);
        System.out.println("Área del cuadrado 3: " + areaCuadrado3);

        System.out.println("-------------------------------------");



        double perimetroCuadrado1 = C1.calcularPerimetro();
        double perimetroCuadrado2 = C2.calcularPerimetro();
        double perimetroCuadrado3 = C3.calcularPerimetro();


        System.out.println("Perímetro del cuadrado 1: " + perimetroCuadrado1);
        System.out.println("Perímetro del cuadrado 2: " + perimetroCuadrado2);
        System.out.println("Perímetro del cuadrado 3: " + perimetroCuadrado3);
    }
    
}
