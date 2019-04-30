import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class MapTiles {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = 10;
		for (char c : q) {
			quad.add(Integer.parseInt("" + c));
		}
		solveNextProblem(quad);
	}

	static void solveNextProblem(ArrayList<Integer> quadKey) {
		int x = 0;
		int y = 0;
// Commetn
		for (int n : quadKey) {
			x *= 2;
			y *= 2;
			x += n%2;
			if (n > 1) {
				y++;
			}
		}
		
		System.out.println("" + quadKey.size() + " " + x + " " + y);
	}

}
