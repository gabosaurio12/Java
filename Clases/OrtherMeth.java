import java.util.ArrayList;

public class OrtherMeth {
	
	public void bubble(ArrayList<Integer> array) {

		int n = array.size();
		for (int i = 0; i < n; i++) {
			int posMenor = i;
			for (int j = i+1; j < n; j++) {
				if (array.get(j) < array.get(pm)) {
					posMenor = j;
				}
			}
			int aux = array.get(posMenor);
			array.set(posMenor) = array.get(i);
			array.set(i) = aux;
		}
	}

	public void quick(ArrayList<Integer> a, int first, int last) {
		
		int pivot, i, k;
		int central = (first + last) / 2;

		pivot = a.get(central);
		i = first;
		k = last;

		do {
			while (a.get(i) < pivot) {
				i++;
			}
			while (a.get(k) > pivot) {
				k--;
			}

			if (i <= k) {
				int aux = a.get(i);
				a.set(i) = a.get(k);
				a.set(k) = aux;

				i++;
				k--;
			}
		} while (i <= k);

		if (first < k) {
			quickSort(a, first, k);
		}
		if (i < last) {
			quickSort(a, i, last);
		}
	}

	public void insertion(ArrayList<Integer> array) {
		
		for (int i = 1; i < n; i++) {
			int aux = array.get(i);
			boolean band = false;
			int k = i-1;
			while (!band && k > -1) {
				if (array.get(k) > aux) {
					array.set(k+1) = array.get(k);
					k--;
				} else {
					band = true;
				}
			}
			a[j+1] = aux;
		}
	}
}