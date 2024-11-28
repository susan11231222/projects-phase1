import java.util.HashMap;
import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        HashMap<String,Double>temparature=new HashMap<String,Double>();
        temparature.put("kiambuu", 20.0);
        temparature.put("nairobi", 21.0);
        temparature.put("thika", 19.0);
        temparature.put("meru", 22.0);
        System.out.println(temparature);
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the town name");
        String name=scanner.nextLine();
        if (temparature.containsKey(name)){
            System.out.println(name+" "+"the temparature is:"+temparature.get(name)+"0C");
        }
        else{
            System.out.println("name not found ");
        }
        scanner.close();  
     }
    }