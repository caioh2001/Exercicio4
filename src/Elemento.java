public class Elemento {
    String valor;
    Elemento proximoElemento;

    public Elemento(String val){
        this.valor = val;
    }

    public String toString(){
        return valor;
    }
}
