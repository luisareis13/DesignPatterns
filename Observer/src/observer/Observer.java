package observer;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public interface Observer {
	  public void update(Subject s);
}

class Subject {
	  private List observers = new LinkedList();
	  public void addObserver(Observer observer) {
	    observers.add(observer);
	  }
	  public void removeObserver(Observer observer) {
	    observers.remove(observer);
	  }
	  public void notifyObservers() {
	    Iterator it = observers.iterator();
	    while (it.hasNext()) {
	      Observer obs= (Observer) it.next();
	      obs.update(this); 
	    }
	  }
}