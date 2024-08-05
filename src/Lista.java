public class Lista {
    
    public Celula cabeca;
    public Celula cauda;
    private int totalElementos;

public void adicionarComeco (String nome){

    Celula nova = new Celula(this.cabeca, nome);
    this.cabeca = nova;

    if(this.totalElementos ==0){
        this.cauda = nova;
    }

    this.totalElementos++;

}


public void adicionarFim(String nome){
    Celula nova = new Celula(nome);
    if(this.totalElementos==0){
        this.cabeca = nova;
        this.cauda = nova;
    }else{
        this.cauda.setProxima(nova);
        this.cauda=nova;
    }
    this.totalElementos++;
}


public void adicionarPorPosicao(String nome, int posicao) {

    if (posicao == 0) {
        adicionarComeco(nome);
    } else if (posicao == this.totalElementos) {
        adicionarFim(nome);
    } else {
        Celula nova = new Celula(nome);
        Celula aux = this.cabeca;
        for (int i = 0; i < posicao - 1; i++) {
            aux = aux.getProxima();
        }
        nova.setProxima(aux.getProxima());
        aux.setProxima(nova);
        this.totalElementos++;
    }
}

public void retirarPorPosicao(int posicao) {
    if (posicao == 0) {
        this.cabeca = this.cabeca.getProxima();
    } else {
        Celula aux = this.cabeca;
        for (int i = 0; i < posicao - 1; i++) {
            aux = aux.getProxima();
        }
        aux.setProxima(aux.getProxima().getProxima());
    }

    this.totalElementos--;
}


public void imprimir(){

Celula aux = this.cabeca;
for(int cont=0;cont<this.totalElementos;cont++){

System.out.println( "\n"+ "----------" + "\n" +aux.getElemento());
aux = aux.proxima;
}

}




}
