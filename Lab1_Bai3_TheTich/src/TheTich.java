import java.util.Scanner;
public class TheTich {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		//Nhập cạnh của khối lập phương
		System.out.print("Nhập cạnh của khối lập phương: ");
		double canh = scanner.nextDouble();
		
		double thetich = canh*canh*canh;
		
		//Xuất ra thể tích của khối lập phương
		System.out.println("Thể tích của khối lập phương là: " + thetich);
	}

}
