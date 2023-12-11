import java.awt.*;
import javax.swing.*;

// Classe représentant un cercle, qui est une sous-classe de Ellipse
public class Circle extends Ellipse {

    // Constructeur avec couleur et indication si le cercle est rempli
    public Circle(Color c, boolean filled) {
        super(c, filled);
    }

    // Constructeur par défaut
    public Circle() {
        super(0, 0, Color.black);
    }

    // Constructeur avec position, couleur et initialisation du cercle
    public Circle(int px, int py, Color c) {
        super(px, py, c);
    }

    // Méthode pour définir le demi-axe X et Y du cercle (qui sont égaux pour un cercle)
    @Override
    public void setSemiAxysX(int semiAxysX) {
        this.semiAxysX = semiAxysX;
        this.semiAxysY = semiAxysX;
    }

    // Méthode pour définir le demi-axe Y et X du cercle (qui sont égaux pour un cercle)
    @Override
    public void setSemiAxysY(int semiAxysY) {
        this.semiAxysY = semiAxysY;
        this.semiAxysX = semiAxysY;
    }

    // Méthode pour définir la boîte englobante du cercle
    @Override
    public void setBoundingBox(int lengthBB, int widthBB) {
        semiAxysX = Math.min(lengthBB, widthBB);
        semiAxysY = Math.min(lengthBB, widthBB);
    }

    // Méthode pour dessiner le cercle
    @Override
    public void draw(Graphics g) {
        int x = getOrigin().getX();
        int y = getOrigin().getY();
        g.setColor(c);

        if (filled) {
            g.fillOval(x, y, Math.min(getSemiAxysX(), getSemiAxysY()), Math.min(getSemiAxysY(), getSemiAxysY()));
        } else {
            g.drawOval(x, y, Math.min(getSemiAxysX(), getSemiAxysY()), Math.min(getSemiAxysY(), getSemiAxysY()));
        }
    }

    // Redéfinition de la méthode toString pour obtenir une représentation textuelle du cercle
    @Override
    public String toString() {
        return "Cercle d'origine : " + o + " et de couleur " + c + "\nRayon : " + semiAxysX + "\nRempli : " + filled;
    }
}
