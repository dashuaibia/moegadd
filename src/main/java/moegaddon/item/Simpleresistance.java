package moegaddon.item;


import moegaddon.loaders.Loader_M_CreativeTabs;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class Simpleresistance extends Item {
	{
	this.setUnlocalizedName("Simpleresistance");
    this.setCreativeTab(Loader_M_CreativeTabs.ElectronicTab);
    this.setTextureName("moegadd:SimpleResistance");
    GameRegistry.registerItem(this, "Simpleresistance");
	}

}
