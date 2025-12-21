public class Encapsulation {
    
}
class Pen{
    private String color;  //it is data
    private int tip;

    String getColor(){     // it is method.
        return this.color;  
    } 

    int getTip(){
        return this.tip;
    }

    void setColor(String c){ 
        color = c;
    }
    void setTip(int tip){
        this.tip = tip;
    }
}