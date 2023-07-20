public class Book {
    //필드는 직접 참조하는 것보다 은닉하는 것이 좋음 public 대신 private를 사용하면 외부에서 직접적으로 사용 불가
    private int price = 5;

    public int getPrice(){
        return this.price;
    }

    public void setPrice(int price){
        this.price = price ;
    }

}
