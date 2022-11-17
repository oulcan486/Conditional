package conditional;

public class RecapDemo1 {

	public static void main(String[] args) {
		int sayi1=90, sayi2=93, sayi3=70;
		String mesaj=" En büyük sayidir";
		if(sayi1>sayi2) {
			if(sayi1>sayi3) {
				System.out.println(sayi1 + mesaj );
			}
		}
		if(sayi2>sayi1) {
			if(sayi2>sayi3) {
				System.out.println(sayi2 + mesaj);
			}
		}
		if(sayi3>sayi1) {
			if(sayi3>sayi2) {
				System.out.println(sayi3 + mesaj);
			}
		}

	}

}
