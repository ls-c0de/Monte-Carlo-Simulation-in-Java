# Simple Monte Carlo Simulation in Java

This program was written because of this yt-video:
https://www.youtube.com/watch?v=7ESK5SaP-bc

# How does it work?

First, it opens a playground, where a circle with the radius of `a` and a square with the length
of `a` is placed. It then randomly drops "balls" and calculates, if they would fit inside of one of these
areas. 

After that, it counts the balls which are inside of one of these object. 
After X amount of balls (specified by the user), it divides the "weight" (count) of the circle against the "weight" (count) of the rectangle, and the resulting number is close to PI, 
thus proving the Law of Large Numbers.

# Learnings

(In german, so i can explain it better)

## Einführung
In oben genannten Youtube Video konnte ich die vorgestelle Hypothese zuerst nicht glauben. Gleichzeitig kam mir der Gedanke, das ich das ganze experimentiell mit meinen derzeitigen Programmierkenntnissen
einfach ausprobieren kann (Mit etwas längerem Nachdenken ist es natürlich klar, warum die Hypothese stimmt)

Darum habe ich einfach losprogrammiert.

## Etwas Rechenzeit sparen
Während der Programmierung fiel mir auf, dass eine Abbruchbedingung, wenn ein "ball" außerhalb von `x` lag, sinnvoll wäre, Denn dadurch erspart man sich einen zweiten Vergleich für `y`, da der Ball ja sowieso außerhalb lag.
