package liste;

public class Noeud<E> {
	private E val;
	private Noeud next;
	
	public Noeud(E v){
		val = v;
		next = null;
	}
	
	public boolean hasNext() {
		return (next == null);
	}
	
	public void setNext(Noeud n) {
		next = n ;
	}
	
	public Noeud getNext() {
		return next;
	}
	
	public E getVal() {
		return val;
	}
}
