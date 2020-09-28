public class Monostate {
	
	
	private static String state;
	

	public Monostate(){
		Monostate.state = "X";
	}
	

	public synchronized void setState(String state) {
	    Monostate.state = state;
	}
	
	public void greet(){
		System.out.println("Hi I am a Monostate with state "+Monostate.state);
	}
}