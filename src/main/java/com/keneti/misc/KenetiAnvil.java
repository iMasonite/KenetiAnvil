package com.keneti.misc;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

/** @author Michael Mason */
public class KenetiAnvil extends JavaPlugin implements Listener {
  
  @Override
  public void onEnable() {
    this.getServer().getPluginManager().registerEvents(this, this);
  }
    
}
