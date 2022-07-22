package Day4.Abstraction;

abstract class MediaPlayer
{
    void playSong(String songName)
    {
        System.out.println(songName+" is playing in the player");
    }
    abstract void pauseControle();
    abstract void screenControler();
}
class Windows extends MediaPlayer
{
    void pauseControle()
    {
        System.out.println("Press P to pause the song");
    }
    void screenControler()
    {
        System.out.println("Do changes using menu button");
    }
}
class VLC extends MediaPlayer
{
    void pauseControle()
    {
        System.out.println("Press space-bar to pause the song");
    }
    void screenControler()
    {
        System.out.println("Press A to change the screen size");
    }
}
class  Main{
    public static void main(String[] args) {
        Windows windows = new Windows();
        VLC vlc = new VLC();
        windows.pauseControle();
        vlc.pauseControle();
    }
}
