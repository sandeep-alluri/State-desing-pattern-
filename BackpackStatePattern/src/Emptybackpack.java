
public class Emptybackpack implements State {
	
	Emptybackpack(){
		load();
	}

	@Override
	public void load() {
		 System.out.println("Empty Backpack");
	}

}
