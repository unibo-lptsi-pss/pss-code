package it.unibo.collections.generic.constrained;

/* Non si esaurisce mai */
public class UnlimitedLamp extends LimitedLamp{    
    /* Nessuna informazione extra da tenere */
    public UnlimitedLamp(){
    	super();
    }
    
    /* Allo switchOn.. non faccio nulla */
    protected void okSwitch(){}
    
    /* Non è mai esaurita */
    public boolean isOver(){
    	return false;
    }
} 
