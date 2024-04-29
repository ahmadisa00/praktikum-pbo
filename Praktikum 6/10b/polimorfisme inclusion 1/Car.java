public class Car extends Vehicle {
  void calRent(int jarak, double harga) {
    double fare = jarak * harga;
    fare = fare - 100;
    System.out.println("Harga sewa mobil = " + fare);
  }
}
