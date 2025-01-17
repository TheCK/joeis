package irvine.oeis.a272;
// Generated by gen_seq4.pl deriv at 2020-07-01 19:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a011.A011371;

/**
 * A272666 a(n) = A011371(n) + 5*n.
 * @author Georg Fischer
 */
public class A272666 implements Sequence {

  final Sequence mA011371 = new A011371();
  protected long mN;
  /** Construct the sequence. */
  public A272666() {
    mN = -1;
  }
  
  @Override
  public Z next() {
    ++mN;
    return mA011371.next().add(Z.FIVE.multiply(Z.valueOf(mN)));
  }

}
