public class Penjual {
  private String nama;
  private String alamat;
  private String noTelp;

  public Penjual(String nama, String alamat, String noTelp) {
    this.nama = nama;
    this.alamat = alamat;
    this.noTelp = noTelp;
  }

  public Penjual() {
    this("Penjual", "alamat", "noTelp");
  } 

  public void setNama(String nama) {
    this.nama = nama;
  }

  public void setAlamat(String alamat) {
    this.alamat = alamat;
  }

  public void setNoTelp(String noTelp) {
    this.noTelp = noTelp;
  } 

  public String getNama() {
    return this.nama;
  }

  
  public String getAlamat() {
    return this.alamat;
  }

  
  public String getNoTelp() {
    return this.noTelp;
  }
}
