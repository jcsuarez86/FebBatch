package pkg1;

public class Math {
	
	public int sum(int a, int b) {
		int resultSum = a + b;
		System.out.println("sum = " +resultSum);
		return resultSum;
	}
	public int subt(int a1, int b1) {
		int resultSubt= a1 - b1;
		System.out.println("subt = " +resultSubt);
		return resultSubt;
	}
	public int multi(int a2, int b2) {
		int resultMulti= a2 * b2;
		System.out.println("mult = " +resultMulti);
		return resultMulti;
	}
	public int div(int a3, int b3) {
		int resultDiv= a3 / b3;
		System.out.println("div = " + resultDiv);
		return resultDiv;
	}
	public void assigment1(){
		System.out.println("Assignment 1: (((10+2)+2)-2)*2)/2)");
		int sum1 = sum(10,2);
		int sum2 = sum(sum1, 2);
		int subt1 = subt(sum2, 2);
		int mul1 = multi(subt1, 2);
		int finalAssig1 = div(mul1, 2);
		System.out.println("Resutl of assigment1: "+finalAssig1);
		System.out.println("**************************************");
	}
	public void assigment2(){
		System.out.println("Assignment 2: (((((10/2)-2)+2)-2)*2)");
		int div1 = div(10,2);
		int subt2 = subt(div1, 2);
		int sum3 = sum(subt2, 2);
		int subt3 = subt(sum3, 2);
		int finalAssig2 = multi(subt3,2);
		System.out.println("Resutl of assigment2: "+finalAssig2);
		System.out.println("**************************************");
	}
	public static void main(String[] args) {
		Math calc = new Math();
		calc.assigment1();
		calc.assigment2();
	}

}
