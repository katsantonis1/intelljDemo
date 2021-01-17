package OldExam2020;

import java.util.Set;

public interface CustomerWish {
    /** Returns all properties of Portfolio p that match
     * the wishes of the customer */
    public Set<Property> matches(Portfolio p);

}
