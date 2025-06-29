import java.util.Scanner;
import ru.netology.service.CustomsService;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int priceRub, weightKg;
        while (true) {
            System.out.print("Введите цену товара (в руб.):");
            priceRub = scanner.nextInt();

            System.out.print("Введите вес товара (в кг.):");
            weightKg = scanner.nextInt();

            if (priceRub < 0 || weightKg < 0) {
                System.out.println("Неверно указан вес или цена товара!");
            }
            else break;
        }

        System.out.print("Размер пошлины (в руб.) составит:" + CustomsService.calcTax(priceRub, weightKg));

    }


}