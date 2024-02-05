package pacman;

public class Player {
    public int x;
    public int y;

    public Player(int startX, int startY) {
        this.x = startX;
        this.y = startY;
    }

    public boolean moveLeft() {

        if (true) {
            x = x - 1;
        }
        return true;
    }

    public boolean moveRight() {

        if (true) {
            x = x + 1;
        }
        return true;
    }

    public boolean moveTop() {

        if (true) {
            y = y + 1;
        }
        return true;
    }

    public boolean moveDown() {

        if (true) {
            y = y - 1;
        }
        return true;
    }

}
