package FactoryMethod;

public class RoboGiganteFactory {
	
	public RoboGigante criarRoboGigante(String tipo) {
        if (tipo.equalsIgnoreCase("MegasXLR")) {
            return new MegasXLR();
        } else if (tipo.equalsIgnoreCase("Robo Alfa")) {
            return new RoboAlfa();
        }
        return null;
    }
	}


