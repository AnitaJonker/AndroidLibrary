<<<<<<< HEAD
package domain.bookSystem;

import java.io.Serializable;

/**
 * Created by Anita on 2016/04/16.
 */
public class Books implements Serializable {
    private long id;
    private String bookTitle;
    private String author;
    private int pages;
    private String publisher;
    private String  iSBN;


    private Books()
    {

    }
    public long getId() {
        return id;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getiSBN() {
        return iSBN;
    }


    public Books(Builder builder)
    {   this.id = builder.id;
        this.bookTitle = builder.bookTitle;
        this.author = builder.author;
        this.pages = builder.pages;
        this.publisher = builder.publisher;
        this.iSBN = builder.iSBN;
    }


    public static class Builder
    {
        private long id;
        private String bookTitle;
        private String author;
        private int pages;
        private String publisher;
        private String  iSBN;

        public Builder id(Long value) {
            this.id = value;
            return this;
        }

        public Builder bookTitle(String bookTitle)
        {
            this.bookTitle = bookTitle;
            return this;
        }

        public Builder author(String author)
        {
            this.author = author;
            return this;
        }

        public Builder pages(int pages)
        {
            this.pages = pages;
            return this;
        }
        public Builder publisher(String publisher)
        {
            this.publisher = publisher;
            return this;
        }

        public Builder iSBN(String iSBN)
        {
            this.iSBN = iSBN;
            return this;
        }

        public Builder copy(Books value) {
            this.id = value.id;
            this.bookTitle = value.bookTitle;
            this.author = value.author;
            this.pages = value.pages;
            this.publisher = value.publisher;
            this.iSBN = value.iSBN;
            return this;
        }

        public Books build()
        {
            return new Books(this);
        }

    }
}
=======
package domain.bookSystem;

/**
 * Created by Anita on 2016/04/16.
 */
public class Books {
    private Long id;
    private String bookTitle;
    private String author;
    private int pages;
    private String publisher;
    private String  iSBN;


    private Books()
    {

    }

    private Books(Builder builder)
    {
        this.bookTitle = builder.bookTitle;
        this.author = builder.author;
        this.pages = builder.pages;
        this.publisher = builder.publisher;
        this.iSBN = builder.iSBN;
    }

    public Long getId() {
        return id;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getiSBN() {
        return iSBN;
    }


    public static class Builder
    {
        private Long id;
        private String bookTitle;
        private String author;
        private int pages;
        private String publisher;
        private String  iSBN;

        public Builder bookTitle(String bookTitle)
        {
            this.bookTitle = bookTitle;
            return this;
        }

        public Builder author(String author)
        {
            this.author = author;
            return this;
        }

        public Builder pages(int pages)
        {
            this.pages = pages;
            return this;
        }
        public Builder publisher(String publisher)
        {
            this.publisher = publisher;
            return this;
        }

        public Builder iSBN(String iSBN)
        {
            this.iSBN = iSBN;
            return this;
        }

        public Books build()
        {
            return new Books(this);
        }

    }
}
>>>>>>> 3f4401acfd7d3290b2ac0e2f99049c6ccae0b211
