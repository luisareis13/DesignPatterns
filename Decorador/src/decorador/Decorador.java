package decorador;

public class Decorador {

	public static void main(String[] args) {
		Channel canal1 = new ZipChannel(new TCPChannel());
		canal1.send();
		
		Channel canal2 = new BufferChannel(new UDPChannel());
		canal2.recv();
		
		Channel canal3 = new LogChannel(new TCPChannel());
		canal3.recv();
	}

}
