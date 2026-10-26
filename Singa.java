/** INHERITANCE: Singa mewarisi Hewan (extends). */
public class Singa extends Hewan {

    public Singa(String nama, double berat) {
        super(nama, berat); // memanggil constructor Hewan
    }

    @Override // OVERRIDING
    public String bersuara() {
        return "Roaarr!";
    }

    @Override // OVERRIDING
    public double hitungPakan() {
        return berat * 0.05; // 5% berat badan
    }
}
