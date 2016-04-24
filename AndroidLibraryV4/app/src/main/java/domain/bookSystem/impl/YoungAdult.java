<<<<<<< HEAD
package domain.bookSystem.impl;

import domain.bookSystem.Books;
import domain.bookSystem.RegisterBook;

/**
 * Created by Anita on 2016/04/16.
 */
public class YoungAdult extends BookDetails implements RegisterBook {

    public Books registerBook()
    {
        Books yA = new Books.Builder()
                .bookTitle("The fault in our stars.")
                .author("John Green")
                .pages(340)
                .publisher("Dutton Penguin")
                .build();
        return yA;

    }
    public Books handleRequest(String request) {
        if (request.equalsIgnoreCase("YA")) {
            return registerBook();
        } else {
            if (request != null) {
                return nextType.handleRequest(request);
            }
            return null;
        }
    }

}
=======
package domain.bookSystem.impl;

import domain.bookSystem.Books;
import domain.bookSystem.RegisterBook;

/**
 * Created by Anita on 2016/04/16.
 */
public class YoungAdult extends BookDetails implements RegisterBook {

    public Books registerBook()
    {
        Books yA = new Books.Builder()
                .bookTitle("The fault in our stars.")
                .author("John Green")
                .pages(340)
                .publisher("Dutton Penguin")
                .build();
        return yA;

    }
    public Books handleRequest(String request) {
        if (request.equalsIgnoreCase("YA")) {
            return registerBook();
        } else {
            if (request != null) {
                return nextType.handleRequest(request);
            }
            return null;
        }
    }

}
>>>>>>> 3f4401acfd7d3290b2ac0e2f99049c6ccae0b211
