import java.net.ServerSocket;

public class MyServerMain {
    public static void main(String[] args) {
        ServerSocket ss = null;
        try{
            ss = new ServerSocket(9090);
        }catch(Exception e){
            e.printStackTrace();
        }

        MyServerSevice ms = new MyServerSevice(ss);
        ms.CreateClientSocket();
        ms.setIO();
        String request = ms.getRequest();
        ms.sendResponse(request);
        ms.closeAll();


    }

}
