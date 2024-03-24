package view;

import br.Lampada;
import javax.swing.*;
import java.awt.event.ActionListener;

    public class LampadaView {  ////////////////interface
        private JPanel simulador;
        private JTextArea simuladorDeLampadaTextArea;
        private JButton desligarButton;
        private JButton ligarButton;
        private JPanel pnTitulo;
        private JLabel lbTitulo;
        private Lampada lampada;
public LampadaView() {
    lampada = new Lampada(false);

ligarButton.addActionListener(e ->{lampada.setStatus(true);atualizarTextoLampada();}); ////button funcionalidade ligar

desligarButton.addActionListener(e -> {lampada.setStatus(false);atualizarTextoLampada();
}); ////button funcionalidade desligar
        }
        private void atualizarTextoLampada() {
            String status = lampada.isStatus() ? "Ligada" : "Desligada";
            simuladorDeLampadaTextArea.setText("Lâmpada está " + status);
        }


        public static void main(String[] args) {
            JFrame frame = new JFrame("Simulador de Lâmpada");
            frame.setContentPane(new LampadaView().simulador);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
    }
}
