package Day1;

public class Basicjava {

	public static void main(String[] args) {
		int a = 10;
		int b = 2;
		float ans = a/b;
		System.out.println(ans);
		
		int score = 85;

        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else if (score >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
        
        int i = 1;
        while (i <= 10) {
            System.out.println("Number: " + i);
            i++; 
        }
        
        int j = 1;
        do {
            System.out.println("Number: " + j);
            j++; 
        } while (j <= 10);
        
        for (int k = 1; k <= 10; k++) {
            System.out.println("Number: " + k);
        }

	}

}
