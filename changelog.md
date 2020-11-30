### 4.5.0.63-experimental
+ Add support for DiaboloLib 1.0.4
+ Move Contributor to DiaboloLib

### 4.5.0.62-experimental
+ Fix missing tag (jprik, cflip)
+ Add an event for contributor

### 4.5.0.61-experimental
+ Implement Diabolo Lib
+ Add osmium ore
+ Rework config organization
+ Fix missing loot table
+ Add dense ore into tag (same as non dense ore)

### 4.4.0.59-experimental
+ Reimplement dense ore (nether and overworld)

### 4.4.0.58-experimental
+ Reimplement end ore generation

### 4.4.0.57-experimental
+ Change FrequencyConfig layout (Incompatible with older version !)
+ Reimplement basalt ore generation

### 4.4.0.56-experimental
+ Add nether ore into FrequencyConfig
+ Reimplement basalt ore localization
+ Fix issues [#7](https://github.com/AlasDiablo/JANOEO/issues/7)

### 4.4.0.55-experimental
+ Reimplement gravel ore gen (with new option)
+ Reimplement basalt ore texture

### 4.4.0.53-experimental
+ Add nether world generation

### 4.4.0.52-experimental
+ Testing version of the port to 1.16.3
    + Only overworld ore generation work

### 4.4.0.49-experimental
+ Drop support for 1.16 for now (wait stable release)
+ Back port to 1.15.2

### 4.4.0.48-experimental
+ Fix missing config file

### 4.4.0.47-experimental
+ Fix harvest level
+ Fix redstone ore always lit
+ Add new basalt ore
  + Diamond
  + Emerald
  + Coal
  + Gold
  + Iron
  + Lapis
  + Redstone

### 4.4.0.46-experimental
+ Rework world ore generation internal code
+ Balancing the nether and end ore generation
+ Buff on in some biomes

### 4.4.0.45-experimental
+ Add more possibility in the config (#1)

### 4.4.0.42-experimental
+ Change versioning
    + \<project version>.\<mod version>.\<mod sub version>.\<project build number>
+ Internal code rework
+ Update xp drop on block

### 3.6.1.1
+ Fix issues with tags references (#2)

### 3.6.1
+ Port to Minecraft 1.16.1

### 3.6
+ Add new gravel ore
    + Iron gravel ore
    + Gold gravel ore
    + Diamond gravel ore

### 3.5
+ Add a new ore world gen system(note for modder: extend of OreFeatureConfig to be use with more predicate (more that stone and netherrack))
+ Setup new world gen system for the end ore (more ore in the end !)

### 3.4 - Nether Ore and Bug Fixing
+ Add Safyrus in the creator event
+ Add new ore in the nether
    + Aluminium
    + Copper
    + Lead
    + Ruby
    + Sapphire
    + Silver
    + Tin
    + Uranium
+ Change loot table for dense ore (buff/nerf)
+ Refactor texture folder
+ Fix anger Enderman/Pigman missing on some block due to duplicated code
+ Fix copper dense ore react as redstone ore and redstone dense ore not react as redstone ore
+ Fix cooking time for blasting on some recipes
+ Fix bad value in the loot table
+ Fix duplicated recipes

### 3.3
+ Add zinc ore and ingot
+ Add amethyst ore and amethyst

### 3.2.1
+ Add tag(hardcoded) to be using with other mod.

### 3.2
+ Add storage block
    + Ruby
    + Sapphire

### 3.1.2
+ Fix mod not working in 1.15.2 due to missing information in the meta-inf

### 3.1.1
+ Port to 1.15.2

### 2.3 & 3.1
+ Fix bug on dense emerald ore in the nether(not generated)
+ Add new ore
    + Ruby
    + Sapphire
+ Add a firework when i join a world

### 3.0
+ Port to 1.15.1

### 2.2
+ Add dust
    + Diamond
    + Iron
    + Gold
+ Continue to rework the code of the mod

### 2.1.1
+ Fix mistake in 3 line of code, causing problem with the ore generation

### 2.1
+ Add new mobs mechanism
    + Zombie pigman attack the player if the player break a nether ore
    + Enderman attack the player if the player break a end ore

### 2.0
+ Internal rework (code)
+ Add a highly modularity (more option in config file)
+ Update to forge 1.14.4-28.1.61

### 1.9.2
+ Fix english variants in tag name (aluminium vs aluminum) (once again...)
+ Fix missing recipes

### 1.9.1
+ Fix english variants in tag name (aluminium vs aluminum)
+ Fix missing file for ingots tag

### 1.9
+ Add lead, silver, uranium and aluminium ingot

### 1.8.1
+ Fix uranium ore with bad tags
+ Fix missing tag for silver and lead ore

### 1.8
+ Add lead and silver ore
+ Fix missing loot table

### 1.7
+ Add french localization
+ Add uranium ore
+ Add aluminium ore
+ Add data generator (change nothing for the client and server, only use for mod compilation and mod data generation)
+ Fix dense redstone ore
+ Update forge from 1.14.4-28.0.55 to 1.14.4-28.1.1
+ Update mcp from 20190912 to 20190915

### 1.6
+ Update mcp to 20190912
+ Dense ore phase 2, dense ore in the nether
+ Fix end/nether redstone ore do not stop lit

### 1.5
+ Add a config file

### 1.4
+ Add dense ore in overworld

### 1.3
+ Add copper and tin ore
+ Add copper and tin ingot
+ Add a new item group for the non-ore

### 1.2
+ Fix missing xp drop
+ Fix end/nether redstone ore
+ Add tags for more compatiblity with other mods
+ Rewrite/clean up the source code of the ore block

### 1.1
+ Add end ore generation

### 1.0
+ Initial release
