import java.util.Arrays;
import java.util.List;

//Verificar se todos os números da lista são distintos (não se repetem)
public class Questao09 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.println(numeros.stream().distinct().toList());
    }
}
