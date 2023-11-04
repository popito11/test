class Entier extends Affichable {
    private int valeur;

    public Entier(int valeur) {
        this.valeur = valeur;
    }

    @Override
    public void affiche() {
        System.out.println("Je suis un entier de valeur " + valeur);
    }
}
