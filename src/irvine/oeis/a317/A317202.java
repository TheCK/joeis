package irvine.oeis.a317;
// Generated by gen_seq4.pl getcr2 at 2021-08-10 22:27

import irvine.math.cr.CR;
import irvine.oeis.a192.A192918;

/**
 * A317202 Decimal expansion of 3 + (t^2+t^4)/2, where t = 0.543689... (A192918) is the real root of x^3+x^2+x=1.
 * @author Georg Fischer
 */
public class A317202 extends A192918 {

  @Override
  public CR getCR() {
    final CR xt = super.getCR();
    return xt.multiply(xt).add(xt.pow(4)).divide(CR.TWO).add(CR.THREE);
  }
}
