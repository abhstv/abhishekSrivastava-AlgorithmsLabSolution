package demoGL.denomination;

import java.util.Scanner;

public class DenominationSort {

    public static void main(String[] args) {
        DenominationSort denominationSort = new DenominationSort();
        System.out.println("Enter the size of currency denominations");
        Scanner sc = new Scanner(System.in);
        int denominations [] = new int [sc.nextInt()];
        System.out.println("Enter the currency denominations value");
        for (int i = 0;i<denominations.length; i++){
            denominations[i]=sc.nextInt();
        }
        denominationSort.sortArray(denominations, 0, denominations.length-1);
        System.out.println("Enter the ammount you want to pay");
        int ammount = sc.nextInt();
        int remainder = ammount;
        System.out.println("Your payment approach in order to give min no of notes will be");
        for (int i = 0; i<denominations.length; i++){
            int num_currency = remainder/denominations[i];
            if (num_currency != 0){
                System.out.println(denominations[i]+" : "+num_currency);
            }
            remainder = remainder%denominations[i];
        }
        if (remainder != 0){
            System.out.println("Amount remain : "+remainder);
        }
    }
    public void sortArray(int array[], int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;
            sortArray(array, l, m);
            sortArray(array, m + 1, r);
            conquerArray(array, l, m, r);
        }
    }
    public void conquerArray(int array[], int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        int L[] = new int[n1];
        int R[] = new int[n2];
        for (int i = 0; i < n1; ++i) {
            L[i] = array[l + i];
        }
        for (int j = 0; j < n2; ++j) {
            R[j] = array[m + 1 + j];
        }
        int i = 0, j = 0;
        int k = l;
        
                while (i < n1 && j < n2) {
                    if (L[i] >= R[j]) {
                    array[k] = L[i];
                    i++;
                    } else {
                    array[k] = R[j];
                    j++;
                    }
                    k++;
                 }
           
        while (i < n1) {
            array[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            array[k] = R[j];
            j++;
            k++;
        }
    }
}