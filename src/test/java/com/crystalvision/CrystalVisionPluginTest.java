package com.crystalvision;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class CrystalVisionPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(CrystalVisionPlugin.class);
		RuneLite.main(args);
	}
}