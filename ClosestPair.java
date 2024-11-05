/** A main class for the Closest Pair algorithms
 *  Programming assignment for
 *  CSI403 Algorithms and Data Structures
 *  University at Albany - SUNY
 *  
 * Instructions: Implement methods: 
 * 1) getCPBruteForce()
 * 2) getCPDivideAndConquer()
 * As discussed in class and in the assignment part (a)
 */
package closestpair;
import java.util.HashSet;

public class ClosestPair {
	
	/** TODO: IMPLEMENT 
	 *  A brute force method for the closest pair
	 *  @returns an array of exactly the two closest points
	 *  IMPORTANT: DO NOT CHANGE THIS METHOD SIGNATURE,
	 *  ONLY THE BODY WILL BE CONSIDERED FOR GRADING
	 */
	public static Point[] getCPBruteForce (Point[] pts)  {
		//TODO: Implement this method for part (a) of the assignment 
		Point[] closestPair = new Point[2];//result
		int firstTime=0;
		double shortestDistance=0;
		//if you run this first time, set the first two points as the closest pair.
		if(firstTime==0) {
			closestPair[0]=pts[0];
			closestPair[1]=pts[1];
			shortestDistance=closestPair[0].dist(closestPair[1]);
			firstTime=1;
			firstTime=1;
		}
		
		for(int i=1; i<pts.length; i++) {
			for(int j=i+1; j<pts.length; j++) {
				if(pts[i].dist(pts[j]) < shortestDistance) {
					closestPair[0] = pts[i];
					closestPair[1] = pts[j];
					shortestDistance=closestPair[0].dist(closestPair[1]);
				}
			}
		}
		return closestPair;
	}
	
	/** A driver for the Divide-And-Conquer method for the closest pair
	 *  takes unsorted array of points, sorts them and invokes 
	 *  the recursive method you are required to implement
	 *  
	 *  @returns an array of exactly the two closest points
	 *  IMPORTANT: DO NOT CHANGE THIS METHOD
	 */
	public static Point[] getCPDivideAndConquer(Point[] pts) {
		Point[] ptsX = Point.sortByX(pts); 
		Point[] ptsY = Point.sortByY(pts);
		return getCPDivideAndConquer(ptsX, ptsY);
	}
	
	/** TODO: IMPLEMENT 
	 *  A Divide-And-Conquer method for the closest pair
	 *  takes as input the points sorted by increasing x
	 *  and y coordinates in ptsX and ptsY respectively
	 *  @returns an array of exactly the two closest points.
	 *  IMPORTANT: DO NOT CHANGE THIS METHOD SIGNATURE,
	 *  ONLY THE BODY WILL BE CONSIDERED FOR GRADING
	 */
	public static Point[] getCPDivideAndConquer(Point[] ptsX, Point[] ptsY) {
		return null;
	}
}
