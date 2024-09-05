package main;
import entidades.Retangulo;
import java.util.Scanner;
public class main1 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        Retangulo retangulo = new Retangulo();
        System.out.printf("Insira a largura e a altura do triângulo: \n");
        retangulo.altura = sc.nextDouble();
        retangulo.largura = sc.nextDouble();

        System.out.printf("\n");
        System.out.printf("AREA = " + retangulo.Area() + "\n");
        System.out.printf("PERIMETRO = " + retangulo.Perimetro() + "\n");
        System.out.printf("DIAGONAL = " + retangulo.Diagonal() + "\n");

        sc.close();
    }
}