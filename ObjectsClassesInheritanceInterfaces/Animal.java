
/**
 * An animal is a life form that does certain things
 *
 * @author Linda
 * @version 1.0.0
 */
public interface Animal
{
    /**
     * Animals need to eat
     *
     * @param  food type of food to be eaten
     */
    public void eat(String food);
    
    /**
     * Animals need to sleep
     *
     * @param  hours amount of time to sleep
     */
    public void sleep(int hours);
}
