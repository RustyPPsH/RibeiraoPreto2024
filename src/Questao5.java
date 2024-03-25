import javax.swing.JOptionPane;

public class Questao5 {
    public static void main(String[] args) throws Exception {

      String str = JOptionPane.showInputDialog("Digite uma palavra: ");
      String nstr ="";
      char ch;
       
      
       
      for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i); //Extrai cada caracter da palavra
        nstr= ch+nstr; //acrescenta cada caracter extraído na frente da nova string
      }

      JOptionPane.showMessageDialog(null, "Palavra Inserida: " + str + "\nPalavra invertida: "+ nstr);

    }
    
}
