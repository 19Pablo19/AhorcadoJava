package codigo;

import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import sun.management.snmp.util.MibLogger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pablo
 */
public class VentanaAhorcado extends javax.swing.JFrame {

    String palabraOculta;
    
    String [] listaDePalabras;
    int numeroFallos = 0;
    
    /**
     * Creates new form VentanaAhorcado
     */
    public VentanaAhorcado() {
        initComponents();
        eligePalabraParaAdivinar();
        //Dibujar la imagen del ahorcado sin fallos
        dibujaImagen(0);
        ponGuiones();
        
    }


    
    
    private void eligePalabraParaAdivinar(){
//        listaDePalabras [0] = "CETYS";
//        listaDePalabras [1] = "MERCURIO";
//        listaDePalabras [2] = "VENUS";
//        listaDePalabras [3] = "TIERRA";
//        listaDePalabras [4] = "MARTE";
//        listaDePalabras [5] = "JUPITER";
//        listaDePalabras [6] = "SATURNO";
//        listaDePalabras [7] = "URANO";
//        listaDePalabras [8] = "NEPTUNO";
//        listaDePalabras [9] = "PLUTON";

listaDePalabras = new String [] {"CETYS", "MERCURIO", "VENUS", "TIERRA", "MARTE", "JUPITER", "SATURNO", "URANO", "NEPTUNO", "PLUTON"};


        Random aleatorio = new Random();
        //Eligo una posicion al azar
        int posicionElegida = aleatorio.nextInt(listaDePalabras.length);
       //Guardo en la palabraOculta la que haya salido al azar
        palabraOculta = listaDePalabras [posicionElegida];
    }
    
    private void ponGuiones(){
        //Crea un nuevo String con tantos guiones bajos y espacios
        //en blanco como letras tenga la palabra a adivinar
        String palabraConGuiones = "";
        for (int i=0; i< palabraOculta.length(); i++){
            palabraConGuiones = palabraConGuiones + "_ ";
        }
        pantalla.setText((palabraConGuiones));
        
    }
    
    private void dibujaImagen(int numeroFallos){
        ImageIcon miImagen = null;
        URL nombreImagen = null;
        int ancho = panelAhorcado.getWidth();
        int alto = panelAhorcado.getHeight();
       
        switch(numeroFallos){
            case 0:  nombreImagen = (getClass().getResource("/imagenes/ahorcado_0.png")); break;
            case 1:  nombreImagen = (getClass().getResource("/imagenes/ahorcado_1.png")); break;
            case 2:  nombreImagen = (getClass().getResource("/imagenes/ahorcado_2.png")); break;       
            case 3:  nombreImagen = (getClass().getResource("/imagenes/ahorcado_3.png")); break;
            case 4:  nombreImagen = (getClass().getResource("/imagenes/ahorcado_4.png")); break;
            case 5:  nombreImagen = (getClass().getResource("/imagenes/ahorcado_5.png")); break;
            case -1:  nombreImagen = (getClass().getResource("/imagenes/acertasteTodo.png")); break;
            default :  nombreImagen = (getClass().getResource("/imagenes/ahorcado_fin.png"));
            nombreImagen = (getClass().getResource("/imagenes/gameOver.png"));
         
                  
           
            
        }
                 
        if (numeroFallos == 6){
           
    }
        
        
        miImagen = new ImageIcon (new ImageIcon(nombreImagen).
                getImage().getScaledInstance(panelAhorcado.getWidth(), alto, Image.SCALE_DEFAULT));
            
      panelAhorcado.setIcon(miImagen);
    }
    
     private void chequeaLetra(String letra){
       letra = letra.toUpperCase();
      // String palabraConGuiones = pantalla.getText();
       StringBuilder palabraConGuiones = new StringBuilder(pantalla.getText());
        if (palabraOculta.contains(letra)) {
            for (int i=0; i < palabraOculta.length(); i++) {
               if (palabraOculta.charAt(i) == letra.charAt(0) && (numeroFallos < 6)){
                   
                   palabraConGuiones.setCharAt(2*i, letra.charAt(0));
                 }
            }
        pantalla.setText(palabraConGuiones.toString());      
        }
        else{
        numeroFallos++;
        dibujaImagen(numeroFallos);
        }
      
        if (pantalla.getText().contains("_")){
            
        }
        else {
            dibujaImagen(-1);
        }
    }
    
    private void chequeaBoton (JButton miBoton){
        miBoton.setEnabled(false);
        chequeaLetra(miBoton.getText());
        
        if (!pantalla.getText().contains("_")){
          miBoton.setEnabled(true);
        }
        
        if (numeroFallos > 6){
           miBoton.setEnabled(true);
        }
    }
                     //  palabraConGuiones = palabraConGuiones.substring(0, 2*i)
                     //              +letra
                     //            +palabraConGuiones.substring(2*i+1);
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        pantalla = new javax.swing.JLabel();
        botonA = new javax.swing.JButton();
        botonB = new javax.swing.JButton();
        botonC = new javax.swing.JButton();
        botonD = new javax.swing.JButton();
        botonE = new javax.swing.JButton();
        botonG = new javax.swing.JButton();
        botonF = new javax.swing.JButton();
        botonK = new javax.swing.JButton();
        botonL = new javax.swing.JButton();
        botonN = new javax.swing.JButton();
        botonM = new javax.swing.JButton();
        botonH = new javax.swing.JButton();
        botonI = new javax.swing.JButton();
        botonJ = new javax.swing.JButton();
        botonW = new javax.swing.JButton();
        botonP = new javax.swing.JButton();
        botonQ = new javax.swing.JButton();
        botonR = new javax.swing.JButton();
        botonT = new javax.swing.JButton();
        botonS = new javax.swing.JButton();
        boton = new javax.swing.JButton();
        botonX = new javax.swing.JButton();
        botonZ = new javax.swing.JButton();
        botonY = new javax.swing.JButton();
        botonÑ = new javax.swing.JButton();
        botonO = new javax.swing.JButton();
        botonU = new javax.swing.JButton();
        botonV = new javax.swing.JButton();
        panelAhorcado = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        jButton8.setText("jButton2");

        jButton28.setText("jButton2");

        jButton20.setText("jButton2");

        jButton18.setText("jButton2");

        jButton23.setText("jButton2");

        jButton25.setText("jButton2");

        jButton19.setText("jButton2");

        jButton29.setText("jButton2");

        jButton30.setText("jButton2");

        jButton21.setText("jButton2");

        jButton24.setText("jButton2");

        jButton26.setText("jButton2");

        jButton17.setText("jButton2");

        jButton27.setText("jButton2");

        jButton22.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pantalla.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        pantalla.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pantalla.setText("_ _ _ _ _");
        pantalla.setToolTipText("");
        getContentPane().add(pantalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 316, -1));

        botonA.setText("A");
        botonA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonAMousePressed(evt);
            }
        });
        getContentPane().add(botonA, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 313, 40, 40));

        botonB.setText("B");
        botonB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonBMousePressed(evt);
            }
        });
        getContentPane().add(botonB, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 313, 40, 40));

        botonC.setText("C");
        botonC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonCMousePressed(evt);
            }
        });
        getContentPane().add(botonC, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 313, 40, 40));

        botonD.setText("D");
        botonD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonDMousePressed(evt);
            }
        });
        getContentPane().add(botonD, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 313, 40, 40));

        botonE.setText("E");
        botonE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonEMousePressed(evt);
            }
        });
        getContentPane().add(botonE, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 313, 40, 40));

        botonG.setText("G");
        botonG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonGMousePressed(evt);
            }
        });
        getContentPane().add(botonG, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 313, 40, 40));

        botonF.setText("F");
        botonF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonFMousePressed(evt);
            }
        });
        getContentPane().add(botonF, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 313, 40, 40));

        botonK.setText("K");
        botonK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonKMousePressed(evt);
            }
        });
        getContentPane().add(botonK, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 359, 40, 40));

        botonL.setText("L");
        botonL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonLMousePressed(evt);
            }
        });
        getContentPane().add(botonL, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 359, 40, 40));

        botonN.setText("N");
        botonN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonNMousePressed(evt);
            }
        });
        getContentPane().add(botonN, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 359, 40, 40));

        botonM.setText("M");
        botonM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonMMousePressed(evt);
            }
        });
        getContentPane().add(botonM, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 359, 40, 40));

        botonH.setText("H");
        botonH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonHMousePressed(evt);
            }
        });
        getContentPane().add(botonH, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 359, 40, 40));

        botonI.setText("I");
        botonI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonIMousePressed(evt);
            }
        });
        getContentPane().add(botonI, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 359, 40, 40));

        botonJ.setText("J");
        botonJ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonJMousePressed(evt);
            }
        });
        getContentPane().add(botonJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 359, 40, 40));

        botonW.setText("W");
        botonW.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonWMousePressed(evt);
            }
        });
        getContentPane().add(botonW, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 451, 40, 40));

        botonP.setText("P");
        botonP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonPMousePressed(evt);
            }
        });
        getContentPane().add(botonP, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 405, 40, 40));

        botonQ.setText("Q");
        botonQ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonQMousePressed(evt);
            }
        });
        getContentPane().add(botonQ, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 405, 40, 40));

        botonR.setText("R");
        botonR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonRMousePressed(evt);
            }
        });
        getContentPane().add(botonR, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 405, 40, 40));

        botonT.setText("T");
        botonT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonTMousePressed(evt);
            }
        });
        getContentPane().add(botonT, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 405, 40, 40));

        botonS.setText("S");
        botonS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonSMousePressed(evt);
            }
        });
        getContentPane().add(botonS, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 405, 40, 40));
        getContentPane().add(boton, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 451, 40, 40));

        botonX.setText("X");
        botonX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonXMousePressed(evt);
            }
        });
        getContentPane().add(botonX, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 451, 40, 40));

        botonZ.setText("Z");
        botonZ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonZMousePressed(evt);
            }
        });
        getContentPane().add(botonZ, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 451, 40, 40));

        botonY.setText("Y");
        botonY.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonYMousePressed(evt);
            }
        });
        getContentPane().add(botonY, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 451, 40, 40));

        botonÑ.setText("Ñ");
        botonÑ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonÑMousePressed(evt);
            }
        });
        getContentPane().add(botonÑ, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 405, 40, 40));

        botonO.setText("O");
        botonO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonOMousePressed(evt);
            }
        });
        getContentPane().add(botonO, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 405, 40, 40));

        botonU.setText("U");
        botonU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonUMousePressed(evt);
            }
        });
        getContentPane().add(botonU, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 451, 40, 40));

        botonV.setText("V");
        botonV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonVMousePressed(evt);
            }
        });
        getContentPane().add(botonV, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 451, 40, 40));
        getContentPane().add(panelAhorcado, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 70, 240, 210));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
   
    
    private void botonAMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAMousePressed
       chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_botonAMousePressed

    private void botonBMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBMousePressed
         chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_botonBMousePressed

    private void botonCMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCMousePressed
         chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_botonCMousePressed

    private void botonDMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonDMousePressed
         chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_botonDMousePressed

    private void botonEMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEMousePressed
         chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_botonEMousePressed

    private void botonFMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonFMousePressed
         chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_botonFMousePressed

    private void botonGMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonGMousePressed
         chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_botonGMousePressed

    private void botonHMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonHMousePressed
         chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_botonHMousePressed

    private void botonIMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonIMousePressed
         chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_botonIMousePressed

    private void botonJMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonJMousePressed
         chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_botonJMousePressed

    private void botonKMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonKMousePressed
         chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_botonKMousePressed

    private void botonLMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonLMousePressed
         chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_botonLMousePressed

    private void botonMMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMMousePressed
         chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_botonMMousePressed

    private void botonNMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonNMousePressed
         chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_botonNMousePressed

    private void botonÑMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonÑMousePressed
         chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_botonÑMousePressed

    private void botonOMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonOMousePressed
         chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_botonOMousePressed

    private void botonPMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonPMousePressed
         chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_botonPMousePressed

    private void botonQMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonQMousePressed
         chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_botonQMousePressed

    private void botonRMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRMousePressed
         chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_botonRMousePressed

    private void botonSMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSMousePressed
         chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_botonSMousePressed

    private void botonTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonTMousePressed
         chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_botonTMousePressed

    private void botonUMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonUMousePressed
         chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_botonUMousePressed

    private void botonVMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonVMousePressed
         chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_botonVMousePressed

    private void botonWMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonWMousePressed
         chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_botonWMousePressed

    private void botonXMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonXMousePressed
         chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_botonXMousePressed

    private void botonYMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonYMousePressed
         chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_botonYMousePressed

    private void botonZMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonZMousePressed
         chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_botonZMousePressed

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
            java.util.logging.Logger.getLogger(VentanaAhorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAhorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAhorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAhorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaAhorcado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton;
    private javax.swing.JButton botonA;
    private javax.swing.JButton botonB;
    private javax.swing.JButton botonC;
    private javax.swing.JButton botonD;
    private javax.swing.JButton botonE;
    private javax.swing.JButton botonF;
    private javax.swing.JButton botonG;
    private javax.swing.JButton botonH;
    private javax.swing.JButton botonI;
    private javax.swing.JButton botonJ;
    private javax.swing.JButton botonK;
    private javax.swing.JButton botonL;
    private javax.swing.JButton botonM;
    private javax.swing.JButton botonN;
    private javax.swing.JButton botonO;
    private javax.swing.JButton botonP;
    private javax.swing.JButton botonQ;
    private javax.swing.JButton botonR;
    private javax.swing.JButton botonS;
    private javax.swing.JButton botonT;
    private javax.swing.JButton botonU;
    private javax.swing.JButton botonV;
    private javax.swing.JButton botonW;
    private javax.swing.JButton botonX;
    private javax.swing.JButton botonY;
    private javax.swing.JButton botonZ;
    private javax.swing.JButton botonÑ;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel panelAhorcado;
    private javax.swing.JLabel pantalla;
    // End of variables declaration//GEN-END:variables
}
