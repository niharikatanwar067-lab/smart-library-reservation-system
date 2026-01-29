import java.util.HashMap;
import java.util.Map;

public class DemandAnalyzer {

    private HashMap<String, Integer> demandMap;

    public DemandAnalyzer() {
        demandMap = new HashMap<>();
    }

    public void recordRequest(String bookTitle) {
        demandMap.put(bookTitle, demandMap.getOrDefault(bookTitle, 0) + 1);
    }

    public String getMostDemandedBook() {
        String mostDemanded = null;
        int maxCount = 0;

        for (Map.Entry<String, Integer> entry : demandMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostDemanded = entry.getKey();
            }
        }
        return mostDemanded;
    }

    public int getDemandCount(String bookTitle) {
        return demandMap.getOrDefault(bookTitle, 0);
    }
}
