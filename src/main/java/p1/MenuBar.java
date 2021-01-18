package p1;

import java.awt.*;
import java.awt.event.*;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuBar extends JMenuBar implements ActionListener {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    JMenu menuFile;
    JMenu menuEdit;
    JMenu menuHelp;
    JMenuItem menuItemSave;
    JMenuItem menuItemSaveAs;
    Notepad notepad;

    public MenuBar(Notepad notepad) {
        this.notepad = notepad;

        //menu File
        setMenuFile();
        //menu Edit
        setMenuEdit();
        //menu Help
        setMenuHelp();


        this.add(menuFile);
        this.add(menuEdit);
        this.add(menuHelp);

    }

    public void setMenuFile() {
        menuFile = new JMenu("File");
        menuFile.setMnemonic(KeyEvent.VK_F);
        menuFile.getAccessibleContext().setAccessibleDescription("File operations");
        //save
        menuItemSave = new JMenuItem("Save");
        menuItemSave.setAction(new SaveFile(notepad));
        menuItemSave.setText("Save");
        menuFile.add(menuItemSave);
        //save as
        menuItemSaveAs = new JMenuItem("Save as");
        menuItemSaveAs.setAction(new SaveFileAs(notepad));
        menuItemSaveAs.setText("Save as");
        menuFile.add(menuItemSaveAs);
    }

    public void setMenuEdit() {
        menuEdit = new JMenu("Edit");
        menuEdit.setMnemonic(KeyEvent.VK_E);
        menuEdit.getAccessibleContext().setAccessibleDescription("Edit operations");
    }

    public void setMenuHelp() {
        menuHelp = new JMenu("Help");
        menuHelp.setMnemonic(KeyEvent.VK_H);
        menuHelp.getAccessibleContext().setAccessibleDescription("Help with " + Notepad.applicationName);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        

    }

}
