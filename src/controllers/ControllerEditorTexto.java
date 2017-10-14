package controllers;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JFileChooser;
import java.io.IOException;
import views.ViewEditorTexto;
import models.ModelEditorTexto;

public class ControllerEditorTexto {
    FileReader fr = null;
    FileWriter fw = null;
    JFileChooser jfc = new JFileChooser();
    ViewEditorTexto view_editor_texto;
    ModelEditorTexto model_editor_texto;

    public ControllerEditorTexto(ModelEditorTexto model_editor_texto, Object[] views) {
        this.model_editor_texto = model_editor_texto;
        this.view_editor_texto = (ViewEditorTexto) views[4];
        initView();
        this.view_editor_texto.jbtn_abrir.addActionListener(e -> jbtn_abrir());
        this.view_editor_texto.jbtn_guardar.addActionListener(e -> jbtn_guardar());
        this.view_editor_texto.jbtn_salir.addActionListener(e -> jbtn_salir());
    }

    private void jbtn_guardar() {
        try {

            fw = new FileWriter(model_editor_texto.getArchivo(), false);
            fw.write(view_editor_texto.jta_area.getText());
            System.out.println("Se ha guardado el archivo " + model_editor_texto.archivo.getName());
            fw.close();

        } catch (FileNotFoundException err) {
            System.err.println("Archivo no encontrado");
        } catch (IOException err) {
            System.err.println("Error en el archivo");
        } finally {
            try {
                fw.close();
            } catch (FileNotFoundException err) {
                System.err.println("Archivo no encontrado");
            } catch (IOException err) {
                System.err.println("Error en el archivo");
            }
        }

    }

    private void jbtn_abrir() {
        try {
            jfc.showOpenDialog(this.view_editor_texto);
            model_editor_texto.setArchivo(jfc.getSelectedFile());
            fr = new FileReader(model_editor_texto.getArchivo());
            int character = 0;
            String texto = "";
            while ((character = fr.read()) != -1) {
                texto += (char) character;
            }
            fr.close();
            view_editor_texto.jta_area.setText(texto);
        } catch (FileNotFoundException err) {
            System.err.println("Archivo no encontrado");
        } catch (IOException err) {
            System.err.println("Error en el archivo");
        } finally {
            try {
                fr.close();
            } catch (FileNotFoundException err) {
                System.err.println("Archivo no encontrado");
            } catch (IOException err) {
                System.err.println("Error en el archivo");
            }
        }

    }

    private void jbtn_salir(){
        System.exit(0);
    }

    private void initView() {

    }

}