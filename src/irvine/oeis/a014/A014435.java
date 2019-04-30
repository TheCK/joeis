package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014435 <code>Sum( a(i)*a(n-i), i=0..n-1 )</code>, with <code>a(0)=1, a(1)=6</code>.
 * @author Sean A. Irvine
 */
public class A014435 extends A014431 {

  @Override
  protected Z a1() {
    return Z.SIX;
  }
}

