import ProxyPattern.Protection.UserService;
import ProxyPattern.Protection.UserServiceProxy;
import ProxyPattern.Virtual.Image;
import ProxyPattern.Virtual.ProxyImage;

public class main {
    public static void main(String[] args) {
        System.out.println("Alo");

        // Adapter
//        AudioPlayer audioPlayer = new AudioPlayer();
//        audioPlayer.play("mp3", "beyond the horizon.mp3");
//        audioPlayer.play("mp4", "alone.mp4");
//        audioPlayer.play("vlc", "far far away.vlc");
//        audioPlayer.play("avi", "mind me.avi");

        // Virtual Proxy
//        Image image = new ProxyImage("test_10mb.jpg");
//        //image will be loaded from disk
//        image.display();
//        System.out.println("");
//        //image will not be loaded from disk
//        image.display();

        // Protection Proxy
        UserService admin = new UserServiceProxy("coder", "admin");
        admin.load();
        admin.insert();
        UserService customer = new UserServiceProxy("customer", "guest");
        customer.load();
        customer.insert();
    }
}
