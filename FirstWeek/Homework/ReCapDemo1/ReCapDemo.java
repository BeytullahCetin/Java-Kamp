package FirstWeek.Homework.ReCapDemo1;

public class ReCapDemo {
   public static void main(String[] args) {
      int sayi1 = 2231;
      int sayi2 = 25;
      int sayi3 = 2;

      int enBuyuk = sayi1;

      if (enBuyuk < sayi2) {
         enBuyuk = sayi2;
      }

      if (enBuyuk < sayi3) {
         enBuyuk = sayi3;
      }

      System.out.println("En büyük: " + enBuyuk);
   }
}
