package Television;

public class Output {
public static void main (String [] args) {
	Input input = new Input() ;

	input.volTage = 60 ;
	input.buttonPower = true ;
	input.disPlay = true ;
	input.speakerSound = 10 ;
	input.HDMI = true ;
	input.VGA = true ;
	input.indicatorLed = true ;
	
	/* jadi di sini itu sebagai
	 *  memproses sebuah function yang kita awal buat jadi 
	 *  input.voltage(); itu sebuah method yang memiliki sebuah funsi atau ada fungsinya
	 *  
	 *  
	 */
	input.Voltage();
}
}
