public class ListaEncadeada {
    Elemento primeiroElemento;
    Elemento ultimoElemento;
    int tamanhoLista;

    public ListaEncadeada(Elemento pElemento, Elemento ultElemento){
        this.primeiroElemento = pElemento;
        this.ultimoElemento = ultElemento;
        this.tamanhoLista++;
    }

    public void Adicionar(String valor){
        Elemento novoElemento = new Elemento(valor);

        if(primeiroElemento == null && ultimoElemento == null){
            primeiroElemento = novoElemento;
            ultimoElemento = novoElemento;
        }
        else{
            ultimoElemento.proximoElemento = novoElemento;
            ultimoElemento = novoElemento;
        }
        tamanhoLista++;
    }

    public void Remover(String valorRemovido){
        Elemento elementoAnterior = null;
        Elemento elementoAtual = primeiroElemento;

        for(int i = 0; i < tamanhoLista; i++){
            if(elementoAtual.valor.equals(valorRemovido)){
                if(tamanhoLista == 1){
                    primeiroElemento = null;
                    ultimoElemento = null;
                }
                else if(elementoAtual == primeiroElemento){
                    primeiroElemento = elementoAtual.proximoElemento;
                    elementoAtual.proximoElemento = null;
                }
                else if(elementoAtual == ultimoElemento){
                    ultimoElemento = elementoAnterior;
                    elementoAnterior.proximoElemento = null;
                }
                else{
                    elementoAnterior.proximoElemento = elementoAtual.proximoElemento;
                    elementoAtual = null;
                }
                tamanhoLista--;
                break;
            }
            elementoAnterior = elementoAtual;
            elementoAtual = elementoAtual.proximoElemento;
        }
    }

    public Elemento Buscar(int posicao){
        Elemento elementoAtual = primeiroElemento;

        for(int i = 0; i < posicao; i++){
            if(elementoAtual.proximoElemento != null){
                elementoAtual = elementoAtual.proximoElemento;
            }
        }
        return elementoAtual;
    }
}
