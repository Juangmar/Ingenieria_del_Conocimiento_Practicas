package business;

public class CellWall extends Cell {

	public CellWall(int i, int j) {
		super(i, j);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isWalkable() {
		return false;
	}

}
