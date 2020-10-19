public class search2D {
	public static void main(String[] args) throws Exception {
		int[][] primes = {
			{ 1,  2,  3,  5,  7},
			{11, 13, 17, 19, 23},
			{29, 31, 37, 41, 43},
			{47, 53, 59, 61, 67},
			{71, 73, 79, 83, 89}
		};

		boolean found = new search2D().searchMatrix(primes, 11);
		if (found) {
			System.out.println("11 found in the matrix");
		} else {
			System.out.println("11 NOT found in the matrix");
		}
	}

	private boolean searchMatrix(int[][] matr, int target) {
		if (matr.length == 0) return false;
		int Z = matr.length;
		int Y = matr[0].length;
		int r = 0, c = Y - 1;
		while (r < Z && c >= 0) {
			if (matr[r][c] == target) return true;
			else if (target < matr[r][c]) --c;
			else if (target > matr[r][c]) r++;
		}
		return false;
	}
}	
