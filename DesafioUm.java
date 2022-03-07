
public class Mediana {
    public static void main(String[] args) {
        int[] valores = {90, 20, 40, 50, 23};
        int aux = 0;
        int i = 0;

        for (i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                if (valores[j] > valores[j + 1]) {
                    aux = valores[j];
                    valores[j] = valores[j + 1];
                    valores[j + 1] = aux;
                }
            }
        }
        int resultado = 0;
        for (i = 0; i < 5; i++) {
            resultado = valores[4] / 2;

        }
        System.out.println("Mediana:" + resultado);
    }
}