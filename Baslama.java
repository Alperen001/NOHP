import java.util.Scanner;

public class Baslama {

	public static void main(String[] args) {
		int mat, fizik, kimya, turkce, tarih, muzik;

		Scanner inp = new Scanner(System.in);
		System.out.println("Mat Deðerini Giriniz:");
		mat = inp.nextInt();
		System.out.println("Fizik Deðerini Giriniz:");
		fizik = inp.nextInt();
		System.out.println("kimya Deðerini Giriniz:");
		kimya = inp.nextInt();
		System.out.println("turkce Deðerini Giriniz:");
		turkce = inp.nextInt();
		System.out.println("tarih Deðerini Giriniz:");
		tarih = inp.nextInt();
		System.out.println("muzik Deðerini Giriniz:");
		muzik = inp.nextInt();

		int toplam = (mat + fizik + kimya + muzik + tarih + turkce);
		int sonuc = (toplam / 6);
		System.out.println("Ortalama notunuz: " + sonuc);

		String res=(sonuc >=60)?"Geçti":"Kaldý";
		System.out.println(res);
	}

}
