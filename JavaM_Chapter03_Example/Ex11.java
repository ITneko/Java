package JavaM_Chapter03_Example;

public class Ex11 {

	public static void main(String[] args)  {

		int sum = 0;
		for (int i = 0; i < args.length; i++)
			sum += Integer.parseInt(args[i]);
		System.out.println(sum / args.length);

	}
}
