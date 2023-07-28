public class GenericPractice<T> {
    private T object ;
    public GenericPractice(T object){
        this.object = object;
    }

    public T getObject() {
        return object;
    }
}
