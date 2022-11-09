package it.unibo.generics.generics;

public class VectorB<X> {
    private final static int INITIAL_SIZE = 10;
    
    private X[] elements; 	// Deposito elementi, non posso usare X[]!!
    private int size;		// Numero di elementi
    
    public VectorB() {		// Inizialmente vuoto
    	this.elements = (X[]) new Object[INITIAL_SIZE]; // unchecked cast
    	this.size = 0;
    }
    
    public void addElement(final X e) {
    	if (this.size == elements.length){
    	    this.expand();	// Se non c'è spazio
    	}
    	this.elements[this.size] = e;
    	this.size++;
    }
    
    public X getElementAt(final int position) {
    	return this.elements[position];
    }
    
    public int getLength(){
    	return this.size;
    }
    
    private void expand() {	// Raddoppio lo spazio..
    	final X[] newElements = (X[]) new Object[this.elements.length*2]; // unchecked cast
    	for (int i=0; i < this.elements.length; i++){
    	    newElements[i] = this.elements[i];
    	}
    	this.elements = newElements;
    }
    
    public String toString(){
    	String s="|";
    	for (int i=0; i < size; i++){
    	    s = s + this.elements[i] + "|";
    	}
    	return s;
    }
}
