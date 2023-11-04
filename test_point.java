public class test_point {
    public static void main(String[] args){
        point p1=new point(1,5);
        p1.initialiser();
        p1.deplacer(2,5);
        //p1.afficher();

        /*exercice2 --------------------- */
        byte a =2;
        byte b=3;
        pointcol p2=new pointcol(a, 2, 4);
        //p2.afficher();
        p2.colorier(b);
        
        /*exercice 3 ----------------------- */

        pointcol p3=new pointcol(a, 2, 7);

        point tableau [];
        tableau = new point[3];

        tableau[0]=p1;
        tableau[1]=p2;
        tableau[2]=p3;

        for (point point : tableau) {
            System.out.println("--------------------------------------------------");
            point.afficher();
        }
    }
    
}
