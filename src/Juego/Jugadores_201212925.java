package Juego;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.TransferHandler;
/**
 * @author Tobito
 */
public class Jugadores_201212925 extends javax.swing.JFrame {
    TablerodeJuego_201212925 Jugar = new TablerodeJuego_201212925();//Enlazar la clase TablerodeJuego_201212925
    //--------------Variables para el Cronometro---------------------------------
    boolean Suspendido;
    boolean Crono;
    int minutos;
    int segundos;
    //------------------------------------------------------
    String Tablero [][];//Declarar la Variable Tablero
    /**
     * Creates new form Jugadores_201212925
     */
     
    public Jugadores_201212925() {
        initComponents();
        //--------------Efecto Dragdrop--------------------------------------
        ficha1.setTransferHandler(new TransferHandler("icon")); 
        ficha2.setTransferHandler(new TransferHandler("icon"));
        ficha3.setTransferHandler(new TransferHandler("icon"));
        ficha4.setTransferHandler(new TransferHandler("icon"));
        ficha5.setTransferHandler(new TransferHandler("icon"));
        ficha6.setTransferHandler(new TransferHandler("icon"));
        FichaPJ1.setTransferHandler(new TransferHandler("icon"));
        FichaPJ2.setTransferHandler(new TransferHandler("icon"));
        
        //---------------------------------------Declarar el Tablero 8*8 con el nombre de las casillas----------------------------------
        Tablero = new String[][]{{"64 ","49 ","48 ","33 ","32 ", "17 ","16 ", "1 "},{"63 ","50 ","47 ","34 ","31 ", "18 ","15 ", "2 "},{"62 ","51 ","46 ","35 ","30 ", "19 ","14 ", "3 "},{"61 ","52 ","45 ","36 ","29 ", "20 ","13 ", "4 "},{"60 ","53 ","44 ","37 ","28 ", "21 ","12 ", "5 "},{"59 ","54 ","43 ","38 ","27 ", "22 ","11 ", "6 "},{"58 ","55 ","42 ","39 ","26 ", "23 ","10 ", "7 "},{"57 ","56 ","41 ","40 ","25 ", "24 ","9 ", "8 "}};
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Titulo = new javax.swing.JLabel();
        Panel1 = new javax.swing.JPanel();
        ficha1 = new javax.swing.JLabel();
        Panel2 = new javax.swing.JPanel();
        ficha2 = new javax.swing.JLabel();
        Panel3 = new javax.swing.JPanel();
        ficha3 = new javax.swing.JLabel();
        Panel4 = new javax.swing.JPanel();
        ficha4 = new javax.swing.JLabel();
        Panel5 = new javax.swing.JPanel();
        ficha5 = new javax.swing.JLabel();
        Panel6 = new javax.swing.JPanel();
        ficha6 = new javax.swing.JLabel();
        Escojer = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Escojer4 = new javax.swing.JLabel();
        Escojer5 = new javax.swing.JLabel();
        namePJ1 = new javax.swing.JTextField();
        Escojer6 = new javax.swing.JLabel();
        PanelFicha1 = new javax.swing.JPanel();
        FichaPJ1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        namePJ2 = new javax.swing.JTextField();
        Escojer7 = new javax.swing.JLabel();
        PanelFicha2 = new javax.swing.JPanel();
        FichaPJ2 = new javax.swing.JLabel();
        Escojer8 = new javax.swing.JLabel();
        Escojer9 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Crear Jugadores");
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(null);

        Titulo.setFont(new java.awt.Font("Britannic Bold", 0, 48)); // NOI18N
        Titulo.setForeground(new java.awt.Color(51, 255, 51));
        Titulo.setText("Jugadores");
        getContentPane().add(Titulo);
        Titulo.setBounds(290, 5, 218, 48);

        Panel1.setBackground(new java.awt.Color(0, 51, 51));
        Panel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        ficha1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ficha1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tablero_domo.png"))); // NOI18N
        ficha1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ficha1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
        Panel1.setLayout(Panel1Layout);
        Panel1Layout.setHorizontalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ficha1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ficha1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        getContentPane().add(Panel1);
        Panel1.setBounds(43, 123, 104, 104);

        Panel2.setBackground(new java.awt.Color(0, 51, 51));
        Panel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        ficha2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ficha2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tablero_gato.png"))); // NOI18N
        ficha2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ficha2MousePressed(evt);
            }
        });

        javax.swing.GroupLayout Panel2Layout = new javax.swing.GroupLayout(Panel2);
        Panel2.setLayout(Panel2Layout);
        Panel2Layout.setHorizontalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ficha2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Panel2Layout.setVerticalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ficha2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        getContentPane().add(Panel2);
        Panel2.setBounds(165, 123, 104, 104);

        Panel3.setBackground(new java.awt.Color(0, 51, 51));
        Panel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        ficha3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ficha3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tablero_marciano.png"))); // NOI18N
        ficha3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ficha3MousePressed(evt);
            }
        });

        javax.swing.GroupLayout Panel3Layout = new javax.swing.GroupLayout(Panel3);
        Panel3.setLayout(Panel3Layout);
        Panel3Layout.setHorizontalGroup(
            Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ficha3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Panel3Layout.setVerticalGroup(
            Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ficha3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        getContentPane().add(Panel3);
        Panel3.setBounds(287, 123, 104, 104);

        Panel4.setBackground(new java.awt.Color(0, 51, 51));
        Panel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        ficha4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ficha4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tablero_peludito.png"))); // NOI18N
        ficha4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ficha4MousePressed(evt);
            }
        });

        javax.swing.GroupLayout Panel4Layout = new javax.swing.GroupLayout(Panel4);
        Panel4.setLayout(Panel4Layout);
        Panel4Layout.setHorizontalGroup(
            Panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ficha4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Panel4Layout.setVerticalGroup(
            Panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ficha4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        getContentPane().add(Panel4);
        Panel4.setBounds(409, 123, 104, 104);

        Panel5.setBackground(new java.awt.Color(0, 51, 51));
        Panel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        ficha5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ficha5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tablero_cocodrilo.png"))); // NOI18N
        ficha5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ficha5MousePressed(evt);
            }
        });

        javax.swing.GroupLayout Panel5Layout = new javax.swing.GroupLayout(Panel5);
        Panel5.setLayout(Panel5Layout);
        Panel5Layout.setHorizontalGroup(
            Panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ficha5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Panel5Layout.setVerticalGroup(
            Panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ficha5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        getContentPane().add(Panel5);
        Panel5.setBounds(531, 123, 104, 104);

        Panel6.setBackground(new java.awt.Color(0, 51, 51));
        Panel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        ficha6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ficha6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tablero_pyong.png"))); // NOI18N
        ficha6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ficha6MousePressed(evt);
            }
        });
        ficha6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ficha6KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout Panel6Layout = new javax.swing.GroupLayout(Panel6);
        Panel6.setLayout(Panel6Layout);
        Panel6Layout.setHorizontalGroup(
            Panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ficha6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Panel6Layout.setVerticalGroup(
            Panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ficha6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        getContentPane().add(Panel6);
        Panel6.setBounds(653, 123, 104, 104);

        Escojer.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        Escojer.setForeground(new java.awt.Color(255, 255, 0));
        Escojer.setText("Escoje una ficha:");
        getContentPane().add(Escojer);
        Escojer.setBounds(110, 90, 160, 26);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(400, 266, 2, 275);

        Escojer4.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        Escojer4.setForeground(new java.awt.Color(255, 255, 0));
        Escojer4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        Escojer4.setText("Jugador 1:");
        getContentPane().add(Escojer4);
        Escojer4.setBounds(40, 260, 130, 40);

        Escojer5.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        Escojer5.setForeground(new java.awt.Color(255, 255, 0));
        Escojer5.setText("Nombre:");
        getContentPane().add(Escojer5);
        Escojer5.setBounds(40, 310, 80, 26);

        namePJ1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        namePJ1.setMinimumSize(new java.awt.Dimension(300, 30));
        namePJ1.setPreferredSize(new java.awt.Dimension(300, 30));
        getContentPane().add(namePJ1);
        namePJ1.setBounds(40, 340, 300, 30);

        Escojer6.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        Escojer6.setForeground(new java.awt.Color(255, 255, 0));
        Escojer6.setText("Ficha:");
        getContentPane().add(Escojer6);
        Escojer6.setBounds(80, 390, 60, 26);

        PanelFicha1.setBackground(new java.awt.Color(153, 0, 0));
        PanelFicha1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        PanelFicha1.setForeground(new java.awt.Color(153, 0, 0));

        FichaPJ1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FichaPJ1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                FichaPJ1MouseReleased(evt);
            }
        });
        FichaPJ1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FichaPJ1KeyReleased(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                FichaPJ1KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout PanelFicha1Layout = new javax.swing.GroupLayout(PanelFicha1);
        PanelFicha1.setLayout(PanelFicha1Layout);
        PanelFicha1Layout.setHorizontalGroup(
            PanelFicha1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FichaPJ1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        PanelFicha1Layout.setVerticalGroup(
            PanelFicha1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FichaPJ1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        getContentPane().add(PanelFicha1);
        PanelFicha1.setBounds(150, 390, 104, 104);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(325, 547, 158, 42);

        namePJ2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        namePJ2.setMinimumSize(new java.awt.Dimension(300, 30));
        namePJ2.setPreferredSize(new java.awt.Dimension(300, 30));
        getContentPane().add(namePJ2);
        namePJ2.setBounds(450, 340, 300, 30);

        Escojer7.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        Escojer7.setForeground(new java.awt.Color(255, 255, 0));
        Escojer7.setText("Ficha:");
        getContentPane().add(Escojer7);
        Escojer7.setBounds(490, 390, 60, 26);

        PanelFicha2.setBackground(new java.awt.Color(0, 102, 51));
        PanelFicha2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        FichaPJ2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FichaPJ2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                FichaPJ2MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout PanelFicha2Layout = new javax.swing.GroupLayout(PanelFicha2);
        PanelFicha2.setLayout(PanelFicha2Layout);
        PanelFicha2Layout.setHorizontalGroup(
            PanelFicha2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FichaPJ2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        PanelFicha2Layout.setVerticalGroup(
            PanelFicha2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FichaPJ2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        getContentPane().add(PanelFicha2);
        PanelFicha2.setBounds(560, 390, 104, 104);

        Escojer8.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        Escojer8.setForeground(new java.awt.Color(255, 255, 0));
        Escojer8.setText("Nombre:");
        getContentPane().add(Escojer8);
        Escojer8.setBounds(450, 310, 80, 26);

        Escojer9.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        Escojer9.setForeground(new java.awt.Color(255, 255, 0));
        Escojer9.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        Escojer9.setText("Jugador 2:");
        getContentPane().add(Escojer9);
        Escojer9.setBounds(450, 260, 130, 40);

        Fondo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondoplayer_201212925.jpg"))); // NOI18N
        Fondo.setToolTipText("");
        getContentPane().add(Fondo);
        Fondo.setBounds(0, 0, 810, 620);

        setSize(new java.awt.Dimension(816, 639));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ficha1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ficha1MousePressed
        //--------------Efecto Dragdrop-------------
        JComponent comp = (JComponent) evt.getSource();
        TransferHandler handler = comp.getTransferHandler();
        handler.exportAsDrag(comp, evt, TransferHandler.COPY);
    }//GEN-LAST:event_ficha1MousePressed

    private void ficha2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ficha2MousePressed
        //--------------Efecto Dragdrop-------------
        JComponent comp = (JComponent) evt.getSource();
        TransferHandler handler = comp.getTransferHandler();
        handler.exportAsDrag(comp, evt, TransferHandler.COPY);
    }//GEN-LAST:event_ficha2MousePressed

    private void ficha3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ficha3MousePressed
        //--------------Efecto Dragdrop-------------
        JComponent comp = (JComponent) evt.getSource();
        TransferHandler handler = comp.getTransferHandler();
        handler.exportAsDrag(comp, evt, TransferHandler.COPY);
    }//GEN-LAST:event_ficha3MousePressed

    private void ficha4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ficha4MousePressed
        //--------------Efecto Dragdrop-------------
        JComponent comp = (JComponent) evt.getSource();
        TransferHandler handler = comp.getTransferHandler();
        handler.exportAsDrag(comp, evt, TransferHandler.COPY);
    }//GEN-LAST:event_ficha4MousePressed

    private void ficha5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ficha5MousePressed
        //--------------Efecto Dragdrop-------------
        JComponent comp = (JComponent) evt.getSource();
        TransferHandler handler = comp.getTransferHandler();
        handler.exportAsDrag(comp, evt, TransferHandler.COPY);
    }//GEN-LAST:event_ficha5MousePressed

    private void ficha6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ficha6KeyPressed
       
    }//GEN-LAST:event_ficha6KeyPressed

    private void ficha6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ficha6MousePressed
         //--------------Efecto Dragdrop-------------
        JComponent comp = (JComponent) evt.getSource();
        TransferHandler handler = comp.getTransferHandler();
        handler.exportAsDrag(comp, evt, TransferHandler.COPY);
    }//GEN-LAST:event_ficha6MousePressed
       
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String nombre1 = namePJ1.getText();
        String nombre2 = namePJ2.getText();
        if(nombre1.equals(nombre2)){//verificar si los nombres de los jugadores son iguales
             JOptionPane.showMessageDialog( null, "Los nombres de los Jugadores son iguales" );
        }
        else{
             if(FichaPJ1.getIcon().toString().equals(FichaPJ2.getIcon().toString())){
            JOptionPane.showMessageDialog( null, "Las fichas son las mismas" );//son iguales
             }else
             {
               
                this.setVisible(false);// cerrar la ventana jugadores
                this.Jugar.setVisible(true);
                nombrarPJ();//Escribir los nombres de los jugadores
                escojerFicha(); //Escojer las fichas
                imprimirTablero(); // Imprimir el Tablero Matriz
                Cronometro_201212925 reloj = new Cronometro_201212925(Jugar.ContadorNum ,Crono);
                reloj.start();
             }    
        }     
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void FichaPJ1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FichaPJ1KeyReleased
        
    }//GEN-LAST:event_FichaPJ1KeyReleased

    private void FichaPJ1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FichaPJ1KeyPressed
       
    }//GEN-LAST:event_FichaPJ1KeyPressed

    private void FichaPJ2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FichaPJ2MouseReleased

    }//GEN-LAST:event_FichaPJ2MouseReleased

    private void FichaPJ1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FichaPJ1MouseReleased
        
    }//GEN-LAST:event_FichaPJ1MouseReleased

    public void nombrarPJ(){ //Pasar los nombres al otro Form(TablerodeJuego_201212925)
        this.Jugar.PJ1.setText(this.namePJ1.getText());
        this.Jugar.PJ2.setText(this.namePJ2.getText());
        this.Jugar.Turno.setText("Es el turno de: "+this.namePJ1.getText());
    }
    public void escojerFicha(){//Pasar las fichas al otro Form(TablerodeJuego_201212925)
        this.Jugar.minFichaPJ2.setIcon(this.FichaPJ1.getIcon()); 
        this.Jugar.minFichaPJ1.setIcon(this.FichaPJ2.getIcon());
        this.Jugar.PJ1ficha1.setIcon(this.FichaPJ1.getIcon()); 
        this.Jugar.PJ1ficha2.setIcon(this.FichaPJ2.getIcon());
    }
    public void imprimirTablero(){
        JLabel label;
        String Casillas;
        for (int i= 0; i < 8; i++) {  //Bucle para los datos de las columnas 
            for (int j= 0; j < 8; j++){ //Bucle para los datos de las filas
                Casillas = Tablero[i][j];
                label =  new JLabel(Casillas);
                label.setHorizontalAlignment(JLabel.RIGHT); // alineacion horizontal
                label.setVerticalAlignment(JLabel.TOP);
                label.setForeground(Color.ORANGE); //color del label
                label.setFont(new Font("Comic Sans MS", Font.BOLD, 16)); //letra y tamaño
                label.setBounds(80*i, 80*j, 82, 82); // la distancia entre cada celda
                label.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0,0,0)));
                Jugar.JuegoTablero.add(label);//agregar los labels en el Panel JuegoTablero
                }
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
            java.util.logging.Logger.getLogger(Jugadores_201212925.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jugadores_201212925.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jugadores_201212925.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jugadores_201212925.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jugadores_201212925().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Escojer;
    private javax.swing.JLabel Escojer4;
    private javax.swing.JLabel Escojer5;
    private javax.swing.JLabel Escojer6;
    private javax.swing.JLabel Escojer7;
    private javax.swing.JLabel Escojer8;
    private javax.swing.JLabel Escojer9;
    public javax.swing.JLabel FichaPJ1;
    public javax.swing.JLabel FichaPJ2;
    private javax.swing.JLabel Fondo;
    private javax.swing.JPanel Panel1;
    private javax.swing.JPanel Panel2;
    private javax.swing.JPanel Panel3;
    private javax.swing.JPanel Panel4;
    private javax.swing.JPanel Panel5;
    private javax.swing.JPanel Panel6;
    private javax.swing.JPanel PanelFicha1;
    private javax.swing.JPanel PanelFicha2;
    private javax.swing.JLabel Titulo;
    public javax.swing.JLabel ficha1;
    public javax.swing.JLabel ficha2;
    public javax.swing.JLabel ficha3;
    public javax.swing.JLabel ficha4;
    public javax.swing.JLabel ficha5;
    public javax.swing.JLabel ficha6;
    public javax.swing.JButton jButton1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField namePJ1;
    private javax.swing.JTextField namePJ2;
    // End of variables declaration//GEN-END:variables

    
}
