import java.util.Scanner;


class Main {
  public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
    System.out.println("1.Zamaian PLN na EUR");
    System.out.println("2.Zamaian EUR na PLN");
    System.out.println("Podaj opcje:");
    int opcja=scan.nextInt();
    switch(opcja){
      case 1:
        {
           System.out.println("Podaj ilość złotych:");
          double zlote =scan.nextDouble();
          double wynik=0;
          double przelicznik = 0.22;
          wynik = zlote*przelicznik;
          System.out.println(zlote+" "+"to"+wynik+"Euro");
          
        }
      case 2:{
          System.out.println("Podaj ilość euro:");
        double euro=scan.nextDouble();
        double przelicznik2 = 4.50;
        double wynik = euro*przelicznik2;
         System.out.println(euro+" "+"to"+" "+wynik+" "+"Złotych");
      }
    }
    
  }
}