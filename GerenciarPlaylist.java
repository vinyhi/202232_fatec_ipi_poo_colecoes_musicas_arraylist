import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
import java.util.Collections;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showInputDialog;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.toString;
public class GerenciarPlaylist{
public static void main (String[] args){
    //generics
    //List <musicas> musicas = new LinkedList<Musica>()
    var musicas = new ArrayList <Musica>();
    String menu = "1- Adicionar musicas\n2- ver musicas\n3-avaliar musica\n 4- Excluir musica\n0- sair";
    int op ;
    do {
        op = parseInt (showInputDialog(menu));
        switch (op){
            
            case 1 :{
            //1 pegar os dados da musica 
            var titulo = showInputDialog("titulo?");
            //2 construir um objeto musica
            var musica = new Musica();
            //adicionar na coleçao com add
            musicas.add(new Musica());
            //4avisar usuario que deu certo
            showMessageDialog(null,"titulo");
            break;
        }
        case 2:{
            var sb = new StringBuilder("");
            for (Musica m :musicas){
                sb.append(m)
                .append("\n")
                .append("****************");
            }
            showMessageDialog(null, sb);
            break;
         //   var n= StringBuilder("")
           // for (int x=0:x< musicas.size;x++){
            //   sb.append(musicas.get(i-1));
            //   .append('\n****************')
           // }
        }
    }
}
    while (op!=0);
    
}
}