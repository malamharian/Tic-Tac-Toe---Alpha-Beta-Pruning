
public class Node {

	String[][] board;
	String nextPlayer;
	Node parent;
	int heuristicValue = 0;
	int atDepth = 0;
	int traversalDepth = 0;
	
	public Node(){
		board = new String[3][3];
		parent = null;
	}
	
	public Node(String[][] board, Node parent, int heuristicValue, int atDepth, String nextPlayer, int traversalDepth){
		this.board = board;
		this.parent = parent;
		this.heuristicValue = heuristicValue;
		this.atDepth = atDepth;
		this.nextPlayer = nextPlayer;
		this.traversalDepth = traversalDepth;
	}
}
