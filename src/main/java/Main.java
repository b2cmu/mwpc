import javax.swing.*;
import java.awt.*;

public class Main  {

    public static void main(String[] args) {
        Model begruessung = new Model();
        System.out.println(begruessung.gethi());

        JFrame hibox = new JFrame("Willkommen Michael");
        hibox.setSize(350,300);
        hibox.setLocationRelativeTo(null);
        hibox.add(new Panel(), BorderLayout.CENTER);
        hibox.setVisible(true);

    }
}


