package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014432 a(n) = Sum( a(i)a(n-1-i),{i,1,n-1} ), with a(0) = 1, a(1) = 3.
 * @author Sean A. Irvine
 */
public class A014432 extends A014431 {

  @Override
  protected Z a1() {
    return Z.THREE;
  }
}

