package Annotations;

import org.springframework.beans.factory.annotation.Required;

public class SimpleMovieListener 
{
	private MovieFinder movieFinder;

	public MovieFinder getMovieFinder() {
		return movieFinder;
	}
   @Required
	public void setMovieFinder(MovieFinder movieFinder) {
		this.movieFinder = movieFinder;
	}
	
	public void ShowMovieFinder()
	{
		System.out.println("Movie to find is"+this.movieFinder.getMovieName());
	}

}
