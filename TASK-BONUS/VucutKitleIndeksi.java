public class VucutKitleIndeksi {
    public static void main(String[] args) {

        double kilo = 74.0;   // kg
        double boy = 1.73;    // metre

        double bmi = kilo / (boy * boy);

        System.out.printf("Kilo: %.1f kg, Boy: %.2f m -> BMI: %.2f\n", kilo, boy, bmi);
    }
}
