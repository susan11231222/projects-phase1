 /*import java .util.HashSet;
import java.util.Scanner;
    class Main{
        public static void main(String[] args) {
            HashSet<String>insideBuilding=new HashSet<String>();
            Scanner scanner=new Scanner(System.in);
            while(true){
                System.out.println("enter commands ('enter','exit','list','quit')");
                //reading input from the user
                String command=scanner.nextLine().toLowerCase();
            
            if(command.equals("quit")){
                System.out.println("Exiting the program GOODBYE!!!!");
                break;
            }
            System.out.println("Enter employee Id:");
            String id=scanner.nextLine();
            switch (command) {
                case "enter":
                //if the employee id is already taken
                    if(insideBuilding.contains(id)){
                        System.out.println("employee"+" "+id+" "+"is already inside the building");
                    }
                   // if the emplooyee id is not yet taken 
                    else{insideBuilding.add(id);
                        System.out.println("employee"+" "+id+" "+"has entered the building ");

                    }
                     break;
                    case "exit":
                    if(insideBuilding.contains(id)){
                        insideBuilding.remove(id);
                        System.out.println("employee"+" "+id+" "+"has exited the building .");
                    }
                    else{
                        System.out.println("employee"+" "+id+" "+"is not curreently in the building.");
                    }
                    
                    break;
                    case "check":
            
                        if (insideBuilding.contains(id)) {
                            System.out.println("Employee " + id + " is currently inside the building.");
                        } else {
                            System.out.println("Employee " + id + " is not currently in the building.");
                    }
                     break;
                    case "list":
                    if(insideBuilding.isEmpty()){
                        System.out.println("No employees are currently inside the building.");
                    } else {
                        System.out.println("Employees currently inside the building: " + insideBuilding);
                    }
                    break;
                    
                    
            
                default:
                System.out.println("Invalid command. Please enter 'enter', 'exit', 'check', 'list', or 'quit'.");
                break;
                
            }
            }
        }
        }*/