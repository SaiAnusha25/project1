import java.util.Scanner;
public class hollowsquare {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter rows:");
        int rows=sc.nextInt();
        System.out.println("enter columns:");
        int columns=sc.nextInt();
        int i=1,j;
        while(i<=rows){
            j=1;
            while(j<=columns){
                if(i==1||i==columns||j==1||j==columns){
                System.out.print("*");
                }
                else
                System.out.print(" ");
                j++;
            }
            System.out.println();
            i++;
        }
        sc.close();
    }
}
