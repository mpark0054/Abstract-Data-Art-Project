public class Music {
    private String album;
    private String artist;
    private String genre;
  

    // Constructor
    public Music(String album, String artist, String genre) {
        this.album = album;
        this.artist = artist;
        this.genre = genre;
    
    }

    // Getters
    public String getAlbum() {
        return album;
    }

    public String getArtist() {
        return artist;
    }

    public String getGenre() {
        return genre;
    }


   
    public String toString() {
        return "Album: " + album + "\n" +
               "Artist: " + artist + "\n" +
               "Genres: " + genre + "\n";
    }

    public String toStringAlbum() {
        return "Album: " + album;
    }

    public String toStringArtist() {
        return "Artist: " + artist;
    }

    public String toStringGenre() {
        return "Genre: " + genre;
    
    }
}