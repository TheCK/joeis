package irvine.oeis.a286;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a046.A046118;
import irvine.oeis.a046.A046119;
import irvine.oeis.a046.A046120;

/**
 * A286217 Product of the n-th sexy prime triple.
 * @author Georg Fischer
 */
public class A286217 implements Sequence {

  final Sequence mA046118 = new A046118();
  final Sequence mA046119 = new A046119();
  final Sequence mA046120 = new A046120();
  @Override
  public Z next() {
    return mA046118.next().multiply(mA046119.next()).multiply(mA046120.next());
  }

}
