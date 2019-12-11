package teste;

import java.util.HashSet;
import java.util.Set;

public class Teste {

	public int solution(int[] A) {

		Set<Integer> set = new HashSet<>();

		int biggestValue = 0;

		for (int arrayValue : A) {
			if (arrayValue > 0)
				set.add(arrayValue);
			if (biggestValue < arrayValue)
				biggestValue = arrayValue;
		}

		for (int i = 1; i <= biggestValue + 1; i++) {
			if (!set.contains(i))
				return i;
		}

		return 1;

	}

}
