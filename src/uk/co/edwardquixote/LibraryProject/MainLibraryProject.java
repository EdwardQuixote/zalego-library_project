package uk.co.edwardquixote.LibraryProject;

import java.util.Random;
import java.util.Scanner;
import uk.co.edwardquixote.LibraryProject.Scroll.ScrollClass;
import uk.co.edwardquixote.LibraryProject.Search.SearchBook;

/**
 *
 * @author edwar
 */
public class MainLibraryProject {
    
    private String userFullName;
    private String userStudentId;
    private String userStudentCourse;
    
    
    public static void main(String[] args) {
        
        System.out.println("Hello World, Welcome to LibraryProject!");
        
        MainLibraryProject classMain = new MainLibraryProject();
        classMain.captureBasicUserData();
        
    }
    
    private void captureBasicUserData() {
        
        Scanner scanUserData = new Scanner(System.in);
        
        System.out.println("Please provide the following details:");
        
        System.out.println("What's your full name?");
        this.userFullName = scanUserData.next();
        
        System.out.println("What's your Student ID Number?");
        this.userStudentId = scanUserData.next();
        
        System.out.println("What course are you taking?"
                + "\n1) Java"
                + "\n2) Digital Media"
                + "\n3) Information Security"
                + "\n4) Data Science");
        this.userStudentCourse = scanUserData.next();
        
        Random classRandomNumberGenerator = new Random(99999);
        int uniqueSessionId = classRandomNumberGenerator.nextInt();
        String randomSessionId = this.userStudentId + "#" + uniqueSessionId;
        
        System.out.println("Here's your session ID: " + randomSessionId);
        
        confirmWithUserIfSearchOrScroll();
        
    }
    
    public void confirmWithUserIfSearchOrScroll() {
        
        Scanner scanSearchOrScroll = new Scanner(System.in);
        
        System.out.println("Would you like to search for a book or"
                + " scroll through our list of available books? (Search/Scroll)");
        String searchOrScroll = scanSearchOrScroll.next();
        
        System.err.println("searchOrScroll: " + searchOrScroll);     //  TODO: For Testing ONLY
        
        String trimmedSearchOrScroll = searchOrScroll.trim();
        
        System.err.println("trimmedSearchOrScroll: " + trimmedSearchOrScroll);     //  TODO: For Testing ONLY
        
        if (trimmedSearchOrScroll.equalsIgnoreCase("")) {
            
            System.out.println("Please specify either search or scroll!");
            
            confirmWithUserIfSearchOrScroll();
            
        } else if (trimmedSearchOrScroll.equalsIgnoreCase("Search")) {
            
            System.err.println("SEARCH selected!");     //  TODO: For Testing ONLY
            
            SearchBook classSearchBook = new SearchBook();
            classSearchBook.searchAvailableBook();
            
        } else if (trimmedSearchOrScroll.equalsIgnoreCase("Scroll")) {
            
            ScrollClass classScrollBooks = new ScrollClass();
            classScrollBooks.scrollThroughAvailableBooks();
            
        } else {
            
            System.out.println("Please specify either search or scroll!");
            
            confirmWithUserIfSearchOrScroll();
            
        }
        
    }
    
}
