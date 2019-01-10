import java.util.Scanner;

public class PetaZadacha {
	static String repeatStr(String strToRepeat, int count) {
		String text = " ";
		for (int i = 0; i < count; i++) {
			text = text + strToRepeat;
		}
		return text;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int col = n / 2;
		int mid = 2 * n - 2 * col - 4;

		String undersc = repeatStr("_", mid);
		String arrow = repeatStr("^", col);

		System.out.println(String.format("/%s\\%s/%s\\", arrow, undersc, arrow));
		for (int row = 1; row <= n - 3; row++) {
			System.out.println(String.format("|%s|", repeatStr(" ", 2 * n)));
		}
		String sspace = repeatStr(" ", col + 1);
		System.out.println(String.format("|%s%s%s|", sspace, undersc, sspace));
		String mspace = repeatStr(" ", mid);
		undersc = repeatStr("_", col);
		System.out.println(String.format("\\%s/%s\\%s/", undersc, mspace, undersc));
	}
}

