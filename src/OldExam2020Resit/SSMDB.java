package OldExam2020Resit;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SSMDB {

    private Set<Entry> entries;
    public SSMDB() {
        entries = new HashSet<Entry>();
    }
    /**
     * Returns all entries of the database.
     * @ensures result != null
     */
    public Set<Entry> getEntries() {
        return entries;
    }
    /**
     * Returns a Movie with the title and release year
     * or null if the Movie is not found
     *
     * Implement the method getMovie, which given a title and year, returns a Movie with this
     * title and release year, or null if this Movie does not exist in the database
     */
    public Movie getMovie(String title, int year) {
        Movie movie=null;
        for(Entry b1:entries){
            if((b1 instanceof Movie)&& ((Movie) b1).getReleaseYear()==year && ((Movie) b1).getTitle().equals(title)){

                movie= (Movie) b1;
                break;

            }
        }
        return movie;
    }
    /**
     * Returns a map that contains all the movies that were released
     * in a given year.
     *
     * Implement the method getMovies, which returns a Map that relates each release
     * year with the set of movies released in that year. This means that given a certain key year,
     * getMovies().get(year) returns a set with all movies released in year.
     */
    public Map<Integer, Set<Movie>> getMovies() {
        Map<Integer, Set<Movie>> result = new HashMap<>();
        for (Entry entry : getEntries()) {
            if (entry instanceof Movie) {
                Movie film = (Movie) entry;
                Set<Movie> sameDate = result.get(film.getReleaseYear());
                if (sameDate == null) {
                    sameDate = new HashSet<Movie>();
                    sameDate.add((Movie) entry);
                    result.put(film.getReleaseYear(), sameDate);
                }
                else {
                    result.put(film.getReleaseYear(), sameDate);
                }
            }
        }
        return result;


    }
    /**
     * Returns the entry with the best (highest) rating that is smaller
     * or equal to a certain given rating or null if no entry satisfies
     * this condition.
     */
    public Entry getBest(double highest) {
    Entry result=null;
    double best=1;
    for(Entry entry : getEntries()){
        double rating = entry.getAverrageRating();
        if (rating >= best && rating <= highest) {
            result = entry;
            best = rating;
        }
    }
        return result;

    }

    public void addEntry(Entry entry) {
        entries.add(entry);
    }

}
