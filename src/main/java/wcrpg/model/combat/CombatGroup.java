package wcrpg.model.combat;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CombatGroup {

  private List<Combatant> combatants;
  
  public int getCompositeStrenghIndex() {
    int result = 0;
    for (Combatant c : combatants) {
      result += c.getStrengthIndex();
    }
    return result;
  }

  public Collection<Combatant> getCombatants() {
    return Collections.unmodifiableCollection(combatants);
  }
}
