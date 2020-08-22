package irvine.oeis.a082;
// Generated by gen_seq4.pl floor3 2020-06-09 22:00
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A082389 a(n) = floor((n+2)*phi) - floor((n+1)*phi) where phi=(1+sqrt(5))/2.
 * @author Georg Fischer
 */
public class A082389 implements Sequence {
  private long mN = 0;

  @Override
  public Z next() {
    final CR n = CR.valueOf(++mN);
    return n.add(CR.TWO).multiply(CR.PHI).floor().subtract(n.add(CR.ONE).multiply(CR.PHI).floor());
  }
}
