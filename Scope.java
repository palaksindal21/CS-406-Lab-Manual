public class Scope {
	private static int x=63;
	private static int y=83;
	public static void main(String[] args) {
		System.out.println(" x:"+x);
		System.out.println(" y:"+y);
		get();
	}
	public static void get(){
		System.out.println("Class of x:"+x);
		System.out.println("Class of y:"+y);
	}
}