import java.net.ServerSocket;

public interface ServerService {
    public void CreateClientSocket();
    public String getRequest();
    public void sendResponse(String request);
    public void closeAll();

}
