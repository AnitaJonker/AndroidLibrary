package domain.members;

/**
 * Created by Anita on 2016/04/16.
 */
public class MemberDetails {
    private Long id;
    private String name;
    private String surname;
    private String address;
    private String libraryBranch;
    private String cardNumber;

    private MemberDetails()
    {


    }

    private MemberDetails(Builder builder)
    {
        this.name = builder.name;
        this.surname = builder.surname;
        this.address = builder.address;
        this.libraryBranch = builder.libraryBranch;
        this.cardNumber = builder.cardNumber;

    }


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }


    public String getAddress() {
        return address;
    }


    public String getLibraryBranch() {
        return libraryBranch;
    }


    public String getCardNumber() {
        return cardNumber;
    }


    public static class Builder {
        private Long id;
        private String name;
        private String surname;
        private String address;
        private String libraryBranch;
        private String cardNumber;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder surname(String surname) {
            this.surname = surname;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder libraryBranch(String libraryBranch) {
            this.libraryBranch = libraryBranch;
            return this;
        }

        public Builder cardNumber(String cardNumber) {
            this.cardNumber = cardNumber;
            return this;
        }

        public MemberDetails build()
        {
            return new MemberDetails(this);
        }




    }

}

