import java.util.Locale;

/**
 * ABSTRACT CLASS: induk semua hewan. Tidak bisa di-new.
 * Punya abstract method (wajib di-override subclass) dan method biasa (diwariskan).
 */
public abstract class Hewan {
    protected String nama;
    protected double berat; // kg

    public Hewan(String nama, double berat) {
        this.nama = nama;
        this.berat = berat;
    }

    // ABSTRACT METHOD: isinya ditentukan oleh subclass
    public abstract String bersuara();
    public abstract double hitungPakan(); // kg per hari

    // Method biasa: diwariskan ke semua subclass (INHERITANCE)
    public String info() {
        return getClass().getSimpleName() + " " + nama + " (" + fmt(berat) + " kg)";
    }

    // OVERLOADING: nama sama, parameter beda
    public void beriMakan() {
        System.out.println(nama + " diberi porsi standar " + fmt(hitungPakan()) + " kg");
    }

    public void beriMakan(double kg) {
        System.out.println(nama + " diberi " + fmt(kg) + " kg");
    }

    protected static String fmt(double v) {
        return String.format(Locale.US, "%.1f", v);
    }
}
