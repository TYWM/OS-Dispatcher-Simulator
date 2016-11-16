package os.dispatcher.simulator;

import java.util.Objects;

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
     * @param pid
     * @param priority 
     * @param status
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
        if(this.pid == ((Process)ob).pid)
            return 0;
        else if(this.pid < ((Process)ob).pid)
            return 1;
        else return -1;
    }
    
    public int getPid() {return this.pid;}
    
    public int getPriority() {return this.priority;}
    
    public ProcessStatus getStatus() {return this.status;}
    

}
    