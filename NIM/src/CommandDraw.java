
public class CommandDraw implements Draw{

	@Override
	public void draw() {
		
	}
	
	public void drawCurrentHeapState(){
//		for(int i = 1 ; i <= Manager.maps.size(); i++){
//			Manager.maps.get((char)('a' + i-1)+"").printState();
//		}
		
		for(int i = 1 ; i <= Manager.maps.size(); i++){
			Heap h = Manager.maps.get((char)('a' + i-1)+"");
			System.out.println(h.getName() + " ("+ h.getCount()+") ");
		}
		
		
	}


	@Override
	public void beforeGetCount(int playerNumber) {
		System.out.print("user(player"+playerNumber+") turn\ninput( format --> heapName count ) : ");		
	}
	
	
	
	@Override
	public void heapNameCountSelectError() {
		System.out.println("heap 이름과 count를 다시 입력해 주세요;");
	}

	@Override
	public void finishedDrawPrint(int playerNumber) {
		System.out.println("player" + playerNumber + " lose");
		System.out.println("game over ");
	}

	@Override
	public void beforeComputerStart(int playerNumber){
		System.out.println("computer(player"+playerNumber+") turn");		
	}

	@Override
	public void drawGetHeapCount() {
		System.out.print("how many heap? : ");		
	}
}
