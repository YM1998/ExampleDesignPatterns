package com.patterns.comportamiento.observable;

import java.util.ArrayList;
import java.util.List;

public abstract class ISubject {

	protected List<Observable> observables;
	protected String state;
	
	public ISubject() {
		observables=new ArrayList<Observable>();
	}
	
	public void setState(String state) {
	   this.state=state;
	   notifyObservables();
	}
	
	public abstract String getResult();
	
	
	public void attach(Observable observable) {
		observables.add(observable);
	}
	
	
	public void remove(Observable observable) {
		observables.add(observable);
	}
	
	public void notifyObservables() { 
		observables.stream().forEach(ob->ob.update(this));
	}
	
}
