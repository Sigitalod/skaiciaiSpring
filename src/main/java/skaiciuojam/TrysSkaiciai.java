
	package skaiciuojam;

	public class TrysSkaiciai extends ManoSkaiciai {
	
		public int sk1;
		public int sk2;
		public int sk3;
		
		public TrysSkaiciai(){
		}
		
		public TrysSkaiciai ( String is_eilutes ) {
			
			nustatyti ( is_eilutes );
		}
		
		public void nustatyti ( String is_eilutes ) {
			
			String[] skaiciai3 = is_eilutes.trim().split ( " " );	
			
			sk1 = Integer.parseInt(skaiciai3[0]);
			sk2 = Integer.parseInt(skaiciai3[1]);
			sk3 = Integer.parseInt(skaiciai3[2]);
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

		public void setSk1( int skaicius1 ) {
			
			sk1 = skaicius1;
		}
		
		public void setSk2( int skaicius2 ) {
			
			sk2 = skaicius2;
		}

		public void setSk3( int skaicius3 ) {
			
			sk3 = skaicius3;
		}
		
		public int max() {
		
			int maks =  sk1;
			
			if ( ( sk2 >  sk1 ) && ( sk2 > sk3 ) ) {
				
				maks = sk2;
			}
			
			if ( ( sk3 >  sk1 ) && ( sk3 > sk2 ) ) {
				
				maks = sk3;
			}			
					
			return maks;
		}
		
		
		public int min() {
			
			int min = sk1;
			
			if ( ( sk2 < sk1 ) && (sk2 < sk3) ) {
				
				min = sk2;
			}
				
			if ( ( sk3 < sk1) && ( sk3 < sk2 ) ) {
				
				min = sk3;
			}
			
			return min;
		
		}
		
		public int vidSk() {
		
			int vid_sk = sk2;
			
			if ( ( sk3 > sk2) && ( sk3 < sk1 ) ) {
				
				vid_sk = sk3;
			}
			
			if ( ( sk1 < sk2 ) && ( sk1 > sk3) ) {
				
				vid_sk = sk1;
			}
			
			return vid_sk;
		}
				
		public String teisingaSeka () {
			
			String teisinga_seka =  min()+ " " + vidSk() + " "  + max();
			
			if  (( vidSk() - min() ) < ( max() - vidSk() ) ) {
				
				teisinga_seka = min()+ "<-" + vidSk()+ " " +max();
				
			}
			
			if ( ( vidSk() - min() ) > ( max() - vidSk() ) ) {
				
				teisinga_seka = min()+ " " + vidSk()+ "->" +max();
				
			}
			
			return teisinga_seka;
		}
				
	}