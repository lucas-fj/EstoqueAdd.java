import java.util.Scanner;

public class EstoqueAdd {

    //variaveis globais para o estoque inicial
    static int calca = 20;
    static int camisa = 18;
    static int bermuda = 23;
    static int saia = 12;
    static int blusa = 9;
    static int moletom = 4;
    static int meia = 17;
    static int tenis = 8;
    static int bota = 3;

    //mostrando o estoque atual
    public static void mostrarEstoque(){
        System.out.println("..:: ESTOQUE ::..");
        System.out.println("1| Calça: " + calca);
        System.out.println("2| Camisa: " + camisa);
        System.out.println("3| Bermuda: " + bermuda);
        System.out.println("4| Saia: " + saia);
        System.out.println("5| Blusa: " + blusa);
        System.out.println("6| Moletom: " + moletom);
        System.out.println("7| Meia: " + meia);
        System.out.println("8| Tênis: " + tenis);
        System.out.println("9| Bota: " + bota);
    }

    //adicionando mais produtos ao estoque
    public static void AddEstoque(int codigo , int quantidade){
        switch (codigo) {
            case 1:
                calca += quantidade;
                break;
            case 2:
                camisa += quantidade;
                break;
            case 3:
                bermuda += quantidade;
                break;
            case 4:
                saia += quantidade;
                break;
            case 5:
                blusa += quantidade;
                break;
            case 6:
                moletom += quantidade;
                break;
            case 7:
                meia += quantidade;
                break;
            case 8:
                tenis += quantidade;
                break;
            case 9: 
                tenis += quantidade;
                break;
            default:
                System.out.println("Código inválido");
                break;
        }
    }

     public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);

        mostrarEstoque();

        //recebendo qual produto e quantidade para adicionar ao estoque
        System.out.println("Deseja adicionar algo ao estoque S/N: ");
        char resposta = scanner.next().charAt(0);

        if (resposta == 'S' || resposta == 's') {
            System.out.println("Informe o código do produto: ");
            int codigo = scanner.nextInt();
            System.out.println("Informe a quantidade: ");
            int quantidade = scanner.nextInt();
            AddEstoque(codigo, quantidade);
            System.out.println("Produto adicionado com sucesso!");
            mostrarEstoque();
        } else if (resposta =='N' || resposta == 'n' ) {
            System.out.println("ok!");
        } else{
            System.out.println("resposta inválida.");
        }

     scanner.close();
     }
}
