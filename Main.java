import java.util.Scanner;

class Main {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("Podaj wyraz");
String wyraz = scan.nextLine();
char[] Wyraz = wyraz.toCharArray();
char[] Samogłoski ={'a','ą','e','ę','i','o','u','y','ó','A','Ą','E','Ę','I','O','U','Y','Ó'};

for(int i=0;i<wyraz.length();i++){
        for(int j=0;j<Samogłoski.length;j++){
          if(Wyraz[i] == Samogłoski[j]){
            System.out.println("Samaogłoski"+" "+ Wyraz[i]);
            break;
          }
          else{
             System.out.println("Spółgłoski"+" "+Wyraz[i]);
            break;
          }
        }
}

}
}


