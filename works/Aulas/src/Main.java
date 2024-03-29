import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a name: ");
        String name = scanner.nextLine();
        System.out.print("Enter the value: ");
        Double value = scanner.nextDouble();
        System.out.print("Enter the code: ");
        Integer code = scanner.nextInt();

        Test test = new Test(name, value, code);

        System.out.println(test.toString());
        scanner.close();
    }
}