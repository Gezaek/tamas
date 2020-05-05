import java.util.List;
import java.util.Arrays; 

  
class Feladat_1
{    
	
	 public static void main(String[] args)  
	    { 
	        String szoveg = "Jo napot kivanok István! Jó egeszseget!"; 
	          
	        System.out.println(kisMaganhangzoEltavolitas(szoveg)); 
	    } 
	
    static String kisMaganhangzoEltavolitas(String szoveg) 
    { 
         Character kismagan[] = {'a', 'e', 'i', 'o', 'u'}; 
           
         List<Character> list = Arrays.asList(kismagan); 
           
         StringBuffer buffer = new StringBuffer(szoveg); 
           
         for (int i = 0; i < buffer.length(); i++) { 
              
             if(list.contains(buffer.charAt(i))){ 
                buffer.replace(i, i+1, "") ; 
                i--; 
             } 
        } 
           
        return buffer.toString(); 
    } 
   
} 