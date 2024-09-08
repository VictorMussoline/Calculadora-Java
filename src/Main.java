import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();;
        System.out.print("Digite a operação (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        scanner.close();
        double result;
    }
}