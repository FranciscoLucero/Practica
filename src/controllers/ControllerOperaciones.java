package controllers;
import views.ViewOperaciones;
import Models.ModelOperaciones;

public class ControllerOperaciones {
    ViewOperaciones view_operaciones;
    ModelOperaciones model_operaciones;
        
    public ControllerOperaciones(ModelOperaciones model_operaciones,Object[] views) {
        this.model_operaciones = model_operaciones;
        this.view_operaciones = (ViewOperaciones) views[2];
        view_operaciones.jbtnSuma.addActionListener(e -> jbtn_sumar_click());
        view_operaciones.jbtnResta.addActionListener(e -> jbtn_restar_click());
        view_operaciones.jbtnMultiplicacion.addActionListener(e -> jbtn_multiplicar_click());
        view_operaciones.jbtnDivision.addActionListener(e -> jbtn_dividir_click());
        initView();
    }
    
        public void initView(){
        view_operaciones.jtfNumero1.setText(String.valueOf(model_operaciones.getNumero1()));
        view_operaciones.jtfNumero2.setText(String.valueOf(model_operaciones.getNumero2()));
        view_operaciones.jtfResultado.setText(String.valueOf(model_operaciones.getResultado()));
        view_operaciones.setVisible(true);
    }
        
        public void jbtn_sumar_click(){
            model_operaciones.setNumero1(Integer.parseInt(view_operaciones.jtfNumero1.getText()));
            model_operaciones.setNumero2(Integer.parseInt(view_operaciones.jtfNumero2.getText()));
            model_operaciones.suma();
            view_operaciones.jtfResultado.setText(String.valueOf(model_operaciones.getResultado()));
        }     
        
        public void jbtn_restar_click(){
            model_operaciones.setNumero1(Integer.parseInt(view_operaciones.jtfNumero1.getText()));
            model_operaciones.setNumero2(Integer.parseInt(view_operaciones.jtfNumero2.getText()));
            model_operaciones.resta();
            view_operaciones.jtfResultado.setText(String.valueOf(model_operaciones.getResultado()));
        }
        
        public void jbtn_multiplicar_click(){
            model_operaciones.setNumero1(Integer.parseInt(view_operaciones.jtfNumero1.getText()));
            model_operaciones.setNumero2(Integer.parseInt(view_operaciones.jtfNumero2.getText()));
            model_operaciones.multiplicacion();
            view_operaciones.jtfResultado.setText(String.valueOf(model_operaciones.getResultado()));
        }
        
        public void jbtn_dividir_click(){
            model_operaciones.setNumero1(Integer.parseInt(view_operaciones.jtfNumero1.getText()));
            model_operaciones.setNumero2(Integer.parseInt(view_operaciones.jtfNumero2.getText()));
            model_operaciones.division();
            view_operaciones.jtfResultado.setText(String.valueOf(model_operaciones.getResultado()));
        }
}