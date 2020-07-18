package irvine.oeis.a033;

/**
 * A033777 Product <code>t2(q^d); d | 18</code>, where <code>t2 = theta2(q)/(2*q^(1/4))</code>.
 * @author Sean A. Irvine
 */
public class A033777 extends A033763 {

  @Override
  protected int base() {
    return 18;
  }
}
