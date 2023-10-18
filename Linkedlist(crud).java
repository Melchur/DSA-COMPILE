
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        LinkedList<String> link = new LinkedList<>();
        Scanner scan = new Scanner(System.in);
        int a=0;
        while(a!=5)
        {
            System.out.println("pick from the 5");
            System.out.println("1.Create");
            System.out.println("2.Read");
            System.out.println("3.Update");
            System.out.println("4.Delete");
            System.out.println("5.exit");
            int b = scan.nextInt();
            scan.nextLine();
            
            switch (b)
            {
                case 1:
                    

                    System.out.println("Enter Link list: ");
                    
                   
                        String node = scan.nextLine();

                       
                        link.add(node);
                   
                    break;
                
                case 2:
                    
                    System.out.println("Display List");
                    for(String dis : link){
                    System.out.println(dis);
                    
                    }
                    
                    break;
                    
                case 3:
                      if(link.isEmpty()){
                    
                    System.out.println("No list to update");
                    
                    }
                     
                      else{
                               System.out.println("Current list :");
                        for(String display : link){
                    System.out.println(display);
                    
                    }
                     
                   System.out.print("enter index num to update from (0-" + (link.size()-1) + "):");
                    int index = scan.nextInt();
                    scan.nextLine();
                    
                    if(index >= 0 && index < link.size()){
                    System.out.print("Enter the new value :");
                    String Newvalue = scan.nextLine();
                    System.out.println("Element updated.\n\n");   
                    }
                    else{
                    System.out.print("Invalid Index\n\n");
                    }
                      }
                    break;
                    
                case 4:
                
                    if(link.isEmpty()){
                    
                    System.out.println("No list to delete");
                    
                    }
                    
                    else{
                    System.out.println(link);
                    System.out.print("Enter list to delete :");
                    String del = scan.nextLine();
                   

                        link.remove(del);
                        System.out.println("updated list :" + link);
                        System.out.println(link);
                    
                       break;
                
                    }
                    break;
                

                case 5:
                a=5;
                    break;
                
                
                default:
                    break;
            }
        }
    }
}