import java.util.Scanner;

public class SedmaZadacha {

	public static void main(String[] args) {

				Scanner scan = new Scanner(System.in);

				char[] letters = {'a' , 'b', 'c' , 'd' , 'e' , 'f',  'g',  'h' , 'i', 'j', 'k',  'l' , 'm' , 'n'  ,'o'  ,'p' ,'q',  'r' , 's' , 't',  'u' , 'v' , 'w' , 'x' , 'y',  'z' };

				String word = scan.nextLine().toLowerCase();

				String[] strings = word.split("");

				char[] myWord = new char[strings.length];

				for(int i = 0; i < strings.length; i++) {

					myWord[i] = strings[i].charAt(0);
				}
				for(int i = 0; i < strings.length; i++) {

					for(int j = 0; j < letters.length; j++) {

						if(myWord[i] == letters[j]) {

							System.out.println(myWord[i] + " -> " + j);
						}
					}
				}
			}
		}

