package batfish.representation;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

/**
 * Representing a bgp process for a particular autonomous system on a router
 */
public class BgpProcess implements Serializable {

   private static final long serialVersionUID = 1L;

   private Map<Ip, BgpNeighbor> _bgpNeighbors;
   private Set<GeneratedRoute> _generatedRoutes;

   public BgpProcess() {
      _bgpNeighbors = new HashMap<Ip, BgpNeighbor>();
      _generatedRoutes = new HashSet<GeneratedRoute>();
   }

   public Set<GeneratedRoute> getGeneratedRoutes() {
      return _generatedRoutes;
   }

   public Map<Ip, BgpNeighbor> getNeighbors() {
      return _bgpNeighbors;
   }

}
