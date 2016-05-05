package cuttle.game.actions.playeractions;

import cuttle.game.Player;
import cuttle.game.actions.TargetedPlayerAction;
import cuttle.game.cards.CuttleCard;

/**
 * Describe this class and the methods exposed by it.
 */
public class Discard extends TargetedPlayerAction {

    public Discard(CuttleCard target, Player player){
        super(target, player, "discard");
    }

    @Override
    public void act() {
        Integer index = player().hand().indexOf(target());
        player().hand().pop(index);
        game().scrapPile().push(target());
        game().updateCardPile(target(), game().scrapPile());
    }
}
