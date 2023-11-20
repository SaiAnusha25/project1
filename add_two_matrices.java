import java.util.Scanner;
public class add_two_matrices {
 public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter rows ");
    int m=sc.nextInt();
    System.out.println("enter columns ");
    int n=sc.nextInt();
    int arr1[][]=new int[m][n];
    System.out.println("enter each element in first array:");
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            arr1[i][j]=sc.nextInt();
        }
    }
    int arr2[][]=new int[m][n];
    System.out.println("enter each element in second array:");
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            arr2[i][j]=sc.nextInt();
        }
    }
    int arr[][]=new int[m][n];
    System.out.println("array after addition:");
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            arr[i][j]=arr1[i][j]+arr2[i][j];
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
    sc.close();
 }   
}
