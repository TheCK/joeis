package irvine.oeis.a159;
// Generated by gen_seq4.pl deriv at 2020-07-01 19:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a153.A153006;

/**
 * A159795 <code>a(n) = 4*A153006(n)</code>.
 * @author Georg Fischer
 */
public class A159795 implements Sequence {

  final Sequence mA153006 = new A153006();
  /** Construct the sequence. */
  public A159795() {
  }
  
  @Override
  public Z next() {
    return Z.FOUR.multiply(mA153006.next());
  }

}
