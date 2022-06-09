package ua.ithillel.classwork.tictactoe;

public class WinChecker extends Field{

    public boolean win() {
        char[][] data = this.getData();

        if ((data[0][0] == 'X' && data[0][1] == 'X' && data[0][2] == 'X') ||
                (data[1][0] == 'X' && data[1][1] == 'X' && data[1][2] == 'X') ||
                (data[2][0] == 'X' && data[2][1] == 'X' && data[2][2] == 'X') ||
                (data[0][0] == 'X' && data[1][0] == 'X' && data[2][0] == 'X') ||
                (data[0][1] == 'X' && data[1][1] == 'X' && data[2][1] == 'X') ||
                (data[0][2] == 'X' && data[1][2] == 'X' && data[2][2] == 'X') ||
                (data[0][0] == 'X' && data[1][1] == 'X' && data[2][2] == 'X') ||
                (data[0][2] == 'X' && data[1][1] == 'X' && data[2][0] == 'X')) {
            System.out.println("You win");
            return true;
        } else if ((data[0][0] == '0' && data[0][1] == '0' && data[0][2] == '0') ||
                (data[1][0] == '0' && data[1][1] == '0' && data[1][2] == '0') ||
                (data[2][0] == '0' && data[2][1] == '0' && data[2][2] == '0') ||
                (data[0][0] == '0' && data[1][0] == '0' && data[2][0] == '0') ||
                (data[0][1] == '0' && data[1][1] == '0' && data[2][1] == '0') ||
                (data[0][2] == '0' && data[1][2] == '0' && data[2][2] == '0') ||
                (data[0][0] == '0' && data[1][1] == '0' && data[2][2] == '0') ||
                (data[0][2] == '0' && data[1][1] == '0' && data[2][0] == '0')) {
            System.out.println("You lose");
            return true;
        } else {
            return false;
        }
    }
}
