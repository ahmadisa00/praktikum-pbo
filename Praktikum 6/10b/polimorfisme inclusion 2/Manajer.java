public class Manajer extends Pegawai{
  public int tunjangan = 700000;

  public Manajer(String nama) {
    this.nama = nama;
  }

  public void tampilData() {
    System.out.println("Nama : " + nama + ", Gaji Pokok : " + gajiPokok + ", Tunjangan : " + tunjangan);  
  }
}