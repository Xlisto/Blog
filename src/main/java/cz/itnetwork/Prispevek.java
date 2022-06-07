package cz.itnetwork;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Prispevek {

    private String id;
    private String autor;
    private String titulek;
    private String obsah;

}
