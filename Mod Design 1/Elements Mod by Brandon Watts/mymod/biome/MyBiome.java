package mymod.biome;

import acq;
import acr;
import apc;
import aqz;
import java.util.List;
import mymod.Main;
import sc;
import tq;

public class MyBiome extends acq
{
  public MyBiome(int par1)
  {
    super(par1);
    
    a("Water World");
    
    A = ((byte)MyBlock_1cF);
    B = ((byte)FcF);
    
    I.y = 20;
    I.A = 1000;
    I.G = 20;
    
    K.add(new acr(sc.class, 5, 1, 4));
    K.add(new acr(tq.class, 7, 3, 8));
    K.add(new acr(rq.class, 10, 6, 12));
    
    b(0.0F, 0.1F);
    a(0.5F, 0.2F);
  }
}
