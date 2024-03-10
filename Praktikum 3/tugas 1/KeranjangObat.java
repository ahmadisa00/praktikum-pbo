public class KeranjangObat {
  private String[] keranjang;
  private int count;
  
  public KeranjangObat() {
    keranjang = new String[5];
    count = 0;
  }

  public void tambahObat(String obat) {
    // TO DO : Tambahkan logika untuk menambahkan obat ke dalam keranjang
 
    if (count < keranjang.length) {
      keranjang[count] = obat;
      count = count + 1;
    } else {
      assert(count >= keranjang.length):"Keranjang sudah penuh!";
    }

    // Berikan asersi jika keranjang sudah penuh (jumlah obat mencapai batas)
  }

  public void tampilkanObat() {
    for (int i = 0; i < keranjang.length; i++) {
    System.out.println(keranjang[i]);
    }
  }
}