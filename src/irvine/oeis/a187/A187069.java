package irvine.oeis.a187;

import irvine.oeis.LinearRecurrence;

/**
 * A187069 Let i be in <code>{1,2,3}</code>, let r <code>&gt;= 0</code> be an integer and n=2*r+i-1. Then a(n)=a(2*r+i-1) gives the quantity of H_(7,2,0) tiles in a subdivided H_(7,i,r) tile after linear scaling by the factor x^r, where x=sqrt((2*cos(Pi/7))^2-1).
 * @author Sean A. Irvine
 */
public class A187069 extends LinearRecurrence {

  /** Construct the sequence. */
  public A187069() {
    super(new long[] {-1, 0, 1, 0, 2, 0}, new long[] {0, 1, 0, 1, 1, 2});
  }
}
