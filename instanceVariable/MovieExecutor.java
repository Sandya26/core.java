class MovieExecutor
{
    public static void main(String args[])
    {
        Movie ref = new Movie();
        boolean added= ref.addMovieDetails("Yash");
        System.out.println(added);

        added = ref.addMovieDetails("Darshan");
        System.out.println(added);

        added = ref.addMovieDetails("Sudeep");
        System.out.println(added);

        added = ref.addMovieDetails("Puneeth Rajkumar");
        System.out.println(added);

        added = ref.addMovieDetails("Varun Tej");
        System.out.println(added);

        added = ref.addMovieDetails("Sai Pallavi");
        System.out.println(added);

        added = ref.addMovieDetails("Samantha");
        System.out.println(added);

        added = ref.addMovieDetails("Allu Arjun");
        System.out.println(added);

        added = ref.addMovieDetails("Prabhas");
        System.out.println(added);

        ref.getMovieDetails();
    }
}