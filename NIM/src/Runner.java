
public class Runner {

	public static void main(String[] args) {

		Player user = new User(1);
		Player computer = new Computer(2);
		Draw draw = new CommandDraw();
		SwingHandler swingHandler = new SwingHandler();
		
		Manager.players.add(user);
		Manager.players.add(computer);
		
		Manager.init(draw);
	

		while (true) {

			for (Player player : Manager.players) {
				draw.drawCurrentHeapState();

				player.removeObjects(draw);

				if (Manager.isFinished()) {
					draw.finishedDrawPrint(player.getPlayerNumber());
					System.exit(0);
					break;
				}
			}

		}

	}

}
