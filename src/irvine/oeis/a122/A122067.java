package irvine.oeis.a122;
// Generated by gen_seq4.pl deriv at 2020-07-01 19:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a014.A014105;

/**
 * A122067 <code>a(n) = 2^A014105(n)</code>.
 * @author Georg Fischer
 */
public class A122067 implements Sequence {

  final Sequence mA014105 = new A014105();
  /** Construct the sequence. */
  public A122067() {
  }
  
  @Override
  public Z next() {
    return Z.TWO.pow(mA014105.next());
  }

}
