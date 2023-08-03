import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class MyServerSevice implements ServerService{
    public ServerSocket serverSocket;
    private Socket clientSocket;
    private PrintWriter pw;
    private BufferedReader br;
    private BufferedReader bfr;

    public MyServerSevice(ServerSocket serverSocket) {
        this.serverSocket = serverSocket;
    }

    @Override
    public void CreateClientSocket() {
        try{
            System.out.println("클라이언트 접속을 기다립니다...");
            this.clientSocket = serverSocket.accept();
            System.out.println("클라이언트 접속");

        }catch(Exception e){
            e.printStackTrace();
        }

    }
    public void setIO(){
        try{
            pw = new PrintWriter(new OutputStreamWriter(this.clientSocket.getOutputStream()));
            br = new BufferedReader(new InputStreamReader(this.clientSocket.getInputStream()));
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    @Override
    public String getRequest() {
        String firstLine=null;
        String nextLine=null;
        ArrayList<String> header = new ArrayList<>() ;
        try{
            firstLine = br.readLine();
            while(!(nextLine = br.readLine()).equals("")){
                header.add(nextLine);
            }
        }catch(Exception e){
            e.printStackTrace();
            System.exit(0);
        }

        return firstLine;
    }

    @Override
    public void sendResponse(String request) {
        pw.println("HTTP/1.1 200 OK");
        pw.println("Date: Thu, 09 Dec 2004 12:07:48 GMT");
        pw.println("Server: IBM_CICS_Transaction_Server/3.1.0(zOS)");
        pw.println("");
        this.bfr = null;
        try{
            bfr = new BufferedReader(new FileReader("d"));
            String line;
            while((line=bfr.readLine())!=null){
                pw.println(line);
            }
        }catch(Exception e){
            e.printStackTrace();
        }

        pw.flush();
    }

    @Override
    public void closeAll() {

        try{
            this.pw.close();
            this.br.close();
            this.clientSocket.close();
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
