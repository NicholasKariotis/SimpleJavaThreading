package part2;

public class Woolie implements Runnable{
    
    public String name;
    public String city;
    public int seconds;
    public Bridge troll;

    public Woolie(String n, String c, int s, Bridge troll){
        this.name = n;
        this.city = c;
        this.seconds = s;
        this.troll = troll;
    }

    @Override
    public void run() {
        System.out.println(this.name + " has arrived at the bridge.");
        while(troll.enterBridge() == false){
            // Waiting for the troll to allow crossing
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Interrupted while waiting.");
            }
        }
        for(int i = 0; i < seconds; i++){
            // Code for woolie crossing the bridge
            if(i == 0){
                System.out.println(this.name + " has started to cross the bridge.");
            }else{
                System.out.println("\t"+ this.name + " " + i + " seconds");
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Interrupted while traveling.");
            }
        }
        System.out.println(this.name + " has arrived at " + this.city);
        troll.leaveBridge(); // Notifies the troll that the woolie exited the bridge
        
    }
}
