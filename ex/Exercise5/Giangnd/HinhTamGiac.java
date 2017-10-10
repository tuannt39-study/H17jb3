package vn.hackademics.exercise5;

public class HinhTamGiac {
	private int ma, mb, mc;

	public HinhTamGiac(int ma, int mb, int mc) {
		if (laTamGiac(ma, mb, mc)) {
			this.ma = ma;
			this.mb = mb;
			this.mc = mc;
		} else {
			System.out.println("Đây không phải là hình tam giác");
			this.ma = 0;
			this.mb = 0;
			this.mc = 0;
		}
	}

	public HinhTamGiac() {
	}

	public int getCanhA() {
		return ma;
	}

	public void setCanhA(int ma) {
		if (ma > 0) {
			this.ma = ma;
		} else
			this.ma = 0;
	}

	public int getCanhB() {
		return mb;
	}

	public void setCanhB(int mb) {
		if (mb > 0) {
			this.mb = mb;
		} else
			this.mb = 0;
	}

	public int getCanhC() {
		return mc;
	}

	public void setCanhC(int mc) {
		if (mc > 0) {
			this.mc = mc;
		} else
			this.mc = 0;
	}

	public int getChuVi() {
		int chuVi = 0;
		chuVi = ma + mb + mc;
		return chuVi;
	}

	public double getDienTich() {
		int p = (ma + mb + mc)/2;
        return Math.sqrt(p * (p - ma) * (p - mb) * (p - mc));
	}

	public boolean laTamGiac(int ma, int mb, int mc) {
		if (ma > 0 && mb > 0 && mc > 0 && (ma + mb > mc) && (ma + mc > mb) && (mb + mc > ma)) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		HinhTamGiac tri = new HinhTamGiac(3, 4, 5);
		System.out.println("Chu vi cua tam giac la: " + tri.getChuVi());
		System.out.println("Dien tich cua tam giac la: " + tri.getDienTich());
		
	}

}
