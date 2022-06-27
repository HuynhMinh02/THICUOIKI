package baithicuoiki.entity;

public class Book {
    String bookId;
    String title;
    String author;
    String publisher;
    String publishyear;
    double rating;
    int amount;
    String kind;

    public Book() {
    }

    public Book(String bookId, String title, String author, String publisher, String publishyear, double rating,
            int amount, String kind) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.publishyear = publishyear;
        this.rating = rating;
        this.amount = amount;
        this.kind = kind;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPublishyear() {
        return publishyear;
    }

    public void setPublishyear(String publishyear) {
        this.publishyear = publishyear;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Titel: " + this.getTitle() + "Code: " + this.getBookId() + "Kind: "
                + this.getKind() + "Author: " + this.getAuthor() + "Publishing House: " + this.getPublisher()
                + " Publishing year: " + this.getPublishyear() + "Amount: " + this.getAmount() + "Rating: "
                + this.getRating();
    }
}
