package h17jb3.ex5;
//Bai - 6
public class NhanVienB6 {
	private int maNV;
	private String hoTen;
	private String diaChi;
	private Boolean CBQL;
	protected NhanVienB6(int maNV, String hoTen, String diaChi, Boolean cBQL) {
		super();
		this.maNV = maNV;
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		CBQL = cBQL;
	}
	protected NhanVienB6() {
		super();
	}
	protected int getMaNV() {
		return maNV;
	}
	protected void setMaNV(int maNV) {
		this.maNV = maNV;
	}
	protected String getHoTen() {
		return hoTen;
	}
	protected void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	protected String getDiaChi() {
		return diaChi;
	}
	protected void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	protected Boolean getCBQL() {
		if (CBQL==true) {
			return CBQL;
		} else return null;
	}
	protected void setCBQL(Boolean cBQL) {
		this.CBQL = cBQL;
	}
	protected void show(){
		System.out.println("Ma NV: " + maNV + "\nHo Ten: " + hoTen + "\nDia chi: " + diaChi + "\nCBQL: " + CBQL);
	}

	public String toString(){
		return "Ma NV: " + maNV + "\nHo Ten: " + hoTen + "\nDia chi: " + diaChi + "\nCBQL: " + CBQL;
	}
}
