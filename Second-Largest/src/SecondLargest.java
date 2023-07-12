import java.util.Scanner;

public class SecondLargest {
    public static int findSecondLargest(int n, int[] arr){
        int temp,second=-1;
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                temp = arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        for(int i=n-1;i>=0;i--){
            if(arr[i]==arr[n-1]){
                continue;
            }
            else{
                second = arr[i];
                break;
            }
        }
        return second;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        int secondLargest = findSecondLargest(n, arr);
        System.out.println(secondLargest);
    }
}
