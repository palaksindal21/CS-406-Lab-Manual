public class Class {
    private String color;
    private String model;
    public Class(String color, String model){
        this.color=color;
        this.model=model;
    }
    public void give(){
        System.out.println("Car Color: "+color+"Model: "+model);
    }
    public static void main(String[] args) {
        Class c=new Class("White ", "City");
        c.give();
    }
}
