public class MiniProjeAsalSayi {
    public static void main(String[] args) {

        int number = 421;
        boolean isPrime = true;

        if (number == 1) {
            System.out.println("Sayi asal değildir");
        } else if (number < 1) {
            System.out.println("Geçersiz sayi");
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                    // break kullanımı 19. videoya kadar videolarda henüz gösterilmedi.
                    // break kullanmasakta çözmesine rağmen kullanmak optimizasyon açısından daha faydalı olacaktır.
                    
                    // peki break anahtar kelimesi nedir? neden kullanılır? bir loop içerisinde break anahtar kelimesini 
                    //kullandığımızda program o anda looptan çıkar ve loopun dışındaki kodları işlemeye devam eder.

                    // detaylı bilgili için google'da break ve continue nedir? diye arama yapabilirsiniz.
                }
            }

            if (isPrime) {
                System.out.println("Sayi asaldır");
            } else {
                System.out.println("Sayi asal değildir");
            }
        }

    }
}
