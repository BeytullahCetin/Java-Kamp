package SecondWeek.Homework.methods;

public class Methods {
    public static void main(String[] args) {
        sayiBulmaca();
    }

    public static void sayiBulmaca() {
        int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
        int aranacakSayi = 5;

        boolean varMi = false;

        for (int i : sayilar) {
            if (aranacakSayi == i) {
                varMi = true;
                break;
            }
        }

        if (varMi) {
            mesajVer("Sayi var: " + aranacakSayi);
        } else {
            mesajVer("Sayi yok: " + aranacakSayi);
        }
    }

    public static void mesajVer(String aranacak){
        System.out.println(aranacak);
    }
    
}
