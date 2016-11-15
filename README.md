A Java application to simulate a basic OS Process Dispatcher, 
as part of the semester project for my CS 471 Operating Systems
 course at Old Dominion University.

Project Description:

You are to simulate a dispatcher using a priority queue system. 

New processes are to be entered using a GUI with priority included
(numbering should be automatic). Processes are also to be terminated
by GUI command. Context switches are to be by command with the cause of the
switch being immaterial. Assume only one CPU.

Priorities and numbers of processes can be kept small, just big enough
to demonstrate the below listed functionality. You may pre-populate the
queues initially from a data file. I am looking at the mechanism as you
are NOT creating actual processes, just simulating them.

Functionality to be provided by you:

1. Priority based Ready Queue(s).

2. Blocked list.

3. Output of complete system status after every context switch showing
   ready, blocked, and running processes.
