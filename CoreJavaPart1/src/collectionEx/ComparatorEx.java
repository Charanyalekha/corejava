package collectionEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Movie{
	String movieName;
	int movieYear;
	double rating;
	public Movie(String movieName,int movieYear,double rating) {
		this.movieName=movieName;
		this.movieYear=movieYear;
		this.rating=rating;
	}
	@Override
	public String toString() {
		return "Movie [movieName=" + movieName + ", movieYear=" + movieYear + ", rating=" + rating + "]";
	}
	
}
class SortByYear implements Comparator<Movie>{

	@Override
	public int compare(Movie o1, Movie o2) {
		
		return o1.movieYear-o2.movieYear;
	}
	
}
class SortByName implements Comparator<Movie>{

	@Override
	public int compare(Movie o1, Movie o2) {
		
		return o1.movieName.compareTo(o2.movieName);
	}
	
}
class SortByRating implements Comparator<Movie>{

	@Override
	public int compare(Movie o1, Movie o2) {
		
		return Double.compare(o1.rating, o2.rating);
	}
	
}

public class ComparatorEx {

	public static void main(String[] args) {
		ArrayList<Movie> list=new ArrayList<Movie>();
		list.add(new Movie("DDL", 2000, 4.3));
		list.add(new Movie("SITARAMAM", 1997, 3.5));
		list.add(new Movie("KGF", 2010, 2.7));
		list.add(new Movie("ADI", 1998, 5.0));
		Collections.sort(list,new SortByYear());
        //Collections.sort(list,new SortByName());
		//Collections.sort(list,new SortByRating());
		Collections.reverse(list);
		for(Movie m:list) {
			System.out.println(m);
		}

	}

}
