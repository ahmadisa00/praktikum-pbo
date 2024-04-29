public class Senjata {
  public String bunyi;
  public boolean menusuk;

  public Senjata(String bunyi) {
    this.bunyi = bunyi;
    menusuk = false;
  }

  public void setBunyi(String bunyi) {
    this.bunyi = bunyi;
  } 

  public String getBunyi() {
    return bunyi;
  }

  public void setMenusuk(boolean menusuk) {
    this.menusuk = menusuk;
  }

  public boolean isMenusuk() {
    return menusuk;
  }

  public void menembak(int jumlah) {
    for (int i = 0; i < jumlah; i++) {
      System.out.println(getBunyi() + " ");
    }
    System.out.println("");
  }

  public void pasangBayonet() {
    setMenusuk(true);
    System.out.println("Bayonet Terpasang");
  }

  public String menusuk() {
    if( isMenusuk() ) {
      return "Jleb!";
    }
    else {
      return "Gagal, belum pasang bayonet";
    }
  }
}