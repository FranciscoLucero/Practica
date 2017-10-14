//package controllers;
//
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import views.ViewMain;
//import models.ModelMain;
//import views.ViewMessage;
//import views.ViewOperaciones;
//import Models.ModelOperaciones;
//import models.ModelMayor;
//import views.ViewMayor;
//import views.ViewAscProm;
//import models.ModelAscProm;
//import models.ModelEditorTexto;
//
//public class ControllerMain implements ActionListener{
//    ViewMain viewMain;
//    ViewMessage viewMessage;
//    ModelMain modelMain;
//    ViewOperaciones viewOperaciones;
//    ModelOperaciones modelOperaciones;
//    ModelMayor modelMayor;
//    ViewMayor viewMayor;
//    ViewAscProm view_asc_prom;
//    ModelAscProm model_asc_prom;
//    ModelEditorTexto model_editor_texto;
//    ViewMain view_main;
//    
//    public ControllerMain(ViewMain viewMain,ViewMessage viewMessage,ModelMain modelMain, 
//            ViewOperaciones viewOperaciones, ModelOperaciones modelOperaciones, 
//            ModelMayor modelMayor, ViewMayor viewMayor, ViewAscProm view_asc_prom, 
//            ModelAscProm model_asc_prom, ModelEditorTexto model_editor_texto,
//            ViewMain view_main){
//        this.viewMain = viewMain;
//        this.viewMessage = viewMessage;
//        this.modelMain = modelMain;
//        this.viewOperaciones = viewOperaciones;
//        this.modelOperaciones = modelOperaciones;
//        this.modelMayor = modelMayor;
//        this.viewMayor = viewMayor;
//        this.view_asc_prom = view_asc_prom;
//        this.model_asc_prom = model_asc_prom;
//        this.model_editor_texto = model_editor_texto;
//        this.view_main = view_main;
//        this.viewMain.jmi_Message.addActionListener(this);
//        this.viewMain.jmi_operaciones.addActionListener(this);
//        this.viewMain.jmi_mayor.addActionListener(this);
//        this.viewMain.jmi_ordenar.addActionListener(this);
//        this.viewMain.jmi_abrir1.addActionListener(this);
//        this.viewMain.jmi_guardar1.addActionListener(this);
//        this.viewMain.jmi_salir1.addActionListener(this);
//        initView();
////        initView1();
////        initView2();
////        initView3();
////        initView4();
//}
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        if(e.getSource()==viewMain.jmi_Message)
//            jmiMessageActionPerformed();
//        if(e.getSource()==viewMain.jmi_operaciones)
//            jmiOperacionesActionPerformed();
//        if(e.getSource()==viewMain.jmi_mayor)
//            jmiMayorActionPerformed();
//        if(e.getSource()==viewMain.jmi_ordenar)
//            jmiAscActionPerformed();
//        if(e.getSource()==viewMain.jmi_abrir1)
//            jmiAbrirActionPerformed();
//        if(e.getSource()==viewMain.jmi_guardar1)
//            jmiGuardarActionPerformed();
//        if(e.getSource()==viewMain.jmi_salir1)
//            jmiSalirActionPerformed();
//    }
//    
//    public void jmiMessageActionPerformed(){
//        this.viewMain.setContentPane(viewMessage);
//        this.viewMain.revalidate();
//        this.viewMain.repaint();
//    }
//     public void jmiOperacionesActionPerformed(){
//        this.viewMain.setContentPane(viewOperaciones);
//        this.viewMain.revalidate();
//        this.viewMain.repaint();
//    }
//     
//     public void jmiMayorActionPerformed(){
//        this.viewMain.setContentPane(viewMayor);
//        this.viewMain.revalidate();
//        this.viewMain.repaint();
//    }
//     
//     public void jmiAscActionPerformed(){
//        this.viewMain.setContentPane(view_asc_prom);
//        this.viewMain.revalidate();
//        this.viewMain.repaint();
//    }
//     
//     public void jmiAbrirActionPerformed(){
//        this.viewMain.setContentPane(viewMain);
//        this.viewMain.revalidate();
//        this.viewMain.repaint();
//    }
//     
//     public void jmiGuardarActionPerformed(){
//        this.viewMain.setContentPane(viewMain);
//        this.viewMain.revalidate();
//        this.viewMain.repaint();
//    }
//     
//     public void jmiSalirActionPerformed(){
//        this.viewMain.setContentPane(viewMain);
//        this.viewMain.revalidate();
//        this.viewMain.repaint();
//    }
//
//    private void initView(){
//        this.viewMain.setTitle("Hello Francisco");
//        this.viewMain.setLocationRelativeTo(null);
//        this.viewMain.setVisible(true);
//    }
//    
//    private void initView1(){
//        viewOperaciones.jtfNumero1.setText(String.valueOf(modelOperaciones.getNumero1()));
//        viewOperaciones.jtfNumero2.setText(String.valueOf(modelOperaciones.getNumero2()));
//        viewOperaciones.jtfResultado.setText(String.valueOf(modelOperaciones.getResultado()));
//        viewOperaciones.setVisible(true);
//    }
//    
//    private void initView2(){
//        viewMayor.jtf_n1.setText(String.valueOf(modelMayor.getN1()));
//        viewMayor.jtf_n2.setText(String.valueOf(modelMayor.getN2()));
//        viewMayor.jtf_n3.setText(String.valueOf(modelMayor.getN3()));
//        viewMayor.jtf_m.setText(String.valueOf(modelMayor.getM()));
//        viewMayor.setVisible(true);
//    }
//    
//    private void initView3(){
//        this.viewMain.setTitle("Ascendente");
//        this.viewMain.setLocationRelativeTo(null);
//        this.viewMain.setVisible(true);
//    }
//    
//    private void initView4(){
//        this.viewMain.setLocationRelativeTo(null);
//        this.viewMain.setVisible(true);
//    }
//}