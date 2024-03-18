import java.util.Scanner;


public class MLingkaran {
  
  public static void main(String[] args) {

    Lingkaran l = new Lingkaran(10.2);
    System.out.println("Luas lingkaran dengan jejari " + l.getJejari() + " adalah " + l.hitungLuas());

    Scanner scan = new Scanner(System.in);
    Lingkaran l2 = new Lingkaran();
    System.out.println("Masukkan jejari lingkaran");
    double jejari = scan.nextDouble();
    System.out.println("Luas lingkaran dengan jejari " + jejari + " adalah " + l2.hitungLuas(jejari));
    
  }

}
