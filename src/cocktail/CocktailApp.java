
package cocktail;

import cocktail.exeptions.BlenderOverFlowExecption;
import cocktail.exeptions.BlenderEmptyExecption;
import java.awt.BorderLayout;
import java.awt.Image;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.*;

/**
 *
 * @author حسن
 */
public class CocktailApp extends javax.swing.JFrame implements Serializable {

 


    

       int cupCount=0;
    ArrayList<Ingredients> ingredients;
/**
     * Creates new form CocktailApp
     */
   MyLogger logger=new MyLogger();
       Blender blender=new Blender(2000, logger);
Cocktail cocktail=new Cocktail(); 
    private boolean flase;
     
    public CocktailApp() {
        this.ingredients = new ArrayList();
        initComponents();
        boolean flag=flase;
         
         
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        tab = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        review1 = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        review2 = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        pell = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pell1 = new javax.swing.JTextArea();
        colorLabel = new javax.swing.JLabel();
        colorArea = new javax.swing.JTextField();
        panel = new javax.swing.JPanel();
        cup250 = new javax.swing.JRadioButton();
        cup330 = new javax.swing.JRadioButton();
        cup500 = new javax.swing.JRadioButton();
        finish = new javax.swing.JButton();
        newOrder = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        jFormattedTextField1.setText("jFormattedTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("cocktail app");
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel1.setBackground(new java.awt.Color(255, 51, 51));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Welcome to Mohammad & Hasan Cocktail");

        jSeparator1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jPanel2.setLayout(null);

        review1.setColumns(20);
        review1.setRows(5);
        review1.setText("1. orange with 100 cal\n2. kiwi with 50 cal\n3. strawbarry with 30 cal\n4. banana with 120 cal\n5. milk with 200 cal\n6. evaborated milk with 250 cal\n");
        review1.setBorder(javax.swing.BorderFactory.createTitledBorder("Menu"));
        review1.setEditable(false);
        jScrollPane2.setViewportView(review1);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(40, 61, 268, 140);

        jLabel9.setBackground(new java.awt.Color(102, 255, 255));
        jLabel9.setText("we can make for you a cocktail with this species:");
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel9);
        jLabel9.setBounds(40, 23, 265, 32);

        review2.setColumns(20);
        review2.setRows(5);
        review2.setText("1. 250 ml cup : 10 $\n2. 330 ml cup : 15 $\n3. 500 ml cup : 20 $\n");
        review2.setBorder(javax.swing.BorderFactory.createTitledBorder("Menu"));
        jScrollPane3.setViewportView(review2);
        review2.setEditable(false);
        review2.getAccessibleContext().setAccessibleName("");

        jPanel2.add(jScrollPane3);
        jScrollPane3.setBounds(50, 280, 268, 120);

        jLabel10.setBackground(new java.awt.Color(102, 255, 255));
        jLabel10.setText("                those are the cup sizes");
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel10.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel2.add(jLabel10);
        jLabel10.setBounds(50, 240, 265, 32);

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\Asus\\Downloads\\christmas-jones-cocktail-recipe-761217-hero-01-5c7dba20c9e77c000136a7de.jpg")); // NOI18N
        jLabel11.setText("jLabel11");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(-350, 0, 1080, 760);

        tab.addTab("menu", jPanel2);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(242, 242, 242));
        jPanel1.setLayout(null);

        jButton3.setText("Add");
        jButton3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(132, 6, 26, 20);

        jLabel3.setText("orange");
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel3);
        jLabel3.setBounds(16, 9, 50, 20);

        jLabel4.setText("banana");
        jLabel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel4);
        jLabel4.setBounds(16, 41, 50, 20);

        jButton5.setText("Add");
        jButton5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(132, 41, 26, 20);

        jLabel5.setText("Strawbarry");
        jLabel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel5);
        jLabel5.setBounds(16, 73, 70, 20);

        jButton6.setText("Add");
        jButton6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(132, 70, 26, 20);

        jLabel6.setText("kiwi");
        jLabel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel6);
        jLabel6.setBounds(16, 102, 30, 20);

        jButton7.setText("Add");
        jButton7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7);
        jButton7.setBounds(132, 99, 26, 20);

        jLabel7.setText("milk");
        jLabel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel7);
        jLabel7.setBounds(16, 137, 30, 20);

        jButton8.setText("Add");
        jButton8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8);
        jButton8.setBounds(132, 137, 26, 20);

        jLabel8.setText("Evaborated milk");
        jLabel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel8);
        jLabel8.setBounds(16, 169, 110, 20);

        jButton9.setText("Add");
        jButton9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9);
        jButton9.setBounds(132, 166, 26, 20);

        jButton1.setText("Blend");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.setEnabled(flase);
        jPanel1.add(jButton1);
        jButton1.setBounds(6, 201, 32, 18);

        jCheckBox1.setText("Suger");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox1);
        jCheckBox1.setBounds(123, 202, 85, 20);

        pell.setBorder(javax.swing.BorderFactory.createTitledBorder("pell"));
        pell.setVisible(false);

        pell1.setColumns(20);
        pell1.setVisible(false);
        pell1.setRows(5);
        jScrollPane1.setViewportView(pell1);

        colorLabel.setVisible(false);
        colorLabel.setText("the color is");

        colorArea.setVisible(false);

        javax.swing.GroupLayout pellLayout = new javax.swing.GroupLayout(pell);
        pell.setLayout(pellLayout);
        pellLayout.setHorizontalGroup(
            pellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pellLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(pellLayout.createSequentialGroup()
                        .addComponent(colorLabel)
                        .addGap(29, 29, 29)
                        .addComponent(colorArea, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pellLayout.setVerticalGroup(
            pellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pellLayout.createSequentialGroup()
                .addGap(602, 602, 602)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(721, 721, 721)
                .addGroup(pellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(colorLabel)
                    .addComponent(colorArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(pell);
        pell.setBounds(290, 210, 220, 190);

        panel.setVisible(false);
        panel.setBorder(javax.swing.BorderFactory.createTitledBorder("choose cup size"));

        buttonGroup3.add(cup250);
        cup250.setVisible(false);
        cup250.setText("1. cup 250 ml");
        cup250.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cup250ActionPerformed(evt);
            }
        });

        buttonGroup3.add(cup330);
        cup330.setText("2. cup 330ml");
        cup330.setVisible(false);
        cup330.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cup330ActionPerformed(evt);
            }
        });

        buttonGroup3.add(cup500);
        cup500.setText("3. cup 500 ml");
        cup500.setVisible(false);
        cup500.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cup500ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cup250)
                    .addComponent(cup330, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cup500, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(cup250)
                .addGap(18, 18, 18)
                .addComponent(cup330)
                .addGap(18, 18, 18)
                .addComponent(cup500)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel1.add(panel);
        panel.setBounds(290, 10, 221, 170);

        finish.setText("Fisnish");
        finish.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 153, 153)));
        finish.setVisible(false);
        finish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finishActionPerformed(evt);
            }
        });
        jPanel1.add(finish);
        finish.setBounds(6, 521, 88, 22);

        newOrder.setText("New Order");
        newOrder.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 153, 153)));
        newOrder.setVisible(false);
        newOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newOrderActionPerformed(evt);
            }
        });
        jPanel1.add(newOrder);
        newOrder.setBounds(120, 521, 64, 22);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Asus\\Downloads\\strawberry-berryoska-recipe-760977-hero-5bb7c465c9e77c0058b52193.jpg")); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(-290, 0, 1030, 640);

        tab.addTab("Home", jPanel1);

        jMenu1.setText("File");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("open");
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem1MouseClicked(evt);
            }
        });
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem2.setText("save");
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("help");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem3.setText("help");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(720, 720, 720)
                        .addComponent(jSeparator1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addComponent(tab)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tab, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MouseClicked

    }//GEN-LAST:event_jMenuItem1MouseClicked

    private void newOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newOrderActionPerformed
        blender=new Blender(2000,logger);
        panel.setVisible(false);
        pell.setVisible(false);

    }//GEN-LAST:event_newOrderActionPerformed

    private void finishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finishActionPerformed
        JOptionPane.showMessageDialog(rootPane, "thank you we hope to see you again");
        System.exit(0);
    }//GEN-LAST:event_finishActionPerformed

    private void cup500ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cup500ActionPerformed
        if (cup500.isSelected()) {
            Cup cup1 = new Cup(500);
            try {
                blender.pour(cup1);
                cupCount++;
                pell.setBorder(javax.swing.BorderFactory.createTitledBorder("pell "+cupCount));
                Color cocktailColor = blender.getColor();
                pell.setVisible(true);
                pell1.setVisible(true);
                pell1.setText("""
                    Price: $20
                    Please pay to the cashier.
                    Calories: """ + cup1.getCalories()+"\nVolume: " + cup1.getCapacity());

                    colorLabel.setVisible(true);
                    colorArea.setVisible(true);
                    finish.setVisible(true);
                    newOrder.setVisible(true);
                    colorArea.setBackground(new java.awt.Color(cocktailColor.getRed(), cocktailColor.getGreen(), cocktailColor.getBlue()));
                } catch (BlenderEmptyExecption ex) {
                    JOptionPane.showMessageDialog(rootPane, "The blender is empty. Please refill.");
                } catch (Exception ex) { // Handle other potential exceptions
                    JOptionPane.showMessageDialog(rootPane, "An error occurred: " + ex.getMessage());
                }
            }
    }//GEN-LAST:event_cup500ActionPerformed

    private void cup330ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cup330ActionPerformed
        if (cup330.isSelected()) {
            Cup cup1 = new Cup(330);
            try {
                blender.pour(cup1);
                cupCount++;
                pell.setBorder(javax.swing.BorderFactory.createTitledBorder("pell "+cupCount));
                Color cocktailColor = blender.getColor();
                pell.setVisible(true);
                pell1.setVisible(true);
                pell1.setText("""
                    Price: $15
                    Please pay to the cashier.
                    Calories: """ + cup1.getCalories()+"\nVolume: " + cup1.getCapacity());
                    finish.setVisible(true);
                    newOrder.setVisible(true);
                    colorLabel.setVisible(true);
                    colorArea.setVisible(true);
                    colorArea.setBackground(new java.awt.Color(cocktailColor.getRed(), cocktailColor.getGreen(), cocktailColor.getBlue()));
                } catch (BlenderEmptyExecption ex) {
                    JOptionPane.showMessageDialog(rootPane, "The blender is empty. Please refill.");
                } catch (Exception ex) { // Handle other potential exceptions
                    JOptionPane.showMessageDialog(rootPane, "An error occurred: " + ex.getMessage());
                }
            }  // TODO add your handling code here:
    }//GEN-LAST:event_cup330ActionPerformed

    private void cup250ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cup250ActionPerformed
        if (cup250.isSelected()) {
            Cup cup1 = new Cup(250);
            try {
                blender.pour(cup1);
                cupCount++;
                pell.setBorder(javax.swing.BorderFactory.createTitledBorder("pell "+cupCount));

                Color cocktailColor = blender.getColor();
                pell.setVisible(true);
                pell1.setVisible(true);
                pell1.setText("""
                    Price: $10
                    Please pay to the cashier.
                    Calories: """ + cup1.getCalories()+"\nVolume: " + cup1.getCapacity());

                    colorLabel.setVisible(true);
                    colorArea.setVisible(true);
                    colorArea.setBackground(new java.awt.Color(cocktailColor.getRed(), cocktailColor.getGreen(), cocktailColor.getBlue()));
                    finish.setVisible(true);
                    newOrder.setVisible(true);
                } catch (BlenderEmptyExecption ex) {
                    JOptionPane.showMessageDialog(rootPane, "The blender is empty. Please refill.");
                    blender=new Blender(2000,logger);
                    panel.setVisible(flase);
                } catch (Exception ex) { // Handle other potential exceptions
                    JOptionPane.showMessageDialog(rootPane, "An error occurred: " + ex.getMessage()+blender.getIngredients().size());
                }
            }

    }//GEN-LAST:event_cup250ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        ingredients.add(new Suger(new Color(248,240,235),0,"Suger",120));
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Cocktail cocktail=new Cocktail();

        cocktail=blender.blend();

        if(blender.isEmpty())
        JOptionPane.showMessageDialog(rootPane, "the blender is empty");

        panel.setVisible(true);
        cup250.setVisible(true);cup330.setVisible(true);
        cup500.setVisible(true);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        Color color6=new Color(250, 253, 240);
        Milk evaporatedMilk=new Milk(color6,150,"evaporated milk",250);
        ingredients.add(evaporatedMilk);
        jButton1.setEnabled(true);
        try {
            blender.add(ingredients);// TODO add your handling code here:
        } catch (BlenderOverFlowExecption ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        Color color5=new Color(255, 250,250);
        Milk milk1=new Milk(color5,150,"milk",200);
        ingredients.add(milk1);
        jButton1.setEnabled(true);
        try {
            blender.add(ingredients);// TODO add your handling code here:
        } catch (BlenderOverFlowExecption ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }    // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        Color color2=new Color(0,255,0);
        Fruits kiwi=new Fruits(color2,50,"kiwi",50);
        ingredients.add(kiwi);
        jButton1.setEnabled(true);
        try {
            blender.add(ingredients);// TODO add your handling code here:
        } catch (BlenderOverFlowExecption ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }// TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Color color4=new Color(255, 80, 120);
        Fruits strawbarry=new Fruits(color4,30,"strwabarry",20);
        ingredients.add(strawbarry);
        jButton1.setEnabled(true);
        try {
            blender.add(ingredients);// TODO add your handling code here:
        } catch (BlenderOverFlowExecption ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }// TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Color color3=new Color(252, 255, 0);
        Fruits banana=new Fruits(color3,80,"banana",120);
        ingredients.add(banana);
        jButton1.setEnabled(true);
        try {
            blender.add(ingredients);// TODO add your handling code here:
        } catch (BlenderOverFlowExecption ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }// TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Color color1=new Color(255,165,0);
        Fruits orange=new Fruits(color1,150,"orange",100);
        ingredients.add(orange);
        jButton1.setEnabled(true);
        try {
            blender.add(ingredients);// TODO add your handling code here:
        } catch (BlenderOverFlowExecption ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
     JOptionPane.showMessageDialog(rootPane, new javax.swing.JFileChooser());
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
   JOptionPane.showMessageDialog(rootPane, new javax.swing.JFileChooser());    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
     JOptionPane.showMessageDialog(rootPane, "please call this number 0592935904");
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
     JOptionPane.showMessageDialog(rootPane, "please call this number 0592935904");
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void ingrediantsAdd() throws FileNotFoundException, IOException{
     try{
    
     File file =new File("ingrediantsAdd.txt");
     
         try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file))) {
             out.writeObject(ingredients);
             //here
         }
         //here
     
     }catch (IOException i) {
         JOptionPane.showMessageDialog(rootPane, i.getMessage());
      }
}

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
            java.util.logging.Logger.getLogger(CocktailApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CocktailApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CocktailApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CocktailApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CocktailApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JTextField colorArea;
    private javax.swing.JLabel colorLabel;
    private javax.swing.JRadioButton cup250;
    private javax.swing.JRadioButton cup330;
    private javax.swing.JRadioButton cup500;
    private javax.swing.JButton finish;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton newOrder;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel pell;
    private javax.swing.JTextArea pell1;
    private javax.swing.JTextArea review1;
    private javax.swing.JTextArea review2;
    private javax.swing.JTabbedPane tab;
    // End of variables declaration//GEN-END:variables
}
