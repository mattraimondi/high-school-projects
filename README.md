# Special Garbanzo
An assortment of useful custom commands for macOS command line.

## ip
ip simply lists your local ip address and your external ip address

## q
q ends the current terminal session and closes the window for you using applescript

## lstrash
lstrash gives you the contents of 
```
~/library/Mobile Documents/com~apple~CloudDocs/.trash 
```
and 
```
~/.trash
```

Typing lstrash empties both of those locations (deletes all files in those locations)

WARNING! This process is not undoable, so don't be typing
```
lstrash empty
```
unless you're sure!

## icloud
I find this one particularly useful. This one spits out the path for icloud every time you type the command.

This is very helpful if you use iCloud Drive often as a place to store files.

## initial
Initial gives a basic snapshot of how your computer is. It lists current volume, desktop items, what's in the trash, itunes status, ip addresses, and battery level (if on portable Mac). Typing "initial plus" will also list any required updates and a list of ips on the current network.

###### Note: the initial command requires the itunes, volume, lstrash, and ip commands to function properly. However, they are not required, and feel free to edit the script and emit the commands you don't want and add ones you do.
