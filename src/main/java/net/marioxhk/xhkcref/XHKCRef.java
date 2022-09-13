package net.marioxhk.xhkcref;

import net.fabricmc.api.ModInitializer;
import net.marioxhk.xhkcref.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class XHKCRef implements ModInitializer {
	public static final String MODID = "xhkcref";
	public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();

	}
}
