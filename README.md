# ENSEA_Paint_&_Games
in JAVA

<p align="center">
  <img src="https://github.com/Ellimaaac/ENSEA_Paint/blob/main/img/paint.png" alt="Paint" width="600" />
</p>

# Fonctionnement global
1. **Main (Main.java)** :
   - Nouvelle instance de la fenêtre principale (`Window`).

2. **Window (Window.java)** :
   - La fenêtre principale de l'application qui héberge le panneau de dessin (`Drawing`).
   - Crée une interface utilisateur pour interagir.

3. **Drawing (Drawing.java)** :
   - 0ù l'utilisateur peut créer des formes géométriques.
   - Gère les interactions utilisateur, la logique de dessin, la sauvegarde et le chargement de fichiers.
   - Utilise les classes spécifiques (`Rectangle`, `Ellipse`, `Circle`, `Square`) pour créer et afficher des formes.
   - Communique avec les classes de sérialisation pour sauvegarder et charger les dessins.

4. **Formes géométriques (Rectangle, Ellipse, Circle, Square)** :
   - Chaque classe représente une forme géométrique spécifique.
   - Hérite de la classe abstraite `Figure`.
   - Gère les propriétés spécifiques à chaque forme (longueur, largeur, demi-axes, etc.).
   - Implémente les méthodes nécessaires pour dessiner la forme.

5. **Point (Point.java)** :
   - Une classe simple représentant un point avec des coordonnées X et Y.

Le flux d'exécution typique peut être décrit comme suit :

- L'utilisateur interagit avec l'interface utilisateur dans la fenêtre principale pour choisir le type de forme, la couleur, et d'autres propriétés.
- Lorsque l'utilisateur clique sur le panneau, une nouvelle instance de la forme sélectionnée est créée et ajoutée à la liste de formes du panneau de dessin.
- Le paint interagit de l'utilisateur en redessinant les formes à l'écran.
- L'utilisateur peut sauvegarder et charger des dessins à partir de fichiers.

# Fonctionnement de chaque class

1. **`Point.java`**:
   - **Fonctionnement** : Représente un point dans un espace bidimensionnel avec des coordonnées X et Y.
   - **Lien avec les autres classes** : Utilisé dans les classes `Figure`, `Rectangle`, `Ellipse`, `Circle`, `Square` pour définir l'origine des formes géométriques.

2. **`Figure.java`**:
   - **Fonctionnement** : Classe abstraite représentant une figure géométrique. Contient des attributs tels que la couleur, l'origine, et si la figure est remplie ou non.
   - **Lien avec les autres classes** : Classe de base pour les formes spécifiques telles que `Rectangle`, `Ellipse`, `Circle`, `Square`.

3. **`Rectangle.java`**:
   - **Fonctionnement** : Représente un rectangle défini par sa longueur, largeur, couleur, origine et propriétés de remplissage.
   - **Lien avec les autres classes** : Hérite de `Figure`. Utilisé dans `Drawing` pour créer des rectangles.

4. **`Ellipse.java`**:
   - **Fonctionnement** : Représente une ellipse définie par ses demi-axes, couleur, origine et propriétés de remplissage.
   - **Lien avec les autres classes** : Hérite de `Figure`. Utilisé dans `Drawing` pour créer des ellipses.

5. **`Circle.java`**:
   - **Fonctionnement** : Représente un cercle, une sous-classe de `Ellipse`, où les demi-axes X et Y sont égaux.
   - **Lien avec les autres classes** : Hérite de `Ellipse`. Utilisé dans `Drawing` pour créer des cercles.

6. **`Square.java`**:
   - **Fonctionnement** : Représente un carré, une sous-classe de `Rectangle`, où la longueur et la largeur sont égales.
   - **Lien avec les autres classes** : Hérite de `Rectangle`. Utilisé dans `Drawing` pour créer des carrés.

7. **`Drawing.java`**:
   - **Fonctionnement** : Classe principale représentant le panneau de dessin. Gère l'interaction utilisateur, le dessin des formes, la sauvegarde et le chargement de fichiers.
   - **Lien avec les autres classes** : Utilise les classes `Rectangle`, `Ellipse`, `Circle`, `Square` pour créer et afficher des formes. Interagit avec les classes de sérialisation pour sauvegarder et charger les dessins.

8. **`Main.java`**:
   - **Fonctionnement** : Classe principale contenant la méthode `main` qui initialise la fenêtre de l'application.
   - **Lien avec les autres classes** : Crée une instance de `Window` qui contient un objet `Drawing` pour gérer le dessin.

9. **`Window.java`**:
   - **Fonctionnement** : Fenêtre principale de l'application qui contient le panneau de dessin (`Drawing`).
   - **Lien avec les autres classes** : Contient un objet `Drawing` pour gérer le dessin. Crée une interface utilisateur permettant d'interagir avec le panneau de dessin.

# Jeux 

Ajouts de 2 types de jeu liés à Paint : **Ou est Charlie ?** et **Les 7 Différences**
Accessible dans le menu **Help**

<p align="center">
  <img src="https://github.com/Ellimaaac/ENSEA_Paint/blob/main/img/OEC.png" alt="Paint" width="600" />
</p>
<p align="center">
  <img src="https://github.com/Ellimaaac/ENSEA_Paint/blob/main/img/HM1.png" alt="Paint" width="600" />
</p>
<p align="center">
  <img src="https://github.com/Ellimaaac/ENSEA_Paint/blob/main/img/HM2.png" alt="Paint" width="600" />
</p>
