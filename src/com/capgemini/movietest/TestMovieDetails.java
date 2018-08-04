package com.capgemini.movietest;

import com.capgemini.movie.MovieDetails;
import com.capgemini.movie.MovieDetailsList;

// an exception class which will be thrown when movie wil not be found
class MovieNotFoundException extends Exception{
	public MovieNotFoundException(String message) {
		super(message);
		}
}
//class to test the methods of MovieDetailsList by which we can add, remove, find and display the objects of treeset of type MovieDetails
public class TestMovieDetails {
	
	public static void main(String[] args) throws MovieNotFoundException{
		//initiating the object of MovieDetailList to access its method
		MovieDetailsList details = new MovieDetailsList();
		
		//adding the objects to the treeset
		details.addMovie(new MovieDetails("Dangal", "Aamir", "A girl", "biopic"));
		details.addMovie(new MovieDetails("K3G", "SRK", "PZ", "romance"));
		details.addMovie(new MovieDetails("Koi mil gya", "Hritik", "PZ", "drama"));
		details.addMovie(new MovieDetails("Bahubali", "Prabhas", "A Woman", "action"));
		
		//finding movie by its name
		boolean checkByName = details.findByName("Dangal");
		
		try {
			if(checkByName)
		
			System.out.println("Movie found");
		else
			throw new MovieNotFoundException("Movie not found.");			
		} catch(MovieNotFoundException e) {
			e.printStackTrace();
		}
		
		//finding movie by its genre
		boolean checkByGenre = details.findByGenre("romance");
		
		try {
	
			if(checkByGenre)
				System.out.println("Movie found");
			else
				throw new MovieNotFoundException("Movie not found.");
		}catch(MovieNotFoundException e) {
			e.printStackTrace();
		}
		
		//deleting the movie by giving its name
		boolean movieDel = details.removeMovie("Dangal");
		
		try {
			if(movieDel)
				System.out.println("Dangal deleted.");
			else
				throw new MovieNotFoundException("Movie not found");
		} catch(MovieNotFoundException e) {
			e.printStackTrace();
		}
			
		
		//displaying the treeset
		details.display();
		
		//deleting all the movies
		details.removeAll();
		
		//displaying the treeset
		details.display();
	}
}
