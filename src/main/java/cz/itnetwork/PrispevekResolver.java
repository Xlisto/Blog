package cz.itnetwork;

import com.coxautodev.graphql.tools.GraphQLResolver;
import org.springframework.stereotype.Component;

@Component
public class PrispevekResolver implements GraphQLResolver<Prispevek> {

    public Uzivatel autor(Prispevek prispevek) {
        return SimulaceDatabaze.listUzivatelu.stream()
                .filter(uzivatel -> uzivatel.getId().equals(prispevek.getAutor()))
                .findFirst()
                .orElse(null);
    }
}
