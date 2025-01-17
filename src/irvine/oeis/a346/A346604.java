package irvine.oeis.a346;
// Generated by gen_seq4.pl finifull at 2021-08-12 15:32

import irvine.oeis.FiniteSequence;

/**
 * A346604 The second of four solutions to a Monthly problem asking if there exist finite sequences 1 &lt; a(1) &lt; a(2) &lt; ... &lt; a(n) such that Sum_i 1/a(i) = 1 and gcd(a(i), a(i+1)) = 1 for 1 &lt;= i &lt; n.
 * @author Georg Fischer
 */
public class A346604 extends FiniteSequence {

  /** Construct the sequence. */
  public A346604() {
    super(3, 5, 7, 9, 11, 21, 22, 45, 154);
  }
}
