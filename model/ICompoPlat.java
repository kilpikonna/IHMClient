package ihm.tydrichova.upmc.fr.ihmclient.model;

import java.util.Map;
import java.util.Set;

public interface ICompoPlat extends IElement{
    Map<Categorie, Set<Plat>> getCompo();
}