
package cocktail;

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
        jLabel2 = new javax.swing.JLabel();
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
        jSeparator1 = new javax.swing.JSeparator();

        jFormattedTextField1.setText("jFormattedTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("cocktail app");
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel1.setBackground(new java.awt.Color(255, 51, 51));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Welcome to Mohammad & Hasan Cocktail");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(242, 242, 242));

        jButton3.setText("Add");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel3.setText("orange");

        jLabel4.setText("banana");

        jButton5.setText("Add");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel5.setText("Strawbarry");

        jButton6.setText("Add");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel6.setText("kiwi");

        jButton7.setText("Add");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel7.setText("milk");

        jButton8.setText("Add");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel8.setText("Evaborated milk");

        jButton9.setText("Add");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton1.setText("Blend");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jCheckBox1.setText("Suger");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/cocktail.jpeg.jpg"))); // NOI18N

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
                .addComponent(colorLabel)
                .addGap(29, 29, 29)
                .addComponent(colorArea, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        pellLayout.setVerticalGroup(
            pellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pellLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(colorLabel)
                    .addComponent(colorArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 40, Short.MAX_VALUE))
        );

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
                .addContainerGap(81, Short.MAX_VALUE))
        );

        finish.setText("Fisnish");
        finish.setVisible(false);
        finish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finishActionPerformed(evt);
            }
        });

        newOrder.setText("New Order");
        newOrder.setVisible(false);
        newOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newOrderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton9))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton8, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton7, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 219, Short.MAX_VALUE)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(finish, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(newOrder)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(pell, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jButton5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jButton6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton7)
                            .addComponent(jLabel6))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jButton8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jButton9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jCheckBox1)))
                    .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pell, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(finish)
                            .addComponent(newOrder))
                        .addGap(8, 8, 8))))
        );

        jSeparator1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2272, 2272, 2272))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         Color color1=new Color(255,165,0);
                        Fruits orange=new Fruits(color1,150,"orange",100);
                        ingredients.add(orange);
        try {
            blender.add(ingredients);// TODO add your handling code here:
        } catch (BlenderOverFlowExecption ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
Color color3=new Color(252, 255, 0);
                        Fruits banana=new Fruits(color3,80,"banana",120);
                        ingredients.add(banana);      
                            try {
            blender.add(ingredients);// TODO add your handling code here:
        } catch (BlenderOverFlowExecption ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }// TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
Color color4=new Color(255, 80, 120);
                        Fruits strawbarry=new Fruits(color4,30,"strwabarry",20);
                        ingredients.add(strawbarry); 
                            try {
            blender.add(ingredients);// TODO add your handling code here:
        } catch (BlenderOverFlowExecption ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }// TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
Color color2=new Color(0,255,0);
                        Fruits kiwi=new Fruits(color2,50,"kiwi",50);
                        ingredients.add(kiwi);  
                            try {
            blender.add(ingredients);// TODO add your handling code here:
        } catch (BlenderOverFlowExecption ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }// TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
    Color color5=new Color(255, 250,250);
                                Milk milk1=new Milk(color5,150,"milk",200);
                                ingredients.add(milk1);        try {
            blender.add(ingredients);// TODO add your handling code here:
        } catch (BlenderOverFlowExecption ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }    // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
 Color color6=new Color(250, 253, 240);
                                Milk evaporatedMilk=new Milk(color6,150,"evaporated milk",250);
                                ingredients.add(evaporatedMilk);    try {
            blender.add(ingredients);// TODO add your handling code here:
        } catch (BlenderOverFlowExecption ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

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

    private void finishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finishActionPerformed
     JOptionPane.showMessageDialog(rootPane, "thank you we hope to see you again");
        System.exit(0);
    }//GEN-LAST:event_finishActionPerformed

    private void newOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newOrderActionPerformed
     blender=new Blender(2000,logger);
     panel.setVisible(false);
     pell.setVisible(false);
 
    
    
        
    }//GEN-LAST:event_newOrderActionPerformed

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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton newOrder;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel pell;
    private javax.swing.JTextArea pell1;
    // End of variables declaration//GEN-END:variables
}
