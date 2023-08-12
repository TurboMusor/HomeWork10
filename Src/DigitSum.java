import java.util.Random;

public class DigitSum {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100_000) + 11;  // Генеруємо рандомне число від 11 до 100011

        int number = randomNumber;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;  // Отримуємо останню цифру числа
            sum += digit;  // Додаємо цифру до суми
            number /= 10;  // Видаляємо останню цифру числа
        }

        System.out.println("Згенероване число: " + randomNumber);
        System.out.println("Сума розрядів числа: " + sum);
    }
}
