class Kubus {
  private double sisi;

  public Kubus(double sisi) {
    this.sisi = sisi;
  }

  public Kubus() {
    this(0);
  }

  public double getSisi() {
    return this.sisi;
  }
  
  public double hitungVolume() {
    double hitungvolume = Math.pow(this.sisi, 3);

    return hitungvolume;
  }

  public double hitungLuasPermukaan() {
    double luaspermukaan = (Math.pow(this.sisi, 2) * 6);

    return luaspermukaan;
  }

}