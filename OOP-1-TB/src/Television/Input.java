package Television;
// jadi ini sebuah class yang bernama Input Jadi Class Bisa Di definisikan Dengan Cetak biru nya atau Kertasnya
// dan fungction ,method,variable,konstanta,dll itu sebagai kerangka 
// dan di java itu ada Public, proctected, private, nah apa itu? jadi ini sebuah keamanan yang ada di sebuah class 
public class Input {
	//Attribute
	int volTage;
	boolean buttonPower;
	boolean disPlay;
	int speakerSound;
	String Brand;
	boolean HDMI;
	boolean VGA;
	boolean indicatorLed;
	
	//function voltage 
	void Voltage() {
		
		/*
	 jadi kalau ingin membuat sebuah method maka bikin dulu keterangannya dan fungsinya
	 lalu apa itu if ? if adalah sebuah perintah untuk membuat sebuah kondisi contohnya dibawah
	 jadi if ini mengkondisikan sebuah integer yang apabila variable tersebut di atas 50 maka akan keluar 
	 output / print "Adapter is compatible" dan berlanjut ke function ynag kita buat yaiut poweron dan kenapa bisa begitu
	 karena kita memanggil di sebuah method yang sedang berjalan maka akan berlanjut terus ke method selanjutnya
	 lalu apabila variable tersebut besisi di bawah 50 maka akan keluar print "incompatible is adapter"
	 jadi fase if itu ada tiga 1. if = awalan kondisi , 2. if else = pertengahan kondisi (banyak kemungkinan)
	 3. else = kondisi terakhir .  
		*/
		
		if (volTage >= 50) {
			System.out.println("apakah adapter ini cocok untuk tv?");
			System.out.println("Adapter Is Compatible");
			Poweron();
			}else{
				System.out.println("apakah adapter ini cocok untuk tv?");
			System.out.println("Adapter Is Incompatible");
			
		}
		
	}
	
	
	//function button power
	void Poweron() {
		// jadi apabila power button di nyalakan maka akan mengoutput / print television turning on 
		System.out.println("apakah button power tv ini sudah di tekan?");
		if (buttonPower) {
			System.out.println("Television Turning on");
			// kenapa saya masukan void display karena apabila buttonpower nya di nyalakan maka akan keluar print television is turning on dan lanjut ke display function
			Display() ;
		} else{
			// dan ini kebalikan yang di atas apabila power button false atau di tekan lagi maka akan mengeluarkan / print television turning off
			System.out.println("Television Turning off");
		}
	}
	String Logo() {
		return "SAMSNUG";
	}
	
	void Display() {
		
		/* apabila ingin memasukan boolean ke sebuah statement/ pernyataan.
		 *  maka harus nulis boolean nya atau true 
		 *  dan kalau ingin false tinggal kasih tanda seru di depan nama boolean tersebut 
		 *  contoh nya "!buttonPower"
		 */
		System.out.println("Tegangan nya tersedia");
		if (volTage >= 50 && buttonPower) {
			disPlay = true ;
			//jadi ini itu adalah panggilan yang kita buat untuk memanggil inputan lain seperti cek suara, hdmi nya , vga nya, indikator nya
			// dan kenapa saya masukan banyak function di satu kondisi karena setelah layar nyala kita ngapain 
			Speakersound();
			HdMI();
			VgA();
			Indikator();
		}else {
			disPlay = false ;
		}
	}
	// function speaker
	void Speakersound() {
		// jadi kita membuat konndisi speaker apabila di bawah 5 maka akan keluar output I Can't Hear Sound"
		if (speakerSound <= 5) {
			System.out.println("Speaker Is not Working" );
		}else {
			// dan ini kondisi dimana speaker yang di atas 10
			System.out.println("Speaker Is Working and The Volume is "+ speakerSound +"%");
		}
	}
	//function hdmi
	void HdMI() {
		if (HDMI) {
		System.out.println("HDMI is conected");
		}else{
		System.out.println("HDMI Not Found");
		}
	}
	// function vga
	void VgA() {
		if (VGA) {
			System.out.println("VGA is conected");
		}else {
		System.out.println("VGA Not Found");
		}
	}
	// function vga
	void Indikator() {
		if (indicatorLed) {
			System.out.println("indikator sudah menyala");
		}else {
			System.out.println("indikator belum menyala");
		}
	}
}
