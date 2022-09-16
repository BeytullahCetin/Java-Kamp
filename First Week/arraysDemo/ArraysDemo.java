public class ArraysDemo {
    public static void main(String[] args) {
        String ogrenici1 = "Engin";
        String ogrenici2 = "Derin";
        String ogrenici3 = "Salih";
        String ogrenici4 = "Ahmet";

        System.out.println(ogrenici1);
        System.out.println(ogrenici2);
        System.out.println(ogrenici3);
        System.out.println(ogrenici4);

        System.out.println("----------------------");

        String[] ogrenciler = new String[4];

        ogrenciler[0] = "ENGİN";
        ogrenciler[1] = "DERİN";
        ogrenciler[2] = "SALİH";
        ogrenciler[3] = "AHMET";
        //ogrenciler[4] = "ALİ";

        for(int i = 0; i < ogrenciler.length; i++)
        {
            System.out.println(ogrenciler[i]);
        }

        System.out.println("-------");

        for(String ogrenci : ogrenciler)
        {
            System.out.println(ogrenci);
        }
    }
}