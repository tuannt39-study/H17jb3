package h17jb3.ex7.Streams;

public class NhanVien {
	private String maNV;
	private String hoTen;
	private int tuoi;
	private int luong;
	public NhanVien() {
		super();
	}
	public NhanVien(String maNV, String hoTen, int tuoi, int luong) {
		super();
		this.maNV = maNV;
		this.hoTen = hoTen;
		this.tuoi = tuoi;
		this.luong = luong;
	}
	public String getMaNV() {
		return maNV;
	}
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	public int getLuong() {
		return luong;
	}
	public void setLuong(int luong) {
		this.luong = luong;
	}
	
	@Override
	public String toString() {
		return "\nMa nhan vien: " + maNV + " - Ho ten: " + hoTen + " - Tuoi: " + tuoi + " - Luong: " + luong;
	}
	
}
