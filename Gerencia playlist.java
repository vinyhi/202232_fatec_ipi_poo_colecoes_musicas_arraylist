import java.util.array.List;
import java.util.List;
import java.util.LinkedList;
import java.util.collections;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showInputDialog;
import static java.lang.integer.parseInt;
public class GerenciarPlaylist{
Run|Debug
public static void main (String[] args){
    //generics
    //List <musicas> musicas = new LinkedList<Musica>()
    var musicas = new ArrayList<Musica>{}
    String menu = "1- Adicionar musicas\n2- ver musicas\n3-avaliar musica\n 4- Excluir musica\n0- sair"
    int op ;
    do {
        op = parseInt(showInputDialog);
        Switch(op){
            case 1 
            //1 pegar os dados da musica 
            var titulo = showInputDialog("titulo?")
            //2 construir um objeto musica
            var titulo = new Musica
            //adicionar na coleçao com add
            musicas.add(new Musica())
            //4avisar usuario que deu certo
            showMessageDialog("musica adicionada")

        }
    }
    while{op!=0}
    musicas.add(new Musica())
}
}