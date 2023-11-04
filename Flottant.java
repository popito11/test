class Flottant extends Affichable {
    private float valeur;

    public Flottant(float valeur) {
        this.valeur = valeur;
    }

    @Override
    public void affiche() {
        System.out.println("Je suis un flottant de valeur " + valeur);
    }
}