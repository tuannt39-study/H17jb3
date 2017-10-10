package h17jb3.ex5;
//Bai - 3
public class NhanVien {
	private String maNV;
	private int soSP;
	private String tongKet;
	private int luong;
	
	protected NhanVien() {
		super();
	}
	protected NhanVien(String maNV, int soSP) {
		super();
		this.maNV = maNV;
		this.soSP = soSP;
	}
	
	protected String getMaNV() {
		return maNV;
	}
	protected void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	protected int getSoSP() {
		return soSP;
	}
	protected void setSoSP(int soSP) {
		this.soSP = soSP;
	}
	
	protected boolean coVuotChuan(){
		if (soSP>500)
			return true;
		else return false;
	}
	protected String getTongKet() {
		if (coVuotChuan()==true) 
			return "YES";
		else return "NO";
	}
	protected int getLuong() {
		if (coVuotChuan()==true) {
			luong=soSP*30000;
		} else luong=soSP*20000;
		return luong;
	}
	protected void XuatTieuDe(){
		System.out.println("Tieu de: " + "\nMa nhan vien: " + maNV + "\nSo san pham: " + soSP + "\nLuong: " + luong + "\nTong ket: " + getTongKet());
	}
	@Override
	public String toString() {
		return "Tieu de: " + "\nMa nhan vien: " + maNV + "\nSo san pham: " + soSP + "\nLuong: " + luong + "\nTong ket: " + getTongKet();
	}
}
