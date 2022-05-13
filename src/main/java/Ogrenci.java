public class Ogrenci {
    String ad;
    String soyad;
    Okul okul;// birnesneyi başka bir nesne içerisinde verebiliriz.

    public static void main(String[] args) {
        Ogrenci ogr=new Ogrenci();
        ogr.ad="Veysel";
        ogr.soyad="Öner"; // . ile üst sınıftanda erişir. Javada her sınıf bir sınıftan inherit alır
        //Object sınıfından
        System.out.println();
    }
}
