package demoGL.transaction;
import java.util.Scanner;

public class transaction{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of transaction array");
        int num = sc.nextInt();
        double transactionArray[] = new double [num];
        System.out.println("Enter the values of array");
        for (int i = 0; i<num; i++){
            transactionArray[i] = sc.nextDouble();
        }
        System.out.println("Enter the total no of targets that needs to be achieved");
        int num_target = sc.nextInt();
        for (int i = 0; i<num_target; i++){
            System.out.println("Enter the value of target");
            double targetValue = sc.nextDouble();
            double sum=0;
            for(int j=0; j<num;j++){
                sum += transactionArray[j];
                if (sum>=targetValue){
                    System.out.println("Target achieved after "+(j+1)+" transaction");
                    System.out.println();
                    break;
                }
            }
            if (sum< targetValue){
                System.out.println("Given target is not achieved.");
            } 
            
        }

        
    }
}