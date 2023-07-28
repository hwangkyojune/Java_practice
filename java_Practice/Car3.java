public abstract class Car3 {
    String name ;
    public Car3(String name){
        this.name = name;
        System.out.println("This car name is "+this.name);
    }

    public abstract void run();

}
