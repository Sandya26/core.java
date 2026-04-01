class Movie {
    int movieId;
    String movieName;
    String genre;
    String director;
    int releaseYear;
    Actor actor;
    public void getMovieDetails() {
        System.out.println("the movie Id is " + movieId);
        System.out.println("the movie Name is " + movieName);
        System.out.println("the movie genre is " + genre);
        System.out.println("the movie director is " + director);
        System.out.println("the movie releaseYear is " + releaseYear);
		System.out.println("-------");
        actor.getActorDetails();
    }
}