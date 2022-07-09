package cz.itnetwork;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class QueeryResolver implements GraphQLQueryResolver {

    public Uzivatel uzivatel(String id) {
        return SimulaceDatabaze.listUzivatelu.stream()
                .filter(uzivatel -> uzivatel.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public Prispevek prispevek(String id) {
        return SimulaceDatabaze.listPrispevku.stream()
                .filter(prispevek -> prispevek.getId().equals(id))
                .findFirst()
                .orElse(null);
    }


    public List<Uzivatel> uzivatele() {
        return SimulaceDatabaze.listUzivatelu;
    }

    public List<Prispevek> prispevky() {
        return SimulaceDatabaze.listPrispevku;
    }

    public String pozdrav() {
        return  "Ahoj, zdraví tě GraphQL";
    }

}
