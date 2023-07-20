package fundamentos;

public class DesafioAritimeticos {
	public static void main(String[] args) {

		double partA = Math.pow(6 * (3 + 2), 2) / (3 * 2);

		double partB = Math.pow(((1 - 5) * (2 - 7) / 2), 2);

		double partC = Math.pow(10, 3);

		double res = Math.pow((partA - partB), 3) / partC;

		System.out.println(res);

	}
}
