package h17jb3.ex5;

public class NhanVienMain {

	public static void main(String[] args) {
		NhanVien n1 = new NhanVien();
		n1.setMaNV("01");
		n1.setSoSP(400);
		NhanVien n2 = new NhanVien();
		n2.setMaNV("02");
		n2.setSoSP(600);
		n1.getTongKet();
		n1.getLuong();
		n1.XuatTieuDe();
		n2.getTongKet();
		n2.getLuong();
		n2.XuatTieuDe();
	}

}
