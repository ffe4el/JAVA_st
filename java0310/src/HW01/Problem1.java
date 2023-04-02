package HW01;
import java.util.Scanner;

public class Problem1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        int x = 5, y = 5;
        boolean tile[][] = new boolean[11][11];
        int steps;
        tile[5][5] = true;
        for (steps=0; steps<10; steps++) {
            int direction = (int) (Math.random() * 4);
            if (direction == 0 && x > 0 && tile[y][x-1]==false) { // go left
                x--;
            	tile[y][x] = true;
            }
            else if (direction == 1 && x < 10 && tile[y][x+1]==false) { // go right
				x++;
            	tile[y][x] = true;
            }
			else if (direction == 2 && y > 0 && tile[y-1][x]==false) { // go up
                y--;
                tile[y][x] = true;
			}
            else if (y < 10 && tile[y+1][x]==false) { // go down
				y++;
				tile[y][x] = true;
            }
            else {
            	steps--;
            	continue;
            }
            
            //쉬어가는 기능
            System.out.print("Enter. ");
            input.nextLine();
	            
            System.out.println("------------ " + (steps + 1) + " --------------");
            for (int i = 0; i < 11; i++) {
            	for (int j = 0; j < 11; j++) {
	                if (tile[i][j] == true)
	                    System.out.print("# ");
	                else
	                    System.out.print(". ");
	            }
	            System.out.println();
            }
            System.out.println("-----------------------------"); 
        }
	}
}


