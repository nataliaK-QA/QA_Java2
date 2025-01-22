public class main {
    public static void main(String[] args) {
        int balance = 50;
        int score = 8500;
        int bonus = 0; 

        // Определяем, сколько бонусных рублей получит клиент
        if (score >= 1001) {
            bonus = score / 100; // Расчёт бонусных рублей

            balance += score + bonus;
        } else {
            balance += score; // Если сумма пополнения меньше 1001, просто добавляем score к балансу
        }

        System.out.println("Итоговый счёт: " + balance);

        if (bonus > 0) {
            System.out.println("Бонусные рубли: " + bonus); // Проверяем, есть ли бонусные рубли
        } else {
            System.out.println("Бонусных рублей нет");
        }
    }
}