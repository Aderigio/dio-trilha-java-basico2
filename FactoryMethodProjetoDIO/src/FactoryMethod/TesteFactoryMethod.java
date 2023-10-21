package FactoryMethod;

public class TesteFactoryMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
RoboGiganteFactory factory = new RoboGiganteFactory();
        
        RoboGigante robo1 = factory.criarRoboGigante("MegasXLR");
        robo1.andar();
        
        RoboGigante robo2 = factory.criarRoboGigante("Robo Alfa");
        robo2.andar();
    }
		
	}

