import java.util.ArrayList;

public class CT {

	public static void main(String[] args) {
		//Khai báo danh sách sản phẩm
		ArrayList<SanPham> dsSanPham;
		
		dsSanPham = new ArrayList<SanPham>();
		
		//Nhập 3 sản phẩm
//		SanPham sp1 = new SanPham(1, "Cơm tấm", "Đồ ăn", "ct.png");
		SanPham sp2 = new SanPham(2, "Phở bò", "Đồ ăn", "pb.png");
		SanPham sp3 = new SanPham(3, "Lẩu bò", "Đồ ăn", "lb.jpg");
		
		//Thêm vào ArrayList
		dsSanPham.add(new SanPham(1, "Cơm tấm", "Đồ ăn", "ct.png"));
		dsSanPham.add(sp2);
		dsSanPham.add(sp3);
		
//		for(SanPham x: dsSanPham)
//			System.out.print(x.toString());
		
		for(int i = 0; i<dsSanPham.size(); i++) {
			SanPham sp = dsSanPham.get(i);
			System.out.println(sp.toString());
		}
			
		
	}
}
