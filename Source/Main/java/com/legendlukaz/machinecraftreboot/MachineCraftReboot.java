package com.legendlukaz.machinecraftreboot;

import com.legendlukaz.machinecraftreboot.proxy.IProxy;
import com.legendlukaz.machinecraftreboot.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class MachineCraftReboot
{
    @Mod.Instance(Reference.MOD_ID)
    public static MachineCraftReboot instance;

    @SidedProxy(clientSide = "com.legendlukaz.machinecraftreboot.proxy.ClientProxy", serverSide = "com.legendlukaz.machinecraftreboot.proxy.ServerProxy")
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
