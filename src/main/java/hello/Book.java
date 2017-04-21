package hello;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by agup101 on 4/21/2017.
 */
@Data
@AllArgsConstructor
public class Book {
    private String isbn;
    private String title;
}
