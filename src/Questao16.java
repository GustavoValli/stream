import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Agrupe os números em pares e ímpares
public class Questao16 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();

        numeros.stream().forEach((n) -> {
            if (n % 2 == 0) {
                pares.add(n);
            } else {
                impares.add(n);
            }
        });

        System.out.println("Números pares: " + pares);
        System.out.println("Números impares: " + impares);
    }
}
