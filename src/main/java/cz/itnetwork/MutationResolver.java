package cz.itnetwork;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.springframework.stereotype.Component;

import java.util.function.Predicate;

@Component
public class MutationResolver implements GraphQLMutationResolver {

    public Uzivatel pridejUzivatele(String jmeno, String prijmeni) {
        Uzivatel uzivatel = new Uzivatel(SimulaceDatabaze.noveIdUzivatel(), jmeno, prijmeni);
        SimulaceDatabaze.listUzivatelu.add(uzivatel);
        return uzivatel;
    }

    public Uzivatel odeberUzivatele(String id) {
        Uzivatel smazanyUzivatel = SimulaceDatabaze.listUzivatelu.stream().filter(uzivatel -> uzivatel.getId().equals(id)).findFirst().orElse(null);
        if (smazanyUzivatel != null)
            SimulaceDatabaze.listUzivatelu.removeIf(uzivatel -> uzivatel.getId().equals(id));
        return smazanyUzivatel;
    }

    public Uzivatel upravUzivatele(String id, String jmeno, String prijmeni) {
        Uzivatel upravenyUzivatel = SimulaceDatabaze.listUzivatelu.stream().filter(uzivatel -> uzivatel.getId().equals(id)).findFirst().orElse(null);
        if(upravenyUzivatel != null) {
            upravenyUzivatel.setJmeno(jmeno);
            upravenyUzivatel.setPrijmeni(prijmeni);
        }
        return upravenyUzivatel;
    }
}
