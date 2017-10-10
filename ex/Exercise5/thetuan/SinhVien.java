package h17jb3.ex5;
//Bai - 5
public class SinhVien {
	private String maSV;
	private String hoTen;
	private int diemLT;
	private int diemTH;
	protected SinhVien(String maSV, String hoTen, int diemLT, int diemTH) {
		super();
		this.maSV = maSV;
		this.hoTen = hoTen;
		this.diemLT = diemLT;
		this.diemTH = diemTH;
	}
	protected SinhVien() {
		super();
	}
	protected String getMaSV() {
		return maSV;
	}
	protected void setMaSV(String maSV) {
		this.maSV = maSV;
	}
	protected String getHoTen() {
		return hoTen;
	}
	protected void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	protected int getDiemLT() {
		return diemLT;
	}
	protected void setDiemLT(int diemLT) {
		this.diemLT = diemLT;
	}
	protected int getDiemTH() {
		return diemTH;
	}
	protected void setDiemTH(int diemTH) {
		this.diemTH = diemTH;
	}
	@Override
	public String toString() {
		return "SV: " + "\nMa sinh vien: " + maSV + "\nHo ten: " + hoTen + "\nDiem LT: " + diemLT + "\nDiem TH: " + diemTH;
	}
	protected void show(){
		System.out.println("SV: " + "\nMa sinh vien: " + maSV + "\nHo ten: " + hoTen + "\nDiem LT: " + diemLT + "\nDiem TH: " + diemTH);
	}
}
