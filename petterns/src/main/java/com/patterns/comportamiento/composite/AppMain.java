package com.patterns.comportamiento.composite;

public class AppMain {

	public static void main(String[] args) {
		OpcionComponent menu=new OpcionComposite(new Opcion(0, null, "Raiz"));
		
		menu.add(new OpcionSheet(new Opcion(1, null, "Menu1")));
		
		menu.add(new OpcionComposite(new Opcion(2, null, "Menu2")));
		menu.add(new OpcionSheet(new Opcion(21, 2, "Menu21")));
		menu.add(new OpcionSheet(new Opcion(22, 2, "Menu22")));
		
		menu.add(new OpcionComposite(new Opcion(3, null, "Menu3")));
		menu.add(new OpcionSheet(new Opcion(31, 3, "Menu31")));
		menu.add(new OpcionSheet(new Opcion(32, 3, "Menu32")));
		
		menu.getTreet();
	}
	
}
