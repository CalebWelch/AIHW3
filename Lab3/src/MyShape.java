import java.awt.Color;
import java.awt.Point;
import java.util.PriorityQueue;
import java.util.Stack;
public class MyShape {
	byte[] state = new byte[22];
	Point[][] shapes;
	public static UCS(MyState start, MyState finish){
		
	}
	
	public void main(String[] args){
		shapes = new Point[11][4];
		shapes[0] = new Point[]{new Point(1,3),new Point(2,3),new Point(1,4), new Point(2,4)};
		shapes[1] = new Point[]{new Point(1,5), new Point(1,6), new Point(2,6)};
		shapes[2] = new Point[]{new Point(2,5), new Point(3,5), new Point(3,6)};
		shapes[3] = new Point[]{new Point(3,7), new Point(3,8), new Point(4,8)};
		shapes[4] = new Point[]{new Point(4,7), new Point(5,7), new Point(5,8)};
		shapes[5] = new Point[]{new Point(6,7), new Point(7,7), new Point(6,8)};
		shapes[6] = new Point[]{new Point(5,4), new Point(5,5), new Point(5,6), new Point(4,5)};
		shapes[7] = new Point[]{new Point(6,4), new Point(6,5), new Point(6,6),new Point(7,5)};
		shapes[8] = new Point[]{new Point(8,5), new Point(8,6), new Point(7,6)};
		shapes[9] = new Point[]{new Point(6,2), new Point(6,3), new Point(5,3)};
		shapes[10] = new Point[]{new Point(5,1), new Point(6,1), new Point(5,2)}; 
	}
	private void shape(int id, int x1, int y1, int x2, int y2, int x3, int y3) {
		// TODO Auto-generated method stub
		
	}
	private void shape(int id, int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
		// TODO Auto-generated method stub
		
	}
	class MyState implements Comparable<MyState>{
		int cost;
		MyState Parent;
		@Override
		public int compareTo(MyState arg0) {
			// TODO Auto-generated method stub
			return 0;
		}
		
	}
}
