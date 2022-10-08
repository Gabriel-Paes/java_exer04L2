import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("Digite um número: ");

        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        sc.close();

        String retorno = verificaPositivoOuNegativo(n);

        System.out.println("O número "+ n +" é um número "+retorno);
    }
    public static String verificaPositivoOuNegativo(int n){
        if (n <= 0) {
            return "N";
        } else {
            return "P";
        }
    }
}
