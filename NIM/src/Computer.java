
public class Computer extends Player{
	
	public Computer(int playerNumber) {
		this.playerNumber = playerNumber;
	}
	
	
	//더 똑똑한 컴퓨터를 만들면
	public void removeObjects(){
		String name = "";
		int delCount = 0 ;
		
		System.out.println("computer(player"+playerNumber+") turn");
		
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