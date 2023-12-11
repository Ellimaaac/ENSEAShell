import java.awt.*;
import javax.swing.*;

// Classe représentant un carré, qui est une sous-classe de Rectangle
public class Square extends Rectangle {

    // Constructeur avec couleur et indication si le carré est rempli
    public Square(Color c, boolean filled) {
        super(c, filled);
    }

    // Constructeur par défaut
    public Square() {
        super(0, 0, Color.black);
    }

    // Constructeur avec position, couleur et longueur du côté du carré
    public Square(int px, int py, Color c) {
        super(px, py, c);
    }

    // Redéfinition des méthodes pour définir la longueur et la largeur du carré
    @Override
    public void setLength(int length) {
        this.length = length;
        this.width = length;
    }

    @Override
    public void setWidth(int width) {
        this.width = width;
        this.length = width;
    }

    // Redéfinition de la méthode pour définir la boîte englobante du carré
    @Override
    public void setBoundingBox(int lengthBB, int widthBB) {
        width = Math.min(lengthBB, widthBB);
        length = Math.min(lengthBB, widthBB);
    }

    // Redéfinition de la méthode pour dessiner le carré
    @Override
    public void draw(Graphics g) {
        int x = getOrigin().getX();
        int y = getOrigin().getY();
        g.setColor(c);

        if (filled) {
            g.fillRect(x, y, Math.min(getWidth(), getLength()), Math.min(getWidth(), getLength()));
        } else {
            g.drawRect(x, y, Math.min(getWidth(), getLength()), Math.min(getWidth(), getLength()));
        }
    }

    // Redéfinition de la méthode toString pour obtenir une représentation textuelle du carré
    @Override
    public String toString() {
        return "Carré  : " + o + "  de couleur " + c + "\nLongueur d'un côté : " + length + "\nRempli :" + filled;
    }
}
