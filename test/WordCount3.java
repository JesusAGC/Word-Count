import java.util.Scanner;
public class WordCount3
{   static Scanner s = new Scanner(System.in);
    public static void main(String[] args){
    System.out.println("Escriba lo que desee procesar:");
    String word = s.nextLine();
  String menu;
  WordCount3 Woosh = new WordCount3();
  Woosh.CountWords(word);
boolean salir = false;
while(!salir){
System.out.println("Contador de palabras");
System.out.println("1 - Contar Espacios");
System.out.println("2 - Contar Palabras");
System.out.println("3 - Contar Caracteres");
System.out.println("4 - Contar Digitos");
System.out.println("5 - Contar Caracteres especiales");
System.out.println("6 - Contar Letras y mostrar la cantidad de vocales y consonantes");
System.out.println("7 - Contar Palabras con primera letra vocal");
System.out.println("8 - Mandar a ROT13");
System.out.println("9 - PigLatin");
System.out.println("10 - ROT-N");
System.out.println("Escriba exit para salir");

menu = s.nextLine();   
switch(menu){
case "1":
Woosh.ContSpac(word);
break;
case "2":
Woosh.CountWords(word);
break;
case "3":
Woosh.CountChar(word);
break;
case "4":
Woosh.DigitCount(word);
break;
case "5":
Woosh.SpCharCount(word);
break;
case "6":
Woosh.LetterCount(word);
break;
case "7":
Woosh.FirstLettVoc(word);
break;
case "8":
Woosh.ROT13(word);
break;
case "9":
Woosh.PigLatin(word);
break;
case"10":
Woosh.ROTN(word);
break;
case "exit":
salir = true;
break;

}
}}
public void ContSpac(String word){
 String str1 = word;
char used;
char spacex = ' ';
boolean test;
int spcount = 0;
        boolean space= true;
        int i;

        for ( i = 0; i < str1.length(); i++) {
            used = str1.charAt(i);    
            test = Character.isWhitespace(used);
            if(test == true){
            spcount++;
            }
            used = ' ';
        }
System.out.println("Hay " +spcount+ " espacios en el texto procesado");
}
public void CountWords(String Word){
String str1 = Word;
int endLine = str1.length() - 1;    
  char used;
  boolean test;
  int spcount = 0;
for (int i = 0; i < str1.length(); i++) {
            used = str1.charAt(i);    
            test = Character.isWhitespace(used);
            if(test == true){
            spcount++;
            }
            used = ' ';
        }
  spcount++;
   System.out.println("Hay " +spcount+ " palabras en el texto procesado");
}
public void CountChar(String Word){
String str1 = Word;
int charcount = str1.length();
System.out.println("Hay "+charcount+" caracteres");
}
public void DigitCount(String Digit){
String str1 = Digit;
char mov;
boolean test;
int digcount = 0;
boolean q;
     for (int i = 0; i < str1.length(); i++) {
         mov = str1.charAt(i);
         q = Character.isDigit(mov);
         if(q == true){
            digcount++;
            }
            mov = ' ' ;
        }
System.out.println("Hay " +digcount+ " digitos en el texto procesado");
}

public void SpCharCount(String DD){
String str1 = DD;
String sc = "!#$%&'()*+,-./:;<=>?@[\\//]^_`{|}~";
Character mov;
char sp;
boolean p;
int count = 0;
for (int i = 0; i < str1.length(); i++) {
        mov = str1.charAt(i);
      for(int ii = 0; ii < sc.length(); ii++){
        sp = sc.charAt(ii);
        p = mov.equals(sp);
        if(p==true){
        count++;
        }
       sp = ' ';
        }  
       mov = ' ' ;
        }
    System.out.println("Hay " +count+ " caracteres especiales en el texto procesado");
    }
 public void LetterCount(String air){
 String str1 = air;   
 Character move;
 String Con = "BCDFGHJKLMNÑPQRSTVWXYZbcdfghjklmnñpqrstvwxyz";
 String Vocal = "AEIOUaeiou";
 boolean let;
 boolean typecons;
 int conso;
 int lettercount = 0;
 int cons = 0;
 int voc = 0;
           for(int i = 0; i < str1.length(); i++){
            move = str1.charAt(i);
            let = Character.isLetter(move);
            if(let==true){
            lettercount++;
            String fl2=Character.toString(move);
            typecons = Con.contains(fl2);
                if(typecons == true){
                cons++;
                }
                else{voc++;}
           }
            }
      System.out.println("Hay " +lettercount+ " letras en el texto procesado");
      System.out.println("Vocales = "+voc);
      System.out.println("Consonantes = "+cons);
    }   
   public void FirstLettVoc(String word){
    String str1 = word;
    String Vocal = "AEIOUaeiou";
    int count = 0;
    boolean test;
    boolean subtest;
    char used;
    int flvocal = 0;
    String flv=Character.toString(str1.charAt(0));
    if(Vocal.contains(flv)){
    flvocal++;
    }
             for (int i = 0; i < str1.length(); i++) {
            used = str1.charAt(i);    
            test = Character.isWhitespace(used);
            if(test == true){
            char fl = str1.charAt(i+1);
            String fl2=Character.toString(fl);
            subtest = Vocal.contains(fl2);
            if(subtest == true){
            flvocal++;
            }
            }
            used = ' ';
        }
        System.out.println("Hay " +flvocal+ " primeras letras vocales en el texto procesado");
    }
 
public void ROT13(String word){
    String str1 = word;
    StringBuilder Out = new StringBuilder();
         for(int i = 0; i < str1.length(); i++)
        {
            char c = str1.charAt(i);
            
             if(c >= 'A' && c<= 'M')
            {
                c += 13;
            }else if(c >= 'N' && c<= 'Z')
            {
                c -= 13;
            }
            else if(c >= 'a' && c<= 'm')
            {
                c += 13;
            }else if(c >= 'n' && c<= 'z')
            {
                c -= 13;
            }
            
            
            
            Out.append(c);
        }
         System.out.println("ROT 13 ="+Out.toString());
}
public String ROT13sh(String word){
    String str1 = word;
    StringBuilder Out = new StringBuilder();
         for(int i = 0; i < str1.length(); i++)
        {
            char c = str1.charAt(i);
            if(c >= 'A' && c<= 'M')
            {
                c += 13;
            }else if(c >= 'N' && c<= 'Z')
            {
                c -= 13;
            }
            else if(c >= 'a' && c<= 'm')
            {
                c += 13;
            }else if(c >= 'n' && c<= 'z')
            {
                c -= 13;
            }
            
            Out.append(c);
        }
         System.out.println("ROT 13 ="+Out.toString());
         return Out.toString();
}
public void ROT3(String word){
    String str1 = word;
    StringBuilder Out = new StringBuilder();
         for(int i = 0; i < str1.length(); i++)
        {
            char c = str1.charAt(i);
            
            if(c >= 'a' && c<= 'w')
            {
                c += 3;
            }else if(c >= 'x' && c<= 'z')
            {
                c -= 23;
                c+=3;
            }
            
            Out.append(c);
        }
         System.out.println("ROT 13 ="+Out.toString());
}
public void PigLatin(String word){
String str1 = word;   
 Character move;
 char used;
 boolean test;
 boolean subtest;
 String Con = "BCDFGHJKLMNÑPQRSTVWXYZbcdfghjklmnñpqrstvwxyz";
 String Vocal = "AEIOUaeiou";
 String output = "";
 String aux = "";
 String[] separate = str1.split(" ");
 String fl =Character.toString(separate[0].charAt(0));
 if(Vocal.contains(fl)){
output += separate[0] += "ay ";
}

for(int i = 0; i < separate.length;i++){
 String fl2 = Character.toString(separate[i].charAt(0));
if(Vocal.contains(fl2)){
output = separate[i] += "ay ";
}
else{
int aux2 = 0;
while(isVocal(separate[i].charAt(aux2)) == false)
{
 aux2++;
}
String p1 =  separate[i].substring(aux2);
String p2 = separate[i].substring(0, aux2);
aux += p1 + p2+ "ay ";  
}
output += aux; 
}
System.out.println("PigLatin = " +output);
}
public boolean isVocal(char input){
String let = Character.toString(input);
String Vocal = "AEIOUaeiou";
boolean answer;
if(Vocal.contains(let)){
answer = true;
}
else{
answer = false;
}
return answer;
}

public void ROTN(String p){
String pass = p;
System.out.println("Escriba el numero de la rotacion:");
int rotn = s.nextInt();
 StringBuilder Out = new StringBuilder();
         for(int i = 0; i < pass.length(); i++)
        {char cii = pass.charAt(i);
         char rot = cii;
         if (cii > 64 && cii < 91) {
                rot = (char) (rot + rotn);
                if (rot > 90) {
                    rot += -90 + 64;
                }
                if (rot < 65) {
                    rot += -64 + 90;
                }
            } else if (cii > 96 && cii < 123) { 
                rot = (char) (rot + rotn);
                if (rot > 122) {
                    rot += -122 + 96;
                }
                if (rot < 97) {
                    rot += -96 + 122;
                }
            }
           
            if (cii > 47 && cii < 58) {
                rot = (char) (rot + rotn);
                if (rot > 47) {
                    rot += -57 + 47;
                }
                if (rot < 58) {
                    rot += -47 + 57;
                }   
          }
            Out.append(rot);
        
}
          System.out.println("ROT N ="+Out.toString());
}}



