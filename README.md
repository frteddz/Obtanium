# Obtanium

Mojang made a metal so rare they named it Unobtainium. Real creative department over there. Then some diamond-clad maniac picked it up off the ground and now the name is just embarrassing for everyone.

So we fixed it. You're welcome.

NeoForge mod for Minecraft 1.21.1. Needs Allthemodium 3.2.1.

## What happens when you use this mod

Pick up any of the 43 Unobtainium items and the name quietly becomes Obtanium. Right in your inventory. No cutscene, no achievement for witnessing it happen, just a better word on a tooltip.

The rename is permanent. Shove it in a chest, throw it in lava, drop it in your friend's bedroom as a threat, sell it to a villager at a 90% loss, quit the world, reload, come back next year. Still says Obtanium.

What it does NOT change: registry IDs. The metal is still `unobtainium_ingot` internally. Recipes, saved worlds, and every other mod that touches it remain completely unaware this social experiment happened.

## The advancements thing

First time you pick up each of the 43 items, the mod rolls a five-sided die and hands you one random advancement. Five possible titles per item, you get exactly one, and you never find out what the other four were.

You do not control the roll. The die does not respect you. Asking nicely changes nothing.

That is 215 advancements total. All of them written like the mod is aware it exists inside a modpack.

## The fine print

- Items you have not picked up yet keep the ugly name. Pick it up first, that's the deal.
- The die rolls once per item, per player. So yes 4.2 billion players will each get their fair shot at the achievement lottery or whatever.
- Save files survive. Tried to break it. Couldn't. Disappointing.

## Build

```
gradle assemble
```

Java 21. NeoForge 21.1.x. A time machine, mostly for gradle downloads.

## License

MIT. Which in romance terms means: do whatever you want, just keep the note attached. T3ddz wrote it. I just live here.
