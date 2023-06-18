# GlobaliaGDP
GlobaliaGDP is a plugin developed by [RetroEdge](https://github.com/RetroEdge) to both 
provide a toolkit to staff and automate certain features of the Minecraft server [Globalia's](https://discord.gg/myjkXFCvuM) GDP system.
## Features
The plugin uses one central command for all of its features, that being /gdp.  The 
command usage is as follows:
* /gdp settlement add \<name> \<faction> - Adds a hamlet at your current position.
* /gdp settlement add \<name> \<faction> \<xyz> - Adds a hamlet at the specified position.
* /gdp settlement upgrade \<name> - Upgrades a settlement to the next tier.  Ex: A hamlet will upgrade to a town
* /gdp settlement remove \<name> - Removes a settlement.
* /gdp settlement move \<name> - Moves a settlement to your current position.
* /gdp settlement move \<name> \<xyz> - Moves a hamlet to the specified position.


* /gdp eco add \<amount> \<faction> - Adds the specified amount to the faction's weekly payout.
* /gdp eco add \<port | monument> \<faction> - Adds the amount associated with the specified build to the faction's weekly payout.
* /gdp eco add park \<n> \<m> \<faction> - Adds the amount associated with a N chunks by M chunks park to the faction's weekly payout.  See below for the formula.
* /gdp eco subtract \<amount> \<faction> - Subtracts the specified amount from the faction's weekly payout.
* /gdp eco get \<faction> - Reports how much the faction gets from the weekly payout.
* /gdp eco set \<amount> \<faction> - Sets the factions weekly payout to the specified amount.

Park payout formula: ((n-2) + (m-2)) * 1000
## About Globalia
Globalia is a factions server taking place on an Earth map.  The server features plugins 
such as [Slimefun 4](https://github.com/Slimefun/Slimefun4) and [Dynmap](https://github.com/webbukkit/dynmap),
and implements a custom GDP system allowing players to gain money and power by building infrastructure.

You can join the server's discord [here.](https://discord.gg/myjkXFCvuM) 