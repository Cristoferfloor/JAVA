package krakedev;

public class TestCuadrado {

    public static void main(String[] args) {
        

        Cuadrado l1 = new Cuadrado();

        l1.setLado(6);;

         Cuadrado C1 = new Cuadrado();

         Cuadrado C2 = new Cuadrado();

         Cuadrado C3 = new Cuadrado();

         C1.setLado(3);;
         C2.setLado(4);;
         C3.setLado(5);;

         double areaCuadrado1 = C1.calcularArea();
        double areaCuadrado2 = C2.calcularArea();
        double areaCuadrado3 = C3.calcularArea();




        double areaCuadrado4 = l1.calcularArea();



        System.out.println("Área del cuadrado 1: " + areaCuadrado4);

        System.out.println("Área 1: " + areaCuadrado1);
        System.out.println("Área 2: " + areaCuadrado2);
        System.out.println("Área 3: " + areaCuadrado3);

        System.out.println("-------------------------------------");



        double perimetroCuadrado1 = C1.calcularPerimetro();
        double perimetroCuadrado2 = C2.calcularPerimetro();
        double perimetroCuadrado3 = C3.calcularPerimetro();


        System.out.println("Perímetro 1: " + perimetroCuadrado1);
        System.out.println("Perímetro 2: " + perimetroCuadrado2);
        System.out.println("Perímetro 3: " + perimetroCuadrado3);
    }
    
}
