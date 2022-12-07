package hafta5.Odev.ödev2;

import java.util.Scanner;

public class UserManager {
	Account account=new Account();
	Scanner scan=new Scanner(System.in);
	boolean krediBasvurusu=account.krediBasvurusu;
	
	String endPattern = "@gmail.com";
	AccountManager accountManager=new AccountManager();

	
	public void otomatikEmailOlustur(User user) {
		
		user.email=user.name+user.surname+endPattern;
		System.out.println(user.email);
	}
	
	public void  bilgileriGoster(User user) {
		
		System.out.println("Isim: " + user.name + " Surname: " + user.surname + " HesapNo : " + user.account.hesapNo + " Email : " + user.email + 
                " Hesap Bakiyeniz: " + user.account.bakiye + " Kalan kredi Borcunuz " + user.account.istenenKredi  );
	}
	public void krediBasvurusundaBulun(Account account, int para) {
		System.out.println("Krediniz onaylanmistir.Alacaginiz para "+para);
		account.istenenKredi=account.istenenKredi+para;
	}
	public void krediKartiBorcuOdeme(Account account, double taksit) {
		System.out.println("Borcunuzu odeyecek misiniz?Yoksa false diyebilirsiniz.");
		krediBasvurusu=scan.nextBoolean();
		if(krediBasvurusu==true) {
				
		System.out.println("Odenen borc "+taksit);
		
		account.istenenKredi=account.istenenKredi-taksit;
		System.out.println("Kalan guncel borc: "+account.istenenKredi);
		account.bakiye=account.bakiye-taksit;
		
	}else {
		System.out.println("Kredi borcunuz yoktur.");
	}
	
}
}