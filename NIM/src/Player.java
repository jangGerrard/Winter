
public  abstract class Player {
	protected int playerNumber;
	
	public abstract void removeObjects(Draw draw);
	
	public int getPlayerNumber()
	{
		return this.playerNumber;
	}
}
