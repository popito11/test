public class point {
    private int abscice;
    private int ordonnee;

    public point(int x,int y){
        abscice=x;
        ordonnee=y;
    }
    public void initialiser(){
        this.abscice=0;
        this.ordonnee=0;
    }
    public void deplacer(int x ,int y){
        this.abscice=this.abscice+x;
        this.ordonnee=this.ordonnee+y;
    }
    public void afficher(){
        System.out.println("je suis un point de coordonnee "+this.abscice+" et "+this.ordonnee);
    }
}

