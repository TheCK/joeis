package irvine.oeis.a137;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a018.A018805;

/**
 * A137243 Number of coprime pairs (a,b) with -n &lt;= a,b &lt;= n.
 * @author Georg Fischer
 */
public class A137243 implements Sequence {

  final Sequence mA018805 = new A018805();
  @Override
  public Z next() {
    return Z.FOUR.multiply(mA018805.next()).add(Z.FOUR);
  }

}
