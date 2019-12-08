import java.util.Scanner;
public class hitungsuhu {
	public static void main(String args[]){
	suhu cel=new suhu();
	Scanner keyboard = new Scanner(System.in);
	System.out.println("1.  Konversi Celcius   to Farenheit ");
	System.out.println("2.  Konversi Celcius   to Reamur ");
	System.out.println("3.  Konversi Celcius   to Kelvin ");
	System.out.println("4.  Konversi Farenheit to Celcius ");
	System.out.println("5.  Konversi Farenheit to Reamur ");
	System.out.println("6.  Konversi Farenheit to Kelvin ");
	System.out.println("7.  Konversi Reamur    to Celcius ");
	System.out.println("8.  Konversi Reamur    to Farenheit ");
	System.out.println("9.  Konversi Reamur    to Kelvin ");
	System.out.println("10. Konversi Kelvin    to Celcius ");
	System.out.println("11. Konversi Kelvin    to Farenheit ");
	System.out.println("12. Konversi Kelvin    to Reamur ");
	System.out.println("User mau Hitung Konversi apa ? ");
		
		cel.p = keyboard.nextInt();
		switch (cel.p){
			
			//object konversi celsius
			case 1 :
			System.out.print("Masukkan nilai suhu Celcius = ");
			cel.c = keyboard.nextInt();
			cel.CtoF();
			break;
			case 2 :
			System.out.print("Masukkan nilai suhu Celcius = ");
			cel.c = keyboard.nextInt();
			cel.CtoR();
			break;
			case 3 :
			System.out.print("Masukkan nilai suhu Celcius = ");
			cel.c = keyboard.nextInt();
			cel.CtoK();
			break;
			
			
			//object konversi farenheit
			case 4 :
			System.out.print("Masukkan nilai suhu Farenheit = ");
			cel.f = keyboard.nextInt();
			cel.FtoC();
			break;
			case 5 :
			System.out.print("Masukkan nilai suhu Farenheit = ");
			cel.f = keyboard.nextInt();
			cel.FtoR();
			break;
			case 6 :
			System.out.print("Masukkan nilai suhu Farenheit = ");
			cel.f = keyboard.nextInt();
			cel.FtoK();
			break;
			
			
			//object konversi reamur
			case 7 :
			System.out.print("Masukkan nilai suhu Reamur = ");
			cel.r = keyboard.nextInt();
			cel.RtoC();
			break;
			case 8 :
			System.out.print("Masukkan nilai suhu Reamur = ");
			cel.r = keyboard.nextInt();
			cel.RtoF();
			break;
			case 9 :
			System.out.print("Masukkan nilai suhu Reamur = ");
			cel.r = keyboard.nextInt();
			cel.RtoK();
			break;
			
			
			//object konversi farenheit
			case 10 :
			System.out.print("Masukkan nilai suhu Kelvin = ");
			cel.k = keyboard.nextInt();
			cel.KtoC();
			break;
			case 11 :
			System.out.print("Masukkan nilai suhu Kelvin = ");
			cel.k = keyboard.nextInt();
			cel.KtoF();
			break;
			case 12 :
			System.out.print("Masukkan nilai suhu Kelvin = ");
			cel.k = keyboard.nextInt();
			cel.KtoR();
			break;
		}
	}
}