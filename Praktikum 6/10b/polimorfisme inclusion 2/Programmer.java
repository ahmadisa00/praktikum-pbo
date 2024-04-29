public class Programmer extends Pegawai{
  public int bonus = 450000;

  public Programmer(String nama) {
    this.nama = nama;
  }

  public void tampilData() {
    System.out.println("Nama : " + nama + ", Gaji Pokok : " + gajiPokok + ", Bonus : " + bonus);
  }
}
