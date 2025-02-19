import java.util.Scanner;
public class PTB1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Nhap vao he so a va b
		System.out.print("Nhap he so a: ");
		double a = scanner.nextDouble();
		System.out.print("Nhap vao he so b: ");
		double b = scanner.nextDouble();
		
        if(a == 0) {
        	if(b == 0) {
        		System.out.println("Phuong trinh co vo so nghiem");
        	}
        	else {
        		System.out.println("Phuong trinh vo nghiem");
        	}
        }
        else {
        	double x = -b / a;
        	System.out.println("Phuong trinh co nghiem: " + x);
        }
        
        scanner.close();
	}
}
