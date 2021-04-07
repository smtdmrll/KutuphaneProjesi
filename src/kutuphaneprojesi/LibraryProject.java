package kutuphaneprojesi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibraryProject {

	static List<String> ktpA = new ArrayList<>();
	static List<String> yzrA = new ArrayList<>();
	static List<String> yynY = new ArrayList<>();
	static List<String> ktpF = new ArrayList<>();
	static int secim;

	public static void main(String[] args) {
		
		listele();
		do {
			
			System.out.println("\nYUKARIDAK� L�STEDEN SE��M YAP;\n");
			secim();
		} while (secim!=5);
		
		System.out.println("Y�NE BEKLEM�YORUZ...");
	}

	private static void listele() {
		System.out.println("============K�TAP PROGRAMI========");
		System.out.println("\n\t1:Kitap Ekle");
		System.out.println("\t2:Numara ile Kitap Sil");
		System.out.println("\t3:Numara ile Kitap Ara");
		System.out.println("\t4:T�m Kitaplar� Listele ");
		System.out.println("\t4:Bitir");

	}

	private static void secim() {
		Scanner scan = new Scanner(System.in);
		secim = scan.nextInt();
			if(secim==1) kitapEkle();
			if(secim==2) kitapSil();
			if(secim==3) kitapGoster();
			if(secim==4) tumList();
			
	}
	

//--------------------------------------------------------------------------------------------------------------------------------------
	
	private static void kitapEkle() {//1
		Scanner scan = new Scanner(System.in);
		System.out.println("eklemek istedi�iniz kitab�n;");
		System.out.print("Ad�:");
		String ktpAd=scan.nextLine();
		ktpA.add(ktpAd);
		
		System.out.print("Yazar Ad�:");
		String yzrAd=scan.nextLine();
		yzrA.add(yzrAd);
		
		System.out.print("Yay�n Y�l�: ");
		String yynYil= scan.next();
		yynY.add(yynYil);
		
		System.out.print("Kitap Fiyat�: ");
		String fyt=scan.next();
		ktpF.add(fyt);
		
		
	}

//--------------------------------------------------------------------------------------------------------------------------------------

	private static void kitapSil() {//2
		Scanner scan = new Scanner(System.in);
		System.out.println("------------L�STEDEN S�LMEK �STED���N K�TABI SE�----------");
		int count=1001;
		System.out.println("\nNO:\t�S�M:\t\t\tYAZAR ADI:   \t\t\tYAYIN YILI:  \tF�YATI:");
		System.out.println("------\t------\t\t\t--------\t\t\t------\t\t------");
		for (int i = 0; i < ktpA.size(); i++) {
		
			System.out.println(count+"\t"+ ktpA.get(i)+"\t\t\t"+yzrA.get(i)+"\t\t\t\t"+yynY.get(i)+"\t\t"+ktpF.get(i));
			
			count++;
		}
		
		System.out.println("silmek istedi�in kitap no gir ");
		int count2=1001;
		int silNo=scan.nextInt()-count2;
		
		if(silNo>=0 && silNo<ktpA.size()) {
			ktpA.remove(silNo);
			yzrA.remove(silNo);
			yynY.remove(silNo);
			ktpF.remove(silNo);
			System.out.println("silme i�lemi ger�ekle�mi�tir");
		}else System.out.println("girdi�iniz numara bulunamad� ");
		
	}

//----------------------------------------------------------------------------------------------------------------------------------------
	
	
	private static void kitapGoster() {//3
		Scanner scan = new Scanner(System.in);
		int count=1001;
		int ktpGoster=scan.nextInt()-count;
		
		System.out.println("g�rmek istedi�iniz kitap numaras�n� giriniz ");
		
		if(ktpGoster>=0 &&ktpGoster<ktpA.size() ) {
			System.out.println("Se�ti�ini kitap: " + (ktpGoster+count)+"\t"+ktpA.get(ktpGoster)+"\t"+yzrA.get(ktpGoster)+"\t"+yynY.get(ktpGoster)+"\t"+ktpF.get(ktpGoster));
		}
	}
	
//----------------------------------------------------------------------------------------------------------------------------------------

	private static void tumList() {//4
		int count=1001;
		System.out.println("\nNO:\t�S�M:\t\t\tYAZAR ADI:   \t\t\tYAYIN YILI:  \tF�YATI:");
		System.out.println("------\t------\t\t\t--------\t\t\t------\t\t------");
		for (int i = 0; i < ktpA.size(); i++) {
		
			System.out.println(count+"\t"+ ktpA.get(i)+"\t\t\t"+yzrA.get(i)+"\t\t\t\t"+yynY.get(i)+"\t\t"+ktpF.get(i));
			
			count++;
		}
		
		
	}












}
