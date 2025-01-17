package irvine.oeis.a294;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a002.A002163;
import irvine.oeis.a002.A002193;

/**
 * A294671 Decimal expansion of the sum of sqrt(2) and sqrt(5) with no positional regrouping.
 * @author Georg Fischer
 */
public class A294671 implements Sequence {

  final Sequence mA002163 = new A002163();
  final Sequence mA002193 = new A002193();
  @Override
  public Z next() {
    return mA002193.next().add(mA002163.next());
  }

}
