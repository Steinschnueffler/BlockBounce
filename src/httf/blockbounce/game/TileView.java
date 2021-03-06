package httf.blockbounce.game;

import javafx.scene.image.ImageView;

public class TileView extends ImageView{
	
	public TileView(Tile tile) {
		super(tile);
	}
	
	public Tile getTile() {
		return (Tile) getImage();
	}
	
	public void moveLeft(double howMuch) {
		setLayoutX(getLayoutX() - howMuch);
	}
	
	public double rightX() {
		return getLayoutX() + getImage().getWidth();
	}
	
	public double getTopHeight(double x) {
		return getLayoutY() - getTile().getHeight() + getTile().getHeight(x);
	}
}
