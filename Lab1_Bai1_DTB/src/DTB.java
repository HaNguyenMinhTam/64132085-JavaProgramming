import java.util.Scanner;
public class DTB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		//Nhập thông tin sinh viên
		System.out.print("Nhập họ sinh viên: ");
		String ho = scanner.nextLine();
		System.out.print("Nhập tên sinh viên: ");
		String ten = scanner.nextLine();
		System.out.print("Nhập điểm trung bình: ");
		double DTB = scanner.nextDouble();
		
		//Hiển thị thông tin sinh viên
		System.out.println("\nThông tin sinh viên:");
		System.out.println("Sinh viên có họ: " + ho);
		System.out.println("Sinh viên có tên: " + ten);
		System.out.println("Điểm trung bình của sinh viên: " + DTB);
		
		scanner.close();

	}

}
