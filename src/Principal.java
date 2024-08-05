import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        Lista l = new Lista();
        Scanner in =new Scanner(System.in);



        l.adicionarComeco(in.nextLine());
        l.adicionarComeco(in.nextLine());
        l.adicionarComeco(in.nextLine());
        l.adicionarComeco(in.nextLine());

        l.imprimir();

        l.adicionarFim(in.nextLine());
        l.imprimir();

        l.adicionarPorPosicao("emilia", 2);
        l.imprimir();

        l.retirarPorPosicao(3);

        l.imprimir();
    }
    
}
