import java.util.Scanner;

public class ASCII {

public static void main(String[] args) {
    
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Charecter : " );
String input=sc.nextLine();
int ch=input.charAt(0);
int accii=(int)ch;
System.out.println("ASCII value is : "+accii);
}    
}