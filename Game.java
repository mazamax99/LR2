public class Game{
	public static void main(String[] args) {
	
	System.out.println("Start game!");
	
	Enemy enemy= new Enemy();
	System.out.println(enemy.getName());

	Ally ally= new Ally();
	System.out.println(ally.getName());
  }
}