package irvine.oeis.a186;
// Generated by gen_seq4.pl deriv at 2020-07-01 19:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a001.A001840;

/**
 * A186340 <code>a(n) = 2^A001840(n)</code>.
 * @author Georg Fischer
 */
public class A186340 implements Sequence {

  final Sequence mA001840 = new A001840();
  /** Construct the sequence. */
  public A186340() {
  }
  
  @Override
  public Z next() {
    return Z.TWO.pow(mA001840.next());
  }

}
