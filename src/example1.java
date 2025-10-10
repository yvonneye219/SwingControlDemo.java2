import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class example1 implements ActionListener {
    private JFrame mainFrame;
    private JLabel statusLabel;
    //private JPanel controlPanel;
    private JMenuBar mb;
    private JMenu file, edit, help;
    private JMenuItem cut, copy, paste, selectAll;
  //  private JTextArea ta; //typing area
    private int WIDTH=800;
    private int HEIGHT=700;


    public example1() {
        prepareGUI();
    }

    public static void main(String[] args) {
        example1 example1 = new example1();
        example1.showEventDemo();
    }

    private void prepareGUI() {
        mainFrame = new JFrame("Java SWING Examples");
        mainFrame.setSize(WIDTH, HEIGHT);
        mainFrame.setLayout(new GridLayout(2, 3));

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

        JButton Button1 = new JButton("button 1");
        JButton Button2 = new JButton("button 2");
        JButton Button3 = new JButton("button 3");
        JButton Button4 = new JButton("button 4");
        JButton Button5 = new JButton("button 5");
        JButton submitButton = new JButton("Submit");
        JButton cancelButton = new JButton("Cancel");

      //  okButton.setActionCommand("Button 1");
        submitButton.setActionCommand("Submit");
        cancelButton.setActionCommand("Cancel");

      //  okButton.addActionListener(new ButtonClickListener());
        submitButton.addActionListener(new ButtonClickListener());
        cancelButton.addActionListener(new ButtonClickListener());

      //controlPanel.add(okButton);
        //   controlPanel.add(submitButton);
    //    controlPanel.add(cancelButton);
        mainFrame.add(Button1);
        mainFrame.add(Button2);
        mainFrame.add(Button3);
        mainFrame.add(Button4);
        mainFrame.add(Button5);
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