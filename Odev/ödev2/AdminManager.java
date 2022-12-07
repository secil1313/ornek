package hafta5.Odev.ödev2;

import java.util.Scanner;

public class AdminManager {
	
	Scanner scan=new Scanner(System.in);
	Account account=new Account();
	AccountManager accountManager=new AccountManager();
	boolean krediBasvurusu=account.krediBasvurusu;
//	double bakiye=accountManager.bakiye;
	
	public void krediBasvurusunuOnayla(Account account) {
		System.out.println("Kredi basvurusu yaptiniz mi?");
		krediBasvurusu=scan.nextBoolean();
		if(krediBasvurusu==true) {
			System.out.println("Basvurunuz onaylanmistir.");
			account.bakiye=account.bakiye+account.istenenKredi;
			System.out.println("Yeni bakiyeniz: "+account.bakiye);
		}else {
			System.out.println("Kredi basvurusu yapilmamistir.");
		}
	}
	public void krediBasvurusunuReddet(Account account) {
		System.out.println("Kredi başvurusu yaptiniz mi?");
		krediBasvurusu=scan.nextBoolean();
		if(krediBasvurusu==true) {
			System.out.println("Basvurunuz reddedilmistir.");
			account.istenenKredi=0;
		}
		else {
			System.out.println("Kredi basvurusu yapilmamistir.");
		}
	}
	
}
