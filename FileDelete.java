import java.io.File;

public class FileDelete {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("파일 삭제법 : 클래스명 파일명");
            System.exit(0);
        }
        File f = new File(args[0]);
        if (f.exists()) {
            boolean deleteflag = f.delete();
            if(deleteflag == true) System.out.println("삭제 성공");
            else System.out.println("삭제실패");
        } else {
            System.out.println("파일을 찾을 수 없습니다.");
        }
    }
}
