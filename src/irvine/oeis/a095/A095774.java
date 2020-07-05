package irvine.oeis.a095;
// Generated by gen_seq4.pl deriv at 2020-07-01 19:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a003.A003160;

/**
 * A095774 <code>a(n)=2*A003160(n)-n</code>.
 * @author Georg Fischer
 */
public class A095774 implements Sequence {

  final Sequence mA003160 = new A003160();
  protected long mN;
  /** Construct the sequence. */
  public A095774() {
    mN = 0;
  }
  
  @Override
  public Z next() {
    ++mN;
    return Z.TWO.multiply(mA003160.next()).subtract(Z.valueOf(mN));
  }

}
