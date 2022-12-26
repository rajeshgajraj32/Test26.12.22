import java.util.Scanner;

public class Wap {
    void amount(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total number of person:");
        int per=sc.nextInt();
        int age[]=new int[10];
        int total=0;
        for(int i=0;i<per;i++){
            System.out.println("Enter "+(i+1)+" person age:");
            age[i]=sc.nextInt();
        }
        System.out.println("Age - charge");
        for(int i=0;i<per;i++){
            if(age[i]<3){
                     System.out.println(age[i]+" - free"); 
            }
            else if(age[i]>=3 && age[i]<=12){
                total+=100;
                System.out.println(age[i]+" - 100"); 
            }
            else if(age[i]>12){
                total+=150;
                System.out.println(age[i]+" - 150"); 
            }
        }
        System.out.println("Total amount: "+total);
    }
    public static void main(String[] args) {
       Wap w = new Wap();
       w.amount();
    }
}
