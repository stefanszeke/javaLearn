package bookpack;


public class Book {
    protected String title;
    protected String author;
    private int pubDate;

    public Book(String title, String author, int date) {
        this.title = title;
        this.author = author;
        this.pubDate = date;
    }

    public void show() {
        System.out.println(title);
        System.out.println(author);
        System.out.println(pubDate);
        System.out.println();
    }
}