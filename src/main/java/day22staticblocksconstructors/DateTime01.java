package day22staticblocksconstructors;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;

public class DateTime01 {

    public static void main(String[] args) {

        Date myDate = new Date();
        System.out.println("myDate = " + myDate); //myDate = Sat Jan 07 23:26:55 EET 2023
        System.out.println(myDate.getTime()); //1673123311609 ==> 1 Ocak 1970'ten su ana kadarki mili-saniye miktari

        //Icinde bulundugumuz an nasil alinir?
        System.out.println(LocalDate.now()); //2023-01-07

        System.out.println(LocalTime.now()); //23:35:23.361062

        System.out.println(LocalDateTime.now()); //2023-01-07T23:36:22.035249

        //Dunyanin herhangi bir saat dilimindeki saati nasil aliriz?
        System.out.println(LocalDateTime.now(ZoneId.of("Europe/Vienna"))); //2023-01-07T21:44:26.908363
        System.out.println(LocalDateTime.now(ZoneId.of("Asia/Tokyo"))); //2023-01-08T05:45:35.016825
        System.out.println(LocalDateTime.now(ZoneId.of("Europe/Moscow"))); //2023-01-07T23:46:16.907005

        //Ileri bir tarihe nasil gidilir?
        System.out.println(LocalDate.now().plusYears(7).plusMonths(5).plusDays(35)); //2030-07-12


        //Geri bir tarihe nasil gidilir?
        System.out.println(LocalDate.now().minusYears(4).minusMonths(3).minusDays(2)); //2018-10-05

        //Ileri bir zamana nasil gidilir?
        System.out.println(LocalTime.now().plusHours(3)); //02:58:05.316110


        //Geri bir tarihe nasil gidilir?
        System.out.println(LocalTime.now().minusMinutes(45)); //23:13:05.316219

        //Zamanda belli bir bolumu nasil aliriz?
        System.out.println(LocalTime.now().getHour() + " : " + LocalTime.now().getMinute()); // 0 : 0

        //Tarihte belli bir bolumu nasil aliriz?
        System.out.println(LocalDate.now().getMonth() + " : " + LocalDate.now().getDayOfMonth()); //JANUARY : 8
        System.out.println(LocalDate.now().getMonthValue() + " : " + LocalDate.now().getDayOfMonth()); //1 : 8

        //Iki tarih nasil karsilastirilir?
        //02/13/2005 - 03/01/2007
        boolean result = LocalDate.of(2005, 02, 13).isBefore(LocalDate.of(2007, 03, 01));
        boolean result2 = LocalDate.of(2005, 02, 13).isAfter(LocalDate.of(2007, 03, 01));
        System.out.println("result = " + result); //result = true
        System.out.println("result2 = " + result2); //result2 = false

        //Tarihlerin formatlari nasil degistirilir?
        //M --> Tek rakamla ay no'sunu yazar - MM --> Iki rakamla ay no'sunu yazar
        //MMM --> Ay isminin ilk uc harfini yazar - MMMM --> Ay isminin tamamini yazar

        //d--> Tek rakamla gun no'sunu yazar - --> dd--> Iki rakamla gun no'sunu yazar

        //yy--> Yilin son iki rakamini yazar - yyyy--> Yilin tamamini yazar
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println(dtf.format(LocalDate.now())); //08/01/2023



    }
}
