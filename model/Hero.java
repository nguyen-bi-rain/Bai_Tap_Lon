package model;


import javax.swing.JLabel;

public class Hero extends JLabel{
    private int x;
    private int y;
    public Hero(){
        this.x =550;
        this.y = 350;
    }
    public void moveForward() {
		setLocation(this.getX(), this.getY() - 64);
		if (this.getY() < 0) {
			this.setLocation(this.getX(), 390);
		}


	}
	public void moveBack() {
		if (this.getY() < 390) {
			this.setLocation(this.getX(), this.getY() + 64);
			
		}
	}

	public void moveRight() {
		this.setLocation(this.getX() + 45, this.getY());
		if (this.getX() >= 660) {
			this.setLocation(0, this.getY());
		}
	}

	public void moveLeft() {
		this.setLocation(this.getX() - 45, this.getY());
		if (this.getX() <= 0) {
			this.setLocation(660 - this.getWidth(), this.getY());
		}
	}
}
