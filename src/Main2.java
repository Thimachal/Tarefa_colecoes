//parte 2
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        //String name = "Joao-m,Marcela-f,Isabela-f,Thiago-m,Neuza-f";
        String name;
        System.out.println("Digite o nome da pessoa o genero");
        System.out.println("m se for masculino e f se for feminino");
        System.out.println("seguido de traço - e após isso digitar virgula ,");
        System.out.println("Exemplo: thiago-m,maria-f");

        name=scanner.next();

        String [] resultName = name.split(",");

        List<String> male = new ArrayList<String>();
        List<String> female = new ArrayList<String>();

        Arrays.sort(resultName);

        for (String names: resultName) {
            if(names.contains("-m")){
                male.add(names);
            } else if (names.contains("-f")) {
                female.add(names);
            }
        }

        System.out.println("Pessoas do gênero masculino:" + male);
        System.out.println("Pessoas do gÊnero masculino:" + female);

    }
}