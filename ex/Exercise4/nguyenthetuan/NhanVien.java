package h17jb3.ex4;

import java.util.Objects;

public class NhanVien {
	private String maNV;
	private String tenNV;
	private int soSP;
	private long luong;

	@Override
	public String toString() {
		return "Nhân Viên - " + " Mã NV: " + maNV + ", Tên NV: " + tenNV + ", Số SP: " + soSP + ", Lương: " + luong
				+ ".";
	}

	public void show() {
		System.out.println("Nhân Viên- Show - " + " Mã NV: " + maNV + ", Tên NV: " + tenNV + ", Số SP: " + soSP
				+ ", Lương: " + luong + ".");
	}

	@Override
	public boolean equals(Object object) {
		if (this == object)
			return true;
		if (object == null)
			return false;
		if (getClass() != object.getClass())
			return false;
		final NhanVien other = (NhanVien) object;
		return Objects.equals(maNV, other.maNV);
	}

	@Override
	public int hashCode() {
		int hash = 0;
		if (hash == 1) {
			hash += (this.maNV != null ? this.maNV.hashCode() : 0);
		}
		return hash;
	}

	public NhanVien() {
		super();
	}

	public NhanVien(String maNV, int soSP) {
		super();
		this.maNV = maNV;
		this.soSP = soSP;
	}

	public NhanVien(String maNV, String tenNV, int soSP, long luong) {
		super();
		this.maNV = maNV;
		this.tenNV = tenNV;
		this.soSP = soSP;
		this.luong = luong;
	}

	public String getMaNV() {
		return maNV;
	}

	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}

	public String getTenNV() {
		return tenNV;
	}

	public void setTenNV(String tenNV) {
		this.tenNV = tenNV;
	}

	public int getSoSP() {
		return soSP;
	}

	public void setSoSP(int soSP) {
		this.soSP = soSP;
	}

	public long getLuong() {
		return luong;
	}

	public void setLuong(long luong) {
		this.luong = luong;
	}
}