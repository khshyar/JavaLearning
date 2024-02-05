package pacman;

public class Main {
    public static void main(String[] args) {
        Player pacman = new Player(3, 4);

        boolean ok;
        ok = pacman.moveLeft();
        ok = pacman.moveTop();
        ok = pacman.moveRight();

        System.out.println("Pac-Man X-Position: " + pacman.x);
        System.out.println("Pac-Man Y-Position: " + pacman.y);
    }
}
