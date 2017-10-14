package controllers;
import models.*;
import views.*;

public class ControllerMain1{
    ViewMessage view_message;
    ModelMain model_main;
    ViewMain view_main;
    ViewMayor view_mayor;
    ViewOperaciones view_operaciones;
    ViewAscProm view_asc_prom;
    ViewEditorTexto view_editor_texto;

    public ControllerMain1(ModelMain model_principal, Object[] views) {
        this.model_main = model_principal;
        this.view_main = (ViewMain) views[0];
        this.view_mayor = (ViewMayor) views[1];
        this.view_operaciones = (ViewOperaciones) views[2];
        this.view_asc_prom = (ViewAscProm) views[3];
        this.view_editor_texto = (ViewEditorTexto) views[4];
        this.view_message = (ViewMessage) views[5];
        this.view_main.jmi_mayor.addActionListener(e -> jmi_numero_mayor());
        this.view_main.jmi_operaciones.addActionListener(e -> jmi_operacion());
        this.view_main.jmi_ordenar.addActionListener(e -> jmi_orden_promedio());
        this.view_main.jmi_editor_texto.addActionListener(e -> jmi_editor_texto());
        this.view_main.jmi_Message.addActionListener(e -> jmi_message());
        initView();
    }

    private void initView() {
        this.view_main.setTitle("Trabajo integrador");
        this.view_main.setLocationRelativeTo(null);
        this.view_main.setVisible(true);
    }
    
    private void jmi_message() {
        view_main.setContentPane(view_message);
        view_main.revalidate();
        view_main.repaint();
    }

    private void jmi_numero_mayor() {
        view_main.setContentPane(view_mayor);
        view_main.revalidate();
        view_main.repaint();
    }

    private void jmi_operacion() {
        view_main.setContentPane(view_operaciones);
        view_main.revalidate();
        view_main.repaint();
    }

    private void jmi_orden_promedio() {
        view_main.setContentPane(view_asc_prom);
        view_main.revalidate();
        view_main.repaint();
    }

    private void jmi_editor_texto() {
        view_main.setContentPane(view_editor_texto);
        view_main.revalidate();
        view_main.repaint();
    }
}
