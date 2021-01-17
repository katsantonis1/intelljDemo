package DiagnosticTest3;

import java.util.Set;

public interface SearchCriteria {

    /** Returns all rooms of Building b that match
     * the search criteria */
    public Set<Room> matches(Building b);

}


