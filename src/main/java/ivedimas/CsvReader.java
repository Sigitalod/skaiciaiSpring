
	package ivedimas;

	import java.io.BufferedReader; 
	import java.io.IOException; 

	import java.io.FileReader;

	public class CsvReader {
		
		public BufferedReader buffered_reader;
		public String[] csv_line;
		
		public CsvReader() {
			
		}
		
		public CsvReader( String vardas_failo ) {
			
			try {
			
				buffered_reader = new BufferedReader( new FileReader( vardas_failo ) );

			} catch ( Exception e ) {
				
				e.printStackTrace();
			}
			
		}
		
		public void readLine() {
			
			try {
			
				csv_line =  buffered_reader.readLine().split( "," );
			
			} catch ( Exception e ) {
				
				e.printStackTrace();
			}			
		}
		
		public String toString() {

			String lent = "--------------\n";
			lent += "|  csv eil.  |\n";
			lent += "--------------\n";
			
			int i = 0;
			
			while ( i < csv_line.length ) {
				
				lent += "|" + String.format ( "%10s", csv_line [i] ) + " |\n";				
				i++;
			}
				
			lent += "--------------\n";
			
			return lent;
		}
	}