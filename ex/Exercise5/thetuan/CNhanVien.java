package h17jb3.ex5;
//Bai - 4
public class CNhanVien {
	private String mHo;
	private String mTen;
	private int mSoSP;
	protected CNhanVien() {
		super();
	}
	protected CNhanVien(String mHo, String mTen, int mSoSP) {
		super();
		this.mHo = mHo;
		this.mTen = mTen;
		if (mSoSP<0) mSoSP=0;
		this.mSoSP = mSoSP;
	}
	protected String getmHo() {
		return mHo;
	}
	protected void setmHo(String mHo) {
		this.mHo = mHo;
	}
	protected String getmTen() {
		return mTen;
	}
	protected void setmTen(String mTen) {
		this.mTen = mTen;
	}
	protected int getmSoSP() {
		return mSoSP;
	}
	protected void setmSoSP(int mSoSP) {
		this.mSoSP = mSoSP;
	}
	protected double getLuong() {
		double luong = 0;
		if (mSoSP>=1 && mSoSP<200){
			luong=(double)(mSoSP*0.5);
		} else if (mSoSP>=200 && mSoSP<400){
			luong=(double)(mSoSP*0.55);
		} else if (mSoSP>=400 && mSoSP<600){
			luong=(double)(mSoSP*0.6);
		} else if (mSoSP>=600){
			luong=(double)(mSoSP*0.65);
		} return luong;
	}
	protected boolean NhieuHon(){
		if (mSoSP>mSoSP)
			return true;
		else return false;
	}
}
