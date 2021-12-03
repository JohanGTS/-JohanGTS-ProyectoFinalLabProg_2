/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import form.Panel1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import menu.MenuItem;

/**
 *
 * @
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        execute();
    }

    private void execute() {
        ImageIcon iconMantenimiento = new ImageIcon(getClass().getResource("/menu/user.png"));
        ImageIcon iconMovimiento = new ImageIcon(getClass().getResource("/menu/setting.png"));
        ImageIcon iconProcesos = new ImageIcon(getClass().getResource("/menu/database.png"));
        ImageIcon iconConsultas = new ImageIcon(getClass().getResource("/menu/database.png"));
        ImageIcon iconMessage = new ImageIcon(getClass().getResource("/menu/message.png"));
        ImageIcon iconSubMenu = new ImageIcon(getClass().getResource("/menu/subMenu.png"));
        ImageIcon iconNext = new ImageIcon(getClass().getResource("/menu/next.png"));
        
        
        //  subMenu del Mantenimiento
        MenuItem menuUsuario = new MenuItem(iconSubMenu, "Usuario", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                panelBody.add(new Panel1());
                panelBody.repaint();
                panelBody.revalidate();
            }
        });
        MenuItem menuEntrenador = new MenuItem(iconSubMenu, "Entrenador", null);
        MenuItem menuLocalizacion = new MenuItem(iconSubMenu, "Localizacion", null);
        MenuItem menuSalas = new MenuItem(iconSubMenu, "Salas", null);
        MenuItem menuActividad = new MenuItem(iconSubMenu, "Actividad", null);
        MenuItem menuHorarioActividad = new MenuItem(iconSubMenu, "Horario Actividad", null);
        MenuItem menuClientes = new MenuItem(iconSubMenu, "Clientes", null);
        MenuItem menuEstadoReserva = new MenuItem(iconSubMenu, "Estado Reservas", null);
        MenuItem menuReserva = new MenuItem(iconSubMenu, "Reserva", null);
        MenuItem menuReservasActividades = new MenuItem(iconSubMenu, "Reservas Actividades", null);

        //  SubMenu del Movimiento 
        MenuItem menuCuotas = new MenuItem(iconSubMenu, "Cuotas", null);
       
        
        //  SubMenu del Procesos 
        MenuItem menuGenerarCobro = new MenuItem(iconSubMenu, "Generar Cobro", null);
        MenuItem menuReservarCobro = new MenuItem(iconSubMenu, "Reservar Cobro", null);
        MenuItem menuActualizarCuotas = new MenuItem(iconSubMenu, "ActualizarCuotas", null);
       
        


        //  SubMenu del Consultas
        MenuItem menuusuario = new MenuItem(iconSubMenu, "Usuario", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                panelBody.add(new Panel1());
                panelBody.repaint();
                panelBody.revalidate();
            }
        });
        MenuItem menuentrenador = new MenuItem(iconSubMenu, "Entrenador", null);
        MenuItem menulocalizacion = new MenuItem(iconSubMenu, "Localizacion", null);
        MenuItem menusalas = new MenuItem(iconSubMenu, "Salas", null);
        MenuItem menuactividad = new MenuItem(iconSubMenu, "Actividad", null);
        MenuItem menuhorarioactividad = new MenuItem(iconSubMenu, "Horario Actividad", null);
        MenuItem menuCobroFecha = new MenuItem(iconSubMenu, "Cobro por Rango de Fecha", null);
        MenuItem menuCobroCliente = new MenuItem(iconSubMenu, "Cobro por Clientes", null);
        MenuItem menuCuotaFecha = new MenuItem(iconSubMenu, "Cuota por Fecha", null);
        MenuItem menuCuotaClientes = new MenuItem(iconSubMenu, "Cuota por Clientes", null);
        MenuItem menuClientesBalance = new MenuItem(iconSubMenu, "Clienets con Balance Pendiente", null);
        
        

        MenuItem menuMantenimiento = new MenuItem(iconMantenimiento, "Mantenimiento", null, menuUsuario, menuEntrenador, menuLocalizacion,menuSalas,menuActividad,menuHorarioActividad,menuClientes,menuEstadoReserva,menuReserva,menuReservasActividades);
        MenuItem menuMovimiento = new MenuItem(iconMovimiento, "Movimientos", null, menuCuotas);
        MenuItem menuproceso = new MenuItem(iconProcesos, "Procesos", null,menuGenerarCobro,menuReservarCobro,menuActualizarCuotas);
        MenuItem menuConsultas = new MenuItem(iconMovimiento, "Consultas", null, menuusuario,menuentrenador,menulocalizacion,menusalas,menuactividad,menuhorarioactividad,menuCobroFecha,menuCobroCliente,menuCuotaFecha,menuCuotaClientes,menuClientesBalance);
        addMenu(menuMantenimiento, menuMovimiento, menuproceso,menuConsultas);
    }

    private void addMenu(MenuItem... menu) {
        for (int i = 0; i < menu.length; i++) {
            menus.add(menu[i]);
            ArrayList<MenuItem> subMenu = menu[i].getSubMenu();
            for (MenuItem m : subMenu) {
                addMenu(m);
            }
        }
        menus.revalidate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelHeader = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelMenu = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        menus = new javax.swing.JPanel();
        panelBody = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelHeader.setBackground(new java.awt.Color(255, 255, 51));
        panelHeader.setPreferredSize(new java.awt.Dimension(561, 50));

        jLabel1.setBackground(new java.awt.Color(255, 255, 51));
        jLabel1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel1.setText("                                                   GOLD GYM");
        jLabel1.setOpaque(true);

        javax.swing.GroupLayout panelHeaderLayout = new javax.swing.GroupLayout(panelHeader);
        panelHeader.setLayout(panelHeaderLayout);
        panelHeaderLayout.setHorizontalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 855, Short.MAX_VALUE)
            .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelHeaderLayout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 761, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(69, Short.MAX_VALUE)))
        );
        panelHeaderLayout.setVerticalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 54, Short.MAX_VALUE)
            .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelHeaderLayout.createSequentialGroup()
                    .addGap(6, 6, 6)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        getContentPane().add(panelHeader, java.awt.BorderLayout.PAGE_START);

        panelMenu.setBackground(new java.awt.Color(115, 120, 230));
        panelMenu.setPreferredSize(new java.awt.Dimension(250, 384));

        jScrollPane1.setBorder(null);

        menus.setBackground(new java.awt.Color(255, 255, 255));
        menus.setLayout(new javax.swing.BoxLayout(menus, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(menus);

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
        );

        getContentPane().add(panelMenu, java.awt.BorderLayout.LINE_START);

        panelBody.setBackground(new java.awt.Color(255, 255, 255));
        panelBody.setLayout(new java.awt.BorderLayout());
        getContentPane().add(panelBody, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(871, 473));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel menus;
    private javax.swing.JPanel panelBody;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JPanel panelMenu;
    // End of variables declaration//GEN-END:variables
}
