import org.junit.jupiter.api.Test;

public class DomashkaPervaja {

    private Object String;

    @Test

    public void zadanieOdin() {
        String marka = "Жига";
        String probeg = "999999";
        String cena = "00.01";

        System.out.println("Продаем машину " + marka + " с пробегом " + probeg + " за " + cena + " денег");

    }

    @Test
    public void zadanieDva() {

        double rashodMarshrut = rashodMarshrutMetod(20, 1215.32);
         double cena = rashodMarshrut * 3.57;
        System.out.println(cena);
    }
    private double rashodMarshrutMetod(double rashod, double marshrut){
        double rashodMarshrut = rashod * marshrut / 100;
        System.out.println(rashodMarshrut);
        return rashodMarshrut;
    }

    @Test
    public void zadanieTri(){
        String day = "01";
        String month = "02";
        String year = "90";
        String denj = denjMetod(01);
        String mesjac = mesjacMetod(02);
        String god = godMetod(90);
        String personalCode = day + month + year + "11170";
        System.out.println("Дата рождения: " + denj + mesjac + god + ".");
    }

    private String denjMetod(int day){
        String nazvanieDnja = "1";
        System.out.println(nazvanieDnja);
        return nazvanieDnja;
    }

    private String mesjacMetod(int month){
        String nazvanieMesjaca = " февраля";
        System.out.println(nazvanieMesjaca);
        return nazvanieMesjaca;
    }

    private String godMetod(int year){
        String nazvanieGoda = " 1990 года";
        System.out.println(nazvanieGoda);
        return nazvanieGoda;
    }
}

