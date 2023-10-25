package net.soul.meldedadditions.item.custom;

import net.minecraft.network.chat.ClickEvent;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;

public class WaitlistItem extends Item {
    public WaitlistItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResult useOn(UseOnContext pContext) {
        if(pContext.getLevel().isClientSide){
            Player player = pContext.getPlayer();
player.sendSystemMessage(Component.literal("Click me for Mangonade's spotify page!").withStyle(s -> s.withClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, "https://open.spotify.com/artist/5dhSYfMl7HiedPG2Fctsz7?si=mqb2soMNRxu29IR87rr-_g"))));
        }

        return InteractionResult.SUCCESS;
    }
}
