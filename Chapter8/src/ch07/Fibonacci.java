package ch07;

public class Fibonacci {

	int number;
	public Fibonacci(int number) {
		this.number = number;
	}

	// 1) 재귀 함수
	public int fiboRecur(int n) {
		if (n == 0) return 0;
		if (n == 1) return 1;
		return fiboRecur(n-1) + fiboRecur(n-2);
	}
	
	public static void main(String[] args) {
		
		Fibonacci fib = new Fibonacci(100);
		
		int result = fib.fiboRecur(10);
		System.out.println(result);
	}
	
}
