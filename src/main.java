public class main {
    public static void main(String[] args) {


        int balance = 50;
        int score = 1001;


        int bonus = (score / 100);
        if (score >= 1000) {
            int result = (balance + score) + bonus;

            System.out.println("Итоговый счет" + result);
        } else {
            if (score >= 999) ;
            {

                System.out.println("Итоговый счет" + (balance + score));
            }
        }
    }


}

