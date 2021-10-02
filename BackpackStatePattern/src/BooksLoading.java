
public class BooksLoading implements State{
	
	BooksLoading(){
		this.load();
	}

	@Override
	public void load() {
		 
		System.out.println("Books loaded in Backpack");
		
	}

}
