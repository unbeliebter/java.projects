package bike;

public class EBike {
    
    public String color;
    public boolean gangChange; 
    private int gang; 
    
    public EBike() {
        color = "red"; 
        gangChange = true; 
        setgang(4); 
    }
    
    public EBike(int gang) {
        setgang(gang);
    }
    
    public void setgang(int gang) {
        this.gang = gang;
    }
    
    public int getgang() {
        return gang;
    }
    
    public void gangChanger(boolean change) {
        this.gangChange = change; 
    }
}

        
