package hafta5.Odev.ödev2;

public class AccountManager {
//	Account a=new Account();
//	double bakiye=a.bakiye;
	
	public void paraYatir(Account account, double miktar) {
		if(miktar<10000) {
			account.bakiye=account.bakiye+miktar;
			System.out.println("Yatirilan miktar:"+miktar);
			System.out.println("Guncel bakiye:"+account.bakiye); 
			
		}else {
			System.out.println("10000 TL üzeri para yatırılamaz.");
		}
	}
	public void paraCek(Account account, double miktar) {
		if(miktar>account.bakiye) {
			System.out.println("Bakiyeniz yetersiz");
		}else {
			account.bakiye=account.bakiye-miktar;
			System.out.println("Cekilen miktar:"+miktar);
			System.out.println("Guncel bakiye:"+account.bakiye); 
		}
	}
	public void hesapBilgileriniGoster(Account account) {
		
		System.out.println("Hesap no: "+account.hesapNo);
		System.out.println("Guncel bakiye: "+account.bakiye);
	}
	
}
