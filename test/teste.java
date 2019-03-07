
import java.util.Scanner;
public class teste
{public static void main (String [] args){
Scanner scu = new Scanner(System.in);
String sss = scu.nextLine();
String Vocal = "AEIOUaeiou";
String flv=Character.toString(sss.trim().charAt(0)).trim();
System.out.print(flv+"\n");
System.out.print(Vocal.contains(flv)+"\n");
main(args);
}

}

