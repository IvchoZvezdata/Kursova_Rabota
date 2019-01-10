import java.util.Scanner;

public class VtoraZadacha {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int restDays = Integer.parseInt(sc.nextLine());
        int playTime = restDays * 127 + (365 - restDays) * 63;

        if (playTime > 30000) {
            int minutes = playTime - 30000;
            int hours = minutes / 60;
            minutes %= 60;

            System.out.println("Tom will run away");
            System.out.printf("%d hours and %d minutes more for play", hours, minutes);
        } else {
            int minutes = 30000 - playTime;
            int hours = minutes / 60;
            minutes %= 60;

            System.out.println("Tom sleeps well");
            System.out.printf("%d hours and %d minutes less for play", hours, minutes);
        }


	}

}
