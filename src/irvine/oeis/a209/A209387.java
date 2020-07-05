package irvine.oeis.a209;
// Generated by gen_seq4.pl deriv at 2020-07-01 19:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a005.A005132;

/**
 * A209387 <code>a(n) = 2*A005132(n) + 1</code>.
 * @author Georg Fischer
 */
public class A209387 implements Sequence {

  final Sequence mA005132 = new A005132();
  /** Construct the sequence. */
  public A209387() {
  }
  
  @Override
  public Z next() {
    return Z.TWO.multiply(mA005132.next()).add(Z.ONE);
  }

}
