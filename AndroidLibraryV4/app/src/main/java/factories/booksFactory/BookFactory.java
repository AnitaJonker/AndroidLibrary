package factories.booksFactory;

/**
 * Created by Anita on 2016/04/16.
 */

import domain.bookSystem.Books;

public interface BookFactory {
    Books getBook(String bookTitle);
}
