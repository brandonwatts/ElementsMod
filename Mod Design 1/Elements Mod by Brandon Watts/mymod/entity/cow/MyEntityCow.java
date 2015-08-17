package mymod.entity.cow;

import abw;
import alf;
import ann;
import asx;
import by;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Random;
import ls;
import nb;
import nk;
import nn;
import of;
import oo;
import oq;
import os;
import pp;
import pq;
import pt;
import pw;
import px;
import qa;
import ql;
import qm;
import qr;
import qx;
import rb;
import rc;
import rd;
import rf;
import rp;
import rz;
import sf;
import tf;
import tj;
import tp;
import uc;
import ud;
import uf;
import uh;
import xx;
import yc;
import ye;

public class MyEntityCow extends oq
{
  private float field_70926_e;
  private float field_70924_f;
  private boolean isShaking;
  private boolean field_70928_h;
  private float timeWolfIsShaking;
  private float prevTimeWolfIsShaking;
  
  public MyEntityCow(abw par1World)
  {
    super(par1World);
    a(0.6F, 0.8F);
    k().a(true);
    c.a(1, new pp(this));
    c.a(2, bp);
    c.a(3, new pw(this, 0.4F));
    c.a(4, new qa(this, 1.0D, true));
    c.a(5, new pq(this, 1.0D, 10.0F, 2.0F));
    c.a(6, new pk(this, 1.0D));
    c.a(7, new qm(this, 1.0D));
    
    c.a(9, new px(this, uf.class, 8.0F));
    c.a(9, new ql(this));
    d.a(1, new rc(this));
    d.a(2, new rd(this));
    d.a(3, new qx(this, true));
    d.a(4, new rb(this, rz.class, 200, false));
    j(false);
  }
  
  protected void az()
  {
    super.az();
    a(tp.d).a(0.30000001192092896D);
    
    if (bT())
    {
      a(tp.a).a(20.0D);
    }
    else
    {
      a(tp.a).a(8.0D);
    }
  }
  



  public boolean bf()
  {
    return true;
  }
  



  public void d(of par1EntityLivingBase)
  {
    super.d(par1EntityLivingBase);
    
    if (par1EntityLivingBase == null)
    {
      setAngry(false);
    }
    else if (!bT())
    {
      setAngry(true);
    }
  }
  



  protected void bk()
  {
    ah.b(18, Float.valueOf(aN()));
  }
  
  protected void a()
  {
    super.a();
    ah.a(18, new Float(aN()));
    ah.a(19, new Byte((byte)0));
    ah.a(20, new Byte((byte)ann.j_(1)));
  }
  



  protected void a(int par1, int par2, int par3, int par4)
  {
    a("mob.wolf.step", 0.15F, 1.0F);
  }
  



  public void b(by par1NBTTagCompound)
  {
    super.b(par1NBTTagCompound);
    par1NBTTagCompound.a("Angry", isAngry());
    par1NBTTagCompound.a("CollarColor", (byte)getCollarColor());
  }
  



  public void a(by par1NBTTagCompound)
  {
    super.a(par1NBTTagCompound);
    setAngry(par1NBTTagCompound.n("Angry"));
    
    if (par1NBTTagCompound.b("CollarColor"))
    {
      setCollarColor(par1NBTTagCompound.c("CollarColor"));
    }
  }
  



  protected String r()
  {
    return ab.nextInt(3) == 0 ? "mob.wolf.panting" : (bT()) && (ah.d(18) < 10.0F) ? "mob.wolf.whine" : isAngry() ? "mob.wolf.growl" : "mob.wolf.bark";
  }
  



  protected String aO()
  {
    return "mob.wolf.hurt";
  }
  



  protected String aP()
  {
    return "mob.wolf.death";
  }
  



  protected float ba()
  {
    return 0.4F;
  }
  



  protected int s()
  {
    return -1;
  }
  




  public void c()
  {
    super.c();
    
    if ((!q.I) && (isShaking) && (!field_70928_h) && (!bM()) && (F))
    {
      field_70928_h = true;
      timeWolfIsShaking = 0.0F;
      prevTimeWolfIsShaking = 0.0F;
      q.a(this, (byte)8);
    }
  }
  



  public void l_()
  {
    super.l_();
    field_70924_f = field_70926_e;
    
    if (func_70922_bv())
    {
      field_70926_e += (1.0F - field_70926_e) * 0.4F;
    }
    else
    {
      field_70926_e += (0.0F - field_70926_e) * 0.4F;
    }
    
    if (func_70922_bv())
    {
      g = 10;
    }
    
    if (G())
    {
      isShaking = true;
      field_70928_h = false;
      timeWolfIsShaking = 0.0F;
      prevTimeWolfIsShaking = 0.0F;
    }
    else if (((isShaking) || (field_70928_h)) && (field_70928_h))
    {
      if (timeWolfIsShaking == 0.0F)
      {
        a("mob.wolf.shake", ba(), (ab.nextFloat() - ab.nextFloat()) * 0.2F + 1.0F);
      }
      
      prevTimeWolfIsShaking = timeWolfIsShaking;
      timeWolfIsShaking += 0.05F;
      
      if (prevTimeWolfIsShaking >= 2.0F)
      {
        isShaking = false;
        field_70928_h = false;
        prevTimeWolfIsShaking = 0.0F;
        timeWolfIsShaking = 0.0F;
      }
      
      if (timeWolfIsShaking > 0.4F)
      {
        float f = (float)E.b;
        int i = (int)(ls.a((timeWolfIsShaking - 0.4F) * 3.1415927F) * 7.0F);
        
        for (int j = 0; j < i; j++)
        {
          float f1 = (ab.nextFloat() * 2.0F - 1.0F) * O * 0.5F;
          float f2 = (ab.nextFloat() * 2.0F - 1.0F) * O * 0.5F;
          q.a("splash", u + f1, f + 0.8F, w + f2, x, y, z);
        }
      }
    }
  }
  
  @SideOnly(Side.CLIENT)
  public boolean getWolfShaking()
  {
    return isShaking;
  }
  




  @SideOnly(Side.CLIENT)
  public float getShadingWhileShaking(float par1)
  {
    return 0.75F + (prevTimeWolfIsShaking + (timeWolfIsShaking - prevTimeWolfIsShaking) * par1) / 2.0F * 0.25F;
  }
  
  @SideOnly(Side.CLIENT)
  public float getShakeAngle(float par1, float par2)
  {
    float f2 = (prevTimeWolfIsShaking + (timeWolfIsShaking - prevTimeWolfIsShaking) * par1 + par2) / 1.8F;
    
    if (f2 < 0.0F)
    {
      f2 = 0.0F;
    }
    else if (f2 > 1.0F)
    {
      f2 = 1.0F;
    }
    
    return ls.a(f2 * 3.1415927F) * ls.a(f2 * 3.1415927F * 11.0F) * 0.15F * 3.1415927F;
  }
  
  @SideOnly(Side.CLIENT)
  public float getInterestedAngle(float par1)
  {
    return (field_70924_f + (field_70926_e - field_70924_f) * par1) * 0.15F * 3.1415927F;
  }
  
  public float f()
  {
    return P * 0.8F;
  }
  




  public int bp()
  {
    return bU() ? 20 : super.bp();
  }
  



  public boolean a(nb par1DamageSource, float par2)
  {
    if (ar())
    {
      return false;
    }
    

    nn entity = par1DamageSource.i();
    bp.a(false);
    
    if ((entity != null) && (!(entity instanceof uf)) && (!(entity instanceof uh)))
    {
      par2 = (par2 + 1.0F) / 2.0F;
    }
    
    return super.a(par1DamageSource, par2);
  }
  

  public boolean m(nn par1Entity)
  {
    int i = bT() ? 4 : 2;
    return par1Entity.a(nb.a(this), i);
  }
  
  public void j(boolean par1)
  {
    super.j(par1);
    
    if (par1)
    {
      a(tp.a).a(20.0D);
    }
    else
    {
      a(tp.a).a(8.0D);
    }
  }
  



  public boolean a(uf par1EntityPlayer)
  {
    ye itemstack = bn.h();
    
    if (bT())
    {
      if (itemstack != null)
      {
        if ((yc.g[d] instanceof xx))
        {
          xx itemfood = (xx)yc.g[d];
          
          if ((itemfood.j()) && (ah.d(18) < 20.0F))
          {
            if (!bG.d)
            {
              b -= 1;
            }
            
            f(itemfood.g());
            
            if (b <= 0)
            {
              bn.a(bn.c, (ye)null);
            }
            
            return true;
          }
        }
        else if (d == aYcv)
        {
          int i = ann.j_(itemstack.k());
          
          if (i != getCollarColor())
          {
            setCollarColor(i);
            
            if (!bG.d) { if (--b <= 0)
              {
                bn.a(bn.c, (ye)null);
              }
            }
            return true;
          }
        }
      }
      
      if ((par1EntityPlayer.c_().equalsIgnoreCase(h_())) && (!q.I) && (!c(itemstack)))
      {
        bp.a(!bU());
        bd = false;
        a((alf)null);
        b((nn)null);
        d((of)null);
      }
    }
    else if ((itemstack != null) && (d == aZcv) && (!isAngry()))
    {
      if (!bG.d)
      {
        b -= 1;
      }
      
      if (b <= 0)
      {
        bn.a(bn.c, (ye)null);
      }
      
      if (!q.I)
      {
        if (ab.nextInt(3) == 0)
        {
          j(true);
          a((alf)null);
          d((of)null);
          bp.a(true);
          g(20.0F);
          b(par1EntityPlayer.c_());
          i(true);
          q.a(this, (byte)7);
        }
        else
        {
          i(false);
          q.a(this, (byte)6);
        }
      }
      
      return true;
    }
    
    return super.a(par1EntityPlayer);
  }
  
  @SideOnly(Side.CLIENT)
  public void a(byte par1)
  {
    if (par1 == 8)
    {
      field_70928_h = true;
      timeWolfIsShaking = 0.0F;
      prevTimeWolfIsShaking = 0.0F;
    }
    else
    {
      super.a(par1);
    }
  }
  
  @SideOnly(Side.CLIENT)
  public float getTailRotation()
  {
    return bT() ? (0.55F - (20.0F - ah.d(18)) * 0.02F) * 3.1415927F : isAngry() ? 1.5393804F : 0.62831855F;
  }
  




  public boolean c(ye par1ItemStack)
  {
    return !(yc.g[d] instanceof xx) ? false : par1ItemStack == null ? false : ((xx)yc.g[d]).j();
  }
  



  public int bv()
  {
    return 8;
  }
  



  public boolean isAngry()
  {
    return (ah.a(16) & 0x2) != 0;
  }
  



  public void setAngry(boolean par1)
  {
    byte b0 = ah.a(16);
    
    if (par1)
    {
      ah.b(16, Byte.valueOf((byte)(b0 | 0x2)));
    }
    else
    {
      ah.b(16, Byte.valueOf((byte)(b0 & 0xFFFFFFFD)));
    }
  }
  



  public int getCollarColor()
  {
    return ah.a(20) & 0xF;
  }
  



  public void setCollarColor(int par1)
  {
    ah.b(20, Byte.valueOf((byte)(par1 & 0xF)));
  }
  



  public sf spawnBabyAnimal(nk par1EntityAgeable)
  {
    sf entitywolf = new sf(q);
    String s = h_();
    
    if ((s != null) && (s.trim().length() > 0))
    {
      entitywolf.b(s);
      entitywolf.j(true);
    }
    
    return entitywolf;
  }
  
  public void func_70918_i(boolean par1)
  {
    if (par1)
    {
      ah.b(19, Byte.valueOf((byte)1));
    }
    else
    {
      ah.b(19, Byte.valueOf((byte)0));
    }
  }
  



  public boolean a(rp par1EntityAnimal)
  {
    if (par1EntityAnimal == this)
    {
      return false;
    }
    if (!bT())
    {
      return false;
    }
    if (!(par1EntityAnimal instanceof sf))
    {
      return false;
    }
    

    sf entitywolf = (sf)par1EntityAnimal;
    return entitywolf.bT();
  }
  

  public boolean func_70922_bv()
  {
    return ah.a(19) == 1;
  }
  



  protected boolean t()
  {
    return (!bT()) && (ac > 2400);
  }
  
  public boolean a(of par1EntityLivingBase, of par2EntityLivingBase)
  {
    if ((!(par1EntityLivingBase instanceof tf)) && (!(par1EntityLivingBase instanceof tj)))
    {
      if ((par1EntityLivingBase instanceof sf))
      {
        sf entitywolf = (sf)par1EntityLivingBase;
        
        if ((entitywolf.bT()) && (entitywolf.bV() == par2EntityLivingBase))
        {
          return false;
        }
      }
      
      return (!(par1EntityLivingBase instanceof uf)) || (!(par2EntityLivingBase instanceof uf)) || (((uf)par2EntityLivingBase).a((uf)par1EntityLivingBase));
    }
    

    return false;
  }
  

  public nk a(nk par1EntityAgeable)
  {
    return spawnBabyAnimal(par1EntityAgeable);
  }
}
