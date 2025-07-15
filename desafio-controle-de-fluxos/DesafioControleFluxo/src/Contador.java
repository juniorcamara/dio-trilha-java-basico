import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número");
        int numero1 = sc.nextInt();
        System.out.println("Digite o segundo número");
        int numero2 = sc.nextInt();

        try {
            contador(numero1, numero2);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }


        sc.close();
    }
    public static void contador(int numero1, int numero2) throws ParametrosInvalidosException{
        if (numero1 >= numero2) {
            throw new ParametrosInvalidosException("O segundo parametro deve ser maior que o primeiro");
        }
        else{
            int resultado = numero2 - numero1;
            for(int i = 1; i<=resultado; i++){
                System.out.println(i);
            }
        }
    }
}
