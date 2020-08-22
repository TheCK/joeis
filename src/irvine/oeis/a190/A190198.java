package irvine.oeis.a190;
// Generated by gen_seq4.pl floor3 2020-06-09 22:00
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A190198 a(n) = [n*u+n*v]-[n*u]-[n*v], where u=sqrt(3), v=1/u, and []=floor.
 * @author Georg Fischer
 */
public class A190198 implements Sequence {
  private long mN = 0;
  private static final CR U = CR.THREE.sqrt();
  private static final CR V = CR.ONE.divide(U);

  @Override
  public Z next() {
    final CR n = CR.valueOf(++mN);
    return n.multiply(U).add(n.multiply(V)).floor().subtract(n.multiply(U).floor()).subtract(n.multiply(V).floor());
  }
}
