package hafta5.Odev.ödev2;

import java.util.Random;

public class Account {
	
	int hesapNo;
	double bakiye;
	boolean krediBasvurusu;
	double istenenKredi;
	//;
	
	
	public Account() {
		Random r=new Random(); //random sınıfı
		   int hesapNo=r.nextInt(1000);
		this.hesapNo=hesapNo;
	}

	public Account(int hesapNo) {
		super();
		this.hesapNo = hesapNo;
	}

	public int getHesapNo() {
		return hesapNo;
	}

	public void setHesapNo(int hesapNo) {
		this.hesapNo = hesapNo;
	}

	public double getBakiye() {
		return bakiye;
	}

	public void setBakiye(double bakiye) {
		this.bakiye = bakiye;
	}

	public boolean isKrediBasvurusu() {
		return krediBasvurusu;
	}

	public void setKrediBasvurusu(boolean krediBasvurusu) {
		this.krediBasvurusu = krediBasvurusu;
	}

	public double getIstenenKredi() {
		return istenenKredi;
	}

	public void setIstenenKredi(double istenenKredi) {
		this.istenenKredi = istenenKredi;
	}

//	@Override
//	public String toString() {
//		return "Account [hesapNo=" + hesapNo + ", bakiye=" + bakiye + "]";
//	}
	

}
