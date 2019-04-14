package observer;

public class Temperature extends Subject  {
	  private double value;
	  public double getValue() {
	    return value;
	  }
	  public void setValue(double value) {
	    this.value = value;
	    notifyObservers();
	  }
}

class TermometerCelsius implements Observer  {
	  public void update(Subject s) {
	    double value = ((Temperature) s).getValue();
	    System.out.println("Celsius: " + value);
	  }
}

class TermometerFahrenheit implements Observer {
	  public void update(Subject s) {
	    double value = 1.8 * ((Temperature) s).getValue() + 32;
	    System.out.println("Fahrenheit: " + value);
	  }
}


