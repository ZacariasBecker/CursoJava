package classe;

public class AreaCircTeste {
	public static void main(String[] args) {

		System.out.println(AreaCirc.PI);

		AreaCirc a = new AreaCirc(10);
		System.out.println(a.area());

		System.out.println(AreaCirc.area(10));
	}
}
