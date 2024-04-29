public class polimorfismeCoercion {

  public static int kuadrat(int bilangan) {
    return bilangan*bilangan;
  }

  public static void main(String[] args) {
    // deklarasi objek integer
    Integer bilangan = 10;

    // objek integer 'dipaksi' untuk diubah menjadi primitif
    int hasilKuadrat = kuadrat(bilangan);

    System.out.println("Hasil kuadrat " + bilangan + " adalah " + hasilKuadrat);
  }

}