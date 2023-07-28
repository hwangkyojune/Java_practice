public class ClassPractice {

    String className;
    int classId;
    static String version = "v1.0";

    static{
        version = "v1.1";
    }
    void allNo(){
        System.out.println("No argument, No return");
    }
    int returnOnly(){
        return 1;
    }
    void argumentOnly(int a){
        System.out.println(a);
    }
    int allYes(int a){
        System.out.println("yes argument, Yes return"+a);
        return a;
    }

    static void printVersion(){
        System.out.println(version);
    }

}
