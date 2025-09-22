import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 5;
        arr[1] = 10;
        arr[2] = 15;


        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

        String digitStr = "25";
        int number = Integer.parseInt(digitStr);
        System.out.println(number);

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();

        Person a = new Person("Иван", "Иванов", "Иванович");
        System.out.println(a);

    }
}