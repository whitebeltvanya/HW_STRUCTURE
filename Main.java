import java.util.Scanner;

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

        System.out.print("Размер пошлины (в руб.) составит:" +calcTax(priceRub, weightKg));

    }

    //calc incoming tax
    public static int calcTax (int priceRub, int weightKg){
            return priceRub/100 + weightKg*100;
    }

}