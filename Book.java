public class Book {
    private final String title;
    private final int releaseYear;
    private final int pages;
    private final Author author;

    public Book(String title, int realiseYear, int pages, Author author) {
        this.title = title;
        this.releaseYear = realiseYear;
        this.pages = pages;
        this.author = author;
    }


    public String getTitle() {
        return title;
    }

    public int getRealiseYear() {
        return releaseYear;
    }

    public int getPages() {
        return pages;
    }

    @Override
    public String toString() {
        return "Book {" +
                "title = '" + title + '\'' +
                ", realiseYear = " + releaseYear +
                ", pages = " + pages +
                ", author = " + author +
                '}';
    }

    public boolean isBig() {
        return getPages() > 500;
    }

    public boolean matches(String word) {
        return word.contains(getTitle()) || word.contains(author.getName()) || word.contains(author.getSurname());
    }

    public int estimatePrice(int price) {
        int priceForPages = pages * 3 * (int) Math.floor(Math.sqrt(author.getRating()));
        return Math.max(price, priceForPages);
    }
}

