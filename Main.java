import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Singa singa = new Singa("Simba", 190.0);
        Elang elang = new Elang("Rajawali", 4.0);
        Pinguin pinguin = new Pinguin("Pingu", 30.0);
        // Hewan h = new Hewan("X", 1.0); // ERROR: Hewan adalah abstract class

        // POLYMORPHISM: variabel bertipe Hewan menampung objek subclass.
        // bersuara() & hitungPakan() yang dijalankan adalah versi milik objek aslinya.
        List<Hewan> kebun = Arrays.asList(singa, elang, pinguin);
        System.out.println("=== Polymorphism ===");
        for (Hewan h : kebun) {
            System.out.println(h.info());
            System.out.println("  Suara: " + h.bersuara() + " | Pakan: "
                    + String.format(Locale.US, "%.1f", h.hitungPakan()) + " kg");
        }

        // INTERFACE: cek kemampuan hewan dengan instanceof
        System.out.println("\n=== Interface ===");
        for (Hewan h : kebun) {
            if (h instanceof BisaTerbang) {
                ((BisaTerbang) h).terbang();
            }
            if (h instanceof BisaBerenang) {
                ((BisaBerenang) h).berenang();
            }
        }

        // OVERLOADING: dua versi beriMakan()
        System.out.println("\n=== Overloading ===");
        singa.beriMakan();
        singa.beriMakan(7.5);
    }
}
