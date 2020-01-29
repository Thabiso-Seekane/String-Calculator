import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("please provide numbers");

        String number = input.nextLine();

        Calculator.add(number);



    }
}
