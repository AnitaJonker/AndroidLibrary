package domain.bookSystem.impl;

import domain.bookSystem.Books;

/**
 * Created by Anita on 2016/04/16.
 */
public abstract class BookDetails {

    BookDetails nextType;

    public void setNextBookType(BookDetails nextType) {
        this.nextType = nextType;
    }
    public abstract Books handleRequest(String request);
}
