package test.thread;

import java.util.Random;
import org.testng.annotations.Test;
import test.support.SafeRandoms;

@Test
public class TrueParallelSampleTest extends BaseThreadTest {
  static Random random = new Random(System.currentTimeMillis());

  private void log(String s) {
    logString(s);
    try {
      Thread.sleep(SafeRandoms.nextInt(3, 7, random));
    } catch (InterruptedException ex) {
      Thread.yield();
    }
    logString(s);
    logCurrentThread();
  }

  public void m1() {
    log("m1");
  }

  public void m2() {
    log("m2");
  }

  public void m3() {
    log("m3");
  }

  public void m4() {
    log("m4");
  }

  public void m5() {
    log("m5");
  }
}
