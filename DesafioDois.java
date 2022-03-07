public class Atividade {
    public static void main(String[] args) {

        int[] valores = {1, 5, 3, 4, 2};
        int cont = 0;
        int x = 2;

        for (int i = 0; i < valores.length; i++) {
            int numeroIAtual = valores[i];

            for (int j = 0; j < valores.length; j++) {
                if ((numeroIAtual > valores[j]) && (numeroIAtual - valores [j] == x)) {
                    cont++;

                }
            }

        }
        System.out.println(cont);
    }

}






