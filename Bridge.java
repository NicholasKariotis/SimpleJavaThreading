package part2;

public class Bridge {
    
    public boolean canEnter;

    public Bridge(){
        canEnter = true;
    }

    public boolean enterBridge(){
        /**
         *  If the bridge is open, change can enter to false and return true.
         *  If the bridge is being used, return false.
         */
        if(canEnter == true){
            canEnter = false;
            return true;
        }else{
            return false;
        }
    }

    public void leaveBridge(){
        canEnter = true;
        // When a woolie exits, canEnter is now true
    }
}
