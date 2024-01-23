package inheritance;
public class Inheritance {
    public static void main(String[] args) {
        
        BangunDatar bangunDatar = new BangunDatar();
        
        
        persegi persegi = new persegi();
        persegi.sisi = 2;
        
        
        lingkaran lingkaran = new lingkaran();
        lingkaran.r = 22;
        
        
        PersegiPanjang persegiPanjang = new PersegiPanjang();
        persegiPanjang.panjang = 8;
        persegiPanjang.lebar = 4;
        
        
        segitiga mSegitiga = new segitiga();
        mSegitiga.alas = 12;
        mSegitiga.tinggi = 8;
        
        
        
        bangunDatar.luas();
        bangunDatar.keliling();
        
        persegi.luas();
        persegi.keliling();
        
        lingkaran.luas();
        lingkaran.keliling();
        
        persegiPanjang.luas();
        persegiPanjang.keliling();
        
        mSegitiga.luas();
        mSegitiga.keliling();
    }
}