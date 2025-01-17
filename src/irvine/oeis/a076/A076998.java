package irvine.oeis.a076;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a007.A007947;
import irvine.oeis.a007.A007948;

/**
 * A076998 Difference between cubefree and squarefree components of n.
 * @author Georg Fischer
 */
public class A076998 implements Sequence {

  final Sequence mA007947 = new A007947();
  final Sequence mA007948 = new A007948();
  @Override
  public Z next() {
    return mA007948.next().subtract(mA007947.next());
  }

}
