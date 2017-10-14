package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.ModelMessage;
import views.ViewMessage;

public class ControllerMessage implements ActionListener  {
    private final ModelMessage modelMessage;
    private final ViewMessage viewMessage;

    public ControllerMessage(ModelMessage modelMessage, Object[] views){
        this.viewMessage = (ViewMessage) views[5];
        this.modelMessage = modelMessage;
        viewMessage.jbtnHello.addActionListener(this);
        viewMessage.jbtnBye.addActionListener(this);
        initView();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==viewMessage.jbtnHello)
            btnHelloActionPerformed();
        else if(e.getSource()==viewMessage.jbtnBye)
            btnByeActionPerformed();
    }

    private void btnHelloActionPerformed(){
        modelMessage.setMessage("Hello Francisco");
        viewMessage.jlMessage.setText(modelMessage.getMessage());
    }

    private void btnByeActionPerformed(){
        modelMessage.setMessage("Bye Francisco");
        viewMessage.jlMessage.setText(modelMessage.getMessage());
    }

    public final void initView(){
        viewMessage.jlMessage.setText(modelMessage.getMessage());
        viewMessage.setVisible(true);
    }
}