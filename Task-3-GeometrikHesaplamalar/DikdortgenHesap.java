public class DikdortgenHesap {
    public static void main(String[] args) {
        // Dikdörtgenin kenar uzunlukları
        double en = 4.5;
        double boy = 7.9;
        // Alan hesapla
        double alan = en * boy;
        // Çevre hesapla
        double cevre = 2 * (en + boy);
        // Sonuçları ekrana yazdır
        System.out.println("En: " + en + ", Boy: " + boy);
        System.out.println("Alan: " + alan);
        System.out.println("cevre: " + cevre);
    }
}
