package mymod;

import ModLoader;
import acq;
import akc;
import aqz;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import ko;
import kp;
import mymod.armor.MyArmor;
import mymod.biome.MyBiome;
import mymod.biome.MyFireyBiome;
import mymod.blocks.MyBlock;
import mymod.blocks.MyBlockGen;
import mymod.entity.cow.MyEntityCow;
import mymod.entity.cow.MyModelCow;
import mymod.entity.cow.MyRenderCow;
import mymod.entity.minion.MyEntityMinion;
import mymod.entity.minion.MyModelMinion;
import mymod.entity.minion.MyRenderMinion;
import mymod.handlers.MyCraftingHandler;
import mymod.handlers.MyPickupHandler;
import mymod.items.MyFood;
import mymod.items.MyItem;
import mymod.items.MyPickaxe;
import mymod.items.MySword;
import mymod.proxies.CommonProxy;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.MinecraftForge;
import nn;
import nt;
import nu;
import oh;
import wj;
import ww;
import xx;
import yc;
import yd;
import ye;

















@Mod(modid="mymod", name="Water World", version="1.0")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class Main
{
  @SidedProxy(clientSide="mymod.proxies.ClientProxy", serverSide="mymod.proxies.CommonProxy")
  public static CommonProxy proxy;
  public static yc MySword_1;
  public static yc MySword_2;
  public static yc MyPickaxe_1;
  public static yd MyToolMaterial = EnumHelper.addToolMaterial("Hard Water", 3, 15, 10.0F, 20.0F, 10);
  

  public static yc MyItem_1;
  

  public static yc MyFood_1;
  

  public static aqz MyBlock_1;
  
  public static yc MyHelmet_1;
  
  public static yc MyChest_1;
  
  public static yc MyLeggings_1;
  
  public static yc MyBoots_1;
  
  public static wj MyArmorMaterial_1 = EnumHelper.addArmorMaterial("Heavy Water", 20, new int[] { 4, 8, 6, 3 }, 5);
  

  public static acq MyBiome_1;
  

  public static acq MyFireyBiome_1;
  

  static int MyEntityID = 300;
  public static ko MyAchievement_1;
  
  public Main() {}
  
  public static int getUniqueEntityId() { do { MyEntityID += 1;
    }
    while (nt.b(MyEntityID) != null);
    return MyEntityID++;
  }
  
  public static void registerEntityEgg(Class<? extends nn> entity, int primaryColor, int secondaryColor)
  {
    int id = getUniqueEntityId();
    nt.d.put(Integer.valueOf(id), entity);
    nt.a.put(Integer.valueOf(id), new nu(id, primaryColor, secondaryColor));
  }
  



  public static ko MyAchievement_2;
  


  public static ko MyAchievement_3;
  


  public static ww MyCreativeTab_1;
  

  @Mod.EventHandler
  public void preInit(FMLPreInitializationEvent event)
  {
    MyCreativeTab_1 = new Main.1(this, "MyCreativeTab_1");
    





    MySword_1 = new MySword(2021, MyToolMaterial, "MySword_1").a(MyCreativeTab_1);
    GameRegistry.registerItem(MySword_1, "MySword_1");
    LanguageRegistry.addName(MySword_1, "Water Sword");
    

    MySword_2 = new MySword(2023, yd.d, "MySword_2").a(MyCreativeTab_1);
    GameRegistry.registerItem(MySword_2, "MySword_2");
    LanguageRegistry.addName(MySword_2, "Fire Sword");
    

    MyPickaxe_1 = new MyPickaxe(2022, MyToolMaterial, "MyPickaxe_1").a(MyCreativeTab_1);
    GameRegistry.registerItem(MyPickaxe_1, "MyPickaxe_1");
    LanguageRegistry.addName(MyPickaxe_1, "Water Pickaxe");
    

    MyItem_1 = new MyItem(2030, "MyItem_1").d(64).a(MyCreativeTab_1);
    GameRegistry.registerItem(MyItem_1, "MyItem_1");
    LanguageRegistry.addName(MyItem_1, "Heavy Water");
    


    MyFood_1 = new MyFood(2040, 2, Float.valueOf(1.0F), true, "MyFood_1").k().a(MyCreativeTab_1);
    GameRegistry.registerItem(MyFood_1, "MyFood_1");
    LanguageRegistry.addName(MyFood_1, "Heavy Water Popcicle");
    

    MyBlock_1 = new MyBlock(250, akc.e, "MyBlock_1").a(0.15F).b(2.0F).c(1.5F).a(aqz.m).a(MyCreativeTab_1);
    GameRegistry.registerBlock(MyBlock_1, "MyBlock_1");
    LanguageRegistry.addName(MyBlock_1, "Hard Ice Ore");
    MinecraftForge.setBlockHarvestLevel(MyBlock_1, "pickaxe", 0);
    

    MyHelmet_1 = new MyArmor(2060, wj.c, 0, 0, "myarmor").a(MyCreativeTab_1);
    GameRegistry.registerItem(MyHelmet_1, "MyHelmet_1");
    LanguageRegistry.addName(MyHelmet_1, "Hard Water Helmet");
    

    MyChest_1 = new MyArmor(2061, MyArmorMaterial_1, 0, 1, "myarmor").a(MyCreativeTab_1);
    GameRegistry.registerItem(MyChest_1, "MyChest_1");
    LanguageRegistry.addName(MyChest_1, "Hard Water Chestplate");
    

    MyLeggings_1 = new MyArmor(2062, MyArmorMaterial_1, 0, 2, "myarmor").a(MyCreativeTab_1);
    GameRegistry.registerItem(MyLeggings_1, "MyLeggings_1");
    LanguageRegistry.addName(MyLeggings_1, "Hard Water Leggings");
    

    MyBoots_1 = new MyArmor(2063, MyArmorMaterial_1, 0, 3, "myarmor").a(MyCreativeTab_1);
    GameRegistry.registerItem(MyBoots_1, "MyBoots_1");
    LanguageRegistry.addName(MyBoots_1, "Hard Water Boots");
    

    MyBiome_1 = new MyBiome(30);
    GameRegistry.addBiome(MyBiome_1);
    

    MyFireyBiome_1 = new MyFireyBiome(31);
    GameRegistry.addBiome(MyFireyBiome_1);
    

    EntityRegistry.registerGlobalEntityID(MyEntityCow.class, "Water Steed", EntityRegistry.findGlobalUniqueEntityId());
    EntityRegistry.addSpawn(MyEntityCow.class, 50, 1, 5, oh.a, new acq[] { acq.d });
    EntityRegistry.addSpawn(MyEntityCow.class, 50, 1, 5, oh.a, new acq[] { MyBiome_1 });
    registerEntityEgg(MyEntityCow.class, new Color(0, 0, 255).getRGB(), new Color(255, 255, 255).getRGB());
    RenderingRegistry.registerEntityRenderingHandler(MyEntityCow.class, new MyRenderCow(new MyModelCow(), 0.3F));
    ModLoader.addLocalization("entity.Water Steed.name", "Water Steed");
    

    EntityRegistry.registerGlobalEntityID(MyEntityMinion.class, "Fireball", EntityRegistry.findGlobalUniqueEntityId());
    EntityRegistry.addSpawn(MyEntityMinion.class, 50, 1, 5, oh.b, new acq[] { MyFireyBiome_1 });
    registerEntityEgg(MyEntityMinion.class, new Color(255, 0, 0).getRGB(), new Color(255, 0, 0).getRGB());
    RenderingRegistry.registerEntityRenderingHandler(MyEntityMinion.class, new MyRenderMinion(new MyModelMinion(), 0.3F));
    ModLoader.addLocalization("entity.Fireball.name", "Fireball");
    

    MyAchievement_1 = new ko(2001, "MyAchievement_1", -3, -1, MyBlock_1, kp.f).c();
    MyAchievement_2 = new ko(2002, "MyAchievement_2", -5, -1, MyItem_1, MyAchievement_1).c();
    MyAchievement_3 = new ko(2003, "MyAchievement_2", -7, -1, MySword_1, MyAchievement_2).c();
  }
  











  @Mod.EventHandler
  public static void init(FMLInitializationEvent event)
  {
    GameRegistry.addRecipe(new ye(MySword_1, 1), new Object[] { "X", "X", "S", Character.valueOf('X'), MyItem_1, Character.valueOf('S'), yc.F });
    








    GameRegistry.addRecipe(new ye(MySword_2, 1), new Object[] { "X", "X", "S", Character.valueOf('X'), yc.aA, Character.valueOf('S'), yc.F });
    








    GameRegistry.addRecipe(new ye(MyPickaxe_1, 1), new Object[] { "XXX", " S ", " S ", Character.valueOf('S'), yc.F, Character.valueOf('X'), MyItem_1 });
    








    GameRegistry.addRecipe(new ye(MyItem_1, 1), new Object[] { "SSS", "SSS", "SSS", Character.valueOf('S'), yc.az });
    







    GameRegistry.addRecipe(new ye(MyFood_1, 1), new Object[] { "X", "S", Character.valueOf('S'), yc.F, Character.valueOf('X'), MyItem_1 });
    







    GameRegistry.addSmelting(MyBlock_1cF, new ye(MyItem_1, 1), 10.0F);
    

    GameRegistry.addRecipe(new ye(MyHelmet_1, 1), new Object[] { "XXX", "X X", Character.valueOf('X'), MyItem_1 });
    






    GameRegistry.addRecipe(new ye(MyChest_1, 1), new Object[] { "X X", "XXX", "XXX", Character.valueOf('X'), MyItem_1 });
    







    GameRegistry.addRecipe(new ye(MyLeggings_1, 1), new Object[] { "XXX", "X X", "X X", Character.valueOf('X'), MyItem_1 });
    







    GameRegistry.addRecipe(new ye(MyBoots_1, 1), new Object[] { "X X", "X X", Character.valueOf('X'), MyItem_1 });
    












    GameRegistry.registerWorldGenerator(new MyBlockGen());
    

    LanguageRegistry.instance().addStringLocalization("achievement.MyAchievement_1", "en_US", "Hard Ice");
    LanguageRegistry.instance().addStringLocalization("achievement.MyAchievement_1.desc", "en_US", "Mine a Hard Ice Block!");
    LanguageRegistry.instance().addStringLocalization("achievement.MyAchievement_2", "en_US", "Smelt Some Hard Ice");
    LanguageRegistry.instance().addStringLocalization("achievement.MyAchievement_2.desc", "en_US", "POP");
    LanguageRegistry.instance().addStringLocalization("achievement.MyAchievement_3", "en_US", "The Water Stick");
    LanguageRegistry.instance().addStringLocalization("achievement.MyAchievement_3.desc", "en_US", "Craft Water Sword");
    

    MyPickupHandler MyPickupHandler_1 = new MyPickupHandler();
    GameRegistry.registerPickupHandler(MyPickupHandler_1);
    

    MyCraftingHandler MyCraftingHandler_1 = new MyCraftingHandler();
    GameRegistry.registerCraftingHandler(MyCraftingHandler_1);
    

    LanguageRegistry.instance().addStringLocalization("itemGroup.MyCreativeTab_1", "en_US", "Mod Armory");
  }
  
  @Mod.EventHandler
  public static void postInit(FMLPostInitializationEvent event) {}
}
