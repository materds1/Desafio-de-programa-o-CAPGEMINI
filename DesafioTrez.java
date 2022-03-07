import java.util.Scanner;

public class AtividadeTreis {
    public static void main(String[] args) {
            Scanner leitor = new Scanner(System.in);
            String palavra = leitor.next();
            String novaPalavra = "";

            for (int i = palavra.length() - 1; i >= 0;  i-- ) {
                novaPalavra = novaPalavra + Character.toString(palavra.charAt(i))+ ;

            }
            System.out.println("\n"+ novaPalavra +"\n");
        }

    }



