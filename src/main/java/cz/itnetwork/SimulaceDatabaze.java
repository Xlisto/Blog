package cz.itnetwork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SimulaceDatabaze {

    static private int idUzivatel = 4;
    static private int idPrispevek = 3;
    static private final String author = "author-";

    static private final Uzivatel[] poleUzivatelu = {
            new Uzivatel(author+"1", "Hana", "Linková"),
            new Uzivatel(author+"2", "Jaromír", "Zapletal"),
            new Uzivatel(author+"3", "Anežka", "Švejdová"),
            new Uzivatel(author+"4", "Marek", "Vrchota")
    };

    static private final Prispevek[] polePrispevku = {
            new Prispevek("1",author+"1","Pikantní hovězí","Postup: Anglickou slaninu nakrájíme na kostičky a dáme ji do kastrolu osmahnout, pak přidáme na drobno nakrájenou cibuli, kterou orestujeme. Poté přidáme na kostičky nakrájené hovězí maso, prolisovaný česnek, osolíme a opepříme, zalijeme bílým vínem a velmi zvolna dusíme pod pokličkou, až maso změkne. Podáváme s rýží a zeleninou."),
            new Prispevek("2",author+"1","Hlávkový salát s majonézou","Postup: Ředkvičky nakrájíme na plátky, cibuli na kostičky. Vejce uvaříme, vychladíme, oloupeme a také drobně nakrájíme - a vše osolíme, opepříme a promícháme s majolkou. Směs pak nalijeme na natrhaný salát, který na talířích ozdobíme plátky rajčete."),
            new Prispevek("3",author+"2","HyperX Cloud II Red","Herní sluchátka drátová, s mikrofonem, přes hlavu, okolo uší, uzavřená konstrukce, 3,5 mm Jack, USB-A, pro PC...")
    };

    static public List<Uzivatel> listUzivatelu = new ArrayList<>(Arrays.asList(poleUzivatelu));
    static public List<Prispevek> listPrispevku = new ArrayList<>(Arrays.asList(polePrispevku));

    static public String noveIdUzivatel() {
        idUzivatel++;
        return author+idUzivatel;
    }

    static public String noveIdPrispevek() {
        idPrispevek++;
        return String.valueOf(idPrispevek);
    }
}
