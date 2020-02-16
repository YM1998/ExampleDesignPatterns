package com.patterns.comportamiento.visitor;

import java.util.ArrayList;
import java.util.List;

public class AppMain {

	
	
	public static void main(String[] args) {
		List<IElement> elementos=new ArrayList<IElement>();
		elementos.add(new Element1());
		elementos.add(new Element2());
		elementos.add(new Element3());
		
		Visitor1 visit1=new Visitor1();
		Visitor2 visit2=new Visitor2();
		Visitor3 visit3=new Visitor3();
			
		
		elementos.stream().forEach( (element) -> element.accept(visit1));
		elementos.stream().forEach( (element) -> element.accept(visit2));
		elementos.stream().forEach( (element) -> element.accept(visit3));
		
	}
}
