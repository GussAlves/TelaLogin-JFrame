/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visão;

/**
 *
 * @author gustavo.araujo
 */
public class TelaConfirmacaoCadastro extends javax.swing.JFrame {

    /**
     * Creates new form TelaConfirmacaoCadastro
     */
    public TelaConfirmacaoCadastro() {
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

        jLabelMensagemConfirmação = new javax.swing.JLabel();
        jButtonRetornoTelaLogin = new javax.swing.JButton();
        jLabel1FundoConfirmacaoSenha = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabelMensagemConfirmação.setText("Usuário Cadastrado com sucesso, Muito obrigado!");
        getContentPane().add(jLabelMensagemConfirmação);
        jLabelMensagemConfirmação.setBounds(120, 70, 240, 130);

        jButtonRetornoTelaLogin.setText("Voltar para realizar login");
        jButtonRetornoTelaLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRetornoTelaLoginActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRetornoTelaLogin);
        jButtonRetornoTelaLogin.setBounds(130, 203, 220, 70);

        jLabel1FundoConfirmacaoSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundotelaLogin.png"))); // NOI18N
        getContentPane().add(jLabel1FundoConfirmacaoSenha);
        jLabel1FundoConfirmacaoSenha.setBounds(0, 0, 500, 375);

        setSize(new java.awt.Dimension(516, 414));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRetornoTelaLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRetornoTelaLoginActionPerformed
        TelaLogin retorno = new TelaLogin();
        retorno.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonRetornoTelaLoginActionPerformed

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
            java.util.logging.Logger.getLogger(TelaConfirmacaoCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaConfirmacaoCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaConfirmacaoCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaConfirmacaoCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaConfirmacaoCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRetornoTelaLogin;
    private javax.swing.JLabel jLabel1FundoConfirmacaoSenha;
    private javax.swing.JLabel jLabelMensagemConfirmação;
    // End of variables declaration//GEN-END:variables
}
