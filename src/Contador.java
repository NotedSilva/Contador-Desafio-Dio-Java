import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int n1 = input.nextInt();

        System.out.println("Digite o segundo númro: ");
        int n2 = input.nextInt();

            try {
                contar(n1, n2);
            } catch (ParametrosInvalidosException e) {
                System.out.println("O segundo parâmetro deve ser maior que o primeiro");
            }


    }
    static void contar(int n1, int n2) throws ParametrosInvalidosException {
        if (n1 >= n2) {
            throw new ParametrosInvalidosException();
        }

        int contagem = n2 - n1;
        for (int i = 0; i != contagem; i++) {
            System.out.print("Imprimindo o número " + (i+1) + " \n");
        }
    }
}
