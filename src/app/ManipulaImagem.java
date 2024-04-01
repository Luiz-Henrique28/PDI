package app;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ManipulaImagem {
    public static BufferedImage carregarImagem(String path) {
        try {
            return ImageIO.read(new File(path));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void exibirImagens(BufferedImage ...imagens) {
        JFrame frame = new JFrame("exibição de imagem");
        JPanel painel = new JPanel(new FlowLayout());

        for(BufferedImage imgs : imagens){
            painel.add(new JLabel(new ImageIcon(imgs)));
        }

        frame.getContentPane().add(painel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    public static void salvarImagem(BufferedImage imagem) {
        try {
            ImageIO.write(imagem, "jpg", new File("imagem-salva.jpg"));
        } catch (IOException e) {
            System.out.println("Erro caralho");
            throw new RuntimeException(e);
        }
    }
}
