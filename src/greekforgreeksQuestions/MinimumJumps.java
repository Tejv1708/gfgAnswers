package greekforgreeksQuestions;

public class MinimumJumps {

	
		int minJumps(int[] arr) {
			int n = arr.length;
			int farthest = 0, jumps = 0, current = 0;
			for (int i = 0; i < n - 1; i++) {
				farthest = Math.max(farthest, arr[i] + i);
				if (i == current) {
					current = farthest;
					jumps++;
				}
			}
			System.out.print(jumps);
			if (current < n - 1)
				return -1;
          
			return jumps;
		}
		

		public static void main(String[] args) {
			 int[] arr = { 1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9 };
			MinimumJumps minJ = new MinimumJumps();
			minJ.minJumps(arr);
		}

	
	

}
