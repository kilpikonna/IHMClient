package ihm.tydrichova.upmc.fr.ihmclient.data;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

import ihm.tydrichova.upmc.fr.ihmclient.model.Client;

/**
 * Created by Magdalena on 5/11/2018.
 */

public class Clients {
    private static Clients ourInstance = new Clients();

    public static Clients getInstance() {
        return ourInstance;
    }

    private TreeSet<Client> clients = new TreeSet<Client>();
    private Clients() {
        clients.add(new Client("tortue1", "motdepasse1"));
        clients.first().addPlat(Plats.getInstance().getPlats().get(0), 4);
        clients.add(new Client("tortue2", "motdepasse2"));
    }

    public TreeSet<Client> getClients() {
        return clients;
    }
}
