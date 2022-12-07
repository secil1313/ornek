package hafta5.Odev.ödev1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileExample {
	
		public static void dosyaYarat(File file)throws IOException {
			if(file.exists()) {
				System.out.println("Dosya mevcut...");
			}else {
				if(!file.createNewFile()) {
					System.out.println("Dosya olusurken hata olustu.");
				}else {
					System.out.println("Dosya olusturuldu.");
				}
			}
		}
		public static void dosyaYaz(File file)throws Exception {
			if(file.exists()) {
			System.out.println("Dosya mevcut...");}
		
				
				FileWriter fileWriter=new FileWriter(file,true);
				//dosyaya yazma yolunu öğreniyoruz, yazılabilir olup olmadığını öğreniyoruz.
				BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
				//dosyaya yazmak istediğimiz şeyi yazdırıyoruz.
				bufferedWriter.write("Merhaba Dunya");
				bufferedWriter.close();
				System.out.println("Dosyaya yazma islemi basarili");
			
			}
		
		public static void dosyaOku(File file)throws Exception {
			if(file.exists()) {
				System.out.println("Dosya mevcut...");
			}
			FileReader fileReader;
			fileReader = new FileReader(file);
			String line;
			BufferedReader bufferedReader=new BufferedReader(fileReader);
			
			while((line=bufferedReader.readLine())!=null) {
				System.out.println(line);
			}
		
	}

}
