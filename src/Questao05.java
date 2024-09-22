import java.util.Arrays;
import java.util.List;

//Calcule a média dos números maiores que 5
public class Questao05 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        double media = (double) (numeros.stream().filter(n -> n > 5).reduce(0, Integer::sum)) / (numeros.stream().filter(n -> n > 5).count());
        System.out.println(media);
    }
}
