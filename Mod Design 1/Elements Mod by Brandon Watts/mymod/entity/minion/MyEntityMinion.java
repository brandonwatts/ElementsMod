package mymod.entity.minion;

import abw;
import acg;
import acq;
import adr;
import als;
import asx;
import by;
import java.util.Random;
import ls;
import mymod.Main;
import og;
import oo;
import os;
import ts;
import uf;

public class MyEntityMinion extends og implements th
{
  public float squishAmount;
  public float squishFactor;
  public float prevSquishFactor;
  private int slimeJumpDelay;
  
  public MyEntityMinion(abw par1World)
  {
    super(par1World);
    int i = 1 << ab.nextInt(3);
    N = 0.0F;
    slimeJumpDelay = (ab.nextInt(20) + 10);
    setSlimeSize(i);
  }
  
  protected void a()
  {
    super.a();
    ah.a(16, new Byte((byte)1));
  }
  
  protected void setSlimeSize(int par1)
  {
    ah.b(16, new Byte((byte)par1));
    a(0.6F * par1, 0.6F * par1);
    b(u, v, w);
    a(tp.a).a(par1 * par1);
    g(aT());
    b = par1;
  }
  



  public int getSlimeSize()
  {
    return ah.a(16);
  }
  



  public void b(by par1NBTTagCompound)
  {
    super.b(par1NBTTagCompound);
    par1NBTTagCompound.a("Size", getSlimeSize() - 1);
  }
  



  public void a(by par1NBTTagCompound)
  {
    super.a(par1NBTTagCompound);
    setSlimeSize(par1NBTTagCompound.e("Size") + 1);
  }
  



  protected String getSlimeParticle()
  {
    return "slime";
  }
  



  protected String getJumpSound()
  {
    return "mob.slime." + (getSlimeSize() > 1 ? "big" : "small");
  }
  



  public void l_()
  {
    if ((!q.I) && (q.r == 0) && (getSlimeSize() > 0))
    {
      M = true;
    }
    
    squishFactor += (squishAmount - squishFactor) * 0.5F;
    prevSquishFactor = squishFactor;
    boolean flag = F;
    super.l_();
    

    if ((F) && (!flag))
    {
      int i = getSlimeSize();
      
      for (int j = 0; j < i * 8; j++)
      {
        float f = ab.nextFloat() * 3.1415927F * 2.0F;
        float f1 = ab.nextFloat() * 0.5F + 0.5F;
        float f2 = ls.a(f) * i * 0.5F * f1;
        float f3 = ls.b(f) * i * 0.5F * f1;
        q.a(getSlimeParticle(), u + f2, E.b, w + f3, 0.0D, 0.0D, 0.0D);
      }
      
      if (makesSoundOnLand())
      {
        a(getJumpSound(), ba(), ((ab.nextFloat() - ab.nextFloat()) * 0.2F + 1.0F) / 0.8F);
      }
      
      squishAmount = -0.5F;
    }
    else if ((!F) && (flag))
    {
      squishAmount = 1.0F;
    }
    
    alterSquishAmount();
    
    if (q.I)
    {
      int i = getSlimeSize();
      a(0.6F * i, 0.6F * i);
    }
  }
  
  protected void bl()
  {
    u();
    uf entityplayer = q.b(this, 16.0D);
    
    if (entityplayer != null)
    {
      a(entityplayer, 10.0F, 20.0F);
    }
    
    if ((F) && (slimeJumpDelay-- <= 0))
    {
      slimeJumpDelay = getJumpDelay();
      
      if (entityplayer != null)
      {
        slimeJumpDelay /= 3;
      }
      
      bd = true;
      
      if (makesSoundOnJump())
      {
        a(getJumpSound(), ba(), ((ab.nextFloat() - ab.nextFloat()) * 0.2F + 1.0F) * 0.8F);
      }
      
      be = (1.0F - ab.nextFloat() * 2.0F);
      bf = (1 * getSlimeSize());
    }
    else
    {
      bd = false;
      
      if (F)
      {
        be = (this.bf = 0.0F);
      }
    }
  }
  
  protected void alterSquishAmount()
  {
    squishAmount *= 0.6F;
  }
  



  protected int getJumpDelay()
  {
    return ab.nextInt(20) + 10;
  }
  
  protected ts createInstance()
  {
    return new ts(q);
  }
  



  public void x()
  {
    int i = getSlimeSize();
    
    if ((!q.I) && (i > 1) && (aN() <= 0.0F))
    {
      int j = 2 + ab.nextInt(3);
      
      for (int k = 0; k < j; k++)
      {
        float f = (k % 2 - 0.5F) * i / 4.0F;
        float f1 = (k / 2 - 0.5F) * i / 4.0F;
        ts entityslime = createInstance();
        
        entityslime.b(u + f, v + 0.5D, w + f1, ab.nextFloat() * 360.0F, 0.0F);
        q.d(entityslime);
      }
    }
    
    super.x();
  }
  



  public void b_(uf par1EntityPlayer)
  {
    if (canDamagePlayer())
    {
      int i = getSlimeSize();
      
      if ((o(par1EntityPlayer)) && (e(par1EntityPlayer) < 0.6D * i * 0.6D * i) && (par1EntityPlayer.a(nb.a(this), getAttackStrength())))
      {
        a("mob.attack", 1.0F, (ab.nextFloat() - ab.nextFloat()) * 0.2F + 1.0F);
      }
    }
  }
  



  protected boolean canDamagePlayer()
  {
    return getSlimeSize() > 1;
  }
  



  protected int getAttackStrength()
  {
    return getSlimeSize();
  }
  



  protected String aO()
  {
    return "mob.enderdragon.growl";
  }
  



  protected String aP()
  {
    return "mob.slime." + (getSlimeSize() > 1 ? "big" : "small");
  }
  



  protected int s()
  {
    return MySword_2cv;
  }
  



  public boolean bs()
  {
    adr chunk = q.d(ls.c(u), ls.c(w));
    
    if (q.N().u().handleSlimeSpawnReduction(ab, q))
    {
      return false;
    }
    

    if ((getSlimeSize() == 1) || (q.r > 0))
    {
      acq biomegenbase = q.a(ls.c(u), ls.c(w));
      
      if ((biomegenbase == acq.h) && (v > 50.0D) && (v < 70.0D) && (ab.nextFloat() < 0.5F) && (ab.nextFloat() < q.x()) && (q.n(ls.c(u), ls.c(v), ls.c(w)) <= ab.nextInt(8)))
      {
        return super.bs();
      }
      
      if ((ab.nextInt(10) == 0) && (chunk.a(987234911L).nextInt(10) == 0) && (v < 40.0D))
      {
        return super.bs();
      }
    }
    
    return false;
  }
  




  protected float ba()
  {
    return 0.4F * getSlimeSize();
  }
  




  public int bp()
  {
    return 0;
  }
  



  protected boolean makesSoundOnJump()
  {
    return getSlimeSize() > 0;
  }
  



  protected boolean makesSoundOnLand()
  {
    return getSlimeSize() > 2;
  }
}
