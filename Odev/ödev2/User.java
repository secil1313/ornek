package hafta5.Odev.ödev2;

public class User {
	String name;
	String surname;
	String email;
	Account account;
	
	public User(String name, String surname, Account account) {
		super();
		this.name = name;
		this.surname = surname;
		this.account = account;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", surname=" + surname + ", email=" + email + "]";
	}
	
	

}
