package game.framework;

public class GameTime
{
    private double deltaTime;
    private long baseTime;
    private long pausedTime;
    private long stopTime;
    private long prevTime;
    private long currTime;
    private boolean stopped;

    public GameTime()
    {
        // Initalize Vars
        this.deltaTime = -1.0f;
        this.baseTime = 0;
        this.pausedTime = 0;
        this.stopTime = 0;
        this.prevTime = 0;
        this.currTime = 0;
        this.stopped = false;
    }

    public float getGameTime()
    {
        if(stopped)
        {
            return (float)(this.stopTime - this.baseTime);
        }
        else
        {
            return (float)((this.currTime - this.pausedTime) - this.baseTime);
        }
    }

    public float getDeltaTime()
    {
        return (float)this.deltaTime;
    }

    /**
     * Resets:
     *  baseTime = System.currentTimeMillis();
     *  prevTime = System.currentTimeMillis();
     *  stopTime = 0
     *  stopped  = false
     */
    public void reset()
    {
        long lCurrTime = System.currentTimeMillis();
        this.baseTime = lCurrTime;
        this.prevTime = lCurrTime;
        this.stopTime = 0;
        this.stopped = false;
    }

    /**
     * Starts the timer
     */
    public void start()
    {
        long startTime = System.currentTimeMillis();

        if(stopped)
        {
            // Then accumulate stopped time
            this.pausedTime += (startTime - this.stopTime);

            // Since the timer is starting back up reset it
            this.prevTime = startTime;

            // No longer stopped
            this.stopTime = 0;
            stopped = false;
        }
    }

    /**
     * Stops the timer
     */
    public void stop()
    {
        if(!stopped)
        {
            long lCurrTime = System.currentTimeMillis();
            this.stopTime = lCurrTime;
            this.stopped = true;
        }
    }

    /**
     * Calculates the change in time between this update and the last
     * update and adds the difference to the total game time
     * game time = total time app has been running since it started.
     */
    public void tick()
    {
        if(stopped)
        {
            this.deltaTime = 0;
            return;
        }

        long lCurrTime = System.currentTimeMillis();
        this.currTime = lCurrTime;

        // Time difference between this frame and the previous.
        this.deltaTime = (this.currTime - this.prevTime);

        // Prepare for next frame.
        this.prevTime = this.currTime;

        // Set to zero incase of inaccuracy
        if(this.deltaTime < 0.0f)
        {
            this.deltaTime = 0.0f;
        }
    }
}
