package irvine.oeis.a188;
// Generated by gen_seq4.pl floor3 2020-06-09 22:00
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A188082 [nr+kr]-[nr]-[kr], where r=sqrt(3), k=1, [ ]=floor.
 * @author Georg Fischer
 */
public class A188082 implements Sequence {
  private long mN = 0;
  private static final CR R = CR.THREE.sqrt();
  private static final CR K = CR.ONE;

  @Override
  public Z next() {
    final CR n = CR.valueOf(++mN);
    return n.multiply(R).add(K.multiply(R)).floor().subtract(n.multiply(R).floor()).subtract(K.multiply(R).floor());
  }
}
