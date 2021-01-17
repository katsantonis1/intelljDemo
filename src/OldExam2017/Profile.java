package OldExam2017;

import java.util.HashSet;
import java.util.Set;

public class Profile {

    /** Number of booked shows required to be frequent customer. */
    public static final int FREQUENT_CUSTOMER = 10;

    /** Name of this profile. */
    public final String name;

    /** Chosen shows. */
    private final Set<Show> choices = new HashSet<>();

    /** Preferential genres, i.e., which occur in at least one chosen show. */
    private final Set<Show.Genre> prefs = new HashSet<>();

    /** Constructs a profile for a given name. */
    public Profile(String name) {
        this.name = name;
    }
    /** Adds a show to the choices and preferences of this profile.
     * @return true if the show is new for this profile, false otherwise */
    public boolean addChoice(Show show) {
       boolean result=choices.add(show);
    }

    /** Returns the set of chosen shows. */
    public Set<Show> getChoices() {
        return choices;
    }

    /** Returns the collected preferences in the chosen shows. */
    public Set<Show.Genre> getPrefs() {
        return prefs;
    }

    /** Tests if this profile represents a frequent customer. */
    public boolean isFrequent() {
// To be programmed
    }

}
