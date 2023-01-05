package practice.nighttime.nighttime04;

public class C03_DoWhileLoopMaymunSurvive {



    /*
    INTERVIEW SORUSU:

    Adada yalnız bir maymun var
    Her gün 4 muz yemesi gerekiyor
    o adada sadece 165 muz var
    Maymunun kac gun hayatta kalabilecegini hesaplayan kodu yaziniz.
    */

    public static void main(String[] args) {

        int numberOfBananas = 165;   //4   8    12 ... 164 ==> geriye 1 muz kaldi, yasamasi icin yeterli degil.
        int survivalDays = 1;        //1   2    3  ... 41  ==> 42. gun oldu.
        boolean isMonkeyAlive = true;

        do {
            System.out.println(" ********* maymunlar yasamak icin gunde 4 muz yer *********"); // Herhangi bir islevi yok, tamamen susleme amacli.
            numberOfBananas -= 4; //numberOfBananas = numberOfBananas -4
            System.out.println("Kalan muz sayisi : " + numberOfBananas);
            survivalDays++;

            if(numberOfBananas<4){  // Kalan muz sayisi 4'un altina dustugunde devreye girecek olan sart.
                isMonkeyAlive = false;
                System.out.println("Bugun " + survivalDays + ". gun yeterli muz kalmadi. \nMaymun sizlere omur :(");
                System.out.println("Maymun " + survivalDays+ ". gun sonunda oldu.");
            }else
                System.out.println("Bugun " + survivalDays + ".gun, maymun yasiyor.");
        } while (isMonkeyAlive);


    }


}
