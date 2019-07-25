package ExercisesApplication;

public class Sort {
	private static int data[];
	
	public static void start() {
		createDatabase();
		bubbleSort();
		imprime();
		System.out.println(confirmSort());
	}
	public static void createDatabase() {
		data = new int[100];
		for(int i = 0; i < data.length; i++) {
			data[i] = (int)(Math.random()*data.length);
		}
	}
	public static void bubbleSort() {
		for(int i = 0; i < data.length;i++) {
			for(int j = i; j < data.length;j++) {
				if(data[i]>data[j]) {
					int aux = data[i];
					data[i] = data[j];
					data[j] = aux;
				}
			}
		}
	}
	public static boolean confirmSort() {
		for(int i = 0 ; i < data.length - 1; i++) {
			if(data[i]>data[i+1])return false;
		}
		return true;
	}
	public static void imprime() {
		for(int i : data) {
			System.out.println(i);
		}
	}
}
