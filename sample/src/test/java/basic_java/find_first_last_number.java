package basic_java;

public class find_first_last_number {

	public static void main(String[] args)
	{
	 int[] numbers = {10, 50, 20, 5, 40};

    int largest = numbers[0];
    int smallest = numbers[0];

    for (int num : numbers) {

        if (num > largest) {
            largest = num;
        }

        if (num < smallest) {
            smallest = num;
        }
    }

    System.out.println("Largest number: " + largest);
    System.out.println("Smallest number: " + smallest);
}
}