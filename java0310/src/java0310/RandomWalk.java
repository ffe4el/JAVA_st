package java0310;

public class RandomWalk {
	public static void main(String[] args) {
        int x = 5, y = 5;
        boolean tile[][] = new boolean[11][11];
        int steps;
        tile[5][5] = true;
        for (steps=0; steps<10; steps++) {
            int direction = (int) (Math.random() * 4);
            if (direction == 0 && x > 0) // go left
                x--;
            else if (direction == 1 && x < 10) // go right
				x++;
			else if (direction == 2 && y > 0) // go up
                y--;
            else if (y < 10) // go down
				y++;
            tile[y][x] = true;
            
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
