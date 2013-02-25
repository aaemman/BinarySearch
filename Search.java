import java.util.ArrayList;


public class Search {
	private ArrayList<Integer> list;

	public Search(ArrayList<Integer> list){
		this.list = list;
	}

	public void find(int max, int min, int i) {
		// TODO Auto-generated method stub
		
		if(max<=min){
			System.out.print("value does not exist");
			return;
		}
		
		if(midpoint(min, max) == i){
			System.out.println("found value");
			return;
		}
		
		if(i > midpoint(min,max)){
			find(max, midpoint(min,max), i);
		}else{
			find(midpoint(min,max),min, i);
		}
		
		
		
	}

	private int midpoint(int min, int max) {
		// TODO Auto-generated method stub
		return ((max - min)/2)+min;
	}

}
