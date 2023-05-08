# Janoeo Foundation Changelog

### 8.13.4.92

#### Fix

+ Tiny Lapis Ore
  + fix ore repartition from (bottom: 16, top: 16) to (bottom: -32, top: 32)

#### Nerf and Buff

+ Tiny Coal Ore
  + nerf ore count from 20 to 8
+ Tiny Diamond Ore
  + nerf ore count from 4 to 2
+ Tiny Emerald Ore
  + nerf ore count from 4 to 2
+ Tiny Gold Ore
  + buff ore count from 2 to 3
+ Tiny Iron Ore
  + nerf ore count from 20 to 6
+ Tiny Redstone Ore
  + nerf ore count from 8 to 5


+ Tiny Lead Ore
  + nerf ore count from 6 to 5
+ Tiny Nickel Ore
  + buff ore count from 4 to 5
+ Tiny Tin Ore
  + nerf ore count from 8 to 6
+ Tiny Uranium Ore
  + nerf ore count from 6 to 4


+ Nether Coal Ore
  + buff ore size from 6 to 8
+ Nether Copper Ore
  + buff ore size from 6 to 8
  + nerf ore count from 6 to 5
+ Nether Diamond Ore
  + nerf ore size from 6 to 4
  + nerf ore count from 4 to 1
+ Nether Emerald Ore
  + nerf ore size from 6 to 4
  + nerf ore count from 4 to 1
+ Nether Iron Ore
  + buff ore size from 6 to 8
  + nerf ore count from 6 to 5
+ Nether Lapis Ore
  + nerf ore count from 4 to 3
+ Nether Redstone Ore
  + nerf ore count from 4 to 3


+ Nether Bauxite Ore
  + nerf ore count from 6 to 5
+ Nether Lead Ore
  + buff ore count from 6 to 4
+ Nether Silver Ore
  + buff ore count from 4 to 2
+ Nether Tin Ore
  + buff ore count from 6 to 5
+ Nether Uranium Ore
  + buff ore count from 4 to 2

### 8.12.4.90 (Ingame version 8.12.0.90)

#### Add
+ End ore

#### Fix
+ Fix gravel ore generated on netherrack instead of gravel

### 8.11.4.89

+ Update to mc 1.19.3
+ Update to forge 44.1.5

### 8.10.4.88

#### Fix

+ Add missing loot table

### 8.10.4.87

#### Other

+ Enable JER Integration

### 8.10.4.86

#### General change

+ Update to Forge 43.1.33 and Minecraft 1.19.2

### 8.10.4.85

#### General change
+ Update to Forge 41.1.0 and Minecraft 1.19
+ Update ore gen code base

### 7.10.3.91

#### Fix
+ Add missing nether ore loot tables

### 7.10.3.84

#### Technical
+ Remove unwanted mixin

### 7.10.3.83

#### Add
+ Gravel ore (every variant of ore)

#### Breaking change
+ Rod items registry name have change

#### Technical change
+ Add a new system to register items and blocks

### 7.9.3.82

#### Remove
+ Scrap

#### Dependencies

+ update Minecraft (1.18.2)
+ update Forge (40.1.0)
+ update Catalog (1.6.1)
+ update JEI (9.7.0.194)
+ update JER (0.14.1.160)
+ add Flywheel (0.6.2)
+ add Create (v0.4.1)

### 6.9.3.81

#### Fix

+ add missing recipes
+ update tag with wrong reference
+ add missing loot table

#### Add

+ add Create compatibility
+ add block of raw materials

#### Other

+ Rename and reorganise creative tab

#### Dependencies

+ update Forge (39.0.64)
+ update Catalog (1.6.0)
+ update JEI (9.2.1.69)
+ update JER (0.13.1.138)
+ add Flywheel (0.6.0)
+ add Create (v0.4d)

### 6.9.2.80

+ Recompile jar with missing data

### 6.9.2.79

#### Fix

+ Lapis ore with the wrong harvest level
+ Nether ore without a specified requirement tools (making ore un minable)
+ Add missing ore in the ores tags

#### Add

+ Block of each ingot
+ Metal rods (iron, etc.)
+ Gear (wood, iron, etc.)

##### Technical only

+ Use parchment as mapping

### 6.8.2.78

#### Add

+ Nether Ore
+ Scrap (Item for next development)
+ Spanish translation

### 6.7.2.77-experimental

#### Update

+ port mod to mc 1.18.1

### 6.6.2.76-experimental

#### Update

+ forge from 37.0.1 to 37.0.33

#### Refactor

+ Remove deprecated code who crash the game since forge 37.0.31

### 6.6.1.74-experimental

##### Fix

+ Tiny Deepslate ore with bad behavior
+ Tiny Redstone ore not acting as redstone ore

##### Technical only

+ Correctly increments mod version

### 6.6.0.73-experimental

##### Add

###### Deepslate version of

+ Tiny coal ore
+ Tiny copper ore
+ Tiny diamond ore
+ Tiny emerald ore
+ Tiny gold ore
+ Tiny iron ore
+ Tiny lapis ore
+ Tiny redstone ore

### 6.6.0.72-experimental

##### Add

###### World gen

+ Bauxite ore
+ Lead ore
+ Nickel ore
+ Silver ore
+ Tin ore
+ Uranium ore
+ Tiny emerald ore

### 6.6.0.71-experimental

##### Fix

+ harvest tool

### 6.6.0.70-experimental

Update to Minecraft 1.17.1

##### Add & re-add

###### Ore Gen

+ Coal
+ Copper
+ Diamond
+ Gold
+ Iron
+ Lapis
+ Redstone

###### Recipe

+ Copper nugget
+ Copper ingot from dust

##### Technical change

Use Mojang mapping

### 6.6.0.69

#### BREAKING CHANGE

+ Complet mod rewrite
+ Name change to Janoeo Foundation

##### Add & re-add

###### Ore:

+ Bauxite (Aluminium)
+ Lead
+ Nickel
+ Silver
+ Tin
+ Uranium

###### Tiny ore:

+ Coal
+ Copper
+ Diamond
+ Emerald
+ Gold
+ Iron
+ Lapis
+ Redstone

###### Dust:

+ Aluminium
+ Amethyst
+ Coal
+ Copper
+ Diamond
+ Emerald
+ Gold
+ Iron
+ Lapis
+ Lead
+ Nickel
+ Silver
+ Tin
+ Uranium

###### Ingot

+ Aluminium
+ Lead
+ Nickel
+ Silver
+ Tin
+ Uranium

###### Nugget

+ Aluminium
+ Coal
+ Copper
+ Diamond
+ Emerald
+ Lapis
+ Lead
+ Nickel
+ Redstone
+ Silver
+ Tin
+ Uranium

###### Raw

+ Aluminium
+ Lead
+ Nickel
+ Silver
+ Tin
+ Uranium

##### Technical change

###### Mod implementation

+ Json config (DiaboloLib)

###### Add data provider

+ English localization
+ French localization
+ Block model
+ Block state
+ Block tag
+ Item model
+ Item tag
+ Recipe

### 5.6.0.68

+ Fix
  + Missing requirement tools
+ Change
  + SoundType of:
    + Basalt Ore
    + Nether Ore

### 5.6.0.67
+ Fix
  + Missing ore generation ([#10](https://github.com/AlasDiablo/JANOEO/issues/10))
    + Diamond nether ore
    + Emerald nether ore
  + Bad registry name apply on some block
  + Missing recipe
+ Add
  + Dust
    + Coal
    + Lapis
    + Emerald
    + Aluminium
    + Lead
    + Nickel
    + Platinum
    + Ruby
    + Sapphire
    + Silver
    + Tin
    + Uranium
    + Copper
  + Gravel Ore
    + Coal
    + Lapis
    + Emerald
  + Custom creative tab
+ Compatibility
  + Create (partial)

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
