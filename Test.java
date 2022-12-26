import java.util.*;
class Test{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        int arr[]=new int[num];
        int count=0,temp=0;
        for(int i=1;i<=num;i++){
            int div=i;
            while(div>0){
                count++;
                div=div/10;
            }
            arr[i-1]=count;
            count=0;

        }
        for(int te:arr){
            if(te>1){
                if(te%4==0){
                    temp=temp+(te*4);
                }
                else{
                    temp=temp+(te*3);
                }
            }
            else{
                temp=temp+2;
            }
        }
        if(temp/10==0){
            System.out.println(temp);
        }
        else{
            int a= temp;
            int f=0;

            while(a>0){
                f=f+(a%10);
                a=a/10;
                if(a==0 && f/10!=0){
                    a=f;
                    f=0;
                }
            }
            System.out.println(f);
        }

    }
}