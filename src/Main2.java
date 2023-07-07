//parte 2
import java.util.Arrays;
public class Main2 {
    public static void main(String[] args) {
        String name = "Joao,Marcela,Isabela,Thiago,Neuza";
        String [] resultName = name.split(",");


        Arrays.sort(resultName);
        for (String names: resultName) {
            System.out.print(names + ", ");
        }


    }
}