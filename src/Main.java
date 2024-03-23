import javax.swing.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.println("Raças de cachorro aleatórias");


       int num = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor qualquer de 1 a 5"));

        switch (num){
            case 1:
                System.out.println("Borzoi");
            case 2:
                System.out.println("Bull Terrier");
            case 3:
                System.out.println("Pug");
            case 4:
                System.out.println("Shih Tzu");
            case 5:
                System.out.println("Pastor Alemão");
        }

    }
}