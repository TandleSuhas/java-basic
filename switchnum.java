import java.util.*;
public class switchnum{
    public static void main(String arg[]){
        System.out.println("Enter the button");
        Scanner sc=new Scanner(System.in);
        int button=sc.nextInt();

        switch(button){
            case 1:System.out.println("HELLO");
                  break;
            case 2:System.out.println("How are u");
                  break;    
            case 3:System.out.println("5n");
                  break;
             case 4:System.out.println("bye");
                  break;    
          default:System.out.println("INVALID");      
        }

    }
}
