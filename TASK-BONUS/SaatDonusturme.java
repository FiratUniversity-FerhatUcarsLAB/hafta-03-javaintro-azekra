public class SaatDonusturme {
    public static void main(String[] args) {

        int toplamSaniye = 8754;

        // Saat, dakika ve saniye hesapla
        int saat = toplamSaniye / 3600;
        int dakika = (toplamSaniye % 3600) / 60;
        int saniye = toplamSaniye % 60;

        // Formatlı çıktı
        System.out.printf("%d saniye = %d:%02d:%02d\n", toplamSaniye, saat, dakika, saniye);
    }
}
