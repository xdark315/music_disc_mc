package fr.nalet.music.item;

import fr.nalet.music.Music;
import fr.nalet.music.sound.ModSounds;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.RecordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Music.MOD_ID);

    private static final Item.Properties discProperties =
            new Item.Properties().stacksTo(1).tab(ModCreativeTab.DISC_TAB);

    public static final RegistryObject<Item> RAMBLE_ON_DISC = ITEMS.register("ramble_on_disc",
            () -> new RecordItem(10, ModSounds.RAMBLE_ON, discProperties));

    public static final RegistryObject<Item> REAL_GONE_DISC = ITEMS.register("real_gone_disc",
            () -> new RecordItem(10, ModSounds.REAL_GONE, discProperties));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
