
package Ventanas;

import javax.swing.ImageIcon;
import javax.swing.JButton;


public class VentanaPrincipal extends javax.swing.JFrame {
    private String usuario1,usuario2;
    private boolean casilla[][] =new boolean[3][3];
    private String turno="usuario1";
    private int matriz[][]=new int[3][3];
    private int gano1=0,gano2=0,empate=0;
    
   
    public VentanaPrincipal(String user1,String user2) {
        
        usuario1=user1;
        usuario2=user2;
        
        initComponents();
        setSize(600, 650);
        setLocationRelativeTo(null);
        llenarCasillas();
        llenarMatriz();
        quienEmpieza();
        
        
//        dibujarX(boton1o1);
//        dibujarO(boton1o3);
    }
    private void llenarMatriz(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                matriz[i][j]=0;
            }
        }
    }
    
    private void llenarCasillas(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                casilla[i][j]=true;
            }
        }
    }
    private void dibujarX(JButton boton){
        boton.setIcon(new ImageIcon(getClass().getResource("/imagenes/x.png")));
    }
    private void dibujarO(JButton boton){
        boton.setIcon(new ImageIcon(getClass().getResource("/imagenes/o.png")));
    }
    
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        boton1o1 = new javax.swing.JButton();
        boton1o2 = new javax.swing.JButton();
        boton1o3 = new javax.swing.JButton();
        boton2o1 = new javax.swing.JButton();
        boton2o2 = new javax.swing.JButton();
        boton2o3 = new javax.swing.JButton();
        boton3o1 = new javax.swing.JButton();
        boton3o2 = new javax.swing.JButton();
        boton3o3 = new javax.swing.JButton();
        barraMenu = new javax.swing.JMenuBar();
        menuJuego = new javax.swing.JMenu();
        ComenzarDeNuevo = new javax.swing.JMenuItem();
        MostarResultados = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        Salir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel.setLayout(new java.awt.GridLayout(3, 3));

        boton1o1.setBackground(new java.awt.Color(102, 102, 255));
        boton1o1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1o1ActionPerformed(evt);
            }
        });
        Panel.add(boton1o1);

        boton1o2.setBackground(new java.awt.Color(102, 102, 255));
        boton1o2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1o2ActionPerformed(evt);
            }
        });
        Panel.add(boton1o2);

        boton1o3.setBackground(new java.awt.Color(102, 102, 255));
        boton1o3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1o3ActionPerformed(evt);
            }
        });
        Panel.add(boton1o3);

        boton2o1.setBackground(new java.awt.Color(102, 102, 255));
        boton2o1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton2o1ActionPerformed(evt);
            }
        });
        Panel.add(boton2o1);

        boton2o2.setBackground(new java.awt.Color(102, 102, 255));
        boton2o2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton2o2ActionPerformed(evt);
            }
        });
        Panel.add(boton2o2);

        boton2o3.setBackground(new java.awt.Color(102, 102, 255));
        boton2o3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton2o3ActionPerformed(evt);
            }
        });
        Panel.add(boton2o3);

        boton3o1.setBackground(new java.awt.Color(102, 102, 255));
        boton3o1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton3o1ActionPerformed(evt);
            }
        });
        Panel.add(boton3o1);

        boton3o2.setBackground(new java.awt.Color(102, 102, 255));
        boton3o2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton3o2ActionPerformed(evt);
            }
        });
        Panel.add(boton3o2);

        boton3o3.setBackground(new java.awt.Color(102, 102, 255));
        boton3o3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton3o3ActionPerformed(evt);
            }
        });
        Panel.add(boton3o3);

        menuJuego.setText("Juego");
        menuJuego.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        ComenzarDeNuevo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ComenzarDeNuevo.setText("Comenzar de Nuevo");
        ComenzarDeNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComenzarDeNuevoActionPerformed(evt);
            }
        });
        menuJuego.add(ComenzarDeNuevo);

        MostarResultados.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        MostarResultados.setText("Mostar tabla de Resultados");
        MostarResultados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostarResultadosActionPerformed(evt);
            }
        });
        menuJuego.add(MostarResultados);
        menuJuego.add(jSeparator1);

        Salir.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        menuJuego.add(Salir);

        barraMenu.add(menuJuego);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

    private void boton1o3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1o3ActionPerformed
        // TODO add your handling code here:
        if(casilla[0][2]==true){//verificamos si no se dio click sobre el boton
            if(turno.equals("usuario1")){
                dibujarX(boton1o3);
                matriz[0][2]=1;
                turno="usuario2";
            }else{//turno del usuario 2
                dibujarO(boton1o3);
                matriz[0][2]=2;
                turno="usuario1";
            }
            casilla[0][2]=false;
            comprobarGanador();
        }
    }//GEN-LAST:event_boton1o3ActionPerformed

    private void boton2o2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton2o2ActionPerformed
        // TODO add your handling code here:
        if(casilla[1][1]==true){//verificamos si no se dio click sobre el boton
            if(turno.equals("usuario1")){
                dibujarX(boton2o2);
                matriz[1][1]=1;
                turno="usuario2";
            }else{//turno del usuario 2
                dibujarO(boton2o2);
                matriz[1][1]=2;
                turno="usuario1";
            }
            casilla[1][1]=false;
            comprobarGanador();
        }
    }//GEN-LAST:event_boton2o2ActionPerformed

    private void boton1o1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1o1ActionPerformed
        // TODO add your handling code here:
        if(casilla[0][0]==true){//verificamos si no se dio click sobre el boton
            if(turno.equals("usuario1")){
                dibujarX(boton1o1);
                matriz[0][0]=1;
                turno="usuario2";
            }else{//turno del usuario 2
                dibujarO(boton1o1);
                matriz[0][0]=2;
                turno="usuario1";
            }
            casilla[0][0]=false;
            comprobarGanador();
        }
    }//GEN-LAST:event_boton1o1ActionPerformed

    private void boton1o2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1o2ActionPerformed
        // TODO add your handling code here:
        if(casilla[0][1]==true){//verificamos si no se dio click sobre el boton
            if(turno.equals("usuario1")){
                dibujarX(boton1o2);
                matriz[0][1]=1;
                turno="usuario2";
            }else{//turno del usuario 2
                dibujarO(boton1o2);
                matriz[0][1]=2;
                turno="usuario1";
            }
            casilla[0][1]=false;
            comprobarGanador();
        }
    }//GEN-LAST:event_boton1o2ActionPerformed

    private void boton2o1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton2o1ActionPerformed
        // TODO add your handling code here:
        if(casilla[1][0]==true){//verificamos si no se dio click sobre el boton
            if(turno.equals("usuario1")){
                dibujarX(boton2o1);
                matriz[1][0]=1;
                turno="usuario2";
            }else{//turno del usuario 2
                dibujarO(boton2o1);
                matriz[1][0]=2;
                turno="usuario1";
            }
            casilla[1][0]=false;
            comprobarGanador();
        }
    }//GEN-LAST:event_boton2o1ActionPerformed

    private void boton2o3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton2o3ActionPerformed
        // TODO add your handling code here:
        if(casilla[1][2]==true){//verificamos si no se dio click sobre el boton
            if(turno.equals("usuario1")){
                dibujarX(boton2o3);
                matriz[1][2]=1;
                turno="usuario2";
            }else{//turno del usuario 2
                dibujarO(boton2o3);
                matriz[1][2]=2;
                turno="usuario1";
            }
            casilla[1][2]=false;
            comprobarGanador();
        }
    }//GEN-LAST:event_boton2o3ActionPerformed

    private void boton3o1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton3o1ActionPerformed
        // TODO add your handling code here:
        if(casilla[2][0]==true){//verificamos si no se dio click sobre el boton
            if(turno.equals("usuario1")){
                dibujarX(boton3o1);
                matriz[2][0]=1;
                turno="usuario2";
            }else{//turno del usuario 2
                dibujarO(boton3o1);
                matriz[2][0]=2;
                turno="usuario1";
            }
            casilla[2][0]=false;
            comprobarGanador();
        }
    }//GEN-LAST:event_boton3o1ActionPerformed

    private void boton3o2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton3o2ActionPerformed
        // TODO add your handling code here:
        if(casilla[2][1]==true){//verificamos si no se dio click sobre el boton
            if(turno.equals("usuario1")){
                dibujarX(boton3o2);
                matriz[2][1]=1;
                turno="usuario2";
            }else{//turno del usuario 2
                dibujarO(boton3o2);
                matriz[2][1]=2;
                turno="usuario1";
            }
            casilla[2][1]=false;
            comprobarGanador();
        }
    }//GEN-LAST:event_boton3o2ActionPerformed

    private void boton3o3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton3o3ActionPerformed
        // TODO add your handling code here:
        if(casilla[2][2]==true){//verificamos si no se dio click sobre el boton
            if(turno.equals("usuario1")){
                dibujarX(boton3o3);
                matriz[2][2]=1;
                turno="usuario2";
            }else{//turno del usuario 2
                dibujarO(boton3o3);
                matriz[2][2]=2;
                turno="usuario1";
            }
            casilla[2][2]=false;
            comprobarGanador();
        }
    }//GEN-LAST:event_boton3o3ActionPerformed

    private void MostarResultadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostarResultadosActionPerformed
        // TODO add your handling code here:
        
        VentanaResultado ventanaR=new VentanaResultado(this, true, usuario1, usuario2, gano1, gano2, empate);
        ventanaR.setVisible(true);
    }//GEN-LAST:event_MostarResultadosActionPerformed

    private void ComenzarDeNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComenzarDeNuevoActionPerformed
        //Inicializamos los valores en 0
        gano1=0;
        gano2=0;
        empate=0;
        //reiniciamoe el juego
        reiniciar();
        
        
        
    }//GEN-LAST:event_ComenzarDeNuevoActionPerformed

    
    private boolean comprobar(int num){
        boolean ganador =false;
        //1ra combinacion
        if(matriz[0][0]==num && matriz[0][1]==num && matriz[0][2]==num){
            ganador=true;
        }
        //2da combinacion  
        else if(matriz[1][0]==num && matriz[1][1]==num && matriz[1][2]==num){
            ganador=true;
        }
        //3ra combinacion
        else if(matriz[2][0]==num && matriz[2][1]==num && matriz[2][2]==num){
            ganador=true;
        }
        //4ta combinacion
        else if(matriz[0][0]==num && matriz[1][0]==num && matriz[2][0]==num){
            ganador=true;
        }
        //5ta combinacion
        else if(matriz[0][1]==num && matriz[1][1]==num && matriz[2][1]==num){
            ganador=true;
        }
        //6ta combinacion
        else if(matriz[0][2]==num && matriz[1][2]==num && matriz[2][2]==num){
            ganador=true;
        }
        //7ma combinacion
        else if(matriz[0][0]==num && matriz[1][1]==num && matriz[2][2]==num){
            ganador=true;
        }
        //8va combinacion
        else if(matriz[2][0]==num && matriz[1][1]==num && matriz[0][2]==num){
            ganador=true;
        }
        return ganador;
        
    }
    private void reiniciar(){
        //casillas vuelven a lo original
        llenarCasillas();
        //valores de las casillas vuelven a 0
        llenarMatriz();
        quitarImagen();
        
        
        //aqui se elige quien juega primero
        quienEmpieza();
        
        
        
    }
    
    private void quienEmpieza(){
        ventanaTurno turnoV=new ventanaTurno(this, true, usuario1, usuario2);
        turnoV.setVisible(true);
        turno=turnoV.getTurno();
    
}
    private void quitarImagen(){
        boton1o1.setIcon(null);
        boton1o2.setIcon(null);
        boton1o3.setIcon(null);
        boton2o1.setIcon(null);
        boton2o2.setIcon(null);
        boton2o3.setIcon(null);
        boton3o1.setIcon(null);
        boton3o2.setIcon(null);
        boton3o3.setIcon(null);
    }
    
    private void comprobarGanador() {
        boolean ganador1 = false;
        boolean ganador2 = false;
        int casillaEmpate = 0;

        //Comprobamos si el ganador es el usuario 1
        ganador1 = comprobar(1);
        //Comprobamos si el ganador es el usuario 2
        ganador2 = comprobar(2);

        //1ra combinacion
        if (ganador1 == true) {
            gano1++;
            ventanaGanador ventanaG=new ventanaGanador(this, true, usuario1);
            ventanaG.setVisible(true);
            reiniciar();
            
        } else if (ganador2 == true) {
            gano2++;
            ventanaGanador ventanaG=new ventanaGanador(this, true, usuario2);
            ventanaG.setVisible(true);
            reiniciar();
        } else {// talvez el tablero esta lleno 
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (matriz[i][j] != 0) {//entonces puede que haiga 1 o 2
                        casillaEmpate++;
                    }
                }
            }
            if (casillaEmpate == 9) {
                empate++;
                ventanaEmpate ventanaE=new ventanaEmpate(this, true);
                ventanaE.setVisible(true);
                reiniciar();
            } else {//para que se reinicie la variable casillaEmpate
                casillaEmpate = 0;
            }
        }

//        for(int i=0;i<3;i++){
//            for(int j=0;j<3;j++){
//                System.out.print(matriz[i][j]+" ");
//            }
//            System.out.println("");
//        }
//        System.out.println("");
    }
    
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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal(null,null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ComenzarDeNuevo;
    private javax.swing.JMenuItem MostarResultados;
    private javax.swing.JPanel Panel;
    private javax.swing.JMenuItem Salir;
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JButton boton1o1;
    private javax.swing.JButton boton1o2;
    private javax.swing.JButton boton1o3;
    private javax.swing.JButton boton2o1;
    private javax.swing.JButton boton2o2;
    private javax.swing.JButton boton2o3;
    private javax.swing.JButton boton3o1;
    private javax.swing.JButton boton3o2;
    private javax.swing.JButton boton3o3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu menuJuego;
    // End of variables declaration//GEN-END:variables
}
