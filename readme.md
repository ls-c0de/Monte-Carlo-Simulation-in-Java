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
