package mokomes_kelisk;

import ivedimas.CsvReader;
import skaiciuojam.*;

public class SkaiciavimoUzduotis {
	
	public ManoSkaiciai mano_skaiciai;
	
	public ManoSkaiciai[] visi_skaiciai;
	
	public int kiek = 0;
	
	public SkaiciavimoUzduotis() {
		
	}
	
	public SkaiciavimoUzduotis(ManoSkaiciai mano_skaiciai) {
		
		this.mano_skaiciai = mano_skaiciai;
		
		this.visi_skaiciai = new ManoSkaiciai[3];
	}
	
	public void vykdyti() throws CloneNotSupportedException {
		CsvReader csv_reader = new CsvReader( "skaiciai.csv" );
		csv_reader.readLine();
		System.out.println ( csv_reader.toString() ); 		
		
		ManoSkaiciai mano_skaicius;
		
		int i = 0;
		
		while ( i < csv_reader.csv_line.length ) {
			
			System.out.println ( "Skaiciu ketvertas : " + csv_reader.csv_line [i].trim() );
			
			mano_skaiciai.nustatyti ( csv_reader.csv_line [i] );
			
			visi_skaiciai [i] = (ManoSkaiciai) mano_skaiciai.clone();
			
			System.out.println ( "Teisinga seka: " + mano_skaiciai.teisingaSeka() );
			System.out.println ( "Vidurkis: " + mano_skaiciai.vidurkis() );
			System.out.println ( "Ketverto maksimumas: " + mano_skaiciai.max() );
			//System.out.println ( "Trejeto vid sk: " + mano_skaiciai.vidSk() );
			
			i++;
			
		}
		
	}

}
