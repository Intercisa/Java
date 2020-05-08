package checkifstraightline;

public class CheckStraightLine {
	   public boolean checkStraightLine(int[][] coordinates) {
		   double tempSlope = 0;
		   int N = coordinates.length-1;
		   
		   double slope = 
				   (double)(coordinates[1][1] - coordinates[0][1])/(double)(coordinates[1][0] - coordinates[0][0]);
		   
		   
		   for (int i = 1; i < N; i++) {
			tempSlope = 
					(double)(coordinates[i+1][1] - coordinates[i][1])/(double)(coordinates[i+1][0] - coordinates[i][0]); 
				if(slope != tempSlope) return false;	
		}
		   
		   return true;
	    } 


/*
 * The slope for a line through any 2 points (x0, y0) and (x1, y1) is (y1 - y0) / (x1 - x0); 
 * Therefore, for any given 3 points (denote the 3rd point as (x, y)), if they are in a straight line, 
 * the slopes of the lines from the 3rd point to the 2nd point and the 2nd point to the 1st point must be equal:
 *(y - y1) / (x - x1) = (y1 - y0) / (x1 - x0)
 *In order to avoid being divided by 0, use multiplication form:
 *(x1 - x0) * (y - y1) = (x - x1) * (y1 - y0) =>
 *dx * (y - y1) = dy * (x - x1), where dx = x1 - x0 and dy = y1 - y0
 *Now imagine connecting the 2nd points respectively with others one by one, Check if all of the slopes are equal.
*/

    public boolean checkStraightLineOtherSolution(int[][] coordinates) {
        int x0 = coordinates[0][0], y0 = coordinates[0][1], x1 = coordinates[1][0], y1 = coordinates[1][1];
        int dx = x1 - x0, dy = y1 - y0;
        for (int[] co : coordinates) {
            int x = co[0], y = co[1];
            if (dx * (y - y1) != dy * (x - x1))
                return false;
        }
        return true;
    }
    
    public boolean checkStraightLineOtherSolution2(int[][] coordinates) {

          float gSlope = slope(coordinates[1], coordinates[0]);

          for (int i = 1; i < coordinates.length; i++) {
              int[] p1 = coordinates[i];
              int[] p2 = coordinates[0];
              float slop = slope(p1, p2);
              if (gSlope != slop) return false;
          }
          return true;
      }

      private float slope(int[] p1, int[] p2) {
          if ((p1[0] - p2[0]) == 0) return 0;
          return (float)(p2[1] - p1[1]) / (p2[0] - p1[0]);
      }
    
    
}
