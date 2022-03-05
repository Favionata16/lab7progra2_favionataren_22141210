/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab7progra2_FavioNatarenl_22141210;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author favio
 */
public class tabla extends javax.swing.JFrame {

    public tabla() {
        this.setLocationRelativeTo(null);
        initComponents();
    }

    ArrayList<Equipo> equipos = new ArrayList();
    private File file = new File("./equipos.txt");
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        nomequi = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jdelim = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        edit = new javax.swing.JTextField();
        jdedit = new javax.swing.JComboBox<>();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jbsim1 = new javax.swing.JComboBox<>();
        jbsim2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });

        jToggleButton1.setText("Agregar");
        jToggleButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButton1MouseClicked(evt);
            }
        });

        jScrollPane1.setViewportView(nomequi);

        jLabel1.setText("Ingrese Nombre De El Nuevo Equipo");

        jLabel2.setText("Editar");

        jLabel3.setText("Eliminar");

        jLabel4.setText("Cargar Archivo");

        jButton2.setText("Seleccionar Documento");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton3.setText("Eliminar");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jdedit.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jdeditItemStateChanged(evt);
            }
        });

        jButton4.setText("Editar");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        jLabel5.setText("Ingrese Nuevo Nombre");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(3, 3, 3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(275, 275, 275)
                                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2)
                                .addGap(120, 120, 120)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jdelim, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(24, 24, 24)))
                .addGap(0, 363, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 719, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jdedit, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(135, 135, 135)
                                .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jdedit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jButton2)
                            .addComponent(jLabel3)
                            .addComponent(jdelim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(91, 91, 91))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jTabbedPane1.addTab("Opiones Equipo", jPanel1);

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Equipo", "PJugados", "PG ", "PE ", "PP", "GF", "GC", "Diferencia ", "Pts"
            }
        ));
        jScrollPane2.setViewportView(tabla);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 950, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
        );

        jTabbedPane1.addTab("Tabla De Posiciones", jPanel2);

        jButton1.setText("Simular Partido");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jLabel6.setText("Primer Equipo");

        jLabel7.setText("Segundo Equipo");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(221, 221, 221))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jbsim1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 513, Short.MAX_VALUE)
                .addComponent(jbsim2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(151, 151, 151))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbsim1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbsim2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Simulacion", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 972, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton1MouseClicked
        boolean x=false;
        for (Equipo equ : equipos) {
            if(equ.getNombre().equalsIgnoreCase(nomequi.getText())){
                x=true;
                break;
            }
        }
            if (x==false) {
            equipos.add(new Equipo(nomequi.getText(),0,0,0,0,0,0,0,0));
            try {
                escribirArchivo();
                jbox();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Ocurrio Un error");
            }
            }else{
                JOptionPane.showMessageDialog(this, "No puede Tener 2 Equipos Con Nombres Iguales");
            }
    }//GEN-LAST:event_jToggleButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
    JFileChooser file1=new JFileChooser();
    file1.showOpenDialog(this);
    File abre=file1.getSelectedFile();
        if (abre!=null) {
            file=abre;
            boolean b=cargarArchivo();
            if (b) {
                JOptionPane.showMessageDialog(this, "Datos Recuperdos Exitosamente");
                jbox();
            }
        }
    }//GEN-LAST:event_jButton2MouseClicked

    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged
        DefaultTableModel modelo2=new DefaultTableModel() ;
        modelo2.addColumn("Equipo");
        modelo2.addColumn("Partidos Jugados");
        modelo2.addColumn("Partidos Ganados");
        modelo2.addColumn("Partidos Empatados");
        modelo2.addColumn("Partidos Perdidos");
        modelo2.addColumn("Goles a fabor");
        modelo2.addColumn("Goles en Contra");
        modelo2.addColumn("Diferencia");
        modelo2.addColumn("Puntos");
        
        Object[] ob=new Object[9];
        for (Equipo equi : equipos) {
            ob[0]=equi.getNombre();
            ob[1]=equi.getPartidosJugados();
            ob[2]=equi.getPartidosGanados();
            ob[3]=equi.getPartidosEmpatados();
            ob[4]=equi.getParperdi();
            ob[5]=equi.getGolesfabor();
            ob[6]=equi.getGolescontra();
            ob[7]=equi.getDiferencia();
            ob[8]=equi.getPts();
            modelo2.addRow(ob);
        }
            tabla.setModel(modelo2);
    }//GEN-LAST:event_jTabbedPane1StateChanged

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        if (jdelim.getSelectedIndex()>=0) {
            equipos.remove(jdelim.getSelectedIndex());
            jbox();
            JOptionPane.showMessageDialog(this, "se elimino el equipo correctamente!");
            try {
                escribirArchivo2();
            } catch (IOException ex) {
                
            }
        }else{
             JOptionPane.showMessageDialog(this, "seleccione un equipo!");
        }
        
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        if (jdedit.getSelectedIndex()>=0 && edit.getText()!="") {
            equipos.get(jdedit.getSelectedIndex()).setNombre(edit.getText());
            JOptionPane.showMessageDialog(this, "se edito correctamente!");
            jbox();
        }else{
            JOptionPane.showMessageDialog(this, "seleccione un equipo ");
        }
        
    }//GEN-LAST:event_jButton4MouseClicked

    private void jdeditItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jdeditItemStateChanged
        if (jdedit.getSelectedIndex()>=0) {
            edit.setText(equipos.get(jdedit.getSelectedIndex()).getNombre());
        }
    }//GEN-LAST:event_jdeditItemStateChanged

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        if (jbsim1.getSelectedIndex()!=jbsim2.getSelectedIndex()) {
            Random r=new Random();
            int equip1=1+r.nextInt(5);
            int equip2=1+r.nextInt(5);
            if (equip1<equip2) {
                JOptionPane.showMessageDialog(this, " gano el equipo  "+equipos.get(jbsim2.getSelectedIndex()).getNombre()+" "+equip2+" a "+equip1);
                equipos.get(jbsim1.getSelectedIndex()).setGolescontra(equip2);
                equipos.get(jbsim1.getSelectedIndex()).setGolesfabor(equip1);
                equipos.get(jbsim1.getSelectedIndex()).setPartidosJugados(1);
                equipos.get(jbsim1.getSelectedIndex()).setParperdi(1);
                equipos.get(jbsim2.getSelectedIndex()).setGolescontra(equip1);
                equipos.get(jbsim2.getSelectedIndex()).setGolesfabor(equip2);
                equipos.get(jbsim2.getSelectedIndex()).setPartidosJugados(1);
                equipos.get(jbsim2.getSelectedIndex()).setPartidosGanados(1);
                equipos.get(jbsim2.getSelectedIndex()).setPts(3);
            }else{
                if (equip1>equip2) {
                    JOptionPane.showMessageDialog(this, " gano el equipo "+equipos.get(jbsim1.getSelectedIndex()).getNombre()+" "+equip1+" a "+equip2);
                equipos.get(jbsim2.getSelectedIndex()).setGolescontra(equip2);
                equipos.get(jbsim2.getSelectedIndex()).setGolesfabor(equip1);
                equipos.get(jbsim2.getSelectedIndex()).setPartidosJugados(1);
                equipos.get(jbsim2.getSelectedIndex()).setParperdi(1);
                equipos.get(jbsim1.getSelectedIndex()).setGolescontra(equip1);
                equipos.get(jbsim1.getSelectedIndex()).setGolesfabor(equip2);
                equipos.get(jbsim1.getSelectedIndex()).setPartidosJugados(1);
                equipos.get(jbsim1.getSelectedIndex()).setPartidosGanados(1);
                equipos.get(jbsim1.getSelectedIndex()).setPts(3);
                }else{
                    JOptionPane.showMessageDialog(this, " empato "+equip1+" con "+equip2);
                equipos.get(jbsim2.getSelectedIndex()).setGolescontra(equip2);
                equipos.get(jbsim2.getSelectedIndex()).setGolesfabor(equip1);
                equipos.get(jbsim2.getSelectedIndex()).setPartidosJugados(1);
                equipos.get(jbsim2.getSelectedIndex()).setPartidosEmpatados(1);
                equipos.get(jbsim1.getSelectedIndex()).setGolescontra(equip1);
                equipos.get(jbsim1.getSelectedIndex()).setGolesfabor(equip2);
                equipos.get(jbsim1.getSelectedIndex()).setPartidosJugados(1);
                equipos.get(jbsim1.getSelectedIndex()).setPartidosEmpatados(1);
                equipos.get(jbsim1.getSelectedIndex()).setPts(1);
                equipos.get(jbsim2.getSelectedIndex()).setPts(1);
                }
            }
        }else{
            JOptionPane.showMessageDialog(this, "esta seleccionando el mismo equipo! ");
        }
    }//GEN-LAST:event_jButton1MouseClicked

    public void escribirArchivo() throws IOException {
            FileWriter fw = null;
            BufferedWriter bw = null;
            try {
                fw = new FileWriter(file, false);
                bw = new BufferedWriter(fw);
                for (Equipo e : equipos) {
                    bw.write(e.getNombre() + ";");
                    bw.write(e.getPartidosJugados() + ";");
                    bw.write(e.getPartidosGanados() + ";");
                    bw.write(e.getPartidosEmpatados() + ";");
                    bw.write(e.getParperdi() + ";");
                    bw.write(e.getGolesfabor() + ";");
                    bw.write(e.getGolescontra() + ";");
                    bw.write(e.getDiferencia() + ";");
                    bw.write(e.getPts() + ";");
                    bw.write("\n");
                }
                bw.flush();
            } catch (Exception ex) {
                
            }
            bw.close();
            fw.close();
        }
        public void escribirArchivo2() throws IOException {
            FileWriter fw = null;
            BufferedWriter bw = null;
            try {
                fw = new FileWriter(file, true);
                bw = new BufferedWriter(fw);
                for (Equipo e : equipos) {
                    bw.write(e.getNombre() + ";");
                    bw.write(e.getPartidosJugados() + ";");
                    bw.write(e.getPartidosGanados() + ";");
                    bw.write(e.getPartidosEmpatados() + ";");
                    bw.write(e.getParperdi() + ";");
                    bw.write(e.getGolesfabor() + ";");
                    bw.write(e.getGolescontra() + ";");
                    bw.write(e.getDiferencia() + ";");
                    bw.write(e.getPts() + ";");
                    bw.write("\n");
                }
                bw.flush();
            } catch (Exception ex) {
                
            }
            bw.close();
            fw.close();
        }
    
    public boolean cargarArchivo() {
        Scanner leer = null;
        boolean a=true;
        ArrayList <Equipo> equip = new ArrayList();
        if (file.exists()) {
            try {
                leer = new Scanner(file);
                leer.useDelimiter(";");
                while (leer.hasNext()) {
                    equip.add(new Equipo(leer.next(),leer.nextInt(),leer.nextInt(),leer.nextInt(),leer.nextInt(),leer.nextInt(),leer.nextInt(),leer.nextInt(),leer.nextInt()));
                }
                equipos=equip;
            } catch (Exception ex) {
                a=false;
                JOptionPane.showMessageDialog(this, "error");
            }
            leer.close();
        }
        return a;
    }
    public void jbox(){
        jdedit.removeAllItems();
        jdelim.removeAllItems();
        jbsim2.removeAllItems();
        jbsim1.removeAllItems();
        for (Equipo equipo : equipos) {
           jdedit.addItem(equipo.toString());
        }
        for (Equipo equipo : equipos) {
           jdelim.addItem(equipo.toString());
        }
        for (Equipo equipo : equipos) {
           jbsim1.addItem(equipo.toString());
        }
        for (Equipo equipo : equipos) {
           jbsim2.addItem(equipo.toString());
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
            java.util.logging.Logger.getLogger(tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tabla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField edit;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JComboBox<String> jbsim1;
    private javax.swing.JComboBox<String> jbsim2;
    private javax.swing.JComboBox<String> jdedit;
    private javax.swing.JComboBox<String> jdelim;
    private javax.swing.JTextPane nomequi;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
    
    
}
