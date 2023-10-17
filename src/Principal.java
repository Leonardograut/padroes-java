import Singleton.Singleton;
import Strategy.Comportamento;
import Strategy.Comportamento1;
import Strategy.Robo;
import facade.Facade;

public class Principal {

	public static void main(String[] args) {
		
		Singleton sing = Singleton.getInstancia();
		System.out.println(sing);
		
		Comportamento1 normal = new Comportamento1();
		
		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.mover();
		
		Facade facade = new Facade();
		facade.migrarCliente("Leonardo", "19988499");

	}

}
