package irvine.oeis.a024;

import irvine.math.z.Z;

/**
 * A024712 <code>a(n) =</code> residue <code>mod 3</code> of n-th term of <code>A024702</code>.
 * @author Sean A. Irvine
 */
public class A024712 extends A024702 {

  @Override
  public Z next() {
    return super.next().mod(Z.THREE);
  }
}