package inheritance;
public class segitiga extends BangunDatar {
    
    double alas;
    double tinggi;
    @Override
    double luas() {
        double luas = 1/2 * (alas * tinggi);
        System.out.println("Luas Segitiga: " + luas);
        return luas;
    }   
    
}