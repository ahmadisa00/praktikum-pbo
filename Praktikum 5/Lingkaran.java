import static java.lang.Math.PI;

public class Lingkaran implements lArea{
  private double jejari;
  
  public Lingkaran() {
  }

  public Lingkaran(double r) {
    jejari = r;
  }

  public double getJejari() {
    return jejari;
  }

  public double hitungLuas() {
    return PI*jejari*jejari;
  }

  
  public double hitungLuas(double jejari) {
    return PI*jejari*jejari;
  }
}
