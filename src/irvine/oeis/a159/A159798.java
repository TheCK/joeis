package irvine.oeis.a159;
// Generated by gen_seq4.pl triman/trian at 2021-10-31 22:17

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A159798 Triangle read by rows in which row n lists n terms, starting with 1, such that the difference between successive terms is equal to n-3.
 * @author Georg Fischer
 */
public class A159798 extends Triangle {

  @Override
  protected Z compute(final int n, final int k) {
    return k == 0 ? Z.ONE : get(n, k - 1).add(n - 2);
  }
}
