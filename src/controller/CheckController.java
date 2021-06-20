package controller;

import models.*;

public class CheckController {
	public static void checkCadre(GridModel grid, IHooverModel iHoover) {
//		je vérifie que je reste dans le cadre
		if (iHoover.getY() > grid.getHeight() || iHoover.getX() > grid.getWidth()) {
			System.out.println("la destination de l'aspirateur est Hors cadre !!!!");
			System.exit(0);
		}
	}
}
