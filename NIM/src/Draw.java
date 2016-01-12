
public interface Draw {
	public void draw();
	
	public void drawCurrentHeapState();

	public void finishedDrawPrint(int playerNumber);

	public void heapNameCountSelectError();

	public void beforeGetCount(int playerNumber);
	
	public void beforeComputerStart(int playerNumber);
	
	public void drawGetHeapCount();
	
}
