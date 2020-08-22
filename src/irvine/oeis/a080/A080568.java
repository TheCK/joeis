package irvine.oeis.a080;
// Generated by gen_seq4.pl holose at 2020-04-12 21:28
// egf: 2/sqrt(5)*exp(x/2)*sinh((sqrt(5)*x)/2)+1/(1-x)
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A080568 Sum of the Fibonacci numbers A000045 and the factorials A000142.
 * @author Georg Fischer
 */
public class A080568 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A080568() {
    super(0, "[[0],[-1,-1],[7,2,-1],[15,18,8,1],[-57,-76,-31,-4],[36,57,24,3]]", "[1,2,3,8,27,125]", 4);
    setGfType(1);
  }
}
