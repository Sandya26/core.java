class Movie
{
    String movieNames[] = new String[6];
    int index;
    public boolean addMovieDetails(String movieName)
    {
        boolean isMovieDetailsAdded = false;
        if(movieName != null && !movieName.isEmpty())
        {
            if(index < movieNames.length)
            {
                movieNames[index++] = movieName;
                isMovieDetailsAdded = true;
            }
            else
            {
                System.out.println("Movie list is full");
            }
        }
        else
        {
            System.out.println(movieName + " is invalid");
        }

        return isMovieDetailsAdded;
    }

    public void getMovieDetails()
    {
        System.out.println("Movie Details:");

        for(String movieName : movieNames)
        {
            System.out.println(movieName);
        }
    }
}