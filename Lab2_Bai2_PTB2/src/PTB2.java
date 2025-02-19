import java.util.Scanner;
public class PTB2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nhap he so a: ");
		double a = scanner.nextDouble();
		System.out.print("Nhap he so b: ");
		double b = scanner.nextDouble();
		System.out.print("Nhap he so c: ");
		double c = scanner.nextDouble();
		
		if(a == 0) {
			if(b == 0) {
				if(c == 0) {
					System.out.print("Phuong trinh co vo so nghiem.");
				}
				else {
					System.out.print("Phuong trinh vo nghiem.");
				}
			}
			else {
				double x = -c / b;
				System.out.print("Phuong trinh co nghiem la: x= " + x);
			}
		}
		else {
			double delta = b * b - 4 * a * c;
			if(delta > 0) {
				double x1 = (-b + Math.sqrt(delta)) / 2 * a;
				double x2 = (-b - Math.sqrt(delta)) / 2 * a;
				System.out.println("Phuong trinh co 2 nghiem phan biet: ");
				System.out.println("x1 = " + x1);
				System.out.println("x2 = " + x2);
			}
			else if(delta == 0) {
				double x = (-b) / (2 * a);
				System.out.print("Phuong trinh co 2 nghiem kep x= " + x);
			}
			else {
				System.out.print("Phuong trinh vo nghiem");
			}
		}
		scanner.close();
	}

}
