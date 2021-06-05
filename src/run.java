import java.awt.*;

public class run {

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                MyForm1 form = new MyForm1();
                form.setVisible(true);
            }

        });

    }
}
