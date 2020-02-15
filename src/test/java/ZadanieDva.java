import org.junit.jupiter.api.Test;

public class ZadanieDva {
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
}
