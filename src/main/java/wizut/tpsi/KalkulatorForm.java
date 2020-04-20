package wizut.tpsi;


public class KalkulatorForm {
    
    private String operacja;
    private Integer x;
    private Integer y;
    
    public void setOperacja(String operacja){
        this.operacja = operacja;
    }
    
    public String getOperacja(){
        return this.operacja;
    }
    
    public void setx(Integer x){
        this.x = x;
    }
    
    public Integer getx(){
        return this.x;
    }
    
    public void sety(Integer y){
        this.y = y;
    }
    
    public Integer gety(){
        return this.y;
    }
    
    public Integer getWynik(){
        Integer wynik= 0;
        /* przepisac kod z CalculatorControllera */
        return wynik;
    }
    
}
