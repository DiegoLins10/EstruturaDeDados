package Recursiva;

public class Main {

	public static void main(String[] args) {
		metodoB (5,1);
		System.out.println(metodoB(5,2));
	}

	public static int metodoB(int n, int m) {
		if (m > n) {
			return 0;
		}
		if (m == n) {
			return n;
		}
		return (metodoB(n - 1, m + 1) + (n + m));
	}

}
