<<<<<<< HEAD
package domain.bookSystem.impl;


import domain.bookSystem.Books;
import domain.bookSystem.RegisterBook;

/**
 * Created by student on 2016/03/31.
 */
public class Kid extends BookDetails implements RegisterBook {
    public Books registerBook()
    {
        Books kidsBook = new Books.Builder()
                .bookTitle("Charlie and the chocolate factory.")
                .author("Roald Dahl")
                .pages(150)
                .publisher("Penguin Books")
                .build();
        return kidsBook;

    }
    public Books handleRequest(String request) {
        if(request.equalsIgnoreCase("Kid")){
            return registerBook();
        }else{
            if (request!=null) {
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
 * Created by student on 2016/03/31.
 */
public class Kid extends BookDetails implements RegisterBook {
    public Books registerBook()
    {
        Books kidsBook = new Books.Builder()
                .bookTitle("Charlie and the chocolate factory.")
                .author("Roald Dahl")
                .pages(150)
                .publisher("Penguin Books")
                .build();
        return kidsBook;

    }
    public Books handleRequest(String request) {
        if(request.equalsIgnoreCase("Kid")){
            return registerBook();
        }else{
            if (request!=null) {
                return nextType.handleRequest(request);
            }
            return null;
        }
    }
}
>>>>>>> 3f4401acfd7d3290b2ac0e2f99049c6ccae0b211
