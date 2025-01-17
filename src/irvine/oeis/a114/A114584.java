package irvine.oeis.a114;
// Generated by gen_seq4.pl holos at 2021-06-07 19:33
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A114584 Number of Motzkin paths of length n having no UHD's (U=(1,1), H=(1,0), D=(1,-1)).
 * radtorec(1/2*(1-x+x^3-((x^3+x+1)*(x^3-3*x+1))^(1/2))/x^2)
 * @author Georg Fischer
 */
public class A114584 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A114584() {
    super(0, "[[0],[120,-32, 2],[0],[-168, 52,-4],[132,-39, 3],[-144, 60,-6],[-60, 26,-2],[12,-9],[0,-3, 3],[0, 1, 2],[0,-2,-1]]", "1, 1, 2, 3, 7, 15, 36, 85, 209, 517, 1303, 3312, 8510, 22029, 57447", 0);
  }
}
