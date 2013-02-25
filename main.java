import java.util.ArrayList;


public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i =0 ; i <=100; i++){
			list.add(i);			
		}
		Search search = new Search(list);
		search.find(list.size()-1,0, 75);
		
	}

}
