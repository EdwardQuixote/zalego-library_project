package uk.co.edwardquixote.LibraryProject.Scroll;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author edwar
 */
public class ScrollClass {
    
    private ArrayList<String> listOfGenres;
    private ArrayList<String> romanceBooks;
    
    public ScrollClass() {
        
        this.listOfGenres = this.generateArrayListOfGenres();
        this.romanceBooks = new ArrayList<>();
        romanceBooks.add("Fifty Shades of Grey");
        romanceBooks.add("After");
        
    }
    
    private ArrayList<String> generateArrayListOfGenres() {
        
        ArrayList<String> genres = new ArrayList<>();
        genres.add("Romance");
        genres.add("Sci-fi");
        genres.add("Drama");
        genres.add("Thriller");
        
        return genres;
    }
    
    public void scrollThroughAvailableBooks() {
        
        System.out.println("Please select a genre:");
        for (String genre : listOfGenres) {
            System.out.println(genre);
        }
        
        Scanner scanGenre = new Scanner(System.in);
        String userGenre = scanGenre.next();
        
        for (int counter = 0; counter < listOfGenres.size(); counter++) {
            
            if (userGenre.equalsIgnoreCase(listOfGenres.get(0))) {
                //  Romance
                
                this.scrollThroughAvailableRomanceBooks();
                
            } else if (userGenre.equalsIgnoreCase(listOfGenres.get(1))) {
                //  Sci-fi
                
                this.scrollThroughAvailableSciFiBooks();
                
            } else if (userGenre.equalsIgnoreCase(listOfGenres.get(2))) {
                //  Drama
                
                this.scrollThroughAvailableDramaBooks();
                
            } else if (userGenre.equalsIgnoreCase(listOfGenres.get(3))) {
                //  Thriller
                
                this.scrollThroughAvailableThrillerBooks();
                
            }
            
        }
        
    }
    
    private void scrollThroughAvailableRomanceBooks() {
        
        for (String romanceBook : this.romanceBooks) {
            System.out.println(romanceBook);
        }
        
    }
    
    private void scrollThroughAvailableSciFiBooks() {
        
    }
    
    private void scrollThroughAvailableDramaBooks() {
        
    }
    
    private void scrollThroughAvailableThrillerBooks() {
        
    }
    
    
}
