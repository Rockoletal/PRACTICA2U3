
public class AplicacionListaDoblePrioridad extends javax.swing.JFrame {
    ListaDoblePrioridad lista = new ListaDoblePrioridad();

    public AplicacionListaDoblePrioridad(){
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JTextField();
        btnInsertar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        txtValor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmbNivel = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PanelActionPerformed(evt);
            }
        });

        btnInsertar.setText("INSERTAR");
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel1.setText("Valor:");

        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        txtValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 36)); // NOI18N
        jLabel2.setText("LISTA DOBLE PRIORIDAD");

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel3.setText("Prioridad:");

        cmbNivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nivel 1 (BAJO)", "Nivel 2 (MEDIO)", "Nivel 3 (ALTO)" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Panel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                                .addComponent(btnInsertar)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminar)
                                .addGap(36, 36, 36)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar)
                    .addComponent(btnInsertar)
                    .addComponent(jLabel1)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbNivel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        String m = "";
        if(txtValor.getText().length()==0){ this.setTitle(m= "PORFAVOR INSERTE UN DATO"); return; }
        char dato = txtValor.getText().toUpperCase().charAt(0);
        int lvl = (cmbNivel.getSelectedIndex()+1);
        boolean r = lista.insertar(dato,lvl);
        m = "ERROR! NO HAY MEMORIA RAM PARA CREAR NUEVO NODO, LIBERA E INSERTA DE NUEVO";   
        if(r) m = "SE INSERTÓ CORRECTAMENTE ["+dato+"]["+lvl+"]";
        setTitle(m);
        txtValor.setText("");
        mostrarLista();
        //Panel.setText("["+ dato +"]["+lvl+"]");
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        boolean respuesta = lista.eliminar();
        String m = "ERROR LISTA VACIA";
        if(respuesta) m = "SE ELIMINO DATO CORRECTAMENTE";
        setTitle(m);
        mostrarLista();
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void PanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PanelActionPerformed

    }//GEN-LAST:event_PanelActionPerformed

    private void txtValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorActionPerformed

    }//GEN-LAST:event_txtValorActionPerformed
    public void mostrarLista(){
        if(lista.hayListaDobleVacia()){
            Panel.setText("");
            return;
        }      
        NodoDoble temp = lista.getIni();
        String cad = "";
        do{
            cad += " ["+temp.getDato()+"]["+temp.getNivel()+"] ";
            temp = temp.getSig();
        }while(temp!=null);
        Panel.setText(cad);
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AplicacionListaDoblePrioridad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Panel;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JComboBox<String> cmbNivel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
