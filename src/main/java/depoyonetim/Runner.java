package depoyonetim;

import java.util.Scanner;

import static depoyonetim.Depo.urun;

public class Runner {

    public static void main(String[] args) {
        urun();
        menu();
    }

    public static void menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\t === MENU SEÇENEKLERİ ===\t\n" +
                "URUN MIKTARINI GUNCELLEMEK ICIN '1' SECINIZ\n" +
                "URUNU RAFA KOYMAK ICIN '2' SECINIZ\n" +
                "URUN CIKISI ICIN '3' SECINIZ\n" +
                "URUN LISTESI ICIN '4' SECINIZ \n" +
                "SISTEMDEN CIKIS ICIN '0' SECINIZ\n");

        int select = sc.nextInt();
        System.out.println("----------------------------------------------------");

        switch (select) {
            case 1:
                Depo.miktarGuncelle();
                break;
            case 2:
                Depo.urunuRafaKoyma();
                break;
            case 3 :
                Depo.urunCikisi();
                break;
            case 4:
                Depo.urunListesi();
                break;
            case 0:
                System.out.println("Iyi Gunler.. ");
                System.out.println();
                break;
            default:
                System.out.println("Hatali Giris");
                break;
        }
    }
}
