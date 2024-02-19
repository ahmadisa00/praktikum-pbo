class titikCoba {
  double absis,ordinat;
  static double counter;

  titikCoba() {
    absis = 0;
    ordinat = 0;

    counter++;
  }

  titikCoba(double a, double b) {
    absis = a;
    ordinat = b;

    counter++;
  }


  double getAbsis() {
    return absis;
  }

  double getOrdinat() {
    return ordinat;
  }

  static double getCounterTitik() {
    return counter;
  }

  void setAbsis(double a) {
    absis = a;
  }

  void setOrdinat(double b) {
    ordinat = b;
  }

}