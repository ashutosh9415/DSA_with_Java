public class GettersAndSetters {

    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        p1.setColor("yellow");
        System.out.println(p1.getColor());
    }
    
}
class Pen{
    private String color;
    private int tip;

    String getColor(){
        return this.color;  // return type value.
    } 

    int getTip(){
        return this.tip;
    }

    void setColor(String c){  //modify the value.
        color = c;
    }
    void setTip(int tip){
        this.tip = tip;
    }
}

