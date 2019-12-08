class suhu{
	//atribut
	public double c;
	public double f;
	public double r;
	public double k;
	public int p;


		//konversi dari celcius 
		public void CtoF(){
			f=c*1.8+32;
			System.out.println("Hasil Konversi Celcius to Farenheit = "+f);
		}
		public void CtoR(){
			r=c*0.8;
			System.out.println("Hasil Konversi Celcius to Reamur = "+r);
		}
		public void CtoK(){
			k=c+273.15;
			System.out.println("Hasil Konversi Celcius to Kelvin = "+k);
		}


		//konversi dari farenheit
		public void FtoC(){
			c=(f-32)/1.8;
			System.out.println("Hasil Konversi Farenheit to Celcius = "+c);
		}
		public void FtoR(){
			r=(f-32)/0.44;
			System.out.println("Hasil Konversi Farenheit to Reamur = "+r);
		}

		public void FtoK(){
			k=(f-459.67)/1.8;
			System.out.println("Hasil Konversi Farenheit to Kelvin = "+k);
		}


		//konversi dari reamur
		public void RtoC(){
			c=r/1.8;
			System.out.println("Hasil Konversi Reamur to Celcius = "+c);
		}
		public void RtoF(){
			f=r*2.25+0.44;
			System.out.println("Hasil Konversi Reamur to Farenheit = "+f);
		}

		public void RtoK(){
			k=r/0.8+273.15;
			System.out.println("Hasil Konversi Reamur to Kelvin = "+k);
		}


		//konversi dari kelvin
		public void KtoC(){
			c=k-273.15;
			System.out.println("Hasil Konversi Kelvin to Celcius = "+c);
		}
		public void KtoF(){
			f=k*1.8-459.67;
			System.out.println("Hasil Konversi Kelvin to Farenheit = "+f);
		}

		public void KtoR(){
			r=(k-273.15)*0.8;
			System.out.println("Hasil Konversi Kelvin to Reamur = "+r);
		}



}