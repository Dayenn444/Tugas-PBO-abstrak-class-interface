/** extends Hewan (inheritance) + implements BisaTerbang (interface). */
public class Elang extends Hewan implements BisaTerbang {

    public Elang(String nama, double berat) {
        super(nama, berat);
    }

    @Override
    public String bersuara() {
        return "Kiiik!";
    }

    @Override
    public double hitungPakan() {
        return berat * 0.10; // 10% berat badan
    }

    @Override // implementasi method interface
    public void terbang() {
        System.out.println(nama + " terbang tinggi");
    }
}
