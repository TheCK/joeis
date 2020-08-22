package irvine.oeis.a101;
// Generated by gen_seq4.pl holos [[0],[4320,-14340,12715,-4170,455],[-12528,44982,-44166,16740,-2184],[-1296,-1206,4022,-2244,364],[0,1584,-6450,5094,-1092],[0,1440,-76,-1152,364]] [1,1,1,2,5] 0 at 2020-02-15 22:07
// Recurrence: 4*n*(n+1)*(91*n^2-379*n+360)*a[n+0]=6*n*(182*n^3-849*n^2+1075*n-264)*a[n-1]-2*(182*n^4-1122*n^3+2011*n^2-603*n-648)*a[n-2]+6*(n-3)*(364*n^3-1698*n^2+2267*n-696)*a[n-3]-5*(n-4)*(n-3)*(91*n^2-197*n+72)*a[n-4]
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A101785 G.f. satisfies: A(x) = 1 + x*A(x)/(1 - x^2*A(x)^2).
 * @author Georg Fischer
 */
public class A101785 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A101785() {
    super(0, "[[0],[4320,-14340,12715,-4170,455],[-12528,44982,-44166,16740,-2184],[-1296,-1206,4022,-2244,364],[0,1584,-6450,5094,-1092],[0,1440,-76,-1152,364]]", "[1,1,1,2,5]", 0);
  }
}
