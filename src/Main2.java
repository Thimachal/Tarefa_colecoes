//parte 2
import java.util.Arrays;
public class Main2 {
    public static void main(String[] args) {
        String name = "Joao-m,Marcela-f,Isabela-f,Thiago-m,Neuza-f";
        String [] resultName = name.split(",");
        String [] male = new String[30];
        String [] female = new String[30];;
        int cont1=0,cont2=0;


        Arrays.sort(resultName);
        for (String names: resultName ) {
            System.out.println(names);
        }
        for (String names: resultName) {
            if (names.contains("-m")) {
                male[cont1] = names;
                cont1++;
            } else if (names.contains("-f")) {
                female[cont2] = names;
            }
        }
        System.out.print("Grupo Masculino: ");
        for (String newNames: male) {
            System.out.print(newNames + ", ");
        }
        System.out.println();
        System.out.print("Grupo Feminino: ");
        for (String newNames: female) {
            System.out.print(newNames + ", ");
        }

    }
}