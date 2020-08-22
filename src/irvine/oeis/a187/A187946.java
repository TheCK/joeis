package irvine.oeis.a187;
// Generated by gen_seq4.pl floor3 2020-06-09 22:00
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A187946 [nr+kr]-[nr]-[kr], where r=(1+sqrt(5))/2, k=5, [ ]=floor.
 * @author Georg Fischer
 */
public class A187946 implements Sequence {
  private long mN = 0;
  private static final CR R = CR.ONE.add((CR.FIVE).sqrt()).divide(CR.TWO);
  private static final CR K = CR.FIVE;

  @Override
  public Z next() {
    final CR n = CR.valueOf(++mN);
    return n.multiply(R).add(K.multiply(R)).floor().subtract(n.multiply(R).floor()).subtract(K.multiply(R).floor());
  }
}
