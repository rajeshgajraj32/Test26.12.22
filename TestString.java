import java.util.Scanner;
public class TestString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("enter name");
    String name=sc.nextLine();
    String b="";
    for(int i=0;i<name.length();i++){
        if(name.charAt(i)==' '){}
        else{
            b=b+name.charAt(i);
        }
    }
    System.out.println(b);
    
    }
    
}
