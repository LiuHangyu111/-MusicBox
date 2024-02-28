public class MusicBox {  
  
    // Variables  
    private String songID;  
    private char isSongPremium;  
    public String songTitle;  
    private String songArtists;  
    private String songAlbum;  
    public String songGenre;  
    private String songProducer;  
    public String songMusicLabel;  
    public int noAds;  
  
    //Constructor  
    public MusicBox(String songID, char premiumSong, String title, String artists, String album, String genre, String producer, String label, int noAds) {  
        this.songID = songID;  
        this.isSongPremium = premiumSong;  
        this.songTitle = title;  
        this.songArtists = artists;  
        this.songAlbum = album;  
        this.songGenre = genre;  
        this.songProducer = producer;  
        this.songMusicLabel = label;  
        this.noAds = noAds;  
    }  
      
    // Getters for the rest of the variables  
    public String getSongTitle() {  
        return songTitle;  
    }  
  
    public String getSongAlbum() {  
        return songAlbum;  
    }  
  
    public String getSongGenre() {  
        return songGenre;  
    }  
  
    public String getSongProducer() {  
        return songProducer;  
    }  
  
    public String getSongMusicLabel() {  
        return songMusicLabel;  
    }  
  
    public int getNoAds() {  
        return noAds;  
    }  
  
    // Modified playSong method  
    public void playSong() {  
        if (isSongPremium == 'Y') {  
            System.out.println("This is a premium song. Please buy it to play without the ads");  
            playAd();  
        } else {  
            System.out.println("Thank you for choosing this song. Hope you enjoy listening to it.");  
            playAd();  
        }  
    }  
      
    private void playAd() {  
        if (noAds > 0) {  
            for (int i = 1; i <= noAds; i++) {  
                System.out.println("Playing Ad " + i);  
            }  
        }  
    }  
}