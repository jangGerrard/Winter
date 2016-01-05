
public class Runner {

	public static void main(String[] args) {

		Player user = new User(1);
		Player computer = new Computer(2);

		Manager.players.add(user);
		Manager.players.add(computer);

		Manager.init();

		while (true) {

			for (Player player : Manager.players) {
				Manager.printCurrentStatus();

				player.removeObjects();

				if (Manager.isFinished()) {
					System.out.println("player" + player.getPlayerNumber() + " lose");
					System.out.println("game over ");
					System.exit(0);
					break;
				}
			}

		}

	}

}
