import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Digite a operação (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();
        scanner.close();
        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Não é possível dividir um número por zero");
                    return;
                }
                break;
            default:
                System.out.println("Operação Inválida");
                return;
        }

        System.out.println(num1 + " " + operator + " " + num2 + ": " + result);
    }
}