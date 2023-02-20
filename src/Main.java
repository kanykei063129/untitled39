public class Main {
    public static void main(String[] args) {
      Country country = Country.AMERICAN;
      switch (country) {
          case ALBANIA:
              System.out.println("POPULATION: 2 986 952");
              break;
          case AMERICAN_SAMOA:
              System.out.println("POPULATION: 57 881");
              break;
          case AFGHANISTAN:
              System.out.println("POPULATION: 29 121 286");
              break;
          case ALGERIA:
              System.out.println("POPULATION: 34 586 184");
              break;
          case ANDORRA:
              System.out.println("POPULATION: 84 000");
      }
    }
}