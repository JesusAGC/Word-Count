import java.util.Scanner;
public class admin_managment 
{public String password(String pass0){
 WordCount3 sec = new WordCount3();
//System.out.println("Escriba lo que desee usar como contraseña:");
String word = pass0;
String pass = sec.ROT13sh(word);
System.out.println("Su nueva contraseña es: "+pass);
return pass;
}
}
