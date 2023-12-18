// Integer Calculator

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int res=0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = scan.nextInt();
        System.out.print("Enter second number: ");
        int b = scan.nextInt();
        System.out.println(
                "##################\nSelect your operation:\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n##################\n");
        System.out.print("Your Choice: ");
        int choice = scan.nextInt();
        switch (choice) {
            case 1:
                res = Calculate.add(a, b);
                break;
            case 2:
                res = Calculate.sub(a, b);
                break;
            case 3:
                res = Calculate.mult(a, b);
                break;
            case 4:
                res = Calculate.div(a, b);
                break;
            default:
                System.out.println("Wrong choice!!!");
                break;
        }
        ;
        scan.close();
        System.out.print("\nResult: ");
        System.out.print(res);

    }
}

class Calculate {
    public static int add(int a, int b) {
        return (a + b);

    }

    public static int sub(int a, int b) {
        return (a - b);
    }

    public static int mult(int a, int b) {
        return (a * b);
    }

    public static int div(int a, int b) {
        return (a / b);
    }
}