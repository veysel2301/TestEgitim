import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
    yazdir();
    }



    public static int topla(int...deger){// ... n kadar değer alma demektir.
        int toplam=0;
        for (int i:deger){
            toplam+=i;

        }
        return toplam;

    }
    public static int cikar(int...deger){// ... n kadar değer alma demektir.
        int cikar=0;
        for (int i:deger){
            cikar+=i;

        }
        return cikar;

    }
    public static int carp(int...deger){// ... n kadar değer alma demektir.
        int carp=1;
        for (int i:deger){
            carp*=i;

        }
        return carp;

    }
    public static int bol(int a ,int b){// ... n kadar değer alma demektir.
        int bolum=1;

            bolum=a/b;


        return bolum;

    }
    public static int kareAl(int a) {
      int kareAlma=a*a;
        return kareAlma;
}
public static void yazdir(){
    System.out.println("toplam ="+topla(3));
    System.out.println("fark ="+cikar(2));
    System.out.println("karesi ="+kareAl(5));
    System.out.println("Bölme işlemi sonucu ="+bol(5,4));
    }
}