package uk.co.edwardquixote.LibraryProject.Search;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import uk.co.edwardquixote.LibraryProject.MainLibraryProject;

/**
 *
 * @author edwar
 */
public class SearchBook {

    private List<String> listOfAvailbleBooks;

    public SearchBook() {
        this.listOfAvailbleBooks = this.generateListOfAvailableBooks();
    }

    public void searchAvailableBook() {

        Scanner scanSearchBook = new Scanner(System.in);

        System.out.println("What's the name of the book you want to search?");

        String userSearchBookQuery = scanSearchBook.next();
        if (userSearchBookQuery.equalsIgnoreCase("")) {

            System.out.println("Please provide a name!");
            searchAvailableBook();

        } else {

            List<String> listSearchResults = new ArrayList<>();

            for (int counter = 0; counter < listOfAvailbleBooks.size(); counter++) {

                String bookNameInList = listOfAvailbleBooks.get(counter);
                if (bookNameInList.toLowerCase(Locale.getDefault()).contains(userSearchBookQuery.toLowerCase(Locale.getDefault()))) {

                    listSearchResults.add(bookNameInList);

                }

                if (counter == (listOfAvailbleBooks.size() - 1)) {

                    this.printOutSearchResults(listSearchResults);

                }

            }

        }

    }

    private ArrayList<String> generateListOfAvailableBooks() {

        ArrayList<String> books = new ArrayList<>();
        books.add("Fifty Shades of Grey");
        books.add("After");
        books.add("Passage");
        books.add("Love & Key");
        books.add("Love at First Sight");
        books.add("River & The Source");
        books.add("Creatures of The Night");
        books.add("Utengano");

        return books;
    }

    private void printOutSearchResults(List<String> searchResults) {

        if (searchResults.size() <= 0) {

            System.out.println("No books found please try again.");

            MainLibraryProject classMain = new MainLibraryProject();
            classMain.confirmWithUserIfSearchOrScroll();

        } else {

            System.out.println("Here are the search results:");
            for (String searchResult : searchResults) {
                System.out.println(searchResult);
            }

        }

    }

}
