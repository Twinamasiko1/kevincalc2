package kevincalc;
import java.util.Scanner;
public class kevincalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0;
		int h = 0;
Scanner sc = new Scanner(System.in);
System.out.println("1. Add");
System.out.println("2. Subtract");
System.out.println("3. Multiply");
System.out.println("4. Division");
System.out.println("5. Exit....");
do {
    System.out.println("Enter Choice: ");
    int ch = sc.nextInt();
    if (ch == 5) {
        System.out.println("exiting ...");
        break;
    }
    switch (ch) {

        case 1:
            System.out.println("Enter two numbers:");
            x = sc.nextInt();
            h = sc.nextInt();
            x = x + h;
            System.out.println("Your answer is: " + x);
            break;
        case 2:
            System.out.println("Enter two numbers: ");
            x = sc.nextInt();
            h = sc.nextInt();
            x = x - h;
            System.out.println("Your answer is: " + x);
            break;
        case 3:
            System.out.println("Enter two numbers: ");
            x = sc.nextInt();
            h = sc.nextInt();
            x = x * h;
            System.out.println("Your answer is: " + x);
            break;
        case 4:
            System.out.println("Enter two numbers: ");
            x = sc.nextInt();
            h = sc.nextInt();
            x = x / h;
            System.out.println("Your answer is: " + x);
            break;
        case 5:
            System.out.println("GOODBYE....!!!");
            break;
        default:
            System.out.println("Invalid Number.....Please try again...");
            break;
    }

} while (true);
}


	}


