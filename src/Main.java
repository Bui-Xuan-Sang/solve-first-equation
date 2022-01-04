import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a;
        double b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        a = sc.nextDouble();
        System.out.println("Enter b: ");
        b = sc.nextDouble();
        double x = -b/(2*a);
        if (a == 0){
            if (b == 0){
                System.out.println("Phương trình có vô số nghiệm");
            }else {
                System.out.println("Phương trình vô nghiệm");
            }
        }else {
            System.out.println("Phương trình có nghiệm: " + x);;
        }
    }
}
