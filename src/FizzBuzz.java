
public class FizzBuzz {
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		for (int counts = 1; counts <= 100; counts++) {
			if (counts % 3 == 0 && counts % 5 == 0) {
				System.out.println("FizzBuzz");
				}
				else if (counts % 3 == 0) {
				System.out.println("Fizz");
				}
				else if (counts % 5 == 0) {
					System.out.println("Buzz");
					}
				else
			        System.out.println(counts);
			}
		}
	}