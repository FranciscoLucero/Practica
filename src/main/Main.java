package main;
import Models.ModelOperaciones;
import controllers.*;
import models.*;
import views.*;

public class Main {
    public static void main(String[] args) {
        ModelMain model_main = new ModelMain();
        ViewMain view_main = new ViewMain();
        
        ModelMayor model_mayor = new ModelMayor();
        ViewMayor view_mayor = new ViewMayor();
        
        ModelOperaciones model_operaciones = new ModelOperaciones();
        ViewOperaciones view_operaciones = new ViewOperaciones();
        
        ModelAscProm model_asc_prom = new ModelAscProm();
        ViewAscProm view_asc_prom = new ViewAscProm();
        
        ModelEditorTexto model_editor_texto = new ModelEditorTexto();
        ViewEditorTexto view_editor_texto = new ViewEditorTexto();
        
        ModelMessage model_message = new ModelMessage();
        ViewMessage view_message = new ViewMessage();
        
         Object views[] = new Object[6];
         
         views[0] = view_main;
         views[1] = view_mayor ;
         views[2] = view_operaciones;
         views[3] = view_asc_prom;
         views[4] = view_editor_texto;
         views[5] = view_message;
         
        ControllerMayor controller_mvc_mayor = new ControllerMayor(model_mayor, views);
        ControllerOperaciones controller_operaciones = new ControllerOperaciones(model_operaciones, views);
        ControllerAscProm controller_asc_prom = new ControllerAscProm( model_asc_prom, views);
        ControllerEditorTexto controller_editor_texto = new ControllerEditorTexto(model_editor_texto, views);
        ControllerMain1 controller_principal = new ControllerMain1(model_main, views);
        ControllerMessage controller_message = new ControllerMessage(model_message, views);
    }  
}