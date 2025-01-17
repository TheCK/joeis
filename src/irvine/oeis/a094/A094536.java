package irvine.oeis.a094;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a003.A003000;

/**
 * A094536 Number of binary words of length n that are not "bifix-free".
 * @author Georg Fischer
 */
public class A094536 implements Sequence {

  final Sequence mA003000 = new A003000();
  protected long mN;
  /** Construct the sequence. */
  public A094536() {
    mN = -1;
  }
  
  @Override
  public Z next() {
    ++mN;
    return Z.TWO.pow(Z.valueOf(mN)).subtract(mA003000.next());
  }

}
