package fr.nalet.music;

import com.mojang.logging.LogUtils;
import fr.nalet.music.item.ModItems;
import fr.nalet.music.sound.ModSounds;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Music.MOD_ID)
public class Music {
    public static final String MOD_ID = "music";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public Music() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModSounds.register(eventBus);
        ModItems.register(eventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        // some pre init code
        LOGGER.info("Mod music loading");
    }
}
