import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        Book b1 = new Book(1, "The Monk", "Monkey Sing", 101, 5);
        //adding books to the list
        bookList.add(b1);

        bookList.add(new Book(2, "Rich Son Poor Son", "Sunny Ming", 112, 6));
        bookList.add(new Book(3, "Lullabay", "Sunny Ming", 112, 6));
        bookList.add(new Book(4, "Tom & Harry", "Sunny Ming", 112, 6));
        bookList.add(new Book(5, "Nutan", "Sunny Ming", 112, 6));
        bookList.add(new Book(6, "Money Money", "Sunny Ming", 112, 6));

        //Displaying all books in the list
        for(Book book : bookList){System.out.println(book);}

        /*
        Map<Integer, Book> bookMap = new HashMap<>();

        bookMap.put(1, new Book(1, "Money Money", "Monkey Ming", 112, 6));
        bookMap.put(2, new Book(2, "Lullabay", "Tuna Buna", 112, 6));
        bookMap.put(3, new Book(3, "Tom & Harry", "Sento Ming", 112, 6));
        bookMap.put(4, new Book(4, "Nutan", "Pluto Fulto", 112, 6));
        bookMap.put(5, new Book(5, "Rich Son Poor Son", "Sunny Ming", 112, 6));

        //Displaying all books in the map
        System.out.println("List of Books:");
        for (Book book : bookMap.values()) {
            System.out.println(book);
        }

        //Example: Searching for a book by bookId
        int searchId = 2;
        Book foundBook = bookMap.get(searchId);
        if (foundBook != null){
            System.out.println("Book found: "+ foundBook);
        }else{
            System.out.println("Book with ID "+ searchId + " not found.");
        }
        */
        
    }
}
