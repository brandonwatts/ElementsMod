package mymod.handlers;

import aqz;
import mymod.Main;
import ss;
import uf;

public class MyPickupHandler implements cpw.mods.fml.common.IPickupNotifier
{
  public MyPickupHandler() {}
  
  public void notifyPickup(ss item, uf player)
  {
    if (dd == MyBlock_1cF) {
      player.a(Main.MyAchievement_1, 1);
    }
  }
}
