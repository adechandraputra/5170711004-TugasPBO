package pbotugaspengganti;
import java.util.Scanner;
public class PBOTugasPengganti {

static Scanner masuk = new Scanner(System.in);

    public static void main(String[] args) {
        Laki muani = new Laki();
        Perempuan luh = new Perempuan();
        String gender;
        System.out.print("Masukkan Jenis Kelamin (l/p) : ");
        gender = masuk.next();
            switch(gender){
                case "l" :
                        System.out.println("");
                        System.out.println("----------------");
                        System.out.println("Ciri Laki - Laki");
                        System.out.println("----------------");
                        muani.FisikUniversal1();
                        muani.FisikUniversal2();
                        muani.Fisik();
                        muani.Karakter();
                        break;
                case "p" :
                        System.out.println("");
                        System.out.println("--------------");
                        System.out.println("Ciri Perempuan");
                        System.out.println("--------------");
                        luh.FisikUniversal1();
                        luh.FisikUniversal2();
                        luh.Fisik();
                        luh.Karakter();
                        break;
                default :
                        System.out.println("---------------------------");
                        System.out.println("Kata Kunci Salah, Coba Lagi");
                        System.out.println("---------------------------");
            } 
    }
}
