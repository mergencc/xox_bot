package v1;

import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {
		char[][] board = { { ' ', '|', ' ', '|', ' ' }, 
				{ '-', '+', '-', '+', '-' }, 
				{ ' ', '|', ' ', '|', ' ' },
				{ '-', '+', '-', '+', '-' }, 
				{ ' ', '|', ' ', '|', ' ' } };

		System.out.println("### TicTacToe v1.0 by mergenc ###\n\n\n");
		
		printBoard(board);

		int pos, pos2;
		Scanner input = new Scanner(System.in);

		// bitmesi icin 8 ihtimal (3 dikey, 3 yatay, 2 capraz);

		for (int i = 0; i < 9; i++) {

			// player 1 icin kontrol;

			if (board[0][0] == 'X' && board[0][2] == 'X' && board[0][4] == 'X') { // yataylar:
				System.out.println("game over. player 1 won.");
				break;
			} else if (board[2][0] == 'X' && board[2][2] == 'X' && board[2][4] == 'X') {
				System.out.println("game over. player 1 won.");
				break;
			} else if (board[4][0] == 'X' && board[4][2] == 'X' && board[4][4] == 'X') { // yataylar buna kadar;
				System.out.println("game over. player 1 won.");
				break;
			} else if (board[0][0] == 'X' && board[2][0] == 'X' && board[4][0] == 'X') { // dikeyler:
				System.out.println("game over. player 1 won.");
				break;
			} else if (board[0][2] == 'X' && board[2][2] == 'X' && board[4][2] == 'X') {
				System.out.println("game over. player 1 won.");
				break;
			} else if (board[0][4] == 'X' && board[2][4] == 'X' && board[4][4] == 'X') { // dikeyler buraya kadar;
				System.out.println("game over. player 1 won.");
				break;
			} else if (board[0][0] == 'X' && board[2][2] == 'X' && board[4][4] == 'X') { // caprazlar:
				System.out.println("game over. player 1 won.");
				break;
			} else if (board[4][0] == 'X' && board[2][2] == 'X' && board[0][4] == 'X') {
				System.out.println("game over. player 1 won.");
				break;
			}

			// player 2 icin kontrol:

			if (board[0][0] == 'O' && board[0][2] == 'O' && board[0][4] == 'O') { // yataylar:
				System.out.println("game over. player 2 won.");
				break;
			} else if (board[2][0] == 'O' && board[2][2] == 'O' && board[2][4] == 'O') {
				System.out.println("game over. player 2 won.");
				break;
			} else if (board[4][0] == 'O' && board[4][2] == 'O' && board[4][4] == 'O') { // yataylar buna kadar;
				System.out.println("game over. player 2 won.");
				break;
			} else if (board[0][0] == 'O' && board[2][0] == 'O' && board[4][0] == 'O') { // dikeyler:
				System.out.println("game over. player 2 won.");
				break;
			} else if (board[0][2] == 'O' && board[2][2] == 'O' && board[4][2] == 'O') {
				System.out.println("game over. player 2 won.");
				break;
			} else if (board[0][4] == 'O' && board[2][4] == 'O' && board[4][4] == 'O') { // dikeyler buraya kadar;
				System.out.println("game over. player 2 won.");
				break;
			} else if (board[0][0] == 'O' && board[2][2] == 'O' && board[4][4] == 'O') { // caprazlar:
				System.out.println("game over. player 2 won.");
				break;
			} else if (board[4][0] == 'O' && board[2][2] == 'O' && board[0][4] == 'O') {
				System.out.println("game over. player 2 won.");
				break;
			}

			do {
				System.out.println("### PLAYER 1 ###");
				System.out.print("enter your replacement (1-9): ");
				pos = input.nextInt();
				if (pos < 1 || pos > 9) {
				} else {
					break;
				}
			} while (true);

			replacement(board, pos);
			do {
				System.out.println("### PLAYER 2 ###");
				System.out.print("enter your replacement (1-9): ");
				pos2 = input.nextInt();
				if (pos < 1 || pos > 9) {
				} else {
					break;
				}
			} while (true);

			replacementP2(board, pos2);

		}
		input.close();

	}

	private static void printBoard(char[][] board) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
	}

	private static void replacement(char[][] board, int pos) {
		switch (pos) {
		case 1:
			board[0][0] = 'X';
			break;
		case 2:
			board[0][2] = 'X';
			break;
		case 3:
			board[0][4] = 'X';
			break;
		case 4:
			board[2][0] = 'X';
			break;
		case 5:
			board[2][2] = 'X';
			break;
		case 6:
			board[2][4] = 'X';
			break;
		case 7:
			board[4][0] = 'X';
			break;
		case 8:
			board[4][2] = 'X';
			break;
		case 9:
			board[4][4] = 'X';
			break;
		}
		printBoard(board);
	}

	private static void replacementP2(char[][] board, int pos2) {
		switch (pos2) {
		case 1:
			board[0][0] = 'O';
			break;
		case 2:
			board[0][2] = 'O';
			break;
		case 3:
			board[0][4] = 'O';
			break;
		case 4:
			board[2][0] = 'O';
			break;
		case 5:
			board[2][2] = 'O';
			break;
		case 6:
			board[2][4] = 'O';
			break;
		case 7:
			board[4][0] = 'O';
			break;
		case 8:
			board[4][2] = 'O';
			break;
		case 9:
			board[4][4] = 'O';
			break;
		}
		printBoard(board);

	}

}

//—
