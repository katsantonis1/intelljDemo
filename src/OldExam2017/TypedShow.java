package OldExam2017;

import java.util.Set;

public interface TypedShow extends Show{

    /**
     * @requires genre !=null
     * @ensures  getGenres().contains(genre)
     */
    public void  addGenre(Genre genre);

    /**
     * @pure
     * @ensures result !=null;
     */
    public Set<Genre> getGenre();

}
