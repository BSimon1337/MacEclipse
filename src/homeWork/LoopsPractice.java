package homeWork;

public class LoopsPractice {

	public static void main(String[] args) {
		/*
		 * used the recipe analogy. It would be ridiculous to write it as dump a cup of flour four times. You do not want to
		 * repeat yourself unnecessarily in programming.
		 * types of loops :
		 * for loops: good if you know how many times you need to iterate
		 * i ++ is the same as i=i+1
		 */
		
		for (int i = 0; i < 10; i ++) {
			System.out.println("Scoop cup of flour");
			
		}
	//anything between curly braces is for that for loop
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		
		for (int i = 0; i < 100; i ++) {
			if (i % 2 == 0)
			System.out.println(i);
			//% means remainder. So when divided by two it should be zero when it is an even number
		}
		int x = 10;
		while (x < 10);{
			System.out.println(x);//left at this line the program would continue infinitely
			x++; //this allows the program to stop
		}
		do {
			System.out.println(x);
			x++;
		} while (x <2);

	}

}
