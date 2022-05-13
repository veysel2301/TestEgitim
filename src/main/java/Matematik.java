public class Matematik {
    public static void main(String[] args) {
        System.out.println(topla(5,4,3,2,1));
    }
    public static int topla(int...deger){// ... n kadar değer alma demektir.
        int toplam=0;
        for (int i:deger){
            toplam+=i;

        }
        return toplam;

    }

}
