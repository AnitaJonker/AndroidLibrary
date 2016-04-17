package domain.bookSystem.impl;

import domain.bookSystem.Books;
import domain.bookSystem.RegisterBook;

/**
 * Created by Anita on 2016/04/16.
 */
public class Restricted extends BookDetails implements RegisterBook {

    public Books registerBook()
    {
        Books restricted = new Books.Builder()
                .bookTitle("Charlie and the chocolate factory.")
                .author("Roald Dahl")
                .pages(150)
                .publisher("Penguin Books")
                .build();
        return restricted;
    }
    public Books handleRequest(String request) {
        if (request.equalsIgnoreCase("Restricted")) {
            return registerBook();
        } else {
            if (request != null) {
                return nextType.handleRequest(request);
            }
            return null;
        }
    }

}
