package ssg_passbyvaluemethodoverloading;

public class PassByValue01 {

    public static void main(String[] args) {

        double ayakkabi = 100;
        double ogrenciFiyat = indirim("ogrenci", ayakkabi);
        double yasliFiyat = indirim("yaslilar", ayakkabi);
        double gaziFiyati = indirim("gaziler", ayakkabi);


    }


    public static double indirim(String durum, double fiyat){
        switch(durum){
            case "ogrenci":
                fiyat = fiyat * 0.90;
                break;
            case "yaslilar":
                fiyat = fiyat * 0.95;
                break;
            case "gaziler":
                fiyat = fiyat * 0.70;
                break;
            default:
                fiyat = fiyat;
        }
        return fiyat;
    }
}
