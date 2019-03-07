import java.util.*;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException; 
import java.io.FileReader;
public class pssw2
{ static Scanner scanner = new Scanner(System.in);
    public static void main (String [] args) throws FileNotFoundException{
   
//String fileName = "//media//jagc-aspire-one//Jesús Antonio González Cárdenas//MOVJAVA//Pasws//Pasws//filekey.txt";
String fileName ="D:\\MOVJAVA\\Pasws\\Pasws\\filekey.txt";
Scanner entireFileText = new Scanner(new File(fileName));
 String key = entireFileText.next();
           System.out.println("contraseña = "+key);
           JPasswordField jpf = new JPasswordField();
int opcion = JOptionPane.showConfirmDialog(null, jpf, "Insertar contraseña",JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
String trying = jpf.getText();
System.out.println("escrito en el jpf = "+trying);
System.out.println(opcion);
boolean Compare;
if (trying.equals(key)){
  Compare = true;
  System.out.println(Compare);
}
else{Compare = false;
System.out.println(Compare);}
if (opcion == 0){
if (Compare==true){
  System.out.println("Contraseña correcta");
 WordCount3.main(args);
}
else{ pssw2.main(args);}    
}
}
}
