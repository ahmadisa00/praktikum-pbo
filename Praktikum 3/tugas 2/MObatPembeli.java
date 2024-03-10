public class MObatPembeli {
  public static void main(String[] args) {
    // Instansiasi kelas Pembeli dan Obat
    
    Pembeli pembeli1 = new Pembeli("Bambang");
    
    Obat obat1 = new Obat("paracetamol");
    Obat obat2 = new Obat("vitamin c");
    Obat obat3 = new Obat("antibiotik");
    Obat obat4 = new Obat("obat batuk");
    Obat obat5 = new Obat("obat pilek");
    Obat obat6 = new Obat("obat buta");

    // obat3.setTersedia(false);

    try {
      pembeli1.beliObat(obat1);
      pembeli1.beliObat(obat2);
      pembeli1.beliObat(obat3);
      pembeli1.beliObat(obat4);
      pembeli1.beliObat(obat5);
      pembeli1.beliObat(obat6);
    } catch ( ObatTidakTersediaException ObatTidakTersediaException ) {
      System.out.println(ObatTidakTersediaException.getMessage());
    } catch ( BatasObatPenuhException BatasObatPenuhException ) {
      System.out.println(BatasObatPenuhException.getMessage());
    }

    // TODO 4: Implementasikan try-catch untuk handling exception saat pembelian obat
    // Buat dua blok catch: ketika jumlah obat sudah mencapai batas dan ketika obat tidak tersedia
    
    // paracetamol vitamin c. antibiotik. obat flu. obat batuk  
  }
}