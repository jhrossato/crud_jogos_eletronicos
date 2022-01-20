package View;

import Controller.MenuClienteViewController;

public class MenuClienteView extends javax.swing.JFrame {
    
    private final MenuClienteViewController controller;
    LoginSenhaView telaSubMenu;
    MenuBuscarView telaBuscar;

    public MenuClienteView() {
        initComponents();
        controller = new MenuClienteViewController(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jPopupMenu3 = new javax.swing.JPopupMenu();
        jPopupMenu4 = new javax.swing.JPopupMenu();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        fundoLogin = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jButtonMinhaConta = new javax.swing.JButton();
        jButtonBuscarProduto = new javax.swing.JButton();
        jButtonCarrinhoDeCompras = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fundoLogin.setBackground(new java.awt.Color(204, 255, 255));
        fundoLogin.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        jButtonMinhaConta.setBackground(new java.awt.Color(204, 255, 255));
        jButtonMinhaConta.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jButtonMinhaConta.setIcon(new javax.swing.ImageIcon("C:\\Users\\joao_\\Documents\\NetBeansProjects\\ProjetoAPOO\\src\\main\\java\\Image\\icons8_user_25px.png")); // NOI18N
        jButtonMinhaConta.setText("Minha Conta");
        jButtonMinhaConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMinhaContaActionPerformed(evt);
            }
        });

        jButtonBuscarProduto.setBackground(new java.awt.Color(204, 255, 255));
        jButtonBuscarProduto.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jButtonBuscarProduto.setIcon(new javax.swing.ImageIcon("C:\\Users\\joao_\\Documents\\NetBeansProjects\\ProjetoAPOO\\src\\main\\java\\Image\\icons8_visual_game_boy_25px.png")); // NOI18N
        jButtonBuscarProduto.setText("Buscar Produto");
        jButtonBuscarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarProdutoActionPerformed(evt);
            }
        });

        jButtonCarrinhoDeCompras.setBackground(new java.awt.Color(204, 255, 255));
        jButtonCarrinhoDeCompras.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jButtonCarrinhoDeCompras.setIcon(new javax.swing.ImageIcon("C:\\Users\\joao_\\Documents\\NetBeansProjects\\ProjetoAPOO\\src\\main\\java\\Image\\icons8_shopping_cart_with_money_25px.png")); // NOI18N
        jButtonCarrinhoDeCompras.setText("Carrinho de compras");

        jButtonSair.setBackground(new java.awt.Color(204, 255, 255));
        jButtonSair.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jButtonSair.setIcon(new javax.swing.ImageIcon("C:\\Users\\joao_\\Documents\\NetBeansProjects\\ProjetoAPOO\\src\\main\\java\\Image\\icons8_exit_25px.png")); // NOI18N
        jButtonSair.setText("Sair/Logout");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jButtonMinhaConta, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jButtonBuscarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jButtonCarrinhoDeCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonMinhaConta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCarrinhoDeCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\joao_\\Documents\\NetBeansProjects\\desktopproject\\src\\main\\java\\images\\computador.png")); // NOI18N

        javax.swing.GroupLayout fundoLoginLayout = new javax.swing.GroupLayout(fundoLogin);
        fundoLogin.setLayout(fundoLoginLayout);
        fundoLoginLayout.setHorizontalGroup(
            fundoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fundoLoginLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(370, 370, 370))
        );
        fundoLoginLayout.setVerticalGroup(
            fundoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundoLoginLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
                .addGap(142, 142, 142))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fundoLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fundoLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonMinhaContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMinhaContaActionPerformed
        telaSubMenu = new LoginSenhaView();
        telaSubMenu.setVisible(true);
    }//GEN-LAST:event_jButtonMinhaContaActionPerformed

    private void jButtonBuscarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarProdutoActionPerformed
        telaBuscar = new MenuBuscarView();
        telaBuscar.setVisible(true);    // TODO add your handling code here:
    }//GEN-LAST:event_jButtonBuscarProdutoActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        System.exit(0);       // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSairActionPerformed

    
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
            java.util.logging.Logger.getLogger(MenuClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuClienteView().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel fundoLogin;
    private javax.swing.JButton jButtonBuscarProduto;
    private javax.swing.JButton jButtonCarrinhoDeCompras;
    private javax.swing.JButton jButtonMinhaConta;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JPopupMenu jPopupMenu3;
    private javax.swing.JPopupMenu jPopupMenu4;
    // End of variables declaration//GEN-END:variables
}
