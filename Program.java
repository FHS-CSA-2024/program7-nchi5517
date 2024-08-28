//import stuff here
import java.util.Scanner;
//Your code here
public class Program7{
    public static void main(String [] args){
     double klevin = 0.0;
     double stanleyNickels = 0.0;
     double schruteBucks = 0.0;
     
     Scanner scan = new Scanner(System.in);
     System.out.print("Enter # of schrutebucks: ");
     schruteBucks = scan.nextInt();
     System.out.print("Enter # of klevins: ");
     klevin = scan.nextInt();
     System.out.print("Enter # of stanley-nickels: ");
     stanleyNickels = scan.nextInt();
     
     
     klevin += stanleyNickels/12.0;
     schruteBucks += klevin/20.0;
     schruteBucks = Math.round(100.0*schruteBucks)/100.0;
     
     
     System.out.print("$"+schruteBucks);
     
    }
}
//Paste console output below:
/*


*/
