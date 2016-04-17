package factories.booksFactory.impl;

import domain.bookSystem.Books;
import domain.bookSystem.impl.AdultBook;
import domain.bookSystem.impl.BookDetails;
import domain.bookSystem.impl.Kid;
import domain.bookSystem.impl.NonFiction;
import domain.bookSystem.impl.Restricted;
import domain.bookSystem.impl.YoungAdult;
import factories.booksFactory.BookFactory;

/**
 * Created by Anita on 2016/04/16.
 */
public class UseBookFactory implements BookFactory {


    Books book;

    public Books getBook(String bookTitle) {
        BookDetails chain = setUpChain();
       return chain.handleRequest(bookTitle);
    }
    
    public static BookDetails setUpChain(){
        BookDetails adultBook = new AdultBook();
        BookDetails kidBook = new Kid();
        BookDetails nonFiction = new NonFiction();
        BookDetails restricted = new Restricted();
        BookDetails yA = new YoungAdult();
        adultBook.setNextBookType(kidBook);
        kidBook.setNextBookType(nonFiction);
        nonFiction.setNextBookType(restricted);
        restricted.setNextBookType(yA);
        return adultBook;
    }

}

