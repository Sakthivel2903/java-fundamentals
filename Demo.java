class Clothing{
    private float cost;

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
}
    
    public class Demo extends Clothing {
    private int _neckSize;
    public int getNeckSize(){
       return _neckSize;
    }
    public void setNeckSize(int nSize){
        this._neckSize = nSize;
    }
    
    public static void main(String [] args){
        Demo de = new Demo();
        de.setCost(350);
        System.out.println(de.getCost());
        
        
    }
    } 
