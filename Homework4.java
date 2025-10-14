import java.util.Scanner;

public class Homework4 {
    static int gcd(int m, int n){
        if(n==0){
          return m;
        }
        int max, min;
        if(m>n){
            max = m;
            min = n;
        }
        else{
            max = n;
            min = m;
        }
        return gcd(min, max%min);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("두 수를 입력하세요: ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.printf("두 수의 최대공약수는 %d입니다.\n", gcd(m,n));
    }
}
