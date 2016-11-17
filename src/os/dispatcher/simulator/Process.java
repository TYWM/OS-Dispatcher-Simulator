package os.dispatcher.simulator;

import java.util.Objects;
import java.util.Comparator;

/**
 *
 * @author Tyler McFaden
 */
public class Process implements Comparable{
    
    private final int pid;
    private final int priority;
    private ProcessStatus status;
    
    /**
     * Default constructor
     */
    public Process(){
    pid = -1;
    priority = -1;
    status = ProcessStatus.BLOCKED;
    }
    
    /**
     * Main constructor
     * @param pid an integer value for the PID, should be handled by the program via a counter.
     * @param priority an integer value for the priority.
     * @param status a ProcessStatus enum type, ProcessStatus.READY, ProcessStatus.RUNNING, ProcessStatus.BLOCKED
     */
    public Process(int pid, int priority, ProcessStatus status){
        this.pid = pid;
        this.priority = priority;
        this.status = status;
    }
    
    @Override
    public boolean equals(Object ob){
        if(ob == null) return false;
        else if (!(ob instanceof Process)) return false;
        else return this.pid == ((Process)ob).pid;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.pid;
        hash = 79 * hash + this.priority;
        hash = 79 * hash + Objects.hashCode(this.status);
        return hash;
    }

    @Override
    public int compareTo(Object ob){
        if(this.priority == ((Process)ob).priority)
            return 0;
        else if(this.priority < ((Process)ob).priority)
            return 1;
        else return -1;
    }
    
    public int getPid() {return this.pid;}
    
    public int getPriority() {return this.priority;}
    
    public ProcessStatus getStatus() {return this.status;}
    

}

class PidSort implements Comparator<Process>{
    
    @Override
    public int compare(Process p1, Process p2){
        if(p1.getPid() == p2.getPid())
            return 0;
        else if(p1.getPid() < p2.getPid())
            return 1;
        else return -1;
    }
}
    