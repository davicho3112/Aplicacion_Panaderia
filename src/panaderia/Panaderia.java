
package panaderia;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Panaderia extends javax.swing.JFrame {

    
    private static String nombreCliente;
    public Panaderia() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_cantTortaVainilla = new javax.swing.JTextField();
        txt_cantNapoleon = new javax.swing.JTextField();
        txt_cantMantecada = new javax.swing.JTextField();
        txt_cantTresLeches = new javax.swing.JTextField();
        txt_cantTortaFresas = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Torta de vainilla");

        jLabel2.setText("Napoleon");

        jLabel3.setText("Mantecada");

        jLabel4.setText("Tres leches");

        jLabel5.setText("Torta de fresas");

        jLabel6.setText("Precios X unidad");

        jLabel7.setText("Categoria");

        jLabel8.setText("Refrigeracion");

        jLabel9.setText("Cantidad");

        jLabel10.setText("Nombre");

        jLabel11.setText("20000");

        jLabel12.setText("10000");

        jLabel13.setText("15000");

        jLabel14.setText("25000");

        jLabel15.setText("40000");

        jLabel16.setText("Tortas");

        jLabel17.setText("Postres");

        jLabel18.setText("Tortas");

        jLabel19.setText("Postres");

        jLabel20.setText("Tortas");

        jLabel21.setText("No");

        jLabel22.setText("Si");

        jLabel23.setText("No");

        jLabel24.setText("Si");

        jLabel25.setText("Si");

        jButton1.setText("SIGUIENTE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(63, 63, 63)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel21)
                                        .addGap(118, 118, 118)
                                        .addComponent(txt_cantTortaVainilla, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel13)
                                            .addComponent(jLabel12)
                                            .addComponent(jLabel14))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel5))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(53, 53, 53)
                                        .addComponent(jLabel6))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(66, 66, 66)
                                        .addComponent(jLabel15)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txt_cantTortaFresas, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(97, 97, 97)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel16)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel7)
                                                        .addGap(90, 90, 90)
                                                        .addComponent(jLabel8)
                                                        .addGap(97, 97, 97)
                                                        .addComponent(jLabel9))
                                                    .addComponent(jLabel20)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel18)
                                                        .addGap(142, 142, 142)
                                                        .addComponent(jLabel23)))
                                                .addGap(0, 7, Short.MAX_VALUE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel19)
                                                        .addGap(134, 134, 134)
                                                        .addComponent(jLabel24))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                        .addComponent(jLabel17)
                                                        .addGap(134, 134, 134)
                                                        .addComponent(jLabel22))
                                                    .addComponent(jLabel25))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txt_cantTresLeches, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_cantMantecada, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                            .addComponent(txt_cantNapoleon))))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_cantTortaVainilla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel16)
                    .addComponent(jLabel21))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_cantNapoleon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel17)
                    .addComponent(jLabel22))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_cantMantecada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel18)
                    .addComponent(jLabel23))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel14)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(jLabel24)
                            .addComponent(txt_cantTresLeches, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel15)
                    .addComponent(jLabel20)
                    .addComponent(jLabel25)
                    .addComponent(txt_cantTortaFresas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jButton1)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Metodo para calcular las ventas y compras de cada producto de la panaderia
     * @param evt 
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        Articulo ar = new Articulo();
        Categoria ct = new Categoria();
        ArrayList<Integer> articulo = new ArrayList<>();
        ArrayList<Integer> totalCompra = new ArrayList<>();
        
        int cantMantecada = Integer.parseInt(txt_cantMantecada.getText().trim());
        int cantTortaVainilla = Integer.parseInt(txt_cantTortaVainilla.getText().trim());
        int cantNapoleon = Integer.parseInt(txt_cantNapoleon.getText().trim());
        int cantTresLeches = Integer.parseInt(txt_cantTresLeches.getText().trim());
        int cantTortasFresas = Integer.parseInt(txt_cantTortaFresas.getText().trim());

        int sumaArticulos = 0;
        int sumaCompra = 0;
        int sumaTortas = 0;
        int sumaPostres = 0;

        
        //Recibimos el numero de cantidad para cada producto digitado por el usuario donde construimos un vector y le definimos su tamaño a base de la cantidad digitada, y hacemos un vector para acumule todas las cantidades de los productos y los guarde
        int[] cantidadMantecada = new int [cantMantecada];
        articulo.add(cantMantecada);
        
        int[] cantidadTortaVainilla = new int [cantTortaVainilla];
        articulo.add(cantTortaVainilla);
        
        int[] cantidadNapoleon = new int [cantNapoleon];
        articulo.add(cantNapoleon);
        
        int[] cantidadTresLeches = new int [cantTresLeches];
        articulo.add(cantTresLeches);
        
        int[] cantidadTortasFresas = new int [cantTortasFresas];
        articulo.add(cantTortasFresas);
        
        for (int i: articulo) {
            sumaArticulos += i;
        }
        
        //Mostramos el total de articulos que solicito el cliente
        JOptionPane.showMessageDialog(null,"Mantecada: "+cantMantecada
                       +"\nTorta De Vainilla: "+cantTortaVainilla
                       +"\nNapoleon: "+cantNapoleon
                       +"\nTres Leches: "+cantTresLeches
                       +"\nTortas de Fresas: "+cantTresLeches
                       +"\nEl cliente "+nombreCliente+" ordeno un total de:"+sumaArticulos+" articulos");
          
        //Mostramos el subtotl de cada producto del cliente
        JOptionPane.showMessageDialog(null,"Subtotal de cada producto para el cliente: "+nombreCliente
                                                           +"\nMantecada: $"+ar.cantMantecada(cantidadMantecada)
                                                           +"\nTorta de Vainilla: $"+ar.cantTortaVainilla(cantidadTortaVainilla)
                                                           +"\nNapoleon: $"+ar.cantNapoleon(cantidadNapoleon)
                                                           +"\nTres Leches: $"+ar.cantTresLeches(cantidadTresLeches)
                                                           +"\nTorta de Fresas: $"+ar.cantTortasFresas(cantidadTortasFresas)); //Pasamos el tamaño del vector mantecada y se aplica para el resto
           
        //Mostramos el total de compra del cliente
            
           totalCompra.add(ar.cantMantecada(cantidadMantecada));
           totalCompra.add(ar.cantNapoleon(cantidadNapoleon));
           totalCompra.add(ar.cantTortaVainilla(cantidadTortaVainilla));
           totalCompra.add(ar.cantTortasFresas(cantidadTortasFresas));
           totalCompra.add(ar.cantTresLeches(cantidadTresLeches));
           
           for(int i: totalCompra)
           {
               sumaCompra += i;
           } 
           
           JOptionPane.showMessageDialog(null,"El total de compras que realizo el cliente "+nombreCliente+" es de: $"+sumaCompra);
           
         //Mostramos el total de articulos para cada categoria
           JOptionPane.showMessageDialog(null,"El total de productos que fueron de la categoria torta es de: "+ct.tortas(cantMantecada,cantTortaVainilla,cantTortasFresas));
           JOptionPane.showMessageDialog(null,"El total de productos que fueron de la categoria postre es de: "+ct.Postres(cantNapoleon,cantTresLeches));
           
           //Mostramos el acumulado de ventas por categoria
           sumaTortas = ar.cantMantecada(cantidadMantecada) + ar.cantTortaVainilla(cantidadTortaVainilla) + ar.cantTortasFresas(cantidadTortasFresas);
           sumaPostres = ar.cantNapoleon(cantidadNapoleon) + ar.cantTresLeches(cantidadTresLeches);
           JOptionPane.showInternalMessageDialog(null, "La categoria tortas tiene un acumulado de ventas de: "+sumaTortas
                                                                   +"\nLa categoria tortas tiene un acumulado de ventas de: "+sumaPostres);
         
           //Mostramos los productos que necesitan y no necesitan refrigeracion
           JOptionPane.showInternalMessageDialog(null,"Los productos que necesitan refrigeracion son: "
                                                                   +"\n- Tres Leches: "+cantTresLeches
                                                                   +"\n- Torta de Fresas: "+cantTortasFresas
                                                                   +"\nLos Productos que no necesitan refrigeracion son:"
                                                                   +"\n- Torta de vainilla: "+cantTortaVainilla
                                                                   +"\n- Napoleon: "+cantNapoleon
                                                                   +"\n- Mantecada: "+cantMantecada);
           
           // Mostramos el promedio del total de venta
           int promedio = sumaArticulos/5;
           JOptionPane.showInternalMessageDialog(null,"El promedio total de venta es de:"+promedio);
             
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Panaderia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Panaderia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Panaderia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Panaderia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
   
//      cantidadCliente = Integer.parseInt(JOptionPane.showInputDialog(null,"BIENVENIDO. Ingrese el numero de clientes"));
        nombreCliente = JOptionPane.showInputDialog(null, "Digite el nombre del cliente");

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Panaderia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txt_cantMantecada;
    private javax.swing.JTextField txt_cantNapoleon;
    private javax.swing.JTextField txt_cantTortaFresas;
    private javax.swing.JTextField txt_cantTortaVainilla;
    private javax.swing.JTextField txt_cantTresLeches;
    // End of variables declaration//GEN-END:variables
}
