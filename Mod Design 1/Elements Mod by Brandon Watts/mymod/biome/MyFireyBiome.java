package mymod.biome;

import acq;
import acr;
import apc;
import aqz;
import java.util.List;
import rq;
import tf;
import tg;


public class MyFireyBiome
  extends acq
{
  public MyFireyBiome(int par1)
  {
    super(par1);
    
    a("Fire World");
    
    A = ((byte)aucF);
    B = ((byte)HcF);
    
    I.F = 20;
    I.G = 100;
    I.C = 1000;
    
    K.add(new acr(tg.class, 5, 1, 4));
    K.add(new acr(tf.class, 7, 3, 8));
    K.add(new acr(rq.class, 10, 6, 12));
    
    b(0.0F, 0.1F);
    a(0.5F, 0.2F);
  }
}
