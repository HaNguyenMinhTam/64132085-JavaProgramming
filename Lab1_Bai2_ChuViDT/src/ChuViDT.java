import java.util.Scanner;
public class ChuViDT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		//Nhập chiều dài
		System.out.print("Nhập chiều dài: ");
		double chieudai = scanner.nextDouble();
		
		//Nhập chiều rộng
		System.out.print("Nhập chiều rộng: ");
		double chieurong = scanner.nextDouble();
		
		double dientich = chieudai * chieurong;
		
		double chuvi = (chieudai + chieurong) * 2;
		
		//Xuất ra 2 cạnh, chu vi và diện tích của hình chữ nhật
		System.out.println("\nChiều dài của hình chữ nhật: " + chieudai);
		System.out.println("Chiều rộng của hình chữ nhật: " + chieurong);
		System.out.println("Diện tích của hình chữ nhật: " + dientich);
		System.out.println("Chu vi của hình chữ nhật: " + chuvi);
	}

}
