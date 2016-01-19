
public class GUIDraw implements Draw{

	private SwingHandler swingHandler;
	
	public GUIDraw() {
		//SWing init
		///some class and init
	}
	
	
	@Override
	public void draw() {
		
	}
	
	public void drawCurrentHeapState(){
//		for(int i = 1 ; i <= Manager.maps.size(); i++){
//			
//			Heap h = Manager.maps.get((char)('a' + i-1)+"");
//			swingHandler.
//		}
		
		
		
	}

	@Override
	public void beforeGetCount(int playerNumber) {
		swingHandler.beforeGetCount();
		
	}

	@Override
	public void beforeComputerStart(int playerNumber) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void heapNameCountSelectError() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void drawGetHeapCount() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void finishedDrawPrint(int playerNumber) {
		
	}
}
