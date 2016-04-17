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
