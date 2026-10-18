# Obtanium Random Advancements

_Updated for Allthemodium 3.2.1 (Minecraft 1.21.1)._

Create 5 possible random advancements for each Obtanium item listed below. When a player picks up an item and it enters their inventory for the first time, randomly choose one of the 5 advancements associated with that item and award it.

Use the titles and descriptions exactly as written. Keep the humor sarcastic, self-aware, and a little absurd, like Deadpool. Advancement titles can be funny questions or blunt punchlines, while descriptions should feel like normal Minecraft advancement descriptions.

## General behavior

- Each listed item has its own pool of 5 possible advancements.
- When a player first picks up an item, select one advancement at random from that item's pool.
- Award only the selected advancement for that pickup event, not all 5.
- Do not reroll the selected advancement because the player drops the item, moves it into a chest, or reloads the world.
- Store enough world/player data to prevent the same pickup from repeatedly triggering the advancement.
- The item-name change from `Unobtainium` to `Obtanium` should still happen only after the item enters a player's inventory.
- Keep internal registry IDs unchanged.
- Avoid awarding the same advancement repeatedly to the same player for the same item.
- If the mod's implementation requires an advancement to be uniquely registered, give each possible advancement a unique internal ID even if some titles or descriptions overlap.

## Ores and raw materials

### Unobtainium Ore → Obtanium Ore

1. **Who Put This Here?**  
   Pick up Obtanium Ore.
2. **Rock and Roll**  
   Obtain a rock that costs more than your entire base.
3. **Have You Tried Turning It Off and On Again?**  
   Acquire a suspiciously valuable block.
4. **Nature Is Healing**  
   Take a perfectly normal walk and come back with this.
5. **Mom, Get the Camera!**  
   Obtain something nobody outside this modpack cares about.

### Raw Unobtainium Ore → Raw Obtanium Ore

1. **Is It Raw?**  
   Pick up Raw Obtanium Ore.
2. **Straight From the Ground**  
   Skip the processing. You're a busy person.
3. **Farm to Table**  
   Except it's a rock.
4. **Should We Be Touching This?**  
   Obtain raw Obtanium.
5. **One Step Closer**  
   The grind has barely begun.

### Block of Raw Unobtainium → Block of Raw Obtanium

1. **That's a Lot of Rock**  
   Pick up a Block of Raw Obtanium.
2. **Do You Even Lift?**  
   Carry a block that would probably crush you.
3. **Minimalist Storage**  
   Put your entire problem into one block.
4. **Bigger Is Better, Apparently**  
   Obtain a very large chunk of raw Obtanium.
5. **This Is Getting Out of Hand**  
   It's not even processed yet.

### Crushed Unobtainium → Crushed Obtanium

1. **Did You Drop It?**  
   Pick up Crushed Obtanium.
2. **Well, That's One Way to Do It**  
   Turn a rare material into gravel with extra steps.
3. **碎? No, Thanks**  
   Acquire crushed Obtanium. The translator is on break.
4. **You Broke It**  
   Obtain the consequences of industrial machinery.
5. **Some Assembly Required**  
   This is somehow progress.

### Unobtainium Clump → Obtanium Clump

1. **A Clump of What?**  
   Pick up an Obtanium Clump.
2. **Technical Term**  
   Somebody got paid to call it a clump.
3. **Clump There It Is**  
   Obtain an Obtanium Clump.
4. **Quality Control Is Missing**  
   This passed inspection.
5. **It's Probably Important**  
   Keep it. You never know.

### Unobtainium Shard → Obtanium Shard

1. **Sharp Object, No Thoughts**  
   Pick up an Obtanium Shard.
2. **A Little Piece of Something Expensive**  
   Obtain an Obtanium Shard.
3. **Handle With Care**  
   Or don't. I'm not your supervisor.
4. **The Forbidden Splinter**  
   Acquire a shard of Obtanium.
5. **It's the Little Things**  
   This one is little. The price isn't.

### Unobtainium Crystal → Obtanium Crystal

1. **Crystal Clear**  
   Pick up an Obtanium Crystal.
2. **Is This DLC?**  
   Obtain a suspiciously shiny rock.
3. **Shiny Object Syndrome**  
   You saw a sparkle and immediately grabbed it.
4. **Local Wizard Behavior**  
   Acquire an Obtanium Crystal.
5. **Don't Lick It**  
   Seriously. Don't.

### Dirty Unobtainium Dust → Dirty Obtanium Dust

1. **Wash Your Hands**  
   Pick up Dirty Obtanium Dust.
2. **How Did It Get Dirty?**  
   Obtain Dirty Obtanium Dust.
3. **Cleanliness Is Optional**  
   Apparently.
4. **Someone Call a Janitor**  
   Collect some suspicious dust.
5. **This Is Why We Have Gloves**  
   Pick up Dirty Obtanium Dust.

## Refined materials

### Unobtainium Ingot → Obtanium Ingot

1. **Who Named This Thing?**  
   Obtain your first Obtanium Ingot.
2. **Mom, Get the Camera!**  
   Obtain something nobody outside this modpack cares about.
3. **My Lawyer Says It's Obtainable**  
   Acquire the item formerly known as Unobtainium.
4. **Breaking the Fourth Wall**  
   You do realize you're mining pixels, right?
5. **And Nobody Clapped**  
   Obtain a very expensive ingot. Nobody cares.

### Unobtainium Nugget → Obtanium Nugget

1. **It's Just a Little Guy**  
   Pick up an Obtanium Nugget.
2. **Shrinkflation**  
   Same material, less material.
3. **Can I Get a Refund?**  
   Obtain a nugget instead of a full ingot.
4. **Pocket-Sized Wealth**  
   Collect an Obtanium Nugget.
5. **We Have Nuggets at Home**  
   Obtain an Obtanium Nugget.

### Unobtainium Dust → Obtanium Dust

1. **It's Literally Dust**  
   Pick up Obtanium Dust.
2. **Breathe It In**  
   Please don't.
3. **A Dusty Situation**  
   Obtain Obtanium Dust.
4. **This Is Valuable?**  
   Collect a handful of shiny dirt.
5. **Someone Get a Vacuum**  
   Pick up Obtanium Dust.

### Block of Unobtainium → Block of Obtanium

1. **Money Can't Buy Happiness**  
   But this block can probably buy everything else.
2. **Heavy Is the Head**  
   Pick up a Block of Obtanium.
3. **A Small Loan of One Million Diamonds**  
   Obtain a Block of Obtanium.
4. **Interior Decorating**  
   Put an absurdly expensive block in your house.
5. **You Could Have Built a House**  
   Instead, you made a cube.

### Unobtainium Plate → Obtanium Plate

1. **Flat Earthers Rejoice**  
   Pick up an Obtanium Plate.
2. **Pressed for Time**  
   Obtain an Obtanium Plate.
3. **That's a Nice Sheet**  
   Acquire a plate of Obtanium.
4. **Industrial Chic**  
   A fancy piece of metal for your fancy machine.
5. **Thin Is In**  
   Obtain an Obtanium Plate.

### Unobtainium Rod → Obtanium Rod

1. **That's What She Said**  
   Pick up an Obtanium Rod.
2. **Stick to the Plan**  
   Obtain an Obtanium Rod.
3. **A Very Expensive Stick**  
   Collect a rod made of Obtanium.
4. **Bonk**  
   Acquire a metal rod. Use responsibly.
5. **Long Story Short**  
   It's a rod.

### Unobtainium Gear → Obtanium Gear

1. **It's Gear Time**  
   Pick up an Obtanium Gear.
2. **A Cog in the Machine**  
   Obtain an Obtanium Gear.
3. **Mechanical Engineering Degree**  
   You picked up a gear. Congratulations.
4. **The Machine Demands It**  
   Collect an Obtanium Gear.
5. **Now With 100% More Teeth**  
   Obtain a gear made of Obtanium.

## Armor

### Unobtainium Helmet → Obtanium Helmet

1. **Protect the Brain Cell**  
   Pick up an Obtanium Helmet.
2. **Fashion Over Function**  
   Look expensive while remaining deeply confused.
3. **Big Head Energy**  
   Obtain an Obtanium Helmet.
4. **Safety Third**  
   Put something on your head. Probably a good idea.
5. **Is This OSHA Approved?**  
   Acquire an Obtanium Helmet.

### Unobtainium Chestplate → Obtanium Chestplate

1. **Emotional Support Armor**  
   Pick up an Obtanium Chestplate.
2. **Main Character Syndrome**  
   Obtain a chestplate worthy of the cutscene.
3. **Tank You Very Much**  
   Acquire an Obtanium Chestplate.
4. **Your Insurance Premium Is Going Up**  
   Equip an absurdly expensive chestplate.
5. **Chest Day**  
   Obtain an Obtanium Chestplate.

### Unobtainium Leggings → Obtanium Leggings

1. **Drip or Drown**  
   Pick up Obtanium Leggings.
2. **Pants With Benefits**  
   Obtain Obtanium Leggings.
3. **Leg Day Was Worth It**  
   Acquire a pair of Obtanium Leggings.
4. **The Most Expensive Trousers**  
   Pick up Obtanium Leggings.
5. **Please Wear Pants**  
   Obtain Obtanium Leggings.

### Unobtainium Boots → Obtanium Boots

1. **These Boots Were Made for Walking**  
   Pick up Obtanium Boots.
2. **Expensive Footwear**  
   Obtain boots that cost more than your house.
3. **Happy Feet, Empty Wallet**  
   Acquire Obtanium Boots.
4. **Walk It Off**  
   Pick up Obtanium Boots.
5. **Cinderella Could Never**  
   Obtain a pair of Obtanium Boots.

## Tools and weapons

### Unobtainium Pickaxe → Obtanium Pickaxe

1. **Mining Is My Passion**  
   Pick up an Obtanium Pickaxe.
2. **Diggy Diggy Hole**  
   Obtain a very expensive digging tool.
3. **Overqualified**  
   You brought this to mine dirt, didn't you?
4. **The IRS Wants to Know**  
   Acquire an Obtanium Pickaxe.
5. **This Better Be Efficient**  
   Pick up an Obtanium Pickaxe.

### Unobtainium Axe → Obtanium Axe

1. **Axe Me Anything**  
   Pick up an Obtanium Axe.
2. **Wood You Look at That**  
   Obtain an Obtanium Axe.
3. **Anger Management**  
   Acquire a very expensive chopping tool.
4. **Timber!**  
   Try not to hit yourself.
5. **Overkill Is Underrated**  
   Pick up an Obtanium Axe.

### Unobtainium Shovel → Obtanium Shovel

1. **Digging Your Own Grave**  
   Pick up an Obtanium Shovel.
2. **Dirt Cheap**  
   Except this shovel isn't.
3. **Groundbreaking Technology**  
   Obtain an Obtanium Shovel.
4. **Professional Dirt Enthusiast**  
   Acquire an Obtanium Shovel.
5. **Touch Grass, but With Tools**  
   Pick up an Obtanium Shovel.

### Unobtainium Hoe → Obtanium Hoe

1. **You Call That Farming?**  
   Pick up an Obtanium Hoe.
2. **Certified Farmer**  
   Obtain a farming tool worth a fortune.
3. **Hoe, Hoe, Hoe**  
   Acquire an Obtanium Hoe.
4. **Agricultural Warfare**  
   Pick up an Obtanium Hoe.
5. **Crop Top**  
   Obtain an Obtanium Hoe.

### Unobtainium Sword → Obtanium Sword

1. **Talk Less, Swing More**  
   Pick up an Obtanium Sword.
2. **Peace Was Never an Option**  
   Obtain an Obtanium Sword.
3. **Local Threat Detected**  
   Acquire a very expensive sword.
4. **Parry This**  
   Pick up an Obtanium Sword.
5. **Violence Is the Answer**  
   Obtain an Obtanium Sword.

### Unobtainium Crossbow → Obtanium Crossbow

1. **Bolt Action**  
   A bow with commitment issues and a trust fund.
2. **Pew Pew, But Make It Expensive**  
   Somewhere, a skeleton is deeply offended by your budget.
3. **Ranged Combat for Cowards**  
   Stand far away. Feel powerful. Repeat.
4. **Reloading Is a Lifestyle**  
   Spend half the fight cranking it. Worth it, probably.
5. **Piglin Approved**  
   The Nether would trade its entire economy for this. Don't ask how I know.

### Unobtainium Mace → Obtanium Mace

1. **Smash Hit**  
   Hit things from a great height. Gravity handles the paperwork.
2. **Gravity Is a Feature**  
   Jump off something tall. The fall damage is someone else's problem.
3. **Blunt Negotiations**  
   Sometimes diplomacy is a very expensive ball on a stick.
4. **Bonk, Premium Edition**  
   Same old bonk, now with a price tag that needs its own zip code.
5. **The Mace Is Not a Spice**  
   Do not season your food with this. I've seen it happen.

### Unobtainium Brush → Obtanium Brush

1. **Archaeology Degree Not Required**  
   Dust things gently and pretend you're doing science.
2. **Dust Off Your Expectations**  
   It's a fancy brush. Don't expect a dinosaur.
3. **A Very Expensive Paintbrush**  
   Worth more than anything it will ever dig up. The math checks out.
4. **Brush With Greatness**  
   You may now legally say "I'm basically an archaeologist."
5. **Sweeping Generalizations**  
   "All brushes are the same," you said. Then you saw this one.

## Alloys

### Unobtainium - Vibranium Alloy Ingot → Obtanium - Vibranium Alloy Ingot

1. **Two Rich Guys Walk Into a Smeltery**  
   Pick up an Obtanium - Vibranium Alloy Ingot.
2. **Power Couple**  
   Combine two absurdly valuable materials.
3. **The Avengers Are Calling**  
   Obtain an Obtanium - Vibranium Alloy Ingot.
4. **Money Makes Money**  
   Acquire an alloy made from expensive materials.
5. **This Is Getting Ridiculous**  
   Pick up an Obtanium - Vibranium Alloy Ingot.

### Unobtainium - Vibranium Alloy Dust → Obtanium - Vibranium Alloy Dust

1. **Double the Dust, Double the Problems**  
   Pick up Obtanium - Vibranium Alloy Dust.
2. **Expensive Powder**  
   Obtain an alloy dust made from two rare materials.
3. **Shake Well Before Use**  
   Collect Obtanium - Vibranium Alloy Dust.
4. **The Chemistry Department Is Concerned**  
   Acquire some alloy dust.
5. **Still Just Dust**  
   Pick up Obtanium - Vibranium Alloy Dust.

### Block of Unobtainium - Vibranium Alloy → Block of Obtanium - Vibranium Alloy

1. **The Rich Get Richer**  
   Pick up a Block of Obtanium - Vibranium Alloy.
2. **Financially Irresponsible**  
   Obtain a block made from two rare materials.
3. **A Brick of Bad Decisions**  
   Acquire a Block of Obtanium - Vibranium Alloy.
4. **Please Declare This at Customs**  
   Pick up a Block of Obtanium - Vibranium Alloy.
5. **What Recession?**  
   Obtain an alloy block that costs a fortune.

### Unobtainium - Allthemodium Alloy Ingot → Obtanium - Allthemodium Alloy Ingot

1. **The Mod Names Are Getting Out of Hand**  
   Pick up an Obtanium - Allthemodium Alloy Ingot.
2. **All the Metals, All the Problems**  
   Obtain an alloy ingot.
3. **Branding Meeting From Hell**  
   Acquire an Obtanium - Allthemodium Alloy Ingot.
4. **Name's Longer Than the Recipe**  
   Pick up an Obtanium - Allthemodium Alloy Ingot.
5. **A Very Modded Metal**  
   Obtain an Obtanium - Allthemodium Alloy Ingot.

### Unobtainium - Allthemodium Alloy Dust → Obtanium - Allthemodium Alloy Dust

1. **Alphabet Soup**  
   Pick up Obtanium - Allthemodium Alloy Dust.
2. **The Dust Has Lore**  
   Obtain an alloy dust with a very long name.
3. **Did You Read All That?**  
   Collect Obtanium - Allthemodium Alloy Dust.
4. **Powdered Confusion**  
   Pick up some alloy dust.
5. **A Recipe for Insomnia**  
   Obtain Obtanium - Allthemodium Alloy Dust.

### Block of Unobtainium - Allthemodium Alloy → Block of Obtanium - Allthemodium Alloy

1. **That's a Mouthful**  
   Pick up a Block of Obtanium - Allthemodium Alloy.
2. **The Naming Committee Has Fallen**  
   Obtain an alloy block.
3. **All the Blocks**  
   Acquire a Block of Obtanium - Allthemodium Alloy.
4. **One Block to Rule Them All**  
   Pick up a Block of Obtanium - Allthemodium Alloy.
5. **Someone Stop the Modpack**  
   Obtain a Block of Obtanium - Allthemodium Alloy.

## Fluids and buckets

### Molten Unobtainium → Molten Obtanium

1. **Forbidden Soup**  
   Pick up Molten Obtanium.
2. **It's Getting Hot in Here**  
   Obtain molten Obtanium.
3. **Do Not Drink**  
   Seriously, this is not a beverage.
4. **Liquid Assets**  
   Acquire molten Obtanium.
5. **Soup of the Day**  
   Pick up Molten Obtanium.

### Molten Unobtainium Bucket → Molten Obtanium Bucket

1. **Bucket List**  
   Pick up a Molten Obtanium Bucket.
2. **OSHA Would Like a Word**  
   Carry a bucket of molten metal.
3. **Handle With Extreme Regret**  
   Obtain a Molten Obtanium Bucket.
4. **Portable Lawsuit**  
   Pick up a bucket of molten Obtanium.
5. **That's Not Water**  
   Obtain a Molten Obtanium Bucket.

### Unobtainium Vapor → Obtanium Vapor

1. **Now You See Me**  
   Pick up Obtanium Vapor.
2. **It's Giving Nothing**  
   Obtain a material that's basically air.
3. **Where Did the Matter Go?**  
   Acquire Obtanium Vapor.
4. **Vaporware**  
   Pick up Obtanium Vapor.
5. **Is This Even Real?**  
   Obtain Obtanium Vapor.

### Unobtainium Vapor Bucket → Obtanium Vapor Bucket

1. **A Bucket of Air**  
   Pick up an Obtanium Vapor Bucket.
2. **Premium Air**  
   Obtain a bucket of Obtanium Vapor.
3. **Scuba Gear Not Included**  
   Acquire an Obtanium Vapor Bucket.
4. **The Emperor's New Bucket**  
   Pick up an Obtanium Vapor Bucket.
5. **Please Explain This to Me**  
   Obtain a bucket of vapor.

### Unobtainium-Vibranium Alloy → Obtanium-Vibranium Alloy

1. **Soup of the Superheroes**  
   Pick up molten Obtanium-Vibranium Alloy.
2. **Two Metals, One Terrible Idea**  
   Obtain a molten alloy.
3. **The Avengers Are Worried**  
   Acquire molten Obtanium-Vibranium Alloy.
4. **Do Not Put This in a Thermos**  
   Pick up molten alloy.
5. **The Geneva Suggestions**  
   Obtain molten Obtanium-Vibranium Alloy.

### Unobtainium-Allthemodium Alloy → Obtanium-Allthemodium Alloy

1. **The Soup Has a Longer Name Than You**  
   Pick up molten Obtanium-Allthemodium Alloy.
2. **Industrial Soup**  
   Obtain molten alloy.
3. **This Recipe Needs a Therapist**  
   Acquire molten Obtanium-Allthemodium Alloy.
4. **Hot and Confusing**  
   Pick up molten Obtanium-Allthemodium Alloy.
5. **Who Is Naming These?**  
   Obtain molten Obtanium-Allthemodium Alloy.

### Clean Unobtainium Slurry → Clean Obtanium Slurry

1. **Clean Enough**  
   Pick up Clean Obtanium Slurry.
2. **Slurry Up**  
   Obtain Clean Obtanium Slurry.
3. **Now With 30% Less Dirt**  
   Acquire clean slurry.
4. **The Spa Treatment**  
   Pick up Clean Obtanium Slurry.
5. **It's Still Slurry**  
   Obtain Clean Obtanium Slurry.

### Dirty Unobtainium Slurry → Dirty Obtanium Slurry

1. **The Before Picture**  
   Pick up Dirty Obtanium Slurry.
2. **Somebody Call a Plumber**  
   Obtain Dirty Obtanium Slurry.
3. **Cleanliness Is a Spectrum**  
   Acquire dirty slurry.
4. **Forbidden Gravy**  
   Pick up Dirty Obtanium Slurry.
5. **We Can Fix Her**  
   Obtain Dirty Obtanium Slurry.

## Other

### Unobtainium Smithing Template → Obtanium Smithing Template

1. **Pay to Win**  
   Pick up an Obtanium Smithing Template.
2. **The Upgrade Is the Content**  
   Obtain an Obtanium Smithing Template.
3. **New Phone, Who Dis?**  
   Acquire an Obtanium Smithing Template.
4. **This Better Be Worth It**  
   Pick up an Obtanium Smithing Template.
5. **Planned Obsolescence**  
   Obtain an Obtanium Smithing Template.

### Unobtainium Nugget Pile → Obtanium Nugget Pile

1. **Some Assembly Required**  
   Pick up an Obtanium Nugget Pile.
2. **Loose Change**  
   Obtain a pile of Obtanium nuggets.
3. **I Found This in the Couch**  
   Acquire an Obtanium Nugget Pile.
4. **We Have Nuggets at Home**  
   Pick up an Obtanium Nugget Pile.
5. **A Pile of Potential**  
   Obtain an Obtanium Nugget Pile.
