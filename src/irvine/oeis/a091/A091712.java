package irvine.oeis.a091;
// Generated by gen_seq4.pl holos at 2020-04-12 21:28
// ogf: (1+10*x-2*x^2+(1-4*x)^(3/2))/2
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A091712 a(n)=6(2n-4)!/((n-2)!n!), if n&gt;2. a(0)=1,a(1)=a(2)=2.
 * @author Georg Fischer
 */
public class A091712 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A091712() {
    super(0, "[[0],[12,-14,4],[-2,5,7],[-4,-6,-2]]", "[1,2,2,2]", 2);
  }
}
