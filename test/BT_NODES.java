import java.util.*; 
 
public class BT_NODES extends WordCount3
 
{ 
 
public class Node { 
 
    Node right = null; 
 
    Node left = null;  
 
    int data; 
   
    String parrafo;
 
 
    public Node(int d, String p){ 
 
        data = d;
      
        parrafo = p;
 
    } 
 
}  
 
public Node root; 
 
public BT_NODES() { 
 
Node root = new Node(0," "); 
 
root.right = null; 
 
root.left = null; 
 
  } 
 
public void addroot(int value, String p) { 
 
    root = add(root, value,p); 
 
} 
 
public Node add(Node current,int d, String p){ 
 
  if (current == null) { 
 
  Node aux = new Node(d,p);    
 
    current = aux;     
 
    } 
 
  
 
    if (d < current.data) { 
 
        current.left = add(current.left, d,p); 
 
    } else if (d > current.data) { 
 
        current.right = add(current.right, d,p); 
 
    } else { 
 
return current; 
 
    } 
 
return current; 
 
} 
 int minValue(Node root) 
    { 
        int minv = root.data; 
        while (root.left != null) 
        { 
            minv = root.left.data; 
            root = root.left; 
        } 
        return minv; 
    } 
    

 void deleted(int d) 
    { 
        root = delete(root, d); 
    } 
  

    Node delete(Node root, int d) 
    { 

        if (root == null)  return root; 
  
     
        if (d < root.data) 
            root.left = delete(root.left, d); 
        else if (d > root.data) 
            root.right = delete(root.right, d); 
  
      
        else
        { 
            // node with only one child or no child 
            if (root.left == null) 
                return root.right; 
            else if (root.right == null) 
                return root.left; 
  
          
            root.data = minValue(root.right); 
  
      
            root.right = delete(root.right, root.data); 
        } 
  
        return root; 
    } 
 
 void inorder() 
    { 
        inorderRec(root); 
    } 
  
   
    void inorderRec(Node root) 
    { 
        if (root != null) 
        { 
            inorderRec(root.left); 
            System.out.print(root.data + "\n");
            System.out.print(root.parrafo + " ");
             System.out.println("\n");
            inorderRec(root.right); 
        } 
    }
    Node inorderNodeRec(Node root) 
    { Node actual=root;
        if (actual != null) 
        { 
           actual =inorderNodeRec(root.left); 
           actual =inorderNodeRec(root.right); 
        }
        return actual;
    }
    void preorder() 
    { 
        preorderRec(root); 
    } 
  
   
    void preorderRec(Node root) 
    { 
        if (root != null) 
        { 
            preorderRec(root.left);
            preorderRec(root.right);
            System.out.print(root.data + "\n");          
            System.out.print(root.parrafo + " ");
             System.out.println("\n");
             
        } 
    }
    void postorder() 
    { 
        preorderRec(root); 
    } 
  
   
    void postorderRec(Node root) 
    { 
        if (root != null) 
        { 
            
            System.out.print(root.data + "\n");
            System.out.print(root.parrafo + " ");
             System.out.println("\n");
             postorderRec(root.left);
            preorderRec(root.right);
             
        } 
    }
    void Actual(Node a){
    System.out.print(a.data + "\n");
    System.out.print(a.parrafo + " ");
   }
    
   void SearchByNum(int num, Node r){
    int n = num;
    System.out.println("Se buscara el nodo con numero "+n+" en el arbol/n");
    search(r, n);
    }
    void search(Node n, int da){
Node Help = n;       
//boolean u = false;
//boolean not = false;
//while(Help!=null&& u==false || not ==false){
   if(root==null){
     System.out.println("Esta vacío el arbol");
    }
    else if(root.data==da){
    System.out.println("Esta en la raíz el dato: ");
    Actual(n);
   // u=true;
    }
   else if(Help.data<da){
      
     if(Help.right ==null){
    System.out.println("No existe el dato\n");
    }
    else{
    Help = Help.right;
    search(Help,da);
    }}
    else if(Help.data>da){
    
    if(Help.left ==null){
    System.out.println("No existe el dato\n");
    }
    else{
    Help = Help.left;
    search(Help,da);   
    }}
   else if(Help.data==da){
    System.out.println("Se encontro lo buscado\n");
    //u=true;
    Actual(n);
    
    }
    else{System.out.println("No existe el dato\n");
   
        //not = true;
    }
   
 // } 
    
}
    
 
  public boolean FLVB(String word){
    String str1 = word;
    String Vocal = "AEIOUaeiou";
    boolean test;
    String flv=Character.toString(str1.trim().charAt(0)).trim();
    //System.out.print(Vocal.contains(flv)+"\n");
    if(Vocal.contains(flv)){
    test = true;
    }
    else{test = false;
    }
    return test;
    }
    public boolean ContainsWord(String word, String parrafo){
    String str1 = word;
    String Parraf = parrafo;
    int count = 0;
    boolean test;
    boolean subtest;
    char used;
    int flvocal = 0;
    if(Parraf.contains(str1.trim())==true){
    test = true;
    }
    else{test = false;
    }
    return test;
    }
    void inorderCW(){
    System.out.println("Escriba la palabra que desee buscar");
    String Word = s.next();
   inorderContainsW(root, Word); 
    }
   void inorderContainsW(Node r, String W){
     Node aux = r;
     if(aux!=null){
    inorderContainsW(aux.left,W);
    if(ContainsWord(W,aux.parrafo)==true){
    System.out.print(aux.data + "\n");
            System.out.print(aux.parrafo + " ");
            System.out.println("\n");
    }
           inorderContainsW(aux.right,W); }
    }
    /*void finding(){
    System.out.println("Escriba la palabra que desee buscar");
    String Word = s.next();
    find(Word,root);
    }
    public void find (String s, Node r) {
        Node aux = r;
        if (s.equals(aux.parrafo)) {
            System.out.print(aux.parrafo);
        }
        if (s.compareToIgnoreCase(aux.parrafo)  < 0) {
            if (aux.right != null)
                find ( s, aux.right);
            
        }
        if (aux.left !=  null) {
            find (s, aux.right);
        }
    }*/
   
    void inorderFlV(Node r){
     inorderFLV(r); 
    }
    void PrintNOde(Node r){
      System.out.print(root.data + "\n");
            System.out.print(root.parrafo + " ");
            System.out.println("\n");  
    }
    
    void inorderFLV(Node root){
     if(root != null){
   inorderFLV(root.left); 
   if(FLVB(root.parrafo)==true){
    PrintNOde(root);
    }
    inorderFLV(root.right);
}
    }
   
    void inorderROT13() 
    { 
        inorderRec13(root); 
    } 
  
    void inorderRec13(Node root) 
    { 
        if (root != null) 
        {   System.out.print(root.data + "\n");
            System.out.print(ROT13sh(root.parrafo) + " ");
            System.out.println("\n");
            inorderRec(root.left); 
            System.out.print(root.data + "\n");
            System.out.print(ROT13sh(root.parrafo) + " ");
            System.out.println("\n");
            inorderRec(root.right);
            
        } 
    }    
 
public static void main(String [] args){ 
 
      System.out.println("Arbol binario"); 
 
       Scanner s = new Scanner(System.in); 
       Scanner x = new Scanner(System.in);
   BT_NODES BT = new BT_NODES  (); 
 
   boolean exit = false; 
 
   while(exit == false){ 
       System.out.println("\n");
    System.out.println("Case 1 adds");  
    System.out.println("Case 2 deletes");  
    System.out.println("Case 3 prints inorder and ROT 13 inorder");  
    System.out.println("Case 4 prints inorder"); 
    System.out.println("Case 5 prints preorder");
    System.out.println("Case 6 prints postorder"); 
    System.out.println("Case 7 Number search");
    System.out.println("Case 8 Contains word");
    System.out.println("Case 9 First letter vocals");
    System.out.println("Case 100 exits");  
 
   int menu = s.nextInt(); 
  //s.useDelimiter("//n");
   switch(menu){ 
 case 1: 
     System.out.println("Text to add for the tree"); 
  String parrafo = x.next();
    System.out.println("Data for the tree"); 
          int data = s.nextInt();      
      if(BT.root == null){
      BT.addroot(data,parrafo);
      }
      else{
      BT.add(BT.root, data,parrafo);
      } 
     break; 
 case 2: 
System.out.println("Data to delete"); 
        int data2 = s.nextInt(); 
       
        BT.deleted(data2);
       break; 
 case 3:
       System.out.println("Printing data:");
       System.out.println("\n");
        BT.inorder();
        System.out.println("\n");
        System.out.println("\n Rot 13:");
        BT.inorderROT13();
 break; 
 case 4:
 BT.inorder();
 break;
 case 5:
 BT.preorder();
 break;
 case 6:
 BT.postorder();
 break;
 case 7: 
 System.out.println("Escriba el numero que desee buscar:");
 int num = s.nextInt();
 BT.SearchByNum(num,BT.root);
 break;
 case 8:
 BT.inorderCW();
 //BT.finding();
 break;
 case 9:
 BT.inorderFlV(BT.root);
 break;
 
case 100: 
System.out.println("Get out"); 
exit = true; 
 break; 
 
    
 
    
 
   }      
 
}} 
 
       
 
}