package AtmSimulator;
/**
 *
 * @author Nandokha Collins
 */
public interface AtmOpInterface {
    public void viewBalance();
    public void withdrawAmount(double withdrawAmount);
    public void depositAmount(double depositAmount );
    public  void viewMiniStatement();
}