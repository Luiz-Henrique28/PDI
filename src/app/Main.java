package app;
import java.awt.image.BufferedImage;

public class Main {
    public static void main(String[] args) {
        BufferedImage imagem = ManipulaImagem.carregarImagem("lenna.png");
        ManipulaImagem.exibirImagens( imagem);
    }
}