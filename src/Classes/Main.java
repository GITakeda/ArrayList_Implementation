package Classes;

public class Main {
	public static void main(String args[]) {
		ArrayListImplementation_01<Integer> array1 = new ArrayListImplementation_01<>(2);
		ArrayListImplementation_02<Integer> array2 = new ArrayListImplementation_02<>(2);
		FixedArray<Integer> array3 = new FixedArray<>(2);

		array1.add(1);
		array1.add(2);
		array1.add(3);
		array1.add(4);
		array1.remove(0);
		array1.remove(10);

		array2.add(1);
		array2.add(2);
		array2.add(3);
		array2.add(4);
		array2.remove(0);
		array1.remove(10);

		array3.add(1);
		array3.add(2);
		array3.add(3);
		array3.add(4);
		array3.remove(0);
		array1.remove(10);

		System.out.println(array1.get(2));
		System.out.println(array2.get(2));
		System.out.println(array3.get(2));
	}
}
