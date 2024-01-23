package classe;

public class AreaCirc {
	final static double PI = 3.1415;
	double raio;

	AreaCirc(double raio) {
		this.raio = raio;
	}

	double area() {
		return PI * Math.pow(raio, 2);
	}

	static double area(double raio) {
		return PI * Math.pow(raio, 2);
	}
}
