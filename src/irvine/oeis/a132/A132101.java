package irvine.oeis.a132;
// Generated by gen_seq4.pl deriv at 2020-07-01 19:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a001.A001147;
import irvine.oeis.a047.A047974;

/**
 * A132101 a(n) = (A001147(n) + A047974(n))/2.
 * @author Georg Fischer
 */
public class A132101 implements Sequence {

  final Sequence mA001147 = new A001147();
  final Sequence mA047974 = new A047974();
  /** Construct the sequence. */
  public A132101() {
  }
  
  @Override
  public Z next() {
    return mA001147.next().add(mA047974.next()).divide(Z.TWO);
  }

}
