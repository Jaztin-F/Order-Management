//Justine Francisco
//Bonjovie Belebelone

//IT2A
package OMS;

   
import java.util.Timer;
import java.util.TimerTask;


public class Start {
    
     static Startup start = new Startup();
    static Main mf = new Main();

    public static void main(String[] args) {
   
        start.setVisible(true);
        Timer timer = new Timer();

        timer.schedule(new EndStartup(), 4000);

    }

    static class EndStartup extends TimerTask {

        @Override
        public void run() {
            start.dispose();
            mf.setVisible(true);
        }
    }
}