package skaiciuojam;

public class ManoSkaiciai implements Cloneable {
	
	
	public int maks;
	
	public int vid_sk;
	
	public ManoSkaiciai() {
		
	}
	
	public ManoSkaiciai ( String is_eilutes ) {
		
		nustatyti ( is_eilutes );
	}
	
	public void nustatyti ( String is_eilutes ) {
	
	}
	
	public String teisingaSeka () {
		
		return "+";
	}
	
	public int max() {
				
		return maks;
	}
	
	public int vidSk() {
		
		return vid_sk;
	}
	
	public Object clone() throws CloneNotSupportedException {
		
        return super.clone();
    }

	public double vidurkis() {
		
		return 0.0;
	}
		
}
