package irvine.oeis.a177;
// Generated by gen_seq4.pl floor3cr 2020-06-09 22:00
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A177738 a(n) = floor( (x^n - x^(-n)) / (x - x^(-1)) ) where x = Pi-2.
 * @author Georg Fischer
 */
public class A177738 implements Sequence {
  private static final ComputableReals REALS = ComputableReals.SINGLETON;
  private static final CR X = CR.PI.subtract(CR.TWO);
  private long mN = -1;

  @Override
  public Z next() {
    final CR n = CR.valueOf(++mN);
    return REALS.pow(X, n).subtract(REALS.pow(X, CR.ZERO.subtract(n))).divide(X.subtract(REALS.pow(X, CR.ZERO.subtract(CR.ONE)))).floor();
  }
}
