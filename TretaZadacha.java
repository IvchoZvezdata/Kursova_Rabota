import java.util.Scanner;

public class TretaZadacha {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        int n1 = Integer.parseInt(scanner.nextLine());
	        int n2 = Integer.parseInt(scanner.nextLine());
	        String operator = scanner.nextLine();

	        switch(operator){
	            case "+":
	                String evenOrOdd = "";
	                int sum = n1 + n2;
	                if(sum % 2 == 0){
	                    evenOrOdd = "even";
	                }
	                else
	                    evenOrOdd = "odd";
	                System.out.printf("%d + %d = %d - %s\n", n1, n2, sum, evenOrOdd);
	                break;
	            case "-":
	                evenOrOdd = "";
	                sum = n1 - n2;
	                if(sum % 2 == 0){
	                    evenOrOdd = "even";
	                }
	                else
	                    evenOrOdd = "odd";
	                System.out.printf("%d - %d = %d - %s\n", n1, n2, sum, evenOrOdd);
	                break;
	            case "/":
	                if(n1 == 0){
	                    System.out.printf("Cannot divide %d by zero", n2);
	                    return;
	                }
	                else if(n2 == 0){
	                    System.out.printf("Cannot divide %d by zero", n1);
	                    return;
	                }
	                double result = n1 / n2;
	                System.out.printf("%d / %d = %d\n", n1, n2, result);
	                break;
	            case "*":
	                evenOrOdd = "";
	                sum = n1 * n2;
	                if(sum % 2 == 0){
	                    evenOrOdd = "even";
	                }
	                else
	                    evenOrOdd = "odd";
	                System.out.printf("%d * %d = %d - %s\n", n1, n2, sum, evenOrOdd);
	                break;
	            case "%":
	                if(n1 == 0){
	                    System.out.printf("Cannot divide %d by zero", n2);
	                    return;
	                }
	                else if(n2 == 0){
	                    System.out.printf("Cannot divide %d by zero", n1);
	                    return;
	                }
	                sum = n1 % n2;
	                System.out.printf("%d % %d = %d\n", n1, n2, sum);
	                break;
	        }
	}

}
