import java.util.Scanner;

public class Homework1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.print("정수를 입력하세요: ");
        arr[0] = sc.nextInt();
        System.out.printf("현재까지 입력된 정수의 합은 %d입니다.\n", arr[0]);
        System.out.print("정수를 입력하세요: ");
        arr[1] = sc.nextInt();
        System.out.printf("현재까지 입력된 정수의 합은 %d입니다.\n", arr[0]+arr[1]);
        System.out.print("정수를 입력하세요: ");
        arr[2] = sc.nextInt();
        System.out.printf("현재까지 입력된 정수의 합은 %d입니다.\n", arr[0]+arr[1]+arr[2]);
        System.out.print("정수를 입력하세요: ");
        arr[3] = sc.nextInt();
        System.out.printf("현재까지 입력된 정수의 합은 %d입니다.\n", arr[0]+arr[1]+arr[2]+arr[3]);
        System.out.print("정수를 입력하세요: ");
        arr[4] = sc.nextInt();
        System.out.printf("현재까지 입력된 정수의 합은 %d입니다.\n", arr[0]+arr[1]+arr[2]+arr[3]+arr[4]);
    }
}