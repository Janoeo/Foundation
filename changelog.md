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
+ add nether world generation

### 4.4.0.52-experimental
+ Testing version of the port to 1.16.3
    + Only overworld ore generation work

### 4.4.0.49-experimental
+ drop support for 1.16 for now (wait stable release)
+ back port to 1.15.2

### 4.4.0.48-experimental
+ fix missing config file

### 4.4.0.47-experimental
+ fix harvest level
+ fix redstone ore always lit
+ add new basalt ore
  + diamond
  + emerald
  + coal
  + gold
  + iron
  + lapis
  + redstone

### 4.4.0.46-experimental
+ rework world ore generation internal code
+ balancing the nether and end ore generation
+ buff on in some biomes

### 4.4.0.45-experimental
+ add more possibility in the config (#1)

### 4.4.0.42-experimental
+ change versioning
    + \<project version>.\<mod version>.\<mod sub version>.\<project build number>
+ internal code rework
+ update xp drop on block

### 3.6.1.1
+ fix issues with tags references (#2)

### 3.6.1
+ port to Minecraft 1.16.1

### 3.6
+ add new gravel ore
    + iron gravel ore
    + gold gravel ore
    + diamond gravel ore

### 3.5
+ add a new ore world gen system(note for modder: extend of OreFeatureConfig to be use with more predicate (more that stone and netherrack))
+ setup new world gen system for the end ore (more ore in the end !)

### 3.4 - Nether Ore and Bug Fixing
+ add Safyrus in the creator event
+ add new ore in the nether
    + Aluminium
    + Copper
    + Lead
    + Ruby
    + Sapphire
    + Silver
    + Tin
    + Uranium
+ change loot table for dense ore (buff/nerf)
+ refactor texture folder
+ fix anger Enderman/Pigman missing on some block due to duplicated code
+ fix copper dense ore react as redstone ore and redstone dense ore not react as redstone ore
+ fix cooking time for blasting on some recipes
+ fix bad value in the loot table
+ fix duplicated recipes

### 3.3
+ add zinc ore and ingot
+ add amethyst ore and amethyst

### 3.2.1
+ add tag(hardcoded) to be using with other mod.

### 3.2
+ add storage block
    + ruby
    + sapphire

### 3.1.2
+ fix mod not working in 1.15.2 due to missing information in the meta-inf

### 3.1.1
+ port to 1.15.2

### 2.3 & 3.1
+ fix bug on dense emerald ore in the nether(not generated)
+ add new ore
    + ruby
    + sapphire
+ add a firework when i join a world

### 3.0
+ port to 1.15.1

### 2.2
+ add dust
    + diamond
    + iron
    + gold
+ continue to rework the code of the mod

### 2.1.1
+ fix mistake in 3 line of code, causing problem with the ore generation

### 2.1
+ add new mobs mechanism
    + zombie pigman attack the player if the player break a nether ore
    + enderman attack the player if the player break a end ore

### 2.0
+ internal rework (code)
+ add a highly modularity (more option in config file)
+ update to forge 1.14.4-28.1.61

### 1.9.2
+ fix english variants in tag name (aluminium vs aluminum) (once again...)
+ fix missing recipes

### 1.9.1
+ fix english variants in tag name (aluminium vs aluminum)
+ fix missing file for ingots tag

### 1.9
+ add lead, silver, uranium and aluminium ingot

### 1.8.1
+ fix uranium ore with bad tags
+ fix missing tag for silver and lead ore

### 1.8
+ add lead and silver ore
+ fix missing loot table

### 1.7
+ add french localization
+ add uranium ore
+ add aluminium ore
+ add data generator (change nothing for the client and server, only use for mod compilation and mod data generation)
+ fix dense redstone ore
+ update forge from 1.14.4-28.0.55 to 1.14.4-28.1.1
+ update mcp from 20190912 to 20190915

### 1.6
+ update mcp to 20190912
+ dense ore phase 2, dense ore in the nether
+ fix end/nether redstone ore do not stop lit

### 1.5
+ add a config file

### 1.4
+ add dense ore in overworld

### 1.3
+ add copper and tin ore
+ add copper and tin ingot
+ add a new item group for the non-ore

### 1.2
+ fix missing xp drop
+ fix end/nether redstone ore
+ add tags for more compatiblity with other mods
+ rewrite/clean up the source code of the ore block

### 1.1
+ add end ore generation

### 1.0
+ initial release
