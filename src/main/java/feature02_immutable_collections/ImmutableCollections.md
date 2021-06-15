# Creating Immutable List, Set, Map Collections
A collection is considered unmodifiable if elements cannot be added, removed, or replaced.

* Modifiable collections require extra bookkeeping
* Immutable collections can be stored more effeciently/densly
* Innately thread safe

### Use Cases
* Constants
* Read from a config file at startup and never changed


### Significant Points
Map.of vs Map.ofEntries()

    Map.of() is not a varargs method. There are only overloaded Map.of() for up to 10 entries. 
    On the other hand, Map.ofEntries() is a varargs method, hence allowing you to specify as many entries as you want.

Why not just make one creation factory method that is a varargs version of Map.of?
While this introduces some clutter in the API, it avoids 
    array allocation, initialization, and garbage collection overhead 
    that is incurred by varargs calls.

SingletonList()
Creates an immutable list with only one element in it.
https://www.geeksforgeeks.org/collections-singletonlist-method-in-java-with-examples/
@ user5047085 — The key and value can be of different types
### References
https://docs.oracle.com/en/java/javase/11/core/creating-immutable-lists-sets-and-maps.html#GUID-DB0865D2-C052-40BC-A3DC-20FCB3088DC9
https://www.geeksforgeeks.org/collections-singletonlist-method-in-java-with-examples/
