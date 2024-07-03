import java.util.*;

public class Vectores {
	public static void main(String Args[]) {
		Vector<Integer> v = new Vector<>();

		for (int i = 1; i < 6; i++) {
			v.add(i * 11);
		}

		System.out.println(v);

		for (int i = 0; i < 5; i++) {
			int nVal = v.elementAt(i) / 10;
			v.set(i, nVal);
		}

		System.out.println(v);

		System.out.println("Vector que aumenta capacidad al llenarse");

		Vector<Integer> v2 = new Vector<>(1, 2);

		System.out.println("Capacidad: " + v2.capacity());

		v2.add(11);
		v2.add(22);

		System.out.println(v2);

		System.out.println("Capacidad: " + v2.capacity());
	}
}