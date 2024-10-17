package ru.mirea.dzarasovra.pkmn;
import  ru.mirea.dzarasovra.pkmn.Card;
import java.io.IOException;

public class PkmnApplication {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        CardImport cardImport = new CardImport();
        Card card = cardImport.importCard("my_card.txt");
        System.out.println("Мой покемон" + '\n' + card + "\n\n");

        CardExport cardExport = new CardExport(card);
        cardExport.serializeToBytes();
        Card anotherCard = cardImport.deserializeCard("Bouffalant");
        System.out.println("Другой покемон"+ '\n'+ anotherCard + '\n');
    }
}
