/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frame;

import function.Encapsulation;
import function.PolymorphismAnimal;
import function.PolymorphismAnimalSnake;

/**
 *
 * @author Office
 */
public class snake4 extends javax.swing.JFrame {

    /**
     * Creates new form snake4
     */
    public snake4() {
        initComponents();
    }

    int Counter=3;
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_mainAnimalSnake = new javax.swing.JLabel();
        lbl_animaldescSnake = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_snake = new javax.swing.JButton();
        btn_mantis = new javax.swing.JButton();
        btn_bat = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lbl_attempt = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbl_point = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_animaldescSnake.setText("This is an animal, Guess this question correctly!");

        jLabel2.setText("CHOOSE YOUR ANSWER BELOW!");

        btn_snake.setText("Snake");
        btn_snake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_snakeActionPerformed(evt);
            }
        });

        btn_mantis.setText("Mantis");
        btn_mantis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mantisActionPerformed(evt);
            }
        });

        btn_bat.setText("Bat");
        btn_bat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_batActionPerformed(evt);
            }
        });

        jLabel3.setText("Attempt left :");

        lbl_attempt.setText("3");

        jLabel4.setText("point : ");

        lbl_point.setText("0");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ular.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(lbl_mainAnimalSnake, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_attempt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_point, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_animaldescSnake)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_snake)
                        .addGap(18, 18, 18)
                        .addComponent(btn_mantis)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_bat)))
                .addGap(72, 72, 72))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(103, 103, 103)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(103, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lbl_mainAnimalSnake, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_animaldescSnake)
                .addGap(154, 154, 154)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_snake)
                    .addComponent(btn_mantis)
                    .addComponent(btn_bat))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lbl_attempt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lbl_point))
                .addContainerGap(63, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(88, 88, 88)
                    .addComponent(jLabel1)
                    .addContainerGap(164, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void count(){
        Counter=Counter-1;
        lbl_attempt.setText(Integer.toString(Counter));
    }
    
    
    public void result(){
        lbl_attempt.setText(Integer.toString(Counter));
    }
    
    private void btn_snakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_snakeActionPerformed
        cow5 c5=new cow5();
        Encapsulation j=new Encapsulation();

        PolymorphismAnimal i=new PolymorphismAnimal();
        PolymorphismAnimalSnake a=new PolymorphismAnimalSnake();

        lbl_mainAnimalSnake.setText(i.sound("animal"));
        lbl_animaldescSnake.setText(a.sound("snake"));

        //        lbl_operator.setVisible(false);
        j.setPoint(1);
        lbl_point.setText(Integer.toString(j.getPoint()));

        j.popupTrue();
        c5.show();
        dispose();
    }//GEN-LAST:event_btn_snakeActionPerformed

    private void btn_mantisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mantisActionPerformed
        //        encapCounter itung=new encapCounter();
        //        counterAbstract countA=new counterAbstract();
        //
        //
        //        lbl_attempt.setText(countA.counter());

        count();
        Encapsulation j=new Encapsulation();

        if(Counter==0){
            snake4 s=new snake4();
            j.popupFalse();

            s.show();
            dispose();
        }
    }//GEN-LAST:event_btn_mantisActionPerformed

    private void btn_batActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_batActionPerformed
        count();
        Encapsulation j=new Encapsulation();

        if(Counter==0){
            snake4 s=new snake4();
            j.popupFalse();

            s.show();
            dispose();
        }
    }//GEN-LAST:event_btn_batActionPerformed

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
            java.util.logging.Logger.getLogger(snake4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(snake4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(snake4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(snake4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new snake4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_bat;
    private javax.swing.JButton btn_mantis;
    private javax.swing.JButton btn_snake;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lbl_animaldescSnake;
    private javax.swing.JLabel lbl_attempt;
    private javax.swing.JLabel lbl_mainAnimalSnake;
    private javax.swing.JLabel lbl_point;
    // End of variables declaration//GEN-END:variables
}
