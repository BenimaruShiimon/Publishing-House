public class Book extends Author {
    private final String title;
    private final int realiseYear;
    private final int pages;

    public Book(String name, String surname, int rating, String title, int realiseYear, int pages) {
        super(name, surname, rating);
        this.title = title;
        this.realiseYear = realiseYear;
        this.pages = pages;
    }


    public String getTitle() {
        return title;
    }

    public int getRealiseYear() {
        return realiseYear;
    }

    public int getPages() {
        return pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", realiseYear=" + realiseYear +
                ", pages=" + pages +
                "} " + super.toString();
}


    public String isBig(int pages) {
        if (getPages() > 500) {
            return "Да";
        } else {
            return "Нет";
        }
    }

    public String matches(String word) {
        if (word.contains(getTitle()) || word.contains(getName()) || word.contains(getSurname())) {
            return "Да";
        } else {
            return "Нет";
        }
    }

    public int estimatePrice(int price) {
        int priceForPages = pages * 3 * (int) Math.floor(Math.sqrt(getRating()));
        return (price >= 250) ? priceForPages : 250;
    }
}

