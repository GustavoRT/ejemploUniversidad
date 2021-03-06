/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * VentanaPrincipal.java
 *
 * Created on 13/08/2010, 02:40:41 PM
 */
package co.edu.eam.diseno.banco.vista.gui;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.naming.NamingException;

import org.pushingpixels.substance.api.SubstanceLookAndFeel;
import org.pushingpixels.substance.api.skin.TwilightSkin;
//import org.pushingpixels.substance.api.SubstanceLookAndFeel;
//import org.pushingpixels.substance.api.skin.TwilightSkin;

/**
 *
 * @author Camilo Andres
 */
public class VentanaPrincipal extends javax.swing.JFrame {

	/** Creates new form VentanaPrincipal */
	public VentanaPrincipal() throws NamingException {
		initComponents();

		setTitle("Banco la Concordia");

	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jToolBar1 = new javax.swing.JToolBar();
		jButton1 = new javax.swing.JButton();
		jButton6 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jButton4 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jButton5 = new javax.swing.JButton();
		jDesktopPane1 = new co.edu.eam.diseno.banco.vista.util.PanelInterno();
		jMenuBar1 = new javax.swing.JMenuBar();
		mnuFile = new javax.swing.JMenu();
		jMenuItem11 = new javax.swing.JMenuItem();
		jMenu2 = new javax.swing.JMenu();
		mnuTransacciones = new javax.swing.JMenu();
		jMenuItem1 = new javax.swing.JMenuItem();
		jMenuItem3 = new javax.swing.JMenuItem();
		jMenuItem4 = new javax.swing.JMenuItem();
		jMenuItem6 = new javax.swing.JMenuItem();
		jMenuItem2 = new javax.swing.JMenuItem();
		jMenu4 = new javax.swing.JMenu();
		jMenuItem8 = new javax.swing.JMenuItem();
		jMenuItem9 = new javax.swing.JMenuItem();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setForeground(java.awt.Color.gray);
		setLocationByPlatform(true);
		addWindowStateListener(new java.awt.event.WindowStateListener() {
			public void windowStateChanged(java.awt.event.WindowEvent evt) {
				formWindowStateChanged(evt);
			}
		});

		jToolBar1.setRollover(true);

		jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/001_user.png"))); // NOI18N
		jButton1.setText("Cliente");
		jButton1.setFocusable(false);
		jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});
		jToolBar1.add(jButton1);

		jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/001_shoppingcart_full.png"))); // NOI18N
		jButton6.setText("Cuenta");
		jButton6.setFocusable(false);
		jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		jButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
		jButton6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton6ActionPerformed(evt);
			}
		});
		jToolBar1.add(jButton6);

		jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bundle-32x32x32b.png"))); // NOI18N
		jButton3.setText("Retiro");
		jButton3.setFocusable(false);
		jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});
		jToolBar1.add(jButton3);

		jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/piggy-bank-48x48x32b.png"))); // NOI18N
		jButton4.setText("Consignacion");
		jButton4.setFocusable(false);
		jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton4ActionPerformed(evt);
			}
		});
		jToolBar1.add(jButton4);

		jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/interact.png"))); // NOI18N
		jButton2.setText("Transferencia");
		jButton2.setFocusable(false);
		jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});
		jToolBar1.add(jButton2);

		jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Calender.png"))); // NOI18N
		jButton5.setText("Estracto");
		jButton5.setFocusable(false);
		jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
		jButton5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton5ActionPerformed(evt);
			}
		});
		jToolBar1.add(jButton5);

		mnuFile.setText("Archivo");

		jMenuItem11.setAccelerator(
				javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
		jMenuItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Error.png"))); // NOI18N
		jMenuItem11.setText("Salir");
		jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem11ActionPerformed(evt);
			}
		});
		mnuFile.add(jMenuItem11);

		jMenuBar1.add(mnuFile);

		jMenu2.setText("Operaciones");

		mnuTransacciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Income.png"))); // NOI18N
		mnuTransacciones.setText("Transacciones");

		jMenuItem1.setAccelerator(
				javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
		jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/piggy-bank-48x48x32b.png"))); // NOI18N
		jMenuItem1.setText("Consignacion");
		jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem1ActionPerformed(evt);
			}
		});
		mnuTransacciones.add(jMenuItem1);

		jMenuItem3.setAccelerator(
				javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
		jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bundle-32x32x32b.png"))); // NOI18N
		jMenuItem3.setText("Retiro");
		jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem3ActionPerformed(evt);
			}
		});
		mnuTransacciones.add(jMenuItem3);

		jMenuItem4.setAccelerator(
				javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
		jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/interact.png"))); // NOI18N
		jMenuItem4.setText("Transferencia");
		jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem4ActionPerformed(evt);
			}
		});
		mnuTransacciones.add(jMenuItem4);

		jMenu2.add(mnuTransacciones);

		jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C,
				java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
		jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/001_user.png"))); // NOI18N
		jMenuItem6.setText("Cliente");
		jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem6ActionPerformed(evt);
			}
		});
		jMenu2.add(jMenuItem6);

		jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C,
				java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
		jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/001_shoppingcart_full.png"))); // NOI18N
		jMenuItem2.setText("Cuenta");
		jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem2ActionPerformed(evt);
			}
		});
		jMenu2.add(jMenuItem2);

		jMenuBar1.add(jMenu2);

		jMenu4.setText("Informes");

		jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E,
				java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
		jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Calender.png"))); // NOI18N
		jMenuItem8.setText("Estracto Cuenta");
		jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem8ActionPerformed(evt);
			}
		});
		jMenu4.add(jMenuItem8);

		jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C,
				java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
		jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/people.png"))); // NOI18N
		jMenuItem9.setText("Lista de Clientes");
		jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem9ActionPerformed(evt);
			}
		});
		jMenu4.add(jMenuItem9);

		jMenuBar1.add(jMenu4);

		setJMenuBar(jMenuBar1);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 657, Short.MAX_VALUE)
				.addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 657, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
		// TODO add your handling code here:

		jDesktopPane1.add(new VentanaCrearEditarCliente());
	}// GEN-LAST:event_jButton1ActionPerformed

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed
		// TODO add your handling code here:
		jDesktopPane1.add(new VentanaTransaccion(VentanaTransaccion.TIPO_TX_TRANSFERENCIA));
	}// GEN-LAST:event_jButton2ActionPerformed

	private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItem1ActionPerformed
		// TODO add your handling code here:
		jDesktopPane1.add(new VentanaTransaccion(VentanaTransaccion.TIPO_TX_CONSIGNACION));
	}// GEN-LAST:event_jMenuItem1ActionPerformed

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton4ActionPerformed
		// TODO add your handling code here:
		jDesktopPane1.add(new VentanaTransaccion(VentanaTransaccion.TIPO_TX_CONSIGNACION));
	}// GEN-LAST:event_jButton4ActionPerformed

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton3ActionPerformed
		// TODO add your handling code here:
		jDesktopPane1.add(new VentanaTransaccion(VentanaTransaccion.TIPO_TX_RETIRO));
	}// GEN-LAST:event_jButton3ActionPerformed

	private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItem3ActionPerformed
		// TODO add your handling code here:
		jDesktopPane1.add(new VentanaTransaccion(VentanaTransaccion.TIPO_TX_RETIRO));
	}// GEN-LAST:event_jMenuItem3ActionPerformed

	private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItem4ActionPerformed
		// TODO add your handling code here:
		jDesktopPane1.add(new VentanaTransaccion(VentanaTransaccion.TIPO_TX_TRANSFERENCIA));
	}// GEN-LAST:event_jMenuItem4ActionPerformed

	private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItem6ActionPerformed
		// TODO add your handling code here:
		jDesktopPane1.add(new VentanaCrearEditarCliente());
	}// GEN-LAST:event_jMenuItem6ActionPerformed

	private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItem2ActionPerformed
		try {
			// TODO add your handling code here:
			jDesktopPane1.add(new VentanaCrearCancelarCuenta());
		} catch (Exception ex) {
			Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
		}

	}// GEN-LAST:event_jMenuItem2ActionPerformed

	private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton6ActionPerformed
		try {
			// TODO add your handling code here:
			jDesktopPane1.add(new VentanaCrearCancelarCuenta());
		} catch (Exception ex) {
			Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
		}

	}// GEN-LAST:event_jButton6ActionPerformed

	private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton5ActionPerformed
		// TODO add your handling code here:
		jDesktopPane1.add(new VentanaEstracto());
	}// GEN-LAST:event_jButton5ActionPerformed

	private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItem8ActionPerformed
		// TODO add your handling code here:
		jDesktopPane1.add(new VentanaEstracto());
	}// GEN-LAST:event_jMenuItem8ActionPerformed

	private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItem9ActionPerformed
		// TODO add your handling code here:
		jDesktopPane1.add(new VentanaCLientes());
	}// GEN-LAST:event_jMenuItem9ActionPerformed

	private void formWindowStateChanged(java.awt.event.WindowEvent evt) {// GEN-FIRST:event_formWindowStateChanged
		// TODO add your handling code here:
		// setTitle(getWidth()+","+getHeight());
	}// GEN-LAST:event_formWindowStateChanged

	private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItem11ActionPerformed
		// TODO add your handling code here:

		System.exit(0);
	}// GEN-LAST:event_jMenuItem11ActionPerformed

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {

			public void run() {

				try {
					Class.forName("com.mysql.jdbc.Driver");

					SubstanceLookAndFeel.setSkin(new TwilightSkin());

					new VentanaPrincipal().setVisible(true);

					// UIManager.setLookAndFeel("org.pushingpixels.substance.api.skin.SubstanceTwilightLookAndFeel");
				} catch (Exception ex) {
					Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
				}

			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JButton jButton5;
	private javax.swing.JButton jButton6;
	private co.edu.eam.diseno.banco.vista.util.PanelInterno jDesktopPane1;
	private javax.swing.JMenu jMenu2;
	private javax.swing.JMenu jMenu4;
	private javax.swing.JMenuBar jMenuBar1;
	private javax.swing.JMenuItem jMenuItem1;
	private javax.swing.JMenuItem jMenuItem11;
	private javax.swing.JMenuItem jMenuItem2;
	private javax.swing.JMenuItem jMenuItem3;
	private javax.swing.JMenuItem jMenuItem4;
	private javax.swing.JMenuItem jMenuItem6;
	private javax.swing.JMenuItem jMenuItem8;
	private javax.swing.JMenuItem jMenuItem9;
	private javax.swing.JToolBar jToolBar1;
	private javax.swing.JMenu mnuFile;
	private javax.swing.JMenu mnuTransacciones;
	// End of variables declaration//GEN-END:variables
}
