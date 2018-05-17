Related to super , subtype bounds relation.
suppose a method needs to be presented in a list which will return 
the argument itself if non empty or an exception if any of the element 
is less than zero

then def agumentCondition(set:IntSets):IntSets will not be perfect choice
as it does not take care whether an empty set has been passed or a non empty
set to the method

thus representing it via

<: or >: symbol makes more sense

def agumentCondition [[set <: IntSets]](s :IntSets):set will be perfect 
to capture all conditions mentioned above