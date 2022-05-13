public class App {
    public static void main(String[] args) throws Exception {

        // ETAPA 2
        // • Com a tabela da etapa 1, crie um método para carregar palavras de um arquivo fornecido por parâmetro. Este arquivo pode 
        // conter mais de 1 milhão de palavras, então esteja preparado para isso. 
        // • A partir do arquivo fornecido, a tabela deve armazenar somente as palavras que contenham exatamente 5 letras.
        

        Elemento teste = new Elemento("DF");
        ListaEncadeada lista = new ListaEncadeada(teste,teste);

        lista.Adicionar("MG");
        lista.Adicionar("SP");
        lista.Adicionar("RJ");

        System.out.println("Tamanho : " + lista.tamanhoLista);
        System.out.println("Primeiro : " + lista.primeiroElemento);
        System.out.println("Ultimo : " + lista.ultimoElemento);

        for(int i = 0; i < lista.tamanhoLista; i++){
            System.out.println(lista.Buscar(i));
        }

        lista.Adicionar("DF");

        System.out.println("_____________");

        for(int i = 0; i < lista.tamanhoLista; i++){
            System.out.println(lista.Buscar(i));
        }

        lista.Remover("DF");
        lista.Adicionar("PF");

        System.out.println("_____________");

        for(int i = 0; i < lista.tamanhoLista; i++){
            System.out.println(lista.Buscar(i));
        }

        lista.Remover("MG");
        lista.Remover("SP");
        lista.Remover("RJ");
        lista.Remover("DF");
        lista.Remover("PF");

        System.out.println(lista.tamanhoLista);

        lista.Adicionar("GO");

        for(int i = 0; i < lista.tamanhoLista; i++){
            System.out.println(lista.Buscar(i));
        }
    }
}
