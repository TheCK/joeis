package irvine.oeis.a320;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A320826 Expansion of x*(1 - 4*x)^(3/2)/(3*x - 1)^2.
 * @author Georg Fischer
 */
public class A320826 implements Sequence {

  final Sequence mA320825 = new A320825();
  final Sequence mA320827 = new A320827();
  @Override
  public Z next() {
    return mA320825.next().subtract(mA320827.next());
  }

}
