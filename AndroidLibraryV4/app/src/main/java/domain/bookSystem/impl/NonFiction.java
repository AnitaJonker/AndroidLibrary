<<<<<<< HEAD
package domain.bookSystem.impl;

import domain.bookSystem.Books;
import domain.bookSystem.RegisterBook;

/**
 * Created by Anita on 2016/04/16.
 */
public class NonFiction extends BookDetails implements RegisterBook {

    public Books registerBook() {
        Books nonFiction = new Books.Builder()
                .bookTitle("Charlie and the chocolate factory.")
                .author("Roald Dahl")
                .pages(150)
                .publisher("Penguin Books")
                .build();
        return nonFiction;

    }

    public Books handleRequest(String request) {
        if (request.equalsIgnoreCase("nonFiction")) {
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
public class NonFiction extends BookDetails implements RegisterBook {

    public Books registerBook() {
        Books nonFiction = new Books.Builder()
                .bookTitle("Charlie and the chocolate factory.")
                .author("Roald Dahl")
                .pages(150)
                .publisher("Penguin Books")
                .build();
        return nonFiction;

    }

    public Books handleRequest(String request) {
        if (request.equalsIgnoreCase("nonFiction")) {
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
