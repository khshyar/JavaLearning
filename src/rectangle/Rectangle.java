package rectangle;

public class Rectangle {

    private double breite;
    private double laenge;

    public Rectangle() {
    }

    public Rectangle(double breite, double laenge) {
        this.breite = breite;
        this.laenge = laenge;
    }

    public double getBreite() {
        return this.breite;
    }

    public void setBreite(double breite) {
        this.breite = breite;
    }

    public double getLaenge() {
        return this.laenge;
    }

    public void setLaenge(double laenge) {
        this.laenge = laenge;
    }

    public double umfang(double getBreite, double getLaenge) {
        double result = (getBreite + getLaenge) * 2;
        return result;
    }

    public double flaeche(double getBreite, double getLaenge) {
        double result = getBreite * getLaenge;
        return result;
    }
}
