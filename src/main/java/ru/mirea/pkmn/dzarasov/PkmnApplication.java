package ru.mirea.pkmn.dzarasov;

import ru.mirea.pkmn.Card;

import java.io.IOException;

public class PkmnApplication {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        CardImport cardImport = new CardImport();
        Card card = cardImport.importCard("my_card.txt");
        System.out.println("Мой покемон" + '\n' + card + '\n');

        CardExport cardExport = new CardExport(card);
        cardExport.serializeToBytes();
        Card anotherCard = cardImport.deserializeCard("Noibat");
        System.out.println("Другой покемон"+ '\n'+ anotherCard + '\n');
    }
}
