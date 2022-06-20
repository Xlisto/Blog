package cz.itnetwork;

import com.coxautodev.graphql.tools.GraphQLResolver;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UzivatelResolver implements GraphQLResolver<Uzivatel> {

    public List<Prispevek> prispevek(Uzivatel uzivatel) {
        return SimulaceDatabaze.listPrispevku.stream()
                .filter(prispevek -> prispevek.getAutor().equals(uzivatel.getId()))
                .toList();
    }
}
