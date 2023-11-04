public class pointcol extends point{
    byte couleur;
    public pointcol(byte couleur,int abscice,int ordonnee){
        super(abscice,ordonnee);
        this.couleur=couleur;
    }
    public void colorier(byte color){
        this.couleur=color;
    }
    public void afficher(){
        super.afficher();
        System.out.println("couleur du point : " + this.couleur);
    }
}
