package DiagnosticTest3;

import java.util.HashSet;
import java.util.Set;

public class CombinedCriteria implements SearchCriteria {
    private Set<SearchCriteria> criteria = new HashSet<SearchCriteria>();

    public void addCriteria (SearchCriteria criteria) {
        this.criteria.add(criteria);
    }
    public Set<Room> matches(Building b) {
        Set<Room> result = new HashSet<Room>(b.getRooms());
        for (SearchCriteria c : criteria) {
            result.retainAll(c.matches(b));
        }
        return result;
    }
}

