package com.firedome.ravello.payload.vm;

/**
 * @see <a href="URL#https://www.ravellosystems.com/ravello-api-doc/#execute-multiple-vms-action"></a>
 */
public enum VmActionTypes {

    /**
     * Starts the VM/VMS
     */
    START("start"),
    /**
     * Shuts down the VM/VMS
     */
    STOP("stop"),
    /**
     * Restart the VM/VMS
     */
    RESTART("restart"),
    /**
     * Makes an attempt to repair the VM/VMS without destroying the data.
     */
    REPAIR("repair"),
    /**
     * Stops the VM/VMS gracefully, no server timeout.
     */
    SHUTDOWN("shutdown"),
    /**
     * Single - The VM is abruptly powered off, with no consideration for work in progress.
     * Multiply - Stops the VM immediately, non-graceful way.
     */
    POWEROFF("poweroff"),
    /**
     * Resets each of the VM/VMS disks to its most recent applicable state
     */
    RESETDISKS("resetDisks"),
    /**
     * Resets the VM/VMS disks to its most recent applicable state
     * Note: this action may result in data loss.
     */
    REDEPLOY("redeploy"),
    ;

    private final String actionType;

    VmActionTypes(final String actionType) {
        this.actionType = actionType;
    }

    @Override
    public String toString() {
        return actionType;
    }
}
