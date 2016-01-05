
public class Heap {
	private String name;
	private int count;
	
	public Heap(String name, int count) {
		this.name = name;
		this.count = count;
		
		Manager.numOfHeap += 1;
		Manager.totalCount += count ;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getCount() {
		return count;
	}
	
	public void setCount(int count) {
		this.count = count;
	}
	
	public String toString(){
		return name+" ("+count+") ";
	}
	
	public void printState(){
		System.out.println(toString());
	}
}
