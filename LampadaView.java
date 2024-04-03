package view;

import br.Lampada;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

    public class LampadaView { 
        private JPanel simulador;
        private JTextArea simuladorDeLampadaTextArea;
        private JButton desligarButton;
        private JButton ligarButton;
        private JPanel pnTitulo;
        private JLabel lbTitulo;
        private Lampada lampada;
public LampadaView() {

ligarButton.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) { System.out.println("ligado"); }
}); ////button funcionalidade ligar


desligarButton.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) { System.out.println("desligado"); }
});////button funcionalidade desligar

        }

        public static void main(String[] args) {
            JFrame frame = new JFrame("Simulador de Lâmpada");
            frame.setContentPane(new LampadaView().simulador);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
    }
}
