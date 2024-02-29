public class Main {
 public static void main(String[] args) {
  Kubus kubus1 = new Kubus(5);

  System.out.println("Volume kubus dengan sisi " + kubus1.getSisi() + " adalah " + kubus1.hitungVolume());
  System.out.println("Luas permukaan kubus dengan sisi " + kubus1.getSisi() + " adalah " + kubus1.hitungLuasPermukaan());
 } 
}