package ExercisesApplication;

public class Sort {
	private static int data[];
	
	public static void start() {
		createDatabase();
		long start_time = System.currentTimeMillis();
		bubbleSort();
		//insertionSort();
		long end_time = System.currentTimeMillis();
		//imprime();
		System.out.println(end_time-start_time+" ms.");
		System.out.println(confirmSort());
		
	}
	public static void createDatabase() {
		data = new int[100000];
		for(int i = 0; i < data.length; i++) {
			data[i] = (int)(Math.random()*data.length);
		}
	}
	public static void bubbleSort() {
		for(int i = 0; i < data.length;i++) {
			for(int j = i+1; j < data.length;j++) {
				if(data[i]>data[j]) {
					int aux = data[i];
					data[i] = data[j];
					data[j] = aux;
				}
			}
		}
	}
	public static void insertionSort() {
		for(int i = 0; i < data.length;i++) {
			for(int j = 0; j < data.length;j++) {
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
