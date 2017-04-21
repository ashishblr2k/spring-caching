package hello;

/**
 * Created by agup101 on 4/21/2017.
 */
public interface BookRepository {

    Book getByIsbn(String isbn);

}
