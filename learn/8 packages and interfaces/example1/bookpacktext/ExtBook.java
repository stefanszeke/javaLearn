package bookpacktext;

class ExtBook extends bookpack.Book {
    private String publisher;

    public ExtBook(String title, String author, int date, String publisher) {
        super(title, author, date);
        this.publisher = publisher;
    }

    public void show() {
        super.show();
        System.out.println(publisher);
        System.out.println();
    }

    public String getPublisher() { return publisher; }
    public void setPublisher(String p) { publisher = p; }

    // Access to protected members is allowed only within subclasses.
    public String getTitle() { return title; }
    public void setTitle(String t) { title = t; }
    public String getAuthor() { return author; }
    public void setAuthor(String a) { author = a; }

    // The following members are not accessible to a subclass. because they are private.
    // public int getPubDate() { return pubDate; }
    // public void setPubDate(int d) { pubDate = d; }

}