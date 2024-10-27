public class Main {
    public static void main(String[] args) {
      System.out.println("Miles\tKilometers");
      System.out.println("--------------------------------------------------------------------");
      for (int i = 1; i <= 10; i++) {
        double kilometers = i * 1.609;
        System.out.println(i + "\t" + kilometers);
      }
    }
  }