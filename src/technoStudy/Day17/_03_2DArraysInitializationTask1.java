package technoStudy.Day17;

public class _03_2DArraysInitializationTask1 {
    // given following arrays
    // create two dimensional array to hold all the movies
    // count the number of movies => 8 movies
    // count the number of characters in each movie name
    public static void main(String[] args) {
        String[] comics = {"Marvel", "DC"};
        String[] fiction = {"The Lord of the rings", "Star war", "Harry Potter"};
        String[] classics = {"War and peace", "Anna Karenina", "Faust"};

        String[][] movies = {{"Marvel", "DC"}, {"The Lord of the rings", "Star war", "Harry Potter"}, {"War and peace", "Anna Karenina", "Faust"}};

        int totalCount = 0;
        for (int i = 0; i < movies.length; i++) {
            totalCount += movies[i].length; // number of movies inside the list
        }
        System.out.println("total number of movies: " + totalCount);

        for (int i = 0; i < movies.length; i++) {
            for (int j = 0; j < movies[i].length; j++) {
                String movie = movies[i][j];
                System.out.println(movie + " -> " + movie.length());
            }
        }
    }
}
