package co.edu.test;

public class Exam4t {

	public static void main(String[] args) {
		
		int array[] = new int[10];
		int ary[] = new int[10];
		int sum = 0;
		int max = 0;
		for (int i = 0; i < array.length; i++) {
			int random = (int) (Math.random() * 10) + 1;
			array[i] = random;
			sum += array[i];
		}
		max = sum / array.length;
		System.out.println("평균값 " + max);
		for (int j = 0; j < ary.length; j++) {
			int random1 = (int) (Math.random() * 10) + 1;
			ary[j] = random1;
			if (ary[j] > max) {
				System.out.println("평균보다 큰 값 : " + ary[j]);
			}
		}
	}

}
