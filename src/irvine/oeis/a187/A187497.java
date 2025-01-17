package irvine.oeis.a187;

import irvine.oeis.LinearRecurrence;

/**
 * A187497 Let i be in {1,2,3,4} and r&gt;=0 an integer. Let p ={p_1,p_2,p_3,p_4} = {-3,0,1,2}, n=3*r+p_i and define a(-3)=0. Then a(n)=a(3*r+p_i) gives the number of H_(9,3,0) tiles in a subdivided H_(9,i,r) tile after linear scaling by the factor Q^r, where Q=sqrt(2*cos(Pi/9)).
 * @author Sean A. Irvine
 */
public class A187497 extends LinearRecurrence {

  /** Construct the sequence. */
  public A187497() {
    super(new long[] {1, 0, 0, 3, 0, 0, 0, 0, 0}, new long[] {0, 1, 0, 1, 0, 1, 0, 2, 1});
  }
}
