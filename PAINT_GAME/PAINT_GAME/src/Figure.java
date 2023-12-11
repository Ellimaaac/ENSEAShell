import javax.swing.*;
import java.awt.*;
import java.io.Serializable;

// Classe abstraite représentant une figure géométrique
public abstract class Figure implements Serializable {
    // Attributs protégés de la classe
    protected Color c;             // Couleur de la figure
    protected Point o;             // Point d'origine de la figure
    protected boolean filled;      // Indique si la figure est remplie ou non
    protected int brushBborder;    // Bordure du pinceau (à corriger : probablement "border" au lieu de "bordure")

    // Constructeur de la classe Figure
    public Figure(Color c, Point o, boolean filled){
        this.filled = filled;
        this.c = c;
        this.o = o;
    }

    // Méthode abstraite pour définir la boîte englobante de la figure
    public abstract void setBoundingBox(int lengthBB, int widthBB);

    // Méthode abstraite pour dessiner la figure
    public abstract void draw(Graphics g);

    // Getter et Setter pour les attributs de la classe
    public Color getColor(){return c;}
    public Point getOrigin(){return o;}
    public boolean getFilled(){return filled;}

    public void setOrigin(Point o){this.o = o;}
    public void setColor(Color c){this.c = c;}
    public void setFilled(boolean filled){this.filled = filled;}

    // Méthode toString pour obtenir une représentation textuelle de la figure
    @Override
    public String toString() {return "Origine:" + o + ", couleur:" + c + ", rempli:" + filled;}
}
