import java.util.Scanner;

public class Main {
    private static final double EXCHANGE_RATE = 77.72;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите тип конвертации:");
        System.out.println("1. Доллары в Рубли");
        System.out.println("2. Рубли в Доллары");
        System.out.print("Ваш выбор (1 или 2): ");

        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Введите сумму в долларах: ");
            double usd = scanner.nextDouble();
            double rub = usd * EXCHANGE_RATE;
            System.out.printf("%.2f USD = %.2f RUB%n", usd, rub);
        } else if (choice == 2) {
            System.out.print("Введите сумму в рублях: ");
            double rub = scanner.nextDouble();
            double usd = rub / EXCHANGE_RATE;
            System.out.printf("%.2f RUB = %.2f USD%n", rub, usd);
        } else {
            System.out.println("Неверный выбор.");
        }
        
        scanner.close();
    }
}