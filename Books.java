import java .util.HashMap;
import java.util.Scanner;
public class Books{
    public static void main(String[] args) {
        HashMap<String,Boolean>books=new HashMap<String,Boolean>();
        books.put("night",true);
        books.put("rabbit",false);
        books.put("class",true);
        books.put("boss",true);
        books.put("infidelity",false);
         books.put("son",true);
         Scanner scanner=new Scanner(System.in);
         while(true){
            System.out.println("enter a command(borrow,return,check,exit):");
            String command=scanner.nextLine().toLowerCase();
            if(command.equals("exit")){
System.out.println("exit the program.Goodbye");
break;
            }
            System.out.println("enter the name of the book :");
            String name=scanner.nextLine();
            if(!books.containsKey(name)){
System.out.println("the book is currently unavailable  in the ibrary");
continue;
            }
            switch (command){
                case "borrow":
                if(books.get(name)){
                    books.put(name,false);
                        System.out.println(name+" successfully borrowed ");
                    }
                    
                    else{
System.out.println(name+ "is currently unavailable ");
                    }
                    break;
                    case "return":
                    if(!books.get(name)){
                        books.put(name,true);
                        System.out.println(name +"is now available");
                    }
                    else{
                        System.out.println(name+"was already available");
                    }
                    break;
                    case "check":
                    if(!books.get(name)){
                        System.out.println(name + "is available");
                    }
                    else {
                        System.out.println(name +"is currently borrowed ");
                    }
                    break;
                    default:
                    System.out.println("invalid command .please enter 'borrow','return','check'");


                }

                scanner.close();
            }
        
         }
         
}