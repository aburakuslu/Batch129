package advanced_practice.practice07;

import java.time.LocalDate;

public class Market {

    String urunAdi;
    Double urunFiyati;
    String sonKullanmaTarihi;

    Market(String urunAdi, double fiyat, int aySonra) {
        this.urunAdi = urunAdi;
        if (fiyat > 99) {
            fiyat = fiyat * 0.9;
        }
        urunFiyati = fiyat;
        sonKullanmaTarihi = LocalDate.now().plusMonths(aySonra).toString();
    }
    // Degisken isimleri ayni ise this keyword'unu kullaniriz.
    // Karisiklik olmasin diye this diyerek bu classtaki degisken  oldugunu belirtiyoruz.
    // Degisken isimleri farkli ise this keyword'unu kullnamaya gerek yok.

    Market(String urunAdi, double fiyat) {
        this.urunAdi = urunAdi;
        if (fiyat > 99) {
            fiyat = fiyat * 0.9;
        }
        urunFiyati = fiyat;
        sonKullanmaTarihi = "Bu urunun son kullanma tarihi yoktur";
    }

    Market() {
    }


    @Override
    public String toString() {
        return "Market{" +
                "urunAdi='" + urunAdi + '\'' +
                ", urunFiyati=" + urunFiyati +
                ", sonKullanmaTarihi='" + sonKullanmaTarihi + '\'' +
                '}';
    }
}
