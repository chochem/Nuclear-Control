package shedar.mods.ic2.nuclearcontrol.crossmod.mekanism;

import net.minecraft.item.Item;

import shedar.mods.ic2.nuclearcontrol.crossmod.ModLib;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;

public class CrossMekanism {

    public static boolean classExists = false;
    public static Item mekCard;

    public CrossMekanism() {
        try {
            Class.forName("mekanism.api.energy.IStrictEnergyStorage", false, this.getClass().getClassLoader());
            classExists = true;
        } catch (ClassNotFoundException e) {
            // nothing
        }
    }

    public static boolean isMekanismPresent() {
        return Loader.isModLoaded(ModLib.MEKANISM);
    }

    public static void LoadItems() {
        mekCard = new MekRFCard();
        GameRegistry.registerItem(mekCard, "MekRFenergyCard");
    }

}
