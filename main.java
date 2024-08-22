import java.util.Scanner;
public class main {
    public static void main(String[] args){

    //Atividade 1

    String produto1 = "Computador";
    String produto2 = "Mesa de Escritório";
    int idade = 30;
    int codigo = 5290;
    char genero = 'F';
    double preco1 = 2100.0;
    double preco2 = 650.0;
    double medida = 53.234567;

    System.out.println("\nProdutos:");
    System.out.printf("%s, cujo preço é R$%.2f.", produto1, preco1);
    System.out.printf("\n%s, cujo preço é R$%.2f.", produto2, preco2);
    System.out.printf("\nRegistro: %d anos, código %d e gênero: %c.", idade, codigo, genero);
    System.out.printf("\nMedida: %.8f.", medida);
    System.out.printf("\nCercado: %.3f.", medida);
    System.out.printf("\nPonto decimal dos EUA: %.3f.\n\n\n", medida);

    //Atividade 2

    double basemenor = 6.0;
    double basemaior = 8.0;
    double altura = 5.0;
    double area = ((basemaior+basemenor)*altura)/2;
    System.out.printf("Área do Trapézio: %.2f.\n\n\n", area);

    //Atividade 3

    Scanner sc = new Scanner(System.in);

    int ndf;
    int ndht;
    double remu;

    System.out.printf("Insira a quantidade de funcionários:\n");
    ndf = sc.nextInt();
    System.out.printf("Insira o número de horas trabalhadas:\n");
    ndht = sc.nextInt();
    System.out.printf("Insira o valor da remuneração por hora:\n");
    remu =sc.nextDouble();

    double s = remu * ndht;

    System.out.printf("\nQuantidade de funcionários: %d", ndf);
    System.out.printf("\nNúmero de horas trabalhadas: %d", ndht);
    System.out.printf("\nSalário do funcionário: %.2f\n\n\n", s);

    //Atividade 4

    double A;
    double B;
    double C;
    double pi = 3.14159;

    System.out.printf("Insira o valor de A: \n");
    A = sc.nextDouble();
    System.out.printf("Insira o valor de B: \n");
    B = sc.nextDouble();
    System.out.printf("Insira o valor de C: \n");
    C = sc.nextDouble();

    double at = (A*C)/2;
    double ac = pi*(C*C);
    double atr = ((A+B)*C)/2;
    double aq = B*B;
    double ar = A*B;

    System.out.printf("\nÁrea do triângulo: %.3f.", at);
    System.out.printf("\nÁrea do cícrulo: %.3f.", ac);
    System.out.printf("\nÁrea do trapézio: %.3f.", atr);
    System.out.printf("\nÁrea do quadrado: %.3f.", aq);
    System.out.printf("\nÁrea do retângulo: %.3f.\n\n\n", ar);

    //Atvididade 5

    int a;
    int b;
    int c;
    int d;

        System.out.printf("Insira o valor de a: \n");
        a = sc.nextInt();
        System.out.printf("Insira o valor de b: \n");
        b = sc.nextInt();
        System.out.printf("Insira o valor de c: \n");
        c = sc.nextInt();
        System.out.printf("Insira o valor de d: \n");
        d =sc.nextInt();

        int dif = (a*b-c*d);

        System.out.printf("A diferença dos produtos é: %d", dif);

    sc.close();
    }
}