package cz.itnetwork;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Uzivatel {

    private String id;
    private String jmeno;
    private String prijmeni;

}
