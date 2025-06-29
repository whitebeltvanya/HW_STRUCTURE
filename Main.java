import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите цену товара (в руб.):");
        int priceRub = scanner.nextInt();

        System.out.print("Введите вес товара (в кг.):");
        int weightKg = scanner.nextInt();

        if (priceRub >=0 && weightKg >=0)
            System.out.println("ggg");
        else
            System.err.println("Неверно указан вес или цена товара!");

    }

}