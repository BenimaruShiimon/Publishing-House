public class Author {
    private final String name;
    private final String surname;
    private final int rating;

    public Author(String name, String surname, int rating) {
        this.name = name;
        this.surname = surname;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Author {" +
                "name = '" + name + '\'' +
                ", surname = '" + surname + '\'' +
                ", rating = " + rating +
                '}';
    }
}
