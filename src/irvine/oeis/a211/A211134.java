package irvine.oeis.a211;

import irvine.oeis.FiniteSequence;

/**
 * A211134 One of 17 possible sets of eleven numbers of the form 3^alpha 5^beta 7^gamma whose sum of reciprocals is 1.
 * @author Georg Fischer
 */
public class A211134 extends FiniteSequence {

  /** Construct the sequence. */
  public A211134() {
    super(3, 5, 7, 9, 15, 21, 27, 35, 45, 105, 945);
  }
}
