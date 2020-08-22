package irvine.oeis.a056;
// Generated by gen_seq4.pl deriv at 2020-07-01 19:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a002.A002596;

/**
 * A056981 a(n) = A002596(n)^2.
 * @author Georg Fischer
 */
public class A056981 implements Sequence {

  final Sequence mA002596 = new A002596();
  /** Construct the sequence. */
  public A056981() {
  }
  
  @Override
  public Z next() {
    return mA002596.next().pow(Z.TWO);
  }

}
