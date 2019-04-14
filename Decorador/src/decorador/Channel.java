package decorador;

abstract class Channel {
	public abstract void send();
    public abstract void recv();
}

class TCPChannel extends Channel { 
	public void send() {
		System.out.println("Enviando TCP");
	}
    public void recv() {
    	System.out.println("Recebendo TCP");
    }
}

class UDPChannel extends Channel { 
	public void send() {
		System.out.println("Enviando UDP");
	}
    public void recv() {
    	System.out.println("Recebendo UDP");
    }
}
