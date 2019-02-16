class Poziom_0_z1 {
  public static void main(String[] args) {
    int x = 21;
    int y = 7;
    int modulo = x % y;
    if (modulo == 0) {
      System.out.println("Liczba 7 jest dzielnikiem liczby " + x);
    } else {
      System.out.println("Liczba 7 NIE jest dzielnikiem liczby " + x);
    }
  }
}