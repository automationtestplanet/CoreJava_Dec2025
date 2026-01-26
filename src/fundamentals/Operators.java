package fundamentals;

public class Operators {

	public static void main(String[] args) {
		int a = 100;
		int b = 200;

		int c;
		c = 300;

		System.out.println("-----------------Arithematic Operators----------------");
		int result = a + b;
		System.out.println("Addition: " + result);

		System.out.println("Addition: " + (a + b));

		System.out.println("Subtraction: " + (a - b));

		System.out.println("Multiplication: " + (a * b));

		System.out.println("Division: " + (b / a));
		System.out.println("Modular Division: " + (b % a));

		System.out.println("Division: " + (10 / 3));
		System.out.println("Division: " + (10 % 3));

		System.out.println("-----------------Increment and Decrement----------------");

		int x = 10;
		System.out.println(++x); // -> 11 -> Pre increment, it can increment in a same line.
		System.out.println(x++); // 11 -> Post increment, it cannot increment in a same line.
		System.out.println(x); // 12

		System.out.println(--x); // -> 11 -> Pre decrement, it can decrease in a same line.
		System.out.println(x--); // -> 11 -> Post decrement, it cannot decrease in a same line.
		System.out.println(x); // 10

		x += 20; // x = x+20; -> x = 10+20 -> 30
		System.out.println(x);

		x -= 20; // x = x-20; x = 30-20 -> 10
		System.out.println(x);

		x *= 5; // x = x*5; x = 10*5 -> 50
		System.out.println(x);

		x /= 5; // x = x/5; x = 50/5 -> 10;
		System.out.println(x);

		x %= 3; // x= 10%3 -> 1
		System.out.println(x);

		System.out.println("------------------------Comparasion Operatos-----------------");

		int p = 10;
		int q = 20;

		boolean compResult = p < q;
		System.out.println(compResult);

		System.out.println(p < q);
		System.out.println(p > q);
		System.out.println(p == q);
		System.out.println(p != q);

		System.out.println(p <= q); // p<=q -> p<q or p==q; -> T or F -> T
		System.out.println(p >= q); // p<=q -> p>q or p==q; -> F or F -> F

		System.out.println("------------------------Logical Operatos-----------------");

		System.out.println(p < q || p > q || p == q); // p<q || p>q || p==q -> T or F or F -> T
		System.out.println(p < q && p > q && p == q); // p<q && p>q & p==q -> T or F or F -> F

		System.out.println(!(p < q || p > q || p == q)); // p<q || p>q || p==q -> T or F or F -> !(T) -> F
		System.out.println(!(p < q && p > q && p == q)); // !(p<q && p>q & p==q) -> T or F or F -> !(F) -> T

		System.out.println("------------------------Ternary Operatos-----------------");

		boolean result2 = (p < q) ? true : false;
		System.out.println(result2);

		boolean result3 = (p > q) ? true : false;
		System.out.println(result3);

		System.out.println((p < q) ? p : q);
		System.out.println((p > q) ? p : q);

		System.out.println((p < q) ? "P is Lesser than Q" : "Q is lesser than P");
		System.out.println((p > q) ? "P is Greater than Q" : "Q is Greater than P");

	}

}
