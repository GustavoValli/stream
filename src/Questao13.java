import java.util.Arrays;
import java.util.List;

//Filtrar os números que estão dentro de um intervalo
public class Questao13 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int min = 0;
        int max = 5;

        System.out.println(numeros.stream().filter(n -> n >= min && n <= max).toList());
    }
}
