public class UcgenAlanHesap {
    public static void main(String[] args) {

        // Üçgenin kenar uzunlukları
        double a = 3.0;
        double b = 4.0;
        double c = 5.0;

        // Yarı çevre (s) hesapla
        double s = (a + b + c) / 2.0;

        // Heron formülü ile alan hesapla
        double alan = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        // Sonuçları yazdır
        System.out.println("Kenarlar: a=" + a + ", b=" + b + ", c=" + c);
        System.out.println("Yari cevre (s): " + s);
        System.out.println("Alan (Heron): " + alan);
    }
}
