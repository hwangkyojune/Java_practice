//어떤 객체든 받아들일 수 있는 클래스
public class ObjectBox {
    private Object object;
    public void set(Object object){
        this.object = object;
    }
    public Object get(){
        return this.object;
    }
}
