//parte 1
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String name;
        System.out.println("Digite os nomes seguido da virgula sem os espaços,");
        name = scanner.next();

        String [] resultName = name.split(",");

        Arrays.sort(resultName);
        for (String names: resultName) {
            System.out.print(names + ", ");
        }


    }
}