import java.util.Map;

class Mapas {
	public static String clave(int n) {
		String clave = String.valueOf(n);
		return clave;
	}

	public static void main(String args[]) {
		Map<String, Integer> mapa = new HashMap<String, Integer>();

		int n = 0;

		for (int i = 1; i < 6; i++) {
			String clav = clave(++n);
			mapa.put(clav, i * 11);
		}

		System.out.println("CLAVE\tValor");
		for (Map.Entry<String, Integer> aux : mapa.entrySet()) {
			System.out.print(aux.getKey() + "\t");
			System.out.println(aux.getValue());
		}

	}
}