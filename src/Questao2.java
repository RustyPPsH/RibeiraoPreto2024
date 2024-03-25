import javax.swing.JOptionPane;

public class Questao2 {
    
    public static void main(String[] args) throws Exception {

        int N = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
        int A = 1;
        int B = 1;
        int C = 0;

        if (N==0 || N==1){
            JOptionPane.showMessageDialog(null, "O número " + N + " é um número de Fibonacci");
        } else {
            while (C < N){
                C = A + B;
                A = B;
                B = C;
            }
            if (C == N){
                JOptionPane.showMessageDialog(null, "O número " + N + " é um número de Fibonacci");
            } else {
                JOptionPane.showMessageDialog(null, "O número " + N + " não é um número de Fibonacci");
            }
        }



        System.out.println("O valor de N é: " + N);

    }
}