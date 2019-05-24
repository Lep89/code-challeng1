a.	What is your design and implementation?
Two applications, one is Randomizer generates a list of integers and send it to the message queue and the other is Prime listening from the queue and receiving the list 
of integer. After process each integer of list, it wraps itself with the state of being or not
a prime and add it to a list and send the list to the message queue. Randomizer, on the other side of the queue listens to the queue and gets the result from the queue.
b.	Sample Output
c.	Further work – if you have all the time in the world how would you implement
I would implement the java Messaging or use existing messaging implementation. And I can increase the number of consumers listening to the queue to improve the performance.
