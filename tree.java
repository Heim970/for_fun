
import java.util.Random;
import java.util.Scanner;

public class tree {
//	public static final String RESET = "\u001B[0m";    
//	public static final String FONT_RED = "\u001B[31m";     
//	public static final String FONT_GREEN = "\u001B[32m";    
//	public static final String FONT_YELLOW = "\u001B[33m";     
//	public static final String FONT_BLUE = "\u001B[34m";   
//	public static final String FONT_PURPLE = "\u001B[35m";     

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		String[] colors = { "\u001B[31m", "\u001B[32m", "\u001B[33m", "\u001B[34m", "\u001B[35m" };

		while (true) {
			System.out.println("  ★☆ 메리크리스마스 ☆★       (2 ~ 50 정수로 입력)");

			int n = 0;
			try {
				n = scan.nextInt();
			} catch (Exception e) {
				System.out.println("정수가 아니에요");
				System.out.println("다시 실행해줘요");
				scan.close();
				System.exit(0);
			}

			if (n > 1 && n <= 50) {
				System.out.println(" ".repeat(n) + "\u001B[33m" + "★" + "\u001B[0m");

				for (int i = 0; i < n; i++) {
					for (int j = 0; j <= n; j++) {

						if (i + j < n) {
							System.out.print(" ");
						} else {
							int r = random.nextInt(0, 12);
							if (r < 5) {
								System.out.print(colors[r] + "*" + "\u001B[0m"); // 색 지정하고 * 출력 후 색 초기화
							} else {
								System.out.print("*");
							}
						}
					} // end for #2-1

					for (int k = 0; k < n; k++) {

						if (k < i) {
							int r = random.nextInt(0, 12);
							if (r < 5) {
								System.out.print(colors[r] + "*" + "\u001B[0m"); // 색 지정하고 * 출력 후 색 초기화
							} else {
								System.out.print("*");
							}
						}
					} // end for #2-2
					System.out.println();
				} // end for #1

			} else {
				System.out.println("숫자가 범위를 벗어났어요");
			}

			System.out.println("+--------------+--------+");
			System.out.println("| 계속 -> 아무 키 | 끝 -> 0 |");
			System.out.println("+--------------+--------+");

			String input = scan.next(); // 0 입력하면 반복문 종료
			if ("0".equals(input)) {
				break;
			}

		} // end while

		scan.close();
	}
}
