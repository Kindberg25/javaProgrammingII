
import java.util.HashMap;
import java.util.Map;



public class IOU {
    private HashMap<String, Double> iouMap = new HashMap<>();
    
    
    public IOU() {
        
    }
    
    
    public void setSum(String toWhom, double amount) {
        iouMap.put(toWhom, amount);
    }
    
    public double howMuchDoIOweTo(String toWhom) {
        return iouMap.getOrDefault(toWhom, 0.0);
    }
    
}
