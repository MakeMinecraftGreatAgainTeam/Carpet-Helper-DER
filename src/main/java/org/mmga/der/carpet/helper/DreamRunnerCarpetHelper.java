package org.mmga.der.carpet.helper;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created On 2022/9/10 20:56
 *
 * @author wzp
 * @version 1.0.0
 */
public class DreamRunnerCarpetHelper implements ModInitializer {
    public static final Logger logger = LoggerFactory.getLogger("DreamRunnerCarpetHelper");
    @Override
    public void onInitialize() {

        logger.info("Loaded!");
    }
}
