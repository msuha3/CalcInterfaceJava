import java.util.Scanner;

public class CalculatorInterface {
	Scanner sc = new Scanner(System.in);
	CalculatorFrame cf = new CalculatorFrame();

	public static void main(String[] args) {
		CalculatorInterface ci = new CalculatorInterface();
		while(true) ci.run();
	}
	
	void run() {
		System.out.println("please enter a value for the top calculator field: ");
		cf.setValue1(sc.nextDouble());
		System.out.println("please enter an operator code: 1: +, 2:-, 3:*, 4:/, or 5:%");
		cf.setOp(sc.nextInt());
		System.out.println("please enter a value for the middle calculator field");
		cf.setValue2(sc.nextDouble());
		System.out.println("calculating…");
		cf.setValue3(cf.calculate(cf.getValue1(), cf.getValue2(), cf.getOp()));
		System.out.println("calculations complete\n\n"); // the \n adds an empty line

	}
}
