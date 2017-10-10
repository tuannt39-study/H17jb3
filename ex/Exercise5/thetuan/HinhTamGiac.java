package h17jb3.ex5;
//Bai - 2
public class HinhTamGiac {
	private int canhA;
	private int canhB;
	private int canhC;
	
	protected HinhTamGiac() {
		super();
	}
	protected HinhTamGiac(int canhA, int canhB, int canhC) {
		super();
		this.canhA = canhA;
		this.canhB = canhB;
		this.canhC = canhC;
	}
	protected int getCanhA() {
		return canhA;
	}
	protected void setCanhA(int canhA) {
		if (canhA>0){
			this.canhA = canhA;
		} else return;
	}
	protected int getCanhB() {
		return canhB;
	}
	protected void setCanhB(int canhB) {
		if (canhB>0){
			this.canhB = canhB;
		} else return;
	}
	protected int getCanhC() {
		return canhC;
	}
	protected void setCanhC(int canhC) {
		if (canhC>0){
			this.canhC = canhC;
		} else return;
	}
	protected boolean laTamGiac(){
		if ((canhA + canhB) > canhC && (canhA + canhC) > canhB && (canhB + canhC) > canhA)
			return true;
		else return false;
	}
	protected boolean laTamGiac(int a, int b, int c){
		if ((a + b) > c && (a + c) > b && (b + c) > a)
			return true;
		else return false;
	}
	
	private int tinhChuVi;
	private double tinhDienTich;
	
	protected int getChuVi() {
		tinhChuVi=canhA+canhB+canhC;
		System.out.println("Chu vi = " + tinhChuVi);
		return tinhChuVi;
	}

	protected double getDienTich(){
		tinhDienTich=(Math.sqrt((canhA+canhB+canhC)*(canhA+canhB-canhC)*(canhB+canhC-canhA)*(canhA-canhB+canhC))/4);
		System.out.println("Dien tich = " + tinhDienTich);
		return tinhDienTich;
	}
}
