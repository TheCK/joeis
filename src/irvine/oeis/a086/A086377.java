package irvine.oeis.a086;
// Generated by gen_seq4.pl posins at 2021-09-20 11:24

import irvine.oeis.PositionSequence;
import irvine.oeis.a189.A189687;

/**
 * A086377 a(1)=1; a(n)=a(n-1)+2 if n is in the sequence; a(n)=a(n-1)+2 if n and (n-1) are not in the sequence; a(n)=a(n-1)+3 if n is not in the sequence but (n-1) is in the sequence.
 * @author Georg Fischer
 */
public class A086377 extends PositionSequence {

  /** Construct the sequence. */
  public A086377() {
    super(1, new A189687(), 0);
  }
}
