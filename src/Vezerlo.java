
public class Vezerlo {

	public static void main(String[] args) {
		
		VersenyAgar[] agar = new VersenyAgar[3];
		 agar[0] = new VersenyAgar("Bobi", 30, 12);
		 agar[1] = new VersenyAgar("Morzsi", 18, 4);
		 agar[2] = new VersenyAgar("Blöki", 1, -1);

		 
		 
		 for(int i = 0; i < agar.length; i++)
		 System.out.println(agar[i]);
		 
		 
		 
		 System.out.println(agar[0].getNev() + " " + agar[0].teljesites() + " s alatt ér körbe");
		 System.out.println(agar[1].getNev() + " " + agar[1].teljesites() + " s alatt ér körbe");
		 System.out.println(agar[2].getNev() + " " + agar[2].teljesites() + " s alatt ér körbe");

		agar[2].teljesitmeny();
		
		 
	}  

}
