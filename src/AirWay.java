import java.util.Scanner;

public class AirWay {
    public static void main(String[] args) {
        Double distance, age, TransportType, Toplam, TotalToplam = null;
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Mesafeyi Giriniz");
        distance = input.nextDouble();
        System.out.println("Lütfen Yaşınızı Giriniz");
        age = input.nextDouble();
        System.out.println("Yolculuk Tipiniz Seçin: 1=> Tekyön , 2=> Gidiş-Dönüş");
        TransportType = input.nextDouble();
        Toplam = distance * 0.10 * TransportType;
        if (age < 12) {
            TotalToplam = Toplam * 50 / 100;
            if (TransportType == 2) {
                TotalToplam = TotalToplam * 20 / 100;
                System.out.println(Toplam-TotalToplam);
            } else {
                System.out.println(Toplam-TotalToplam);
            }
        } else if (age > 12 && age < 24) {
            TotalToplam = Toplam * 10 / 100;
            if (TransportType == 2) {
                TotalToplam = TotalToplam * 20 / 100;
                System.out.println(Toplam-TotalToplam);
            } else {
                System.out.println(Toplam-TotalToplam);
            }
        } else if (age > 65) {
            TotalToplam = Toplam * 30 / 100;
            if (TransportType == 2) {
                TotalToplam = TotalToplam * 20 / 100;
                System.out.println(Toplam-TotalToplam);
            } else {
                System.out.println(Toplam-TotalToplam);
            }
        }

    }
}