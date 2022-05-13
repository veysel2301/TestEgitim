public class Okul {
    private String adres;
   private String adı;
    private int year;

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

//    public Okul(String adres, String adı, int year) {
//        this.adres = adres;
//        this.adı = adı;
//        this.year = year;
//    }

    public String getAdı() {
        return adı;
    }

    public void setAdı(String adı) {
        this.adı = adı;
    }

    public int getYear(int i) {
        return year;
    }

    public void setYear(int year) {
        this.year = year; //sınıfın deişkenini setliyor. sınıfın içindekini alıyor yani İçerisinde bulunduğumuz neseneyi işaretler.
    } // kodları constructor vs ksa tutmak için lombok kull .@data yazarak

    public static void main(String[] args) {



    }}

