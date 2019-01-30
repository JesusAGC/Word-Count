import java.util.Scanner;
public class WordCount
{   static Scanner s = new Scanner(System.in);
    public static void main(String[] args){
    System.out.println("Escriba lo que desee procesar:");
    String word = s.nextLine();
  String menu;
  WordCount Woosh = new WordCount();
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
}
