package liste;

public class ListChainee<E> {

    private Noeud<E> tete;

    public ListChainee() {
        tete = null;
    }

    void addNoeud(E val) {
        Noeud<E> n = new Noeud<>(val);

        if (tete == null) {
            tete = n;
        } else {
            Noeud<E> courant = tete;
            while (courant.getNext() != null) {
                courant = courant.getNext();
            }
            courant.setNext(n);
        }
    }

    Noeud<E> get(int index) {
        if (index < 0) return null;

        Noeud<E> courant = tete;
        int i = 0;

        while (courant != null && i < index) {
            courant = courant.getNext();
            i++;
        }

        return courant; // null si index hors limites
    }

    void insert(int index, E val) {
        Noeud<E> n = new Noeud<>(val);

        // insertion en tête
        if (index <= 0) {
            n.setNext(tete);
            tete = n;
            return;
        }

        Noeud<E> precedent = get(index - 1);

        if (precedent == null) {
            System.out.println("Impossible d'inserer a l'index " + index);
            return;
        }

        n.setNext(precedent.getNext());
        precedent.setNext(n);
    }

    void remove(int index) {

        if (tete == null) {
            System.out.println("Liste vide");
            return;
        }

        if (index == 0) {
            tete = tete.getNext();
            return;
        }

        Noeud<E> precedent = get(index - 1);

        if (precedent == null || precedent.getNext() == null) {
            System.out.println("Index superieur a la taille de la liste");
            return;
        }

        precedent.setNext(precedent.getNext().getNext());
    }

    @Override
    public String toString() {
        if (tete == null) return "Liste vide";

        StringBuilder sb = new StringBuilder();
        Noeud<E> courant = tete;

        while (courant != null) {
            sb.append(courant.getVal());
            if (courant.getNext() != null) {
                sb.append(" --> ");
            }
            courant = courant.getNext();
        }

        return sb.toString();
    }
}
