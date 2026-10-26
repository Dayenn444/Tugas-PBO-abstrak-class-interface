/** Pinguin adalah burung yang tidak bisa terbang, jadi hanya implements BisaBerenang. */
public class Pinguin extends Hewan implements BisaBerenang {

    public Pinguin(String nama, double berat) {
        super(nama, berat);
    }

    @Override
    public String bersuara() {
        return "Honk!";
    }

    @Override
    public double hitungPakan() {
        return berat * 0.15; // 15% berat badan
    }

    @Override
    public void berenang() {
        System.out.println(nama + " berenang cepat");
    }
}
