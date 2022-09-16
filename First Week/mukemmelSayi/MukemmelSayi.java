public class MukemmelSayi {
    public static void main(String[] args) {
        int number = 218;
        int sum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0)
                sum += i;
        }

        if (sum == number) {
            System.out.println(number + " : Mükemmel sayıdır");
        } else {
            System.out.println(number + " : Mükemmel sayı değildir");
        }

    }
}
