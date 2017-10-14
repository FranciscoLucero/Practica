package models;
import javax.swing.DefaultListModel;

public class ModelAscProm {
    private DefaultListModel valores = new DefaultListModel();
    private double promedio=0;
    
    public DefaultListModel getValores() {
        return valores;
    }
    
    public double getPromedio() {
        return promedio;
    }

    public void setValores(DefaultListModel valores) {
        this.valores = valores;
    }

    public void ordenar() {
        String flgm;
       for (int i=0;i<valores.getSize();i++){
            for(int j=0;j<valores.getSize();j++){
                if (Double.parseDouble((String) valores.get(i)) 
                    <Double.parseDouble((String)valores.get(j))){
                    flgm=(String) valores.get(i);
                    valores.set(i,valores.get(j));
                    valores.set(j,flgm);
                }
            }
	}
    }
    
    public void promedio() {
        for(int i=0;i<valores.getSize();i++)
            promedio+=Double.parseDouble((String) valores.get(i));
        promedio=promedio/valores.getSize();  
    }
    public void agregar(String numero) {
        valores.addElement(numero);  
    }
}