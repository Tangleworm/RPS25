package game;

/**
 * @author Justin Wang
 * Contains all the valid choices for RPS25.
 */
public enum Choice {
	//Each choice beats the next 12 and is beaten by the previous 12
	//i.e. if its value is 1-12 higher than its opponent, it wins
	ROCK (25),
	SUN (24),
	FIRE (23),
	SCISSORS (22),
	AXE (21),
	SNAKE (20),
	MONKEY (19),
	WOMAN (18),
	MAN (17),
	TREE (16),
	COCKROACH (15),
	WOLF (14),
	SPONGE (13),
	PAPER (12),
	MOON (11),
	AIR (10),
	BOWL (9),
	WATER (8),
	ALIEN (7),
	DRAGON (6),
	DEVIL (5),
	LIGHTNING (4),
	NUKE (3),
	DYNAMITE (2),
	GUN (1);
	
	private int id; // the number of the choice
	
	Choice(int number){
		this.id = number;
	}
	
	public int id(){
		return id;
	}
}
