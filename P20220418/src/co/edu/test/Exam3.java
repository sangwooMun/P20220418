package co.edu.test;

public class Exam3 {

	public static void main(String[] args) {
		int array[] = new int[10];
		int newary[] = new int[10];

		int num = 0;
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 10) + 1;
			num += array[i];
			sum = num / array.length;
			if (array[i] > sum) {
				for (int j = 0; j < newary.length; j++) {
					if (newary[j] == 0) {
						newary[j] = array[i];
						System.out.println(newary[j]);
						break;
					}
				}
			}
		}
		System.out.println("평균값 : " + sum);
	}

}
