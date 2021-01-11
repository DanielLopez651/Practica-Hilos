package hilosfilosofos;

import java.awt.Color;
import java.util.ArrayList;

public class Vista extends javax.swing.JFrame {

    Thread Filosofo1;
    Thread Filosofo2;
    Thread Filosofo3;
    Thread Filosofo4;
    Thread Filosofo5;
    Thread cubiertos;
    ArrayList<cubierto> lista = new ArrayList<>();

    int total = 5;

    public Vista() {
        initComponents();
        for (int i = 0; i < total; i++) {
            lista.add(new cubierto(i, "Disponible"));
        }
        Filosofo1 = new Thread(new Vista.hilo(1));
        Filosofo2 = new Thread(new Vista.hilo(2));
        Filosofo3 = new Thread(new Vista.hilo(3));
        Filosofo4 = new Thread(new Vista.hilo(4));
        Filosofo5 = new Thread(new Vista.hilo(5));
        cubiertos = new Thread(new Vista.cubiertoHilo());
        Filosofo1.start();
       Filosofo2.start();
      Filosofo3.start();
       Filosofo4.start();
       Filosofo5.start();
        cubiertos.start();
    }

    public class cubiertoHilo implements Runnable {

        @Override
        public void run() {
            while (true) {
                for (int i = 0; i < lista.size(); i++) {
                    switch (i) {
                        case 0:
                            estado6.setText(lista.get(i).getEstado());
                            if (lista.get(i).getEstado().equals("Disponible")) {
                                estado6.setForeground(Color.red);
                            } else {
                                estado6.setForeground(Color.black);
                            }
                            break;
                        case 1:
                            estado7.setText(lista.get(i).getEstado());
                            if (lista.get(i).getEstado().equals("Disponible")) {
                                estado7.setForeground(Color.red);
                            } else {
                                estado7.setForeground(Color.black);
                            }
                            break;
                        case 2:
                            estado8.setText(lista.get(i).getEstado());
                            if (lista.get(i).getEstado().equals("Disponible")) {
                                estado8.setForeground(Color.red);
                            } else {
                                estado8.setForeground(Color.black);
                            }
                            break;
                        case 3:
                            estado9.setText(lista.get(i).getEstado());
                            if (lista.get(i).getEstado().equals("Disponible")) {
                                estado9.setForeground(Color.red);
                            } else {
                                estado9.setForeground(Color.black);
                            }
                            break;
                        case 4:
                            estado10.setText(lista.get(i).getEstado());
                            if (lista.get(i).getEstado().equals("Disponible")) {
                                estado10.setForeground(Color.red);
                            } else {
                                estado10.setForeground(Color.black);
                            }
                            break;
                    }
                }
            }
        }

    }

    public class cubierto {

        private int numero;
        private String estado;

        public cubierto(int numero, String estado) {
            this.numero = numero;
            this.estado = estado;
        }

        public int getNumero() {
            return numero;
        }

        public void setNumero(int numero) {
            this.numero = numero;
        }

        public String getEstado() {
            return estado;
        }

        public void setEstado(String estado) {
            this.estado = estado;
        }

    }

    public class hilo implements Runnable {
        int numero;
        private hilo(int i) {
            this.numero = i;
        }
        @Override
        public void run() {
            try {
                while (true) {
                    int wait = (int) (Math.random() * (5000 - 1000) + 1000);
                    cambiar(numero, ("Pensando Filosofo " + numero), true);
                    Thread.sleep(wait);
                    if (numero > 1) {
                        if (lista.get(numero - 2).estado.equals("Disponible") && lista.get(numero-1).estado.equals("Disponible")) {
                                lista.get(numero - 2).setEstado("Ocupado");
                                lista.get(numero-1).setEstado("Ocupado");
                                cambiar(numero, ("Comiendo Filosofo " + numero), false);
                                Thread.sleep(2000);
                                lista.get(numero - 2).setEstado("Disponible");
                                lista.get(numero-1).setEstado("Disponible");
                        }
                    } else {
                        if (lista.get(numero-1).estado.equals("Disponible") && lista.get(total-1).estado.equals("Disponible")) {
                            lista.get(numero-1).setEstado("Ocupado");
                            lista.get(total-1).setEstado("Ocupado");
                            cambiar(numero, ("Comiendo Filosofo " + numero), false);
                            Thread.sleep(2000);
                            lista.get(numero - 1).setEstado("Disponible");
                            lista.get(total - 1).setEstado("Disponible");
                        }
                    }
                }

            } catch (Exception e) {
            }
        }
    }

    public void cambiar(int numero, String mensaje, boolean x) {
        switch (numero) {
            case 1:
                estado1.setText(mensaje);
                if (x) {
                    estado1.setForeground(Color.red);
                } else {
                    estado1.setForeground(Color.black);
                }
                break;
            case 2:
                estado2.setText(mensaje);
                if (x) {
                    estado2.setForeground(Color.red);
                } else {
                    estado2.setForeground(Color.black);
                }
                break;
            case 3:
                estado3.setText(mensaje);
                if (x) {
                    estado3.setForeground(Color.red);
                } else {
                    estado3.setForeground(Color.black);
                }

                break;
            case 4:
                estado4.setText(mensaje);
                if (x) {
                    estado4.setForeground(Color.red);
                } else {
                    estado4.setForeground(Color.black);
                }
                break;
            case 5:
                estado5.setText(mensaje);
                if (x) {
                    estado5.setForeground(Color.red);
                } else {
                    estado5.setForeground(Color.black);
                }
                break;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        estado8 = new javax.swing.JLabel();
        f1 = new javax.swing.JLabel();
        f2 = new javax.swing.JLabel();
        f3 = new javax.swing.JLabel();
        f4 = new javax.swing.JLabel();
        estado10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        estado2 = new javax.swing.JLabel();
        estado3 = new javax.swing.JLabel();
        estado4 = new javax.swing.JLabel();
        estado1 = new javax.swing.JLabel();
        cubierto3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        f5 = new javax.swing.JLabel();
        estado5 = new javax.swing.JLabel();
        estado6 = new javax.swing.JLabel();
        estado7 = new javax.swing.JLabel();
        estado9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        estado8.setText("Disponible");
        jPanel1.add(estado8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, -1, -1));

        f1.setText("Filosofo 1");
        jPanel1.add(f1, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 17, -1, -1));

        f2.setText("Filosofo 2");
        jPanel1.add(f2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 124, -1, -1));

        f3.setText("Filosofo 3");
        jPanel1.add(f3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, -1, -1));

        f4.setText("Filosofo5");
        jPanel1.add(f4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, -1, -1));

        estado10.setText("Disponible");
        jPanel1.add(estado10, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, -1, -1));

        jLabel5.setText("Cubierto5");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, -1, 20));

        estado2.setText("Estado");
        jPanel1.add(estado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 146, -1, -1));

        estado3.setText("Estado");
        jPanel1.add(estado3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, -1, -1));

        estado4.setText("Estado");
        jPanel1.add(estado4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, -1, -1));

        estado1.setText("Estado");
        jPanel1.add(estado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 39, -1, -1));

        cubierto3.setText("Cubierto3");
        jPanel1.add(cubierto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, -1, -1));

        jLabel2.setText("Cubierto4");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, -1, 20));

        jLabel3.setText("Cubierto 1");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 90, -1, -1));

        jLabel4.setText("Cubierto 2");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));

        f5.setText("Filosofo4");
        jPanel1.add(f5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, -1, -1));

        estado5.setText("Estado");
        jPanel1.add(estado5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, -1, -1));

        estado6.setText("Disponible");
        jPanel1.add(estado6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, -1, -1));

        estado7.setText("Disponible");
        jPanel1.add(estado7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        estado9.setText("Disponible");
        jPanel1.add(estado9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cubierto3;
    private javax.swing.JLabel estado1;
    private javax.swing.JLabel estado10;
    private javax.swing.JLabel estado2;
    private javax.swing.JLabel estado3;
    private javax.swing.JLabel estado4;
    private javax.swing.JLabel estado5;
    private javax.swing.JLabel estado6;
    private javax.swing.JLabel estado7;
    private javax.swing.JLabel estado8;
    private javax.swing.JLabel estado9;
    private javax.swing.JLabel f1;
    private javax.swing.JLabel f2;
    private javax.swing.JLabel f3;
    private javax.swing.JLabel f4;
    private javax.swing.JLabel f5;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
