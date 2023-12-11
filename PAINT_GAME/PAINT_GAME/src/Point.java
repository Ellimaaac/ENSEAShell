import java.io.Serializable;

// Classe représentant un point dans un plan cartésien, implémente Serializable pour permettre la sérialisation
public class Point implements Serializable {
    private int X;  // Coordonnée X du point
    private int Y;  // Coordonnée Y du point

    // Constructeur par défaut initialisant le point à l'origine (0,0)
    public Point() {
        this.X = 0;
        this.Y = 0;
    }

    // Constructeur avec des coordonnées spécifiées
    public Point(int X, int Y) {
        this.X = X;
        this.Y = Y;
    }

    // Getter et Setter pour la coordonnée X
    public int getX() {
        return X;
    }

    public void setX(int X) {
        this.X = X;
    }

    // Getter et Setter pour la coordonnée Y
    public int getY() {
        return Y;
    }

    public void setY(int Y) {
        this.Y = Y;
    }

    // Redéfinition de la méthode toString pour obtenir une représentation textuelle du point
    @Override
    public String toString() {
        return "(" + X + "," + Y + ")";
    }
}
