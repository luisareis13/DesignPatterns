package observer;

public class TesteTemperature {
	  public static void main(String[] args) {
	    Temperature t = new Temperature();
	    t.setValue(10);
	    t.addObserver(new TermometerCelsius ());
	    t.addObserver(new TermometerFahrenheit ());
	    t.setValue(100);
	  }
	}

