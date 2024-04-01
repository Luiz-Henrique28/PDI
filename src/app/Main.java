package app;
import java.awt.image.BufferedImage;

public class Main {
    public static void main(String[] args) {
        BufferedImage image = ManipulaImagem.carregarImagem("lenna.png");
        ManipulaImagem.exibirImagens(OpPontuais.cinzaRed(image), OpPontuais.cinzaBlue(image), OpPontuais.cinzaGreen(image));
        ManipulaImagem.salvarImagem(OpPontuais.binarizacao(image, 80));
    }
}