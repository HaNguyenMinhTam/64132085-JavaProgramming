import java.util.Scanner;
public class Delta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		// Nhập các hệ số a, b, c
        System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập hệ số c: ");
        double c = scanner.nextDouble();

        // Tính delta
        double delta = Math.pow(b, 2) - 4 * a * c;

        // Xuất kết quả
        System.out.println("\nGiá trị delta: " + delta);
        if (delta >= 0) {
            System.out.println("Căn delta: " + Math.sqrt(delta));
        } else {
            System.out.println("Delta âm, không thể tính căn delta.");
        }

        scanner.close();
	}

}
