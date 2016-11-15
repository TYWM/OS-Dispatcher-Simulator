package os.dispatcher.simulator;

/**
 *
 * @author Tyler McFaden
 */
public class Process {
    
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
    

}
    