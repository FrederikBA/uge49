import java.util.ArrayList;
import java.util.List;

public class Bibleotek {
    List<Bog> books;

    public Bibleotek() {
        books = new ArrayList<>();
    }
    public void addBook(Bog bog) {
        books.add(bog);
    }

    public List<Bog> getBooks() {
        return books;
    }

    public boolean containsBook(Bog bog) {
        boolean retVal = false;
        for (Bog b : books) {
            if (bog.equals(b.getISBNnr())) {
                retVal = true;
            } else {
                retVal = false;
            }
        }
        System.out.println(books.size());
        return retVal;
    }

}

/*
        if (bog.getISBNnr() == 123) {
            retVal = true;
        } else {
            retVal = false;
        }
 */