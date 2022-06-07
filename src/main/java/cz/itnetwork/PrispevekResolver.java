package cz.itnetwork;

import com.coxautodev.graphql.tools.GraphQLResolver;
import org.springframework.stereotype.Component;

@Component
public class PrispevekResolver implements GraphQLResolver<Prispevek> {

    public Uzivatel getAutor(Prispevek prispevek) {
        return QueeryResolver.listUzivatelu.stream()
                .filter(uzivatel -> uzivatel.getId().equals(prispevek.getAutor()))
                .findFirst()
                .orElse(null);
    }
}