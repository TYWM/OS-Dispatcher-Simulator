package os.dispatcher.simulator;

/**
 * A basic enumeration type to represent process state.
 * A process is either Running, Ready, or Blocked.
 * @author Tyler McFaden
 */
public enum ProcessStatus {
    RUNNING(0), READY(1), BLOCKED(2);

    private final int id;
    ProcessStatus(int id) {this.id = id;}
    public int getValue() {return id;}
    
}
