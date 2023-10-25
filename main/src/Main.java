
public class Main {
    public static void main(String[] args)  {
        // Crear instancias de las formas
        Cuadrado miCuadrado = new Cuadrado(5);
        Circulo miCirculo = new Circulo(3);
        Paralelogramo miParalelogramo = new Paralelogramo(4.2,5.2);
        Rectangulo miRectangulo = new Rectangulo(3,2);

        // Calcular y mostrar áreas y perímetros
        System.out.println("Área del cuadrado: " + miCuadrado.calcularArea());
        System.out.println("Perímetro del cuadrado: " + miCuadrado.calcularPerimetro());

        System.out.println("Área del círculo: " + miCirculo.calcularArea());
        System.out.println("Perímetro del círculo: " + miCirculo.calcularPerimetro());

        System.out.println("Área del Paralelogramo: " + miParalelogramo.calcularArea());
        System.out.println("Perímetro del Paralelogramo: " + miParalelogramo.calcularPerimetro());

        System.out.println("Área del Rectangulo: " + miRectangulo.calcularArea());
        System.out.println("Perímetro del Rectangulo: " + miRectangulo.calcularPerimetro());
    }
}

