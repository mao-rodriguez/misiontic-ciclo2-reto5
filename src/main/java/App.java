import view.VistaInterfaz;
import java.awt.EventQueue;

public class App {
    public static void main( String[] args ){        

        EventQueue.invokeLater(new Runnable(){

            @Override
            public void run() {
                try {
                    VistaInterfaz frame = new VistaInterfaz();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
