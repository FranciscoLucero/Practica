package controllers;
import javax.swing.DefaultListModel;
import views.ViewAscProm;
import models.ModelAscProm;

public class ControllerAscProm {

    ModelAscProm model_asc_prom;
    ViewAscProm view_asc_prom;
    DefaultListModel valores = new DefaultListModel();

    public ControllerAscProm(ModelAscProm model_asc_prom, Object[] views) {
        this.model_asc_prom = model_asc_prom;
        this.view_asc_prom = (ViewAscProm) views[3];
        this.view_asc_prom.jbtn_insertar.addActionListener(e -> agregarClick());
        this.view_asc_prom.jbtn_asc.addActionListener(e -> ascClick());
        this.view_asc_prom.jbtn_promedio.addActionListener(e -> promedioClick());
        initView();

    }

    public void agregarClick() {
        model_asc_prom.agregar(view_asc_prom.jtf_numero.getText());
        view_asc_prom.jl_numeros.setModel(model_asc_prom.getValores());

    }

    public void promedioClick() {
        valores = (DefaultListModel) view_asc_prom.jl_numeros.getModel();
        model_asc_prom.setValores(valores);
        model_asc_prom.promedio();
        view_asc_prom.jtf_promedio.setText(String.valueOf(model_asc_prom.getPromedio()));
    }

    public void ascClick() {
        valores = (DefaultListModel) view_asc_prom.jl_numeros.getModel();
        model_asc_prom.setValores(valores);
        model_asc_prom.ordenar();
        view_asc_prom.jl_numeros.setModel(model_asc_prom.getValores());
    }

    public void initView() {

    }
}