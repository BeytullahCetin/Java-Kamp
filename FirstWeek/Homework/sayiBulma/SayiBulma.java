package FirstWeek.Homework.sayiBulma;

public class SayiBulma {
    public static void main(String[] args) {
        int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
        int aranacakSayi = 5;

        boolean varMi = false;

        for (int i : sayilar) {
            if(aranacakSayi == i)
            {
                varMi = true;
                break;
            }
        }    

        if(varMi)
        {
            System.out.println("Sayi var");
        }else{
            System.out.println("Sayi yok");
        }
    
    }

}
