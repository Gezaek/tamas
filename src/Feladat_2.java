class Feladat_2  { 
	  
	 public static void main(String[] args) 
	    { 
	        String szoveg = ("Jo napot     kivanok Tanar Ur!   Jo egeszseget!"); 
	        szamlalo(szoveg); 
	    } 
	
    static void szamlalo(String szoveg) 
    { 
        char[] karakter = szoveg.toCharArray();  
        for (int i = 0; i < karakter.length; i++) { 
  
            String s = ""; 
  
            while (i < karakter.length && karakter[i] != ' ') { 
  
                s = s + karakter[i]; 
                i++; 
            } 
  
            if (s.length() > 0)  
                System.out.println(s + " osszesen " + s.length() + " db betubol all!" );             
        } 
    } 
   
}  