public class Client {
    /*
        Folder Structure:

        Movies
            |- Inception
            |- Intersteller
            |- Horror Movies
                |- Conjuring
                |- Anabelle
                |- Comedy Movie
                    |-Hangout
            |- Matrix
     */

    public static void main(String[] args) {
        Folder movies = new Folder("Movies");

        File inception = new File("Inception");
        File intersteller = new File("Intersteller");

        movies.addFileSystem(inception);
        movies.addFileSystem(intersteller);

        Folder horror = new Folder("Horror Movies");

        File conjuring = new File("Conjuring");
        File anabelle = new File("Anabelle");

        horror.addFileSystem(conjuring);
        horror.addFileSystem(anabelle);

        Folder comedy = new Folder("Comedy Movie");
        File hangout = new File("Hangout");

        comedy.addFileSystem(hangout);
        horror.addFileSystem(comedy);
        movies.addFileSystem(horror);

        File matrix = new File("Matrix");
        movies.addFileSystem(matrix);

        movies.ls();
    }
}
