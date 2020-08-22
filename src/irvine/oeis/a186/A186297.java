package irvine.oeis.a186;
// Generated by gen_seq4.pl deriv at 2020-07-01 19:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a007.A007520;

/**
 * A186297 ( A007520(n)-1)/2.
 * @author Georg Fischer
 */
public class A186297 implements Sequence {

  final Sequence mA007520 = new A007520();
  /** Construct the sequence. */
  public A186297() {
  }
  
  @Override
  public Z next() {
    return mA007520.next().subtract(Z.ONE).divide(Z.TWO);
  }

}
