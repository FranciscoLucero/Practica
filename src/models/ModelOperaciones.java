package Models;

public class ModelOperaciones{
    int numero1;
    int numero2;
    int resultado;
    
    public int getNumero1(){
        return numero1;
    }
    
    public int getNumero2(){
        return numero2;
    }
    
    public int getResultado(){
        return resultado;
    }
    
    public void setNumero1(int numero1){
        this.numero1 = numero1;
    }
    
    public void setNumero2(int numero2){
        this.numero2 = numero2;
    }
    
    public void setResultado(int resultado){
        this.resultado = resultado;
    }
    
    public void suma(){
        resultado = numero1 + numero2;
    }
    
    public void resta(){
        resultado = numero1 - numero2;
    }
    
    public void multiplicacion(){
        resultado = numero1 * numero2;
    }
    
    public void division(){
        resultado = numero1 / numero2;
    }
}