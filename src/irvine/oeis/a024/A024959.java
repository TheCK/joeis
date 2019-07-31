package irvine.oeis.a024;

import irvine.math.z.Z;

/**
 * A024959 <code>a(n) = Sum(a(2i-1)*a(n-2i+1), i = 1,2,...,[ (n+2)/4 ])</code>.
 * @author Sean A. Irvine
 */
public class A024959 extends A024945 {

  @Override
  protected Z a() {
    return Z.TWO;
  }

  @Override
  protected Z c() {
    return Z.TWO;
  }
}