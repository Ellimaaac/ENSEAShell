import java.awt.*;

// Classe représentant un rectangle, qui est une sous-classe de Figure
public class Rectangle extends Figure {
    // Attributs spécifiques à un rectangle
    protected int length;    // Longueur du rectangle
    protected int width;     // Largeur du rectangle

    // Constructeur avec couleur et indication si le rectangle est rempli
    public Rectangle(Color c, boolean filled) {
        super(c, new Point(0, 0), filled);
    }

    // Constructeur par défaut
    public Rectangle() {
        super(Color.black, new Point(0, 0), false);
    }

    // Constructeur avec position, couleur et initialisation du rectangle non rempli
    public Rectangle(int px, int py, Color c) {
        super(c, new Point(px, py), false);
    }

    // Méthode pour définir la boîte englobante du rectangle
    public void setBoundingBox(int lengthBB, int widthBB) {
        length = lengthBB;
        width = widthBB;
    }

    // Méthode pour dessiner le rectangle
    public void draw(Graphics g) {
        int x = this.getOrigin().getX();
        int y = this.getOrigin().getY();
        g.setColor(c);

        if (filled) {
            g.fillRect(x, y, this.getLength(), this.getWidth());
        } else {
            g.drawRect(x, y, this.getLength(), this.getWidth());
        }
    }

    // Getter et Setter pour la longueur et la largeur du rectangle
    public int getLength() {return length;}
    public int getWidth() {return width;}

    // Méthodes pour calculer le périmètre et la surface du rectangle
    public int getPerimeter() {return 2 * (length + width);}
    public int getSurface() {return length * width;}

    // Setter pour la longueur du rectangle
    public void setLength(int length) {this.length = length;}

    // Setter pour la largeur du rectangle
    public void setWidth(int width) {this.width = width;}

    // Redéfinition de la méthode toString pour obtenir une représentation textuelle du rectangle
    @Override
    public String toString() {
        return "Rectangle : " + o + " color " + c + "\nLength : " + length + "\nWidth : " + width + "\nFilled : " + filled;
    }
}
