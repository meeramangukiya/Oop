import java.util.LinkedList;

public class MusicPlaylist {
    public static void main(String[] args) {
        LinkedList<String> playlist = new LinkedList<>();
      
        playlist.add("Song A");
        playlist.add("Song B");
        playlist.add("Song C");
        playlist.add("Song D");
        playlist.add("Song E");

      
        System.out.println("Full Playlist:");
        System.out.println(playlist);

        
        String firstSong = playlist.removeFirst();
        System.out.println("\nPlaying: " + firstSong);
        System.out.println("Playlist after playing first song:");
        System.out.println(playlist);

        
        String lastSong = playlist.removeLast();
        System.out.println("\nSkipped: " + lastSong);
        System.out.println("Playlist after skipping last song:");
        System.out.println(playlist);
    }
}
/*
Full Playlist:
[Song A, Song B, Song C, Song D, Song E]

Playing: Song A
Playlist after playing first song:
[Song B, Song C, Song D, Song E]

Skipped: Song E
Playlist after skipping last song:
[Song B, Song C, Song D]
*/
