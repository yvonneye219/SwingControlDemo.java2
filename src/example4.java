import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class example4 implements ActionListener {
    private JFrame mainFrame;
    private JLabel statusLabel;
    private JPanel gridPanel;
    //private JPanel controlPanel;
    private JMenuBar mb;
    private JMenu file, edit, help;
    private JMenuItem cut, copy, paste, selectAll;
    //  private JTextArea ta; //typing area
    private int WIDTH=800;
    private int HEIGHT=700;


    public example4() {
        prepareGUI();
    }

    public static void main(String[] args) {
        example4 example4 = new example4();
        example4.showEventDemo();
    }

    private void prepareGUI() {
        mainFrame = new JFrame("Java SWING Examples");
        mainFrame.setSize(WIDTH, HEIGHT);
        mainFrame.setLayout(new GridLayout(3, 3));

        //menu at top
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
        //end menu at top

        //   ta = new JTextArea();
        //  ta.setBounds(50, 5, WIDTH-100, HEIGHT-50);
        mainFrame.add(mb);  //add menu bar
        //mainFrame.add(ta);//add typing area
        mainFrame.setJMenuBar(mb); //set menu bar

        statusLabel = new JLabel("", JLabel.CENTER);
        statusLabel.setSize(350, 100);

        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        //  controlPanel = new JPanel();
        // controlPanel.setLayout(new FlowLayout()); //set the layout of the pannel

        //   mainFrame.add(controlPanel);
        //mainFrame.add(okb);
        mainFrame.setVisible(true);
    }



    private void showEventDemo() {
        gridPanel = new JPanel(new GridLayout(3, 3));
       // mainFrame.add(gridPanel, BorderLayout.CENTER);

        JButton Button1 = new JButton("button 1");
        JButton Button2 = new JButton("button 2");
        JButton Button3 = new JButton("button 3");
        JButton Button4 = new JButton("button 4");
        JButton Button5 = new JButton("button 5");
        JButton Button6 = new JButton("button 6");
        JButton Button7 = new JButton("button 7");
        JButton Button8 = new JButton("button 8");
        JButton Button9 = new JButton("button 9");
        JButton Button10 = new JButton("button 10");


        mainFrame.add(Button1);
        mainFrame.add(Button2);
        mainFrame.add(Button3);


        mainFrame.add(Button4);

        JPanel centerPanel = new JPanel(new BorderLayout());
        JLabel label = new JLabel("label", JLabel.CENTER);
        centerPanel.add(label, BorderLayout.CENTER);
        centerPanel.add(Button9, BorderLayout.EAST);
        centerPanel.add(Button10, BorderLayout.SOUTH);
        mainFrame.add(centerPanel);

        mainFrame.add(Button5);

        mainFrame.add(Button6);
        mainFrame.add(Button7);
        mainFrame.add(Button8);


        mainFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //   if (e.getSource() == cut)
        //       ta.cut();
        //  if (e.getSource() == paste)
        //      ta.paste();
        //  if (e.getSource() == copy)
        //      ta.copy();
        //   if (e.getSource() == selectAll)
        //      ta.selectAll();
    }

    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

            if (command.equals("OK")) {
                statusLabel.setText("Ok Button clicked.");
            } else if (command.equals("Submit")) {
                statusLabel.setText("Submit Button clicked.");
            } else {
                statusLabel.setText("Cancel Button clicked.");
            }
        }
    }
}