package decorador;

abstract class ChannelDecorator extends Channel{
    protected Channel decoradorCanal;
    
    public ChannelDecorator(Channel decoradorCanal) {
        this.decoradorCanal = decoradorCanal;
    }
}

class ZipChannel extends ChannelDecorator{
	public ZipChannel(Channel decoradorCanal) {
        super(decoradorCanal);
    }
 
    public void send() {
        sendZipChannel();
        decoradorCanal.send();
    }
 
    private void sendZipChannel() {
        System.out.println("Compactando dados para envio");
    }
    
    public void recv() {
    	recvZipChannel();
    	decoradorCanal.recv();
    }
    
    private void recvZipChannel() {
    	System.out.println("Descompactando dados para recebimento");
    }
}

class BufferChannel extends ChannelDecorator{
	public BufferChannel(Channel decoradorCanal) {
        super(decoradorCanal);
    }
 
    public void send() {
        sendBufferChannel();
        decoradorCanal.send();
    }
 
    private void sendBufferChannel() {
        System.out.println("Buffer para envio");
    }
    
    public void recv() {
    	recvBufferChannel();
    	decoradorCanal.recv();
    }
    
    private void recvBufferChannel() {
    	System.out.println("Buffer para recebimento");
    }
}

class LogChannel extends ChannelDecorator{
	public LogChannel(Channel decoradorCanal) {
        super(decoradorCanal);
    }
 
    public void send() {
        sendLogChannel();
        decoradorCanal.send();
    }
 
    private void sendLogChannel() {
        System.out.println("Log de envio");
    }
    
    public void recv() {
    	recvLogChannel();
    	decoradorCanal.recv();
    }
    
    private void recvLogChannel() {
    	System.out.println("Log de recebimento");
    }
}