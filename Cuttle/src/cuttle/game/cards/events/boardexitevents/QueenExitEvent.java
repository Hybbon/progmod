package cuttle.game.cards.events.boardexitevents;

import cuttle.game.actions.playeractions.LowerProtection;
import cuttle.game.cards.CuttleCard;
import cuttle.game.cards.events.Event;
import cuttle.game.cards.events.Trigger;

/**
 * Describe this class and the methods exposed by it.
 */
public class QueenExitEvent extends Event {
    public QueenExitEvent(CuttleCard card){
        super(Trigger.OnBoardExit, card);
    }

    @Override
    public void execute() {
        game().perform(new LowerProtection(card().owner()));
    }
}