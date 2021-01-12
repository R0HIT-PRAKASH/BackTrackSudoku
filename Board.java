import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Board extends JFrame implements ActionListener {

    JPanel boardPanel;
    JLabel boardLabel;
    JButton solve;

    public Board(){
        super("Border Layout");
        ImageIcon icon = createImageIcon("grid.png", "image description");
        JTextField test = new JTextField();
        test.setPreferredSize(new Dimension(20, 20));

        solve = new JButton("Solve");
        //image is 593 X 593

        boardPanel = new JPanel(new GridLayout(9, 9, 10, 10));
        //boardPanel.setBounds(0, 0, 593, 593);

        boardLabel = new JLabel();
        boardLabel.setIcon(icon);

        //boardPanel.add(boardLabel);
        boardPanel.add(test);

        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.setResizable(false);
        this.setSize(593,593);
        this.add(boardPanel, BorderLayout.NORTH);
        //this.add(solve, BorderLayout.CENTER);
        //this.pack();


    }

    @Override
    public void actionPerformed(ActionEvent e){

    }

    public static void main(String [] args){
        Board board = new Board();
    }

    protected ImageIcon createImageIcon(String path, String description) {
        java.net.URL imgURL = getClass().getResource(path);

        if (imgURL != null) {
            return new ImageIcon(imgURL, description);
        } else {
            System.err.println("Couldn't find file:" +path);
            return null;
        }
    }
}

