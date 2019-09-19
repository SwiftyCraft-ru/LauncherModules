package pro.gravit.launchermodules.startscreen;

import java.awt.SplashScreen;

import pro.gravit.launcher.client.events.ClientGuiPhase;
import pro.gravit.launcher.modules.LauncherInitContext;
import pro.gravit.launcher.modules.LauncherModule;
import pro.gravit.launcher.modules.LauncherModuleInfo;
import pro.gravit.launcher.modules.events.PreConfigPhase;
import pro.gravit.utils.Version;
import pro.gravit.utils.helper.IOHelper;
import pro.gravit.utils.helper.LogHelper;

public class ModuleImpl extends LauncherModule {
	public ModuleImpl() {
		super(new LauncherModuleInfo("LauncherStartScreen", version, Integer.MAX_VALUE-200, new String[0]));
	}
	
    public static final Version version = new Version(0, 1, 0, 0, Version.Type.LTS);

    public SplashScreen screen = null;

	@Override
	public void init(LauncherInitContext initContext) {
		registerEvent(this::preInit, PreConfigPhase.class);
        registerEvent(this::finish, ClientGuiPhase.class);
	}
	public void preInit(PreConfigPhase phase)
	{
		try {
			screen = SplashScreen.getSplashScreen();
			screen.setImageURL(IOHelper.getResourceURL("runtime/splash.png"));
			screen.createGraphics();
			screen.update();
		} catch (Throwable e) {
			LogHelper.error(e);
		}
	}
	public void finish(ClientGuiPhase context) {
		if (screen != null)
			try {
				screen.close();
				screen = null;
			} catch (Throwable e) {
				LogHelper.error(e);
			}
    }
}