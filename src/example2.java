import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class example2 implements ActionListener {
    private JFrame mainFrame;
    private JLabel statusLabel;
    private JMenuBar mb;
    private JMenu file, edit, help;
    private JMenuItem cut, copy, paste, selectAll;
    private int WIDTH = 800;
    private int HEIGHT = 700;

    public example2() {
        prepareGUI();
    }

    public static void main(String[] args) {
        example2 example2 = new example2();
        example2.showEventDemo();
    }

    private void prepareGUI() {
        mainFrame = new JFrame("Example with border layout");
        mainFrame.setSize(WIDTH, HEIGHT);
        mainFrame.setLayout(new BorderLayout(10, 10));

        // Menu setup
        cut = new JMenuItem("cut");
        copy = new JMenuItem("copy");
        paste = new JMenuItem("paste");
        selectAll = new JMenuItem("selectAll");
        cut.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);
        selectAll.addActionListener(this);

        mb = new JMenuBar();
        file = new JMenu("File");
        edit = new JMenu("Edit");
        help = new JMenu("Help");
        edit.add(cut);
        edit.add(copy);
        edit.add(paste);
        edit.add(selectAll);
        mb.add(file);
        mb.add(edit);
        mb.add(help);
        mainFrame.setJMenuBar(mb);

        statusLabel = new JLabel("", JLabel.CENTER);
        statusLabel.setSize(350, 100);

        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });

        mainFrame.setVisible(true);
    }

    private void showEventDemo() {
        JButton Button1 = new JButton("button 1");
        JButton Button2 = new JButton("button 2");
        JButton Button3 = new JButton("button 3");
        JButton Button4 = new JButton("button 4");
        JButton Button5 = new JButton("button 5");

        mainFrame.add(Button1, BorderLayout.NORTH);
        mainFrame.add(Button2, BorderLayout.EAST);
        mainFrame.add(Button3, BorderLayout.SOUTH);
        mainFrame.add(Button4, BorderLayout.WEST);
        mainFrame.add(Button5, BorderLayout.CENTER);

        mainFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // handle menu actions if needed
    }
}
