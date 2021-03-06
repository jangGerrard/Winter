
public class Computer extends Player{
	
	public Computer(int playerNumber) {
		this.playerNumber = playerNumber;
	}
	
	
	public void removeObjects(Draw draw){
		String name = "";
		int delCount = 0 ;
		
		draw.beforeComputerStart(playerNumber);
		do{
			name = (char)(Math.random()*Manager.maps.size() + 'a') +"";
			Heap h  = Manager.maps.get(name);
			int count = h.getCount();
			delCount = (int)(Math.random()*count+1) ;
		}while(!Manager.isValidCount(name,delCount));
		
		Heap h = Manager.maps.get(name);
		int currentCount = h.getCount();
		h.setCount(currentCount- delCount);
		Manager.totalCount -= delCount;
		
	}
}