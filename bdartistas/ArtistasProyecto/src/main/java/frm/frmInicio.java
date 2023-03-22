package frm;

import Entidades.Artistas;
import Entidades.Canciones;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Negocio.IArtistaNegocio;

/**
 *
 * @author Hermmann Cazares
 */
public class frmInicio extends javax.swing.JFrame {

    private IArtistaNegocio ArtistaNegocio;
    private int paginas;

    public frmInicio(IArtistaNegocio artistaNegocio) {
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.ArtistaNegocio = artistaNegocio;
        initComponents();
        lblSinRegistros.setVisible(false);
        if (this.ArtistaNegocio.obtenerLista() != null) {
            actPagina(this.ArtistaNegocio.obtenerLista().size());
        }
    }

    public void actPagina(int registrosTotales) {
        int limite = Integer.parseInt((String) CantidadPaginaCombo.getSelectedItem());
        int paginas = (int) Math.ceil((float) registrosTotales / limite);
        PaginasCbx.removeAllItems();
        for (int i = 1; i <= paginas; i++) {
            PaginasCbx.addItem((String.valueOf(i)));
        }
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblArtistas = new javax.swing.JTable();
        btnCrearTablas = new javax.swing.JButton();
        CantidadPaginaCombo = new javax.swing.JComboBox<>();
        PaginasCbx = new javax.swing.JComboBox<>();
        txtFiltro = new javax.swing.JTextField();
        lblSinRegistros = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Registros:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblArtistas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblArtistas);

        btnCrearTablas.setText("Crear los datos");
        btnCrearTablas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearTablasActionPerformed(evt);
            }
        });

        CantidadPaginaCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "5" }));
        CantidadPaginaCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CantidadPaginaComboActionPerformed(evt);
            }
        });

        PaginasCbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaginasCbxActionPerformed(evt);
            }
        });

        lblSinRegistros.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblSinRegistros.setText("No existen registros.");

        btnBuscar.setText("buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Busqueda:");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Página:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Registros:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 637, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(CantidadPaginaCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(PaginasCbx, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFiltro)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblSinRegistros)
                .addGap(119, 119, 119)
                .addComponent(btnCrearTablas)
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel4)
                .addGap(100, 100, 100)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PaginasCbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CantidadPaginaCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSinRegistros)
                    .addComponent(btnCrearTablas))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
public void llenarTabla(List<Artistas> lista) {
        String canciones = "";
        DefaultTableModel defa = new DefaultTableModel();
        tblArtistas.setModel(defa);
        defa.addColumn("Artista");
        defa.addColumn("Generos");
        defa.addColumn("Canciones");
        if (lista == null) {
            return;
        }
        Object[] datos = new Object[defa.getColumnCount()];
        for (Artistas artista : lista) {
            datos[0] = artista.getNombre();
            datos[1] = artista.getGenero();
            for (Canciones cancion : artista.getCanciones()) {
                canciones = canciones + ", ";
                canciones = canciones + cancion.getNombre();
            }
            datos[2] = canciones;
            defa.addRow(datos);
            canciones = "";
        }
    }
    private void btnCrearTablasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearTablasActionPerformed
        if (ArtistaNegocio.obtenerLista() != null) {
            JOptionPane.showMessageDialog(this, "Información creada.", "Error: información existennte.", JOptionPane.ERROR_MESSAGE);
            return;
        }
//CRREA AL PRIMER ARTISTA EN ESTE CASO YUNG LEAN Y POSTERIOR AGREGA 3 CANCIONES CON SU DURACIÓN CADA UNA.
        Artistas a1 = new Artistas("Yung lean", "Cloudrap, rap, rap alternativo");
        Canciones c1 = new Canciones("Hurt", "3:15", a1);
        Canciones c2 = new Canciones("Yoshi city", "4:10", a1);
        Canciones c3 = new Canciones("Red bottom sky", "4:34", a1);
//CRREA AL PRIMER ARTISTA EN ESTE CASO ZIROBIT Y POSTERIOR AGREGA 3 CANCIONES CON SU DURACIÓN CADA UNA.
        Artistas a2 = new Artistas("Ziro Bit", "rap, rock, plug");
        Canciones c11 = new Canciones("Diamonds", "2:23", a2);
        Canciones c22 = new Canciones("Haters broke", "2:44", a2);
        Canciones c33 = new Canciones("Lego ft los2010", "3:34", a2);
//CRREA AL PRIMER ARTISTA EN ESTE CASO C418 Y POSTERIOR AGREGA 3 CANCIONES CON SU DURACIÓN CADA UNA.
        Artistas a3 = new Artistas("C418", "Ambient, gamemusic, electronica");
        Canciones c111 = new Canciones("Moog city", "2:40", a3);
        Canciones c222 = new Canciones("Aria math", "5:10", a3);
        Canciones c333 = new Canciones("Sweden ", "3:36", a3);

        Artistas a4 = new Artistas("Bladee", "trap, pop, r&b");
        Canciones c1111 = new Canciones("Western union", "4:33", a4);
        Canciones c2222 = new Canciones("JSRF", "3:15", a4);
        Canciones c3333 = new Canciones("Reality surf", "4:20", a4);

        List<Canciones> listaa1 = new ArrayList<Canciones>();
        List<Canciones> listaa2 = new ArrayList<Canciones>();
        List<Canciones> listaa3 = new ArrayList<Canciones>();
        List<Canciones> listaa4 = new ArrayList<Canciones>();

        listaa1.add(c1);
        listaa1.add(c2);
        listaa1.add(c3);

        listaa2.add(c11);
        listaa2.add(c22);
        listaa2.add(c33);
        
        listaa3.add(c111);
        listaa3.add(c222);
        listaa3.add(c333);
        
        listaa4.add(c1111);
        listaa4.add(c2222);
        listaa4.add(c3333);

        a1.setCanciones(listaa1);
        a2.setCanciones(listaa2);
        a3.setCanciones(listaa3);
        a4.setCanciones(listaa4);


        List<Artistas> listaArtistas = new ArrayList<Artistas>();
        listaArtistas.add(a1);
        listaArtistas.add(a2);
        listaArtistas.add(a3);
         listaArtistas.add(a4);
        if (ArtistaNegocio.agregaArtistaLista(listaArtistas) == null) {
            JOptionPane.showMessageDialog(this, "Imposible guardar la información. ", "Error: Información.", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCrearTablasActionPerformed

    private void CantidadPaginaComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CantidadPaginaComboActionPerformed
        String filtro = txtFiltro.getText();
        if (ArtistaNegocio.obtenerListaFiltro(filtro)==null) {
            return;
        }
        actPagina(ArtistaNegocio.obtenerListaFiltro(filtro).size());
    }//GEN-LAST:event_CantidadPaginaComboActionPerformed

    private void PaginasCbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaginasCbxActionPerformed
        if (PaginasCbx.getSelectedItem() != null) {
            int limite = Integer.parseInt((String) CantidadPaginaCombo.getSelectedItem());
            int pagina = Integer.parseInt((String) PaginasCbx.getSelectedItem());
            int offset = (limite * (pagina - 1));
            String filtro = txtFiltro.getText();
            List<Artistas> listaArtista = ArtistaNegocio.obtenerListaFiltro(filtro, limite, offset);
            llenarTabla(listaArtista);
        }
    }//GEN-LAST:event_PaginasCbxActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String filtro = txtFiltro.getText();
        if (!filtro.equalsIgnoreCase("")) {
            if (ArtistaNegocio.obtenerListaFiltro(filtro) == null) {
                PaginasCbx.removeAllItems();
                lblSinRegistros.setVisible(true);
                DefaultTableModel defa = new DefaultTableModel();
                defa = (DefaultTableModel) tblArtistas.getModel();
                for (int i = 0; i < defa.getRowCount(); i++) {
                    defa.removeRow(i);
                }
                return;
            }
            lblSinRegistros.setVisible(false);
            actPagina(ArtistaNegocio.obtenerListaFiltro(filtro).size());
        } else {
            lblSinRegistros.setVisible(false);
            actPagina(ArtistaNegocio.obtenerListaFiltro(filtro).size());
            int limite = Integer.parseInt((String) CantidadPaginaCombo.getSelectedItem());
            int pagina = Integer.parseInt((String) PaginasCbx.getSelectedItem());
            int offset = (limite * (pagina - 1));
            List<Artistas> listaArtista = ArtistaNegocio.obtenerListaFiltro(filtro, limite, offset);
            llenarTabla(listaArtista);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CantidadPaginaCombo;
    private javax.swing.JComboBox<String> PaginasCbx;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCrearTablas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSinRegistros;
    private javax.swing.JTable tblArtistas;
    private javax.swing.JTextField txtFiltro;
    // End of variables declaration//GEN-END:variables
}
