import java.util.Scanner;

public class Baslama {

	public static void main(String[] args) {
		int mat, fizik, kimya, turkce, tarih, muzik;

		Scanner inp = new Scanner(System.in);
		System.out.println("Mat De�erini Giriniz:");
		mat = inp.nextInt();
		System.out.println("Fizik De�erini Giriniz:");
		fizik = inp.nextInt();
		System.out.println("kimya De�erini Giriniz:");
		kimya = inp.nextInt();
		System.out.println("turkce De�erini Giriniz:");
		turkce = inp.nextInt();
		System.out.println("tarih De�erini Giriniz:");
		tarih = inp.nextInt();
		System.out.println("muzik De�erini Giriniz:");
		muzik = inp.nextInt();

		int toplam = (mat + fizik + kimya + muzik + tarih + turkce);
		int sonuc = (toplam / 6);
		System.out.println("Ortalama notunuz: " + sonuc);

		String res=(sonuc >=60)?"Ge�ti":"Kald�";
		System.out.println(res);
	}

}
