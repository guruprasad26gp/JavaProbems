import java.util.Scanner;

public class ScaleneTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            
            if((a==b)||(a==c)||(b==c)){
                System.out.println("No");
            }else{
                System.out.println("YES");
            }
        }
    }
}
