package co.edu.test;


public class Exam2 {

	public static void main(String[] args) {
		
		int[] numbers = new int[10];
		
		for(int i=0; i<numbers.length; i++) {
			numbers[i] = (int) (Math.random() * 10) + 1;
		}
		int num2=0;
		int num3= 0;
		for(int i =0; i<numbers.length; i++) {
			if(numbers[i] % 2 ==0) {
				num2 = num2 + numbers[i];
			}
			if(numbers[i] % 3 == 0) {
				num3 = num3 + numbers[i];
			}
		}
		System.out.println("2의 배수 합 : " + num2);
		System.out.println("3의 배수 합 : " + num3);
	}

}
