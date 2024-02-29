public class Produk {
  private String nama, deskripsi;
  private double harga, stok;

  private Penjual penjual1;

  public Produk(String nama, String deskripsi, double harga, double stok) {
    this.nama = nama;
    this.deskripsi = deskripsi;
    this.harga = harga;
    this.stok = stok;
  }

  public Produk() {
    this("nama", "deskripsi", 0, 0);
  }

  public void setNama(String nama) {
    this.nama = nama;
  }

  public void setDeskripsi(String deskripsi) {
    this.deskripsi = deskripsi;
  }

  public void setHarga(double harga) {
    this.harga = harga;
  }

  public void setStok(double stok) {
    this.stok = stok;
  }

  public String getNama() {
    return this.nama;
  }

  public String getDeskripsi() {
    return this.deskripsi;
  }

  public double getHarga() {
    return this.harga;
  }

  public double getStok() {
    return this.stok;
  }


  // Mengambil objek penjual terkait
  public Penjual getPenjual() {
    return this.penjual1;
  }


}
