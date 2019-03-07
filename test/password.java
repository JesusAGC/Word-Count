

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class password 
{
 public static void main(String [] args){
 admin_managment admin = new admin_managment();
 WordCount3 User = new WordCount3();
 password us3r = new password();
Scanner s =  new Scanner (System.in);
String trying = s.next();
while(us3r.validacion(trying)!=true){
trying = s.next();
us3r.validacion(trying);
}
String password = admin.password(trying);
us3r.STotxt(password);
}

 static boolean validacion(String password){
 String pass = password;
 String alf="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
 String mayus ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
 String digits ="0123456789";
 char c = pass.charAt(0);
 String fl = Character.toString(c);
 
 if(pass.length()<8){
 System.out.println("Caracteres insuficientes");
 return false;
}
  else if(!alf.contains(fl)){
 System.out.println("El primer caracter no es letra");
 return false;
  }
  else if(MayusDig(pass) == false){
  System.out.println("Se necesita por lo menos 1 mayuscula y 1 digito");
  return false;
  }
  else if(SpecDig(pass)==true){
  System.out.println("Hay caracteres no validos en la contraseña");
  return false;
  }
  else{return true;}
 }
 
 static boolean MayusDig(String p){
 String pass = p;
  String mayus ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
 String digits ="0123456789";
 int dig = 0;
 int may = 0;
 String temp = "";
 for(int i = 0; i<pass.length();i++){
 temp = Character.toString(pass.charAt(i));
     if(mayus.contains(temp)){
     may++;
     }
     else if(digits.contains(temp)){
     dig++;
     }
 }
 if(may > 0 && dig>0){
 return true;}
 else{return false;}
 }
static boolean SpecDig(String p){
String pass = p;
String specv = "#@&%$?";
String specd = "!'()*+,-./:;<=>?[\\//]^_`{|}~";
String temp = "";
int cinv = 0;
 for(int i = 0; i<pass.length();i++){
 temp = Character.toString(pass.charAt(i));
     if(specd.contains(temp)){
     cinv++;
     }
 }
 if(cinv>0){
     return true;
     }
     else{return false;}
}
public void STotxt(String n){
FileWriter flwriter = null;
    	try {
			flwriter = new FileWriter("//media//jagc-aspire-one//Jesús Antonio González Cárdenas//MOVJAVA//Pasws//Pasws//filekey.txt");
		
			BufferedWriter bfwriter = new BufferedWriter(flwriter);
			bfwriter.write(n);
		bfwriter.close();
			System.out.println("Contraseña guardada satisfactoriamente..");

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (flwriter != null) {
				try {
					flwriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
} 

}
