package teste;

public class Start {

	public static void main(String[] args) {

		printValue(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 });
		printValue(new int[] { -1, -2 });
		printValue(new int[] { -3 });
		printValue(new int[] { -3, -7, -8 });
		printValue(new int[] { 1, 2, 3, 6, 7, 8 });
		printValue(new int[] { 5, -4, 6, 8, 10, 0, 1 });

	}

	private static void printValue(int[] array) {
		Teste teste = new Teste();
		System.out.println(teste.solution(array));
	}

}
