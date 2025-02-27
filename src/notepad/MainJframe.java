/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package notepad;

import java.awt.Font;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

/**
 *
 * @author henri
 */
public class MainJframe extends javax.swing.JFrame {

    /**
     * Creates new form MainJframe
     */
    public MainJframe() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        scrollPane = new javax.swing.JScrollPane();
        textPane = new javax.swing.JTextPane();
        mainMenubar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        newFileMenu = new javax.swing.JMenuItem();
        openFileMenu = new javax.swing.JMenuItem();
        saveFileMenu = new javax.swing.JMenuItem();
        exitMenu = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        fontSizeMenu = new javax.swing.JMenu();
        bodeEspiatorio = new javax.swing.JMenuItem();
        fontSelector = new JSpinner(new SpinnerNumberModel(12, 12, 30, 1));
        textaAlignment = new javax.swing.JMenu();
        textAlignLeft = new javax.swing.JMenuItem();
        textAlignCenter = new javax.swing.JMenuItem();
        textAlignRight = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Notepad#");
        setFont(new java.awt.Font("Open Sans", 0, 10)); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        textPane.setBorder(null);
        scrollPane.setViewportView(textPane);

        mainMenubar.setBackground(new java.awt.Color(204, 204, 204));
        mainMenubar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        mainMenubar.setToolTipText("");
        mainMenubar.setBorderPainted(false);
        mainMenubar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mainMenubar.setFont(mainMenubar.getFont());

        fileMenu.setText("File");

        newFileMenu.setText("New");
        newFileMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newFileMenuActionPerformed(evt);
            }
        });
        fileMenu.add(newFileMenu);

        openFileMenu.setText("Open");
        openFileMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openFileMenuActionPerformed(evt);
            }
        });
        fileMenu.add(openFileMenu);

        saveFileMenu.setText("Save as");
        saveFileMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveFileMenuActionPerformed(evt);
            }
        });
        fileMenu.add(saveFileMenu);

        exitMenu.setText("Exit");
        exitMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenu);

        mainMenubar.add(fileMenu);

        editMenu.setText("Edit");

        fontSizeMenu.setText("Font Size");
        fontSizeMenu.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
                fontSizeMenuMenuDeselected(evt);
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
            }
        });

        bodeEspiatorio.setText(".");
        bodeEspiatorio.setEnabled(false);
        fontSizeMenu.add(bodeEspiatorio);
        fontSizeMenu.add(fontSelector);

        editMenu.add(fontSizeMenu);

        textaAlignment.setText("Text alignment");

        textAlignLeft.setText("Left");
        textAlignLeft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textAlignLeftActionPerformed(evt);
            }
        });
        textaAlignment.add(textAlignLeft);

        textAlignCenter.setText("Center");
        textAlignCenter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textAlignCenterActionPerformed(evt);
            }
        });
        textaAlignment.add(textAlignCenter);

        textAlignRight.setText("Right");
        textAlignRight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textAlignRightActionPerformed(evt);
            }
        });
        textaAlignment.add(textAlignRight);

        editMenu.add(textaAlignment);

        mainMenubar.add(editMenu);

        setJMenuBar(mainMenubar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    String originalText = "";
//ALIGN_CENTER
    private void alignText(int alignment){
        StyledDocument style = textPane.getStyledDocument();
        SimpleAttributeSet align= new SimpleAttributeSet();
        StyleConstants.setAlignment(align, alignment);
        style.setParagraphAttributes(0, style.getLength(), align, false);
        String vtext = textPane.getText();
        textPane.setText("");
        textPane.setText(vtext);
    }
    private void changeFontSize() {
        textPane.setFont(new Font("Sans Serif", Font.PLAIN, (int) fontSelector.getValue()));
    }

    private boolean textIsModified() {
        // false se modificado true se nao modificado
        return originalText.equals(textPane.getText());
    }

    private int notSavedDialog() {
        int choice = JOptionPane.showConfirmDialog(null, "Deseja salvar as mudanças feitas?", "Esqueceules", JOptionPane.YES_NO_CANCEL_OPTION);

        if (choice == JOptionPane.YES_OPTION) {
            // se clicou sim, ele manda salvar entao
            saveFile();
            return 0;
        } else if (choice == JOptionPane.NO_OPTION) {
            // faz nada
            return 0;
        } else // retorna 1 pra saber que o usuario clicou em cancel ou fechou o dialog
        {
            return 1;
        }

    }

    private void saveFile() {
        try {
            JFileChooser NewArquivo = new JFileChooser();
            NewArquivo.setDialogTitle("Digite o nome do arquivo para salvar");
            NewArquivo.setFileSelectionMode(JFileChooser.FILES_ONLY);
            int op = NewArquivo.showSaveDialog(this);
            if (op == JFileChooser.APPROVE_OPTION) {
                File file = new File("");
                file = NewArquivo.getSelectedFile();
                String NomeArquivo = file.getAbsolutePath();

                FileWriter writer = new FileWriter(NomeArquivo, true);
                writer.write(textPane.getText());
                writer.close();
                JOptionPane.showMessageDialog(null, "Salvei.");
                originalText = textPane.getText();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void openFile() {
        if (textIsModified() == false) {
            // se o usuario clicar em cancel, retorna
            if (notSavedDialog() == 1) {
                return;
            }
        }

        JFileChooser NewArquivo = new JFileChooser();
        NewArquivo.setDialogTitle("Digite o nome do arquivo para abrir");
        NewArquivo.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int op = NewArquivo.showOpenDialog(this);
        if (op == JFileChooser.APPROVE_OPTION) {
            File filePath = new File("");
            filePath = NewArquivo.getSelectedFile();
            String NomeArquivo = filePath.getAbsolutePath();
            File file = new File(NomeArquivo);
            FileInputStream fis = null;
            String text = "";

            try {
                fis = new FileInputStream(file);
                int content;
                while ((content = fis.read()) != -1) {
                    text += (char) content;
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (fis != null) {
                        fis.close();
                    }
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
            originalText = text;
            textPane.setText(text);
        }
    }

    private void newFileMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newFileMenuActionPerformed
        // TODO add your handling code here:

        if (textIsModified() == false) {
            // se o usuario clicar em cancel, retorna
            if (notSavedDialog() == 1) {
                return;
            }
        }

        textPane.setText("");
        originalText = "";
    }//GEN-LAST:event_newFileMenuActionPerformed

    private void openFileMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openFileMenuActionPerformed
        // TODO add your handling code here:
        openFile();
    }//GEN-LAST:event_openFileMenuActionPerformed

    private void saveFileMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveFileMenuActionPerformed
        // TODO add your handling code here:
        saveFile();
    }//GEN-LAST:event_saveFileMenuActionPerformed

    private void exitMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuActionPerformed
        // TODO add your handling code here:
        if (textIsModified() == false) {
            // se o usuario clicar em cancel, retorna
            if (notSavedDialog() == 1) {
                return;
            }
        }
        System.exit(0);
    }//GEN-LAST:event_exitMenuActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        if (textIsModified() == false) {
            // se o usuario clicar em cancel, retorna
            if (notSavedDialog() == 1) {
                return;
            }
        }
    }//GEN-LAST:event_formWindowClosing

    private void fontSizeMenuMenuDeselected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_fontSizeMenuMenuDeselected
        // TODO add your handling code here:
        changeFontSize();

    }//GEN-LAST:event_fontSizeMenuMenuDeselected

    private void textAlignLeftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textAlignLeftActionPerformed
        // TODO add your handling code here:
        alignText(StyleConstants.ALIGN_LEFT);
    }//GEN-LAST:event_textAlignLeftActionPerformed

    private void textAlignCenterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textAlignCenterActionPerformed
        // TODO add your handling code here:
                alignText(StyleConstants.ALIGN_CENTER);

    }//GEN-LAST:event_textAlignCenterActionPerformed

    private void textAlignRightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textAlignRightActionPerformed
        // TODO add your handling code here:
        alignText(StyleConstants.ALIGN_RIGHT);

    }//GEN-LAST:event_textAlignRightActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JMenuItem bodeEspiatorio;
    public javax.swing.JSpinner fontSelector;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenu;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu fontSizeMenu;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JMenuBar mainMenubar;
    private javax.swing.JMenuItem newFileMenu;
    private javax.swing.JMenuItem openFileMenu;
    private javax.swing.JMenuItem saveFileMenu;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JMenuItem textAlignCenter;
    private javax.swing.JMenuItem textAlignLeft;
    private javax.swing.JMenuItem textAlignRight;
    private javax.swing.JTextPane textPane;
    private javax.swing.JMenu textaAlignment;
    // End of variables declaration//GEN-END:variables
}
