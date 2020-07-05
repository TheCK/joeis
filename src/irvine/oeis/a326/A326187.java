package irvine.oeis.a326;
// Generated by gen_seq4.pl deriv at 2020-07-01 19:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000203;
import irvine.oeis.a003.A003557;

/**
 * A326187 <code>a(n) = sigma(n) - A003557(n)</code>.
 * @author Georg Fischer
 */
public class A326187 implements Sequence {

  final Sequence mA000203 = new A000203();
  final Sequence mA003557 = new A003557();
  /** Construct the sequence. */
  public A326187() {
  }
  
  @Override
  public Z next() {
    return mA000203.next().subtract(mA003557.next());
  }

}
