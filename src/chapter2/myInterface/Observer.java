package chapter2.myInterface;

/**
 * 观察者接口
 * @author chk
 *
 */
public interface Observer {
	public void update(int temp,float humidity,float pressure);
}
