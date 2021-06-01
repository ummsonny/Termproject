import kr.ac.konkuk.ccslab.cm.stub.CMClientStub;

public class SimpleCMClient {
	private CMClientStub m_clientStub;
	private CMClientEventHandler m_eventHandler;
	
	public SimpleCMClient() {
		m_clientStub = new CMClientStub();
		m_eventHandler = new CMClientEventHandler();
	}
	
	public static void main(String[] args) {
		SimpleCMClient client = new SimpleCMClient();
		client.m_clientStub.setAppEventHandler(client.m_eventHandler);
		client.m_clientStub.startCM();
		client.m_clientStub.loginCM("hyungsu", "12345");
		
	}
}
