package irvine.oeis.a007;

import irvine.math.matrix.DefaultMatrix;
import irvine.math.z.Z;

/**
 * A007295 Number of elements <code>(a b</code>, c d) in <code>GL(2</code>,Z) with |det| <code>= 1</code>, trace <code>&lt;= n</code> and <code>0 &lt;= a &lt;= {b</code>, c} <code>&lt;=</code> d.
 * @author Sean A. Irvine
 */
public class A007295 extends A007104 {

  @Override
  protected boolean accept(final DefaultMatrix<Z> matrix, final Z n) {
    return Z.ONE.equals(MAT.det(matrix).abs()) && MAT.trace(matrix).compareTo(n) <= 0;
  }
}
