public class Test1 {
	public static void main(String [] args) {
		int num = times(5,6);	//call value method
		System.out.println(num);
	}
	
	//simple value method
	public static int times(int x, int y) {
		return x * y;
	}
	
	//simple void method
	public static void myPrint(String x) {
		System.out.print(x);
	}
}
