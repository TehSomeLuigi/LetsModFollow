package com.someluigi.letsmodfollow;

import com.someluigi.letsmodfollow.proxy.IProxy;
import com.someluigi.letsmodfollow.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid= Reference.MOD_ID, name=Reference.MOD_NAME, version="1.7.2-0.0.0")
public class LetsModFollow {
    @Mod.Instance(Reference.MOD_ID)
    public static LetsModFollow instance;

	@SidedProxy(clientSide = "com.someluigi.letsmodfollow.proxy.ClientProxy", serverSide = "com.someluigi.letsmodfollow.proxy.ServerProxy")
	public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent evt) {

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent evt) {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent evt) {

    }
}
