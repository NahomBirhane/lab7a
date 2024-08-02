package miu.edu.codingpractice;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CodingPracticeApplication {
        public static void main(String[] args) {
            int[] numbers = {10, 14, 35, 7, 5, 15, 21, 25, 70, 1};
            System.out.println("=".repeat(50));
            System.out.println(printHelloWorld(numbers));
            System.out.println("=".repeat(50));
            System.out.println("Second Largest Number in the Given Array are: ");
            System.out.println(findSecondBiggest(new int[]{1,2,3,4,5}));
            System.out.println(findSecondBiggest(new int[]{19,9,11,0,12}));
        }

        public static int findSecondBiggest(int[] numbers){
            int largest = Integer.MIN_VALUE;
            int secondLargest = Integer.MIN_VALUE;

            for (int number : numbers) {
                if (number > largest) {
                    secondLargest = largest;
                    largest = number;
                } else if (number > secondLargest && number != largest) {
                    secondLargest = number;
                }
            }

            return secondLargest;
        }

        public static String printHelloWorld(int[] numbers) {

            StringBuilder result = new StringBuilder();
            for (int number : numbers) {
                String output = (number % 5 == 0 && number % 7 == 0) ? "HelloWorld" :
                        (number % 5 == 0) ? "Hello" :
                                (number % 7 == 0) ? "World" : "";
                if (!output.isEmpty()) {
                    result.append(output).append("\n");
                }
            }
            return result.toString();
        }
}
