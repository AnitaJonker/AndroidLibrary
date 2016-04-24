<<<<<<< HEAD
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
=======
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
>>>>>>> 3f4401acfd7d3290b2ac0e2f99049c6ccae0b211
