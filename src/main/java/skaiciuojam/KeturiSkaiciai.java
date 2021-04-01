
	package skaiciuojam;

	public class KeturiSkaiciai extends ManoSkaiciai {
	
		public int sk1;
		public int sk2;
		public int sk3;
		public int sk4;
		
		public KeturiSkaiciai(){
		}
		
		public KeturiSkaiciai ( String is_eilutes ) {
			
			nustatyti ( is_eilutes );
		}
		
		public void nustatyti ( String is_eilutes ) {
			
			String[] skaiciai4 = is_eilutes.trim().split ( " " );	
			
			sk1 = Integer.parseInt(skaiciai4[0]);
			sk2 = Integer.parseInt(skaiciai4[1]);
			sk3 = Integer.parseInt(skaiciai4[2]);
			sk4 = Integer.parseInt(skaiciai4[3]);
		}		
		
		public int getSk1() {
			
			return sk1;
		}
		
		public int getSk2() {
			
			return sk2;
		}

		public int getSk3() {
			
			return sk3;
		}
		
		public int getSk4() {
			
			return sk4;
		}

		public void setSk1( int skaicius1 ) {
			
			sk1 = skaicius1;
		}
		
		public void setSk2( int skaicius2 ) {
			
			sk2 = skaicius2;
		}

		public void setSk3( int skaicius3 ) {
			
			sk3 = skaicius3;
		}
		
		public void setSk4( int skaicius4 ) {
			
			sk4 = skaicius4;
		}
		
		public  double vidurkis() {
		
			double vidurkis = ( sk1 + sk2 + sk3 + sk4 ) / 4;
			
		return vidurkis;
		
		}
		
		public int max() {
		
			int maks =  sk1;
			
			if ( ( sk2 >  sk1 ) && ( sk2 > sk3 ) && (sk2 > sk4)) {
				
				maks = sk2;
			}
			
			if ( ( sk3 >  sk1 ) && ( sk3 > sk2 ) && (sk3 > sk4)) {
				
				maks = sk3;
			}
			
			if ( ( sk4 >  sk1 ) && ( sk4 > sk2 ) && (sk4 > sk3 )) {
				
				maks = sk4;
			}		
					
			return maks;
		}
		
		
		public int min() {
			
			int min = sk1;
			
			if ( ( sk2 < sk1 ) && (sk2 < sk3) && ( sk2 < sk4) ) {
				
				min = sk2;
			}
				
			if ( ( sk3 < sk1) && ( sk3 < sk2 ) && (sk3 < sk4) ) {
				
				min = sk3;
			}
			
			if ( ( sk4 < sk1) && ( sk4 < sk2 ) && (sk4 < sk3) ) {
				
				min = sk4;
			}
			
			return min;
		
		}
		
		/*public int vidSk() {
		
			int vid_sk = sk2;
			
			if ( ( sk3 > sk2) && ( sk3 < sk1 ) ) {
				
				vid_sk = sk3;
			}
			
			if ( ( sk1 < sk2 ) && ( sk1 > sk3) ) {
				
				vid_sk = sk1;
			}
			
			return vid_sk;
		}*/
				
		public String teisingaSeka () {
			
			int min = sk1;
			
			String teisinga_seka =  min()+ " " + sk2 + " " + sk3 + " " + max();
			
			if  ( ( sk2 > min() ) && ( sk2 < sk3 ) ) {
				
				teisinga_seka = min()+ "<-" + sk2+ " " +sk3 + "-> " +max();
				
			}
			
			if  ( ( sk3 > min() ) && ( sk3 < sk2 ) ) {
				
				teisinga_seka = min()+ "<-" + sk3+ " " +sk2 + "-> " +max();
				
			}
			
			return teisinga_seka;
			
		}
		
	}