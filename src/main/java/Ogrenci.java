public class Ogrenci {
    String ad;
    String soyad;
    private Okul okul;// birnesneyi başka bir nesne içerisinde verebiliriz.Çağırma

    public static void main(String[] args) {
        Ogrenci ogr=new Ogrenci();
        ogr.ad="Veysel";
        ogr.soyad="Öner";// . ile üst sınıftanda erişir. Javada her sınıf bir sınıftan inherit alır
        Okul firat= new Okul();// hatanın sebebi oluşturulan constructorda değişken var.
        ogr.okul=firat;
        firat.setAdı("Fırat Üniversitesi");// private tanımlandığı için getter ve setter kullandık sağ tık generate üzerinden
        firat.getYear(2020);

        //Object sınıfından
        System.out.println(ogr.okul.getYear(2020));
    } // not 7,6,5,4,3,2,1 tane olacak şekilde x yaz

}
