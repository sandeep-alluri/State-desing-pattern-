
public class BackpackStateDemo {

	public static void main(String[] args) {
		
		Context context = new Context();
		
		context.setState(new ClothsLoading());
		
		context.setState(new Emptybackpack());
		
		context.setState(new BooksLoading());
		
	}
	
	
}
