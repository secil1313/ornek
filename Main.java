package hafta5.Odev.ödev1;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {

	public static void main(String[] args) {
		File file=new File("C:\\bilgeadam\\io\\deneme7.txt");
		
		try {
			//FileExample.dosyaYarat(file);
			FileExample.dosyaYaz(file);
			FileExample.dosyaOku(file);
		} 
		catch(FileNotFoundException ep) {
			System.out.println("Dosya bulunamadi.");
			ep.printStackTrace();
		}catch (Exception e) {
			System.out.println("Dosya okuma hatasi.");
			
			e.printStackTrace();
		}
	}
	

}
