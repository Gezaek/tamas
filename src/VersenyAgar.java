
public class VersenyAgar {

	private String nev;
	private int sebesseg, ermekSzama;
	public static int palyaHossza = 500;
	
	public VersenyAgar (String nev, int sebesseg, int ermekSzama) {
		this.nev = nev;
		
		if ( sebesseg > 20 ) this.sebesseg = 15;
		 else if ( sebesseg > 0 ) this.sebesseg = sebesseg;
		 
		if ( ermekSzama > 10 ) this.ermekSzama = 0;
		 else if ( ermekSzama > 0 ) this.ermekSzama = ermekSzama;}
		   
	
	public String getNev() {
		return nev;
	}
	
	public void setSebesseg(int sebesseg) {
		this.sebesseg = sebesseg;
	}
	
	public int teljesites() {
		return palyaHossza/sebesseg;
	}
	
	public int teljesitmeny() {
		if (sebesseg >20) {
			System.out.println("Túl lépi a maximális 20m/s sebességet");
		} 
		return sebesseg + 1;}
		
		
	public int pluszerem() {
		return ermekSzama + 1;
	}
	
	public String toString() {
		return nev + System.getProperty("line.separator")
		+ "sebessége: " +sebesseg + " m/s" + System.getProperty("line.separator")
		+ "érmei száma: " + ermekSzama + " db aranyérem" + System.getProperty("line.separator");
	}
	
}


		
		