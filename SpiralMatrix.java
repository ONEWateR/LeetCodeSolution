public class Solution {

	enum Direction {  
		UP, DOWN, RIGHT, LEFT;
	}
	
    public List<Integer> spiralOrder(int[][] matrix) {
    	List<Integer> result = new ArrayList<Integer>();
    	if (matrix.length == 0) return result;
    	// init
    	int i = 0, j = 0;
    	// up,left,right,down
    	int[] border = {0, 0, matrix[0].length, matrix.length};
    	Direction dir = Direction.RIGHT;
    	
    	while (result.size() < matrix[0].length * matrix.length) {
			switch (dir) {
			case RIGHT:
				for (; i < border[2]; i++) {
					result.add(matrix[j][i]);
				}
				border[0]++;
				dir = Direction.DOWN;
				break;
			case LEFT:
				for (i--,j--; i >= border[1]; i--) {
					result.add(matrix[j][i]);
				}
				border[3]--;
				dir = Direction.UP;
				break;
			case UP:
				for (j--,i++; j >= border[0]; j--) {
					result.add(matrix[j][i]);
				}
				j++;i++;
				border[1]++;
				dir = Direction.RIGHT;
				break;
			case DOWN:
				for (j++,i--; j < border[3]; j++){
					result.add(matrix[j][i]);
				}
				border[2]--;
				dir = Direction.LEFT;
				break;
			}
		}
    	
    	return result;
    }
}
