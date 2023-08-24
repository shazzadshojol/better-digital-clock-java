import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.FocusAdapter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Frame extends JFrame {

    
    SimpleDateFormat timeFormate;
    JLabel timelable;
    String time;

    JLabel dayLabel;
    String day;
    SimpleDateFormat dayFormate;

    JLabel datLabel;
    String date;
    SimpleDateFormat dateFormat;

    Frame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Degital Clock");
        this.setLocation(500, 300);
        this.setLayout(new FlowLayout());
        this.setSize(450, 250);

        timelable = new JLabel();
        timelable.setFont(new Font("Verdana", Font.PLAIN, 50));
        timelable.setForeground(Color.green);
        timelable.setBackground(Color.black);
        timelable.setOpaque(true);
        this.add(timelable);

        timeFormate = new SimpleDateFormat("hh:mm:ss a");
        dayFormate = new SimpleDateFormat("EEEE ");
        dateFormat = new SimpleDateFormat("MMMMM : dd : yyyy");


        dayLabel = new JLabel();
        dayLabel.setFont(new Font("Ink Free", Font.PLAIN, 35));
        this.add(dayLabel);

        datLabel=new JLabel();
        datLabel.setFont(new Font("Ink Free", Font.PLAIN, 35));
        this.add(datLabel);

        this.setVisible(true);
        setTime();
    }

    public void setTime() {
        while (true) {
            time = timeFormate.format(new Date());
            timelable.setText(time);

            day = dayFormate.format(new Date());
            dayLabel.setText(day);

            date = dateFormat.format(new Date());
            datLabel.setText(date);
        }
    }
}
